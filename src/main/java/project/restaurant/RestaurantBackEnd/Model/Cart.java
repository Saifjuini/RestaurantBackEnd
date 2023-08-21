package project.restaurant.RestaurantBackEnd.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CartId;

    @OneToMany(mappedBy = "cart",
               cascade = CascadeType.ALL)
    private List<CartItem> cartItems = new ArrayList<>();

}
