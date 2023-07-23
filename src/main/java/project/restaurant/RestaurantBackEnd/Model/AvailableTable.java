package project.restaurant.RestaurantBackEnd.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.restaurant.RestaurantBackEnd.Enumeration.Status;
import project.restaurant.RestaurantBackEnd.Enumeration.TableCategory;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AvailableTable {
    @Id
    @GeneratedValue(strategy = AUTO)
    private  Long id ;
    private String description;
    private int numberOfChairs;
    private Status status = Status.available;
    private TableCategory tableType;

    @OneToOne(mappedBy = "availableTable")
    private UserBookTable userBookTable;
}

