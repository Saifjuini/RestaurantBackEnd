package project.restaurant.RestaurantBackEnd.Repository.BookTableController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.restaurant.RestaurantBackEnd.Model.UserBookTable;
import project.restaurant.RestaurantBackEnd.Service.BookTableServiceImplement.UserTableServiceImplement;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookTable")
public class BookTable {

    private final UserTableServiceImplement userTableServiceImplement;

    @PostMapping("/bookingTable")
    public ResponseEntity<UserBookTable> addBooking(@RequestBody UserBookTable userBookTable) {
        UserBookTable userBookTable1= userTableServiceImplement.bookTable(userBookTable);
        System.out.println(userBookTable1);
        return new ResponseEntity<>(userBookTable1 , HttpStatus.CREATED);
    }

}
