package project.restaurant.RestaurantBackEnd.Service;

import project.restaurant.RestaurantBackEnd.Model.CartItem;

import java.util.List;

public interface CartItemService {
    void addToCartItem(CartItem cartItem);
     List<CartItem> getAllCartItems();

}
