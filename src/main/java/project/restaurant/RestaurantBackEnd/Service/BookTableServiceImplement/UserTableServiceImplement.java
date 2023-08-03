package project.restaurant.RestaurantBackEnd.Service.BookTableServiceImplement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.restaurant.RestaurantBackEnd.Model.UserBookTable;
import project.restaurant.RestaurantBackEnd.Repository.BookTableRepo;
import project.restaurant.RestaurantBackEnd.Service.UserTableService;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserTableServiceImplement implements UserTableService {
private final BookTableRepo bookTableRepo;
    @Override
    public UserBookTable bookTable(UserBookTable userBookTable) {
        return bookTableRepo.save(userBookTable);
    }

    @Override
    public List<UserBookTable> listOfDemands() {
        return bookTableRepo.findAll();
    }
}
