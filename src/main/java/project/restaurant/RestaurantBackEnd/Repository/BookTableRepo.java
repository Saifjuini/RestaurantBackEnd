package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Model.UserBookTable;

public interface BookTableRepo extends JpaRepository<UserBookTable, Long> {

}
