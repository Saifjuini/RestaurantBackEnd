package project.restaurant.RestaurantBackEnd.Service.CartServiceImplement;

import jakarta.persistence.EntityNotFoundException;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.restaurant.RestaurantBackEnd.Model.Cart;
import project.restaurant.RestaurantBackEnd.Model.CartItem;
import project.restaurant.RestaurantBackEnd.Model.Product;
import project.restaurant.RestaurantBackEnd.Repository.CartRepo;
import project.restaurant.RestaurantBackEnd.Repository.ProductRepo;
import project.restaurant.RestaurantBackEnd.Service.CartService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CartServiceImplement implements CartService {
    private final CartRepo cartRepo;
    private final ProductRepo productRepo;

    @Override
    public void addToCart(Long productId , int quantity) {
        Product product = productRepo.findById(productId).orElseThrow(()
                    -> new EntityNotFoundException("Product not found"));

        Cart cart = cartRepo.getReferenceById(2L);
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setCart(cart);

        cart.getCartItems().add(cartItem);

        cartRepo.save(cart);
    }

}
