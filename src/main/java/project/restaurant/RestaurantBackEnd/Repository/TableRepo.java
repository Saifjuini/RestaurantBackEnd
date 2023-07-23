package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Enumeration.Status;
import project.restaurant.RestaurantBackEnd.Model.AvailableTable;

import java.util.List;

public interface TableRepo extends JpaRepository<AvailableTable, Long> {

    List<AvailableTable> findTableBooksByStatus(Status status);
}
