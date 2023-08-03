package project.restaurant.RestaurantBackEnd.Repository.TableController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.restaurant.RestaurantBackEnd.Model.AvailableTable;
import project.restaurant.RestaurantBackEnd.Service.TableServiceImplement.TableServiceImplement;
import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class TableController {
    private final TableServiceImplement tableServiceImplement;

    @GetMapping("/tableList")
    public ResponseEntity<List<AvailableTable>> getTableList(){
        List<AvailableTable> tableBooks = tableServiceImplement.listTables();
        return new ResponseEntity<>(tableBooks , HttpStatus.OK);
    }
    @PostMapping("/addTable")
    public ResponseEntity<AvailableTable> addTable(@RequestBody AvailableTable tableBook){
        AvailableTable tableBook1= tableServiceImplement.addTable(tableBook);
        return new ResponseEntity<>(tableBook1 , HttpStatus.CREATED);
    }
    @GetMapping("/getTableById/{id}")
    public ResponseEntity<AvailableTable> getTableById(@PathVariable Long id){  
        AvailableTable availableTableById=tableServiceImplement.getTableById(id);
        System.out.println(availableTableById);
        return new ResponseEntity<>(availableTableById , HttpStatus.OK);
    }


}
