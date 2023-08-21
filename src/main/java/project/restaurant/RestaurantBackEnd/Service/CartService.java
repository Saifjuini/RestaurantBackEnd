package project.restaurant.RestaurantBackEnd.Service;


import project.restaurant.RestaurantBackEnd.Model.Cart;
import project.restaurant.RestaurantBackEnd.Model.CartItem;
import project.restaurant.RestaurantBackEnd.Model.Product;

import java.util.List;

public interface CartService {
    void addToCart(Long productId,int quantity);


}
