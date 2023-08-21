package project.restaurant.RestaurantBackEnd.Service.CartItemServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.restaurant.RestaurantBackEnd.Model.CartItem;
import project.restaurant.RestaurantBackEnd.Repository.CartItemRepo;
import project.restaurant.RestaurantBackEnd.Service.CartItemService;

import java.util.List;

@Service
public class CartItemServiceImplement implements CartItemService {

private final CartItemRepo cartItemRepo;

    @Autowired
    public CartItemServiceImplement(CartItemRepo cartItemRepo) {
        this.cartItemRepo = cartItemRepo;
    }

    @Override
    public void addToCartItem(CartItem cartItem) {
    cartItemRepo.save(cartItem);
    }
    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepo.findAll();
    }
}
