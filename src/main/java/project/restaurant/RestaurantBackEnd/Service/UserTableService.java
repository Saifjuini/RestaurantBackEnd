package project.restaurant.RestaurantBackEnd.Service;

import project.restaurant.RestaurantBackEnd.Model.UserBookTable;
import project.restaurant.RestaurantBackEnd.Repository.UserTableRepo;

import java.util.List;

public interface UserTableService {
    UserBookTable bookTable(UserBookTable userBookTable);
    List<UserBookTable> listOfDemands();
}
