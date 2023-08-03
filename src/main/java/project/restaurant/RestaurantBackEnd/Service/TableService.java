package project.restaurant.RestaurantBackEnd.Service;

import project.restaurant.RestaurantBackEnd.Enumeration.Status;
import project.restaurant.RestaurantBackEnd.Model.AvailableTable;

import java.util.List;
import java.util.Optional;

public interface TableService {
    AvailableTable addTable(AvailableTable tableBook);

    List<AvailableTable> listTables();
    AvailableTable getTableById(Long id);

    void deleteTable(Long id);

    List<AvailableTable> getAvailbeTables(Status status);


}
