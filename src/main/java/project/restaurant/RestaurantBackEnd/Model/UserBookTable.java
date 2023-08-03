package project.restaurant.RestaurantBackEnd.Model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserBookTable {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String lastName;
    private Long phone;
    private Long numberOfPersons;
    private String email;
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_add_id")
    private AvailableTable availableTable;
}
