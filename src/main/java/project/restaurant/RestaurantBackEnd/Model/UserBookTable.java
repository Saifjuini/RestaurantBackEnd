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
    private String Nom;
    private String Prenom;
    private Long phone;
    private String numberOfPersons;
    private String email;
    private Date date;

    @OneToOne
    @JoinColumn(name = "id")
    private AvailableTable availableTable;

}
