package project.restaurant.RestaurantBackEnd.Repository.CartController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.restaurant.RestaurantBackEnd.Service.CartServiceImplement.CartServiceImplement;
@RestController
@RequestMapping("/Cart")
public class CartController {

    private final CartServiceImplement cartServiceImplement;

    @Autowired
    public CartController(CartServiceImplement cartServiceImplement) {
        this.cartServiceImplement = cartServiceImplement;
    }

    @PostMapping("/add/{productId}/{quantity}")
    public ResponseEntity<String> addToCart(@PathVariable("productId") Long productId ,
                                            @PathVariable("quantity") int quantity)
    {
        cartServiceImplement.addToCart(productId , quantity);
        return ResponseEntity.ok("Product added to cart");
    }



}
