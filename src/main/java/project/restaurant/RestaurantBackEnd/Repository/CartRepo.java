package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Model.Cart;

public interface CartRepo extends JpaRepository<Cart,Long> {

}
