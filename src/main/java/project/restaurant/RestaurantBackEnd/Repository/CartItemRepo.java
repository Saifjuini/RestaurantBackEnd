package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Model.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem , Long> {
}
