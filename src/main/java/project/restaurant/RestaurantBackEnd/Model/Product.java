package project.restaurant.RestaurantBackEnd.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.restaurant.RestaurantBackEnd.Enumeration.Category;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String productName;
    private String productDescription;
    private Float productPrice;
    private String productPicture;
    @Enumerated(EnumType.STRING)
    private Category productCategory;
}
