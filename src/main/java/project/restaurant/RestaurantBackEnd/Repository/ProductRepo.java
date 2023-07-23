package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Enumeration.Category;
import project.restaurant.RestaurantBackEnd.Model.Product;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findProductByProductName(String productName);
    Product findProductById(Long id);
    List<Product> findByProductCategory(Category productCategory);

}
