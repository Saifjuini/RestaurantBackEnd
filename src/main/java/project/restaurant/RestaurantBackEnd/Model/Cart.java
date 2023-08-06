package project.restaurant.RestaurantBackEnd.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Cart {
   @Id
    @GeneratedValue(strategy = AUTO)
    private String id;



}
