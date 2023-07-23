package project.restaurant.RestaurantBackEnd.Repository.BookTableController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.restaurant.RestaurantBackEnd.Model.UserBookTable;
import project.restaurant.RestaurantBackEnd.Service.UserTableServiceImplement.UserTableServiceImplement;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookTable")
public class BookTable {

    private final UserTableServiceImplement userTableServiceImplement;

    public ResponseEntity<UserBookTable> BookAtable(UserBookTable userBookTable) {
        UserBookTable userBookTable1= userTableServiceImplement.bookTable(userBookTable);
        return new ResponseEntity<>(userBookTable1 , HttpStatus.CREATED);
    }

}
