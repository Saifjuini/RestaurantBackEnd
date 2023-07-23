package project.restaurant.RestaurantBackEnd.Service;

import project.restaurant.RestaurantBackEnd.Enumeration.Status;
import project.restaurant.RestaurantBackEnd.Model.AvailableTable;

import java.util.List;

public interface TableService {
    AvailableTable addTable(AvailableTable tableBook);

    List<AvailableTable> listTables();

    void deleteTable(Long id);

    List<AvailableTable> getAvailbeTables(Status status);


}
