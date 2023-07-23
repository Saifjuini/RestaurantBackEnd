package project.restaurant.RestaurantBackEnd.Service.UserTableServiceImplement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.restaurant.RestaurantBackEnd.Model.UserBookTable;
import project.restaurant.RestaurantBackEnd.Repository.UserTableRepo;
import project.restaurant.RestaurantBackEnd.Service.UserTableService;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserTableServiceImplement implements UserTableService {
private final UserTableRepo userTableRepo;
    @Override
    public UserBookTable bookTable(UserBookTable userBookTable) {
        return userTableRepo.save(userBookTable);
    }

    @Override
    public List<UserBookTable> listOfDemands() {
        return userTableRepo.findAll();
    }
}
