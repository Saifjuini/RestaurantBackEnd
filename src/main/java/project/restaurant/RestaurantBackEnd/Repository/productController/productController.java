package project.restaurant.RestaurantBackEnd.Repository.productController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.restaurant.RestaurantBackEnd.Enumeration.Category;
import project.restaurant.RestaurantBackEnd.Model.Product;
import project.restaurant.RestaurantBackEnd.Service.productServiceImplement.ProductServiceImplement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/product")
public class productController {
    private final ProductServiceImplement productServiceImplement;

        @PostMapping("/addProduct")
        public ResponseEntity<Product> addProduct(@RequestBody Product product){
            Product newProduct = productServiceImplement.createProduct(product);
            return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
        }


            @GetMapping("/listProducts")
        public ResponseEntity<List<Product>> getProducts(){
            List<Product> products = productServiceImplement.listProduct();
            return new ResponseEntity<>(products, HttpStatus.OK);
        }

        @GetMapping("/find/{name}")
    public  ResponseEntity<Product> getProductById(@PathVariable("name") String name){
            Product product = productServiceImplement.findProductByName(name);
            return new ResponseEntity<>(product , HttpStatus.OK);
        }
        @GetMapping("/category/{productCategory}")
        public ResponseEntity<List<Product>> getProductsByCategorie(@PathVariable("productCategory") Category productCategory){
            List<Product> productsCategory= productServiceImplement.findProductsByCategory(productCategory);
            return new ResponseEntity<>(productsCategory , HttpStatus.OK);
        }

        @PutMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id){
           productServiceImplement.deleteProduct(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }

}
