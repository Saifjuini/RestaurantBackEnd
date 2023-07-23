package project.restaurant.RestaurantBackEnd.Service.TableServiceImplement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.restaurant.RestaurantBackEnd.Enumeration.Status;
import project.restaurant.RestaurantBackEnd.Model.AvailableTable;
import project.restaurant.RestaurantBackEnd.Repository.TableRepo;
import project.restaurant.RestaurantBackEnd.Service.TableService;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TableServiceImplement implements TableService {


    private final TableRepo tableRepo;

    @Override
    public AvailableTable addTable(AvailableTable tableBook) {
        return tableRepo.save(tableBook);
    }

    @Override
    public List<AvailableTable> listTables() {
        return tableRepo.findAll();
    }

    @Override
    public void deleteTable(Long id) {
    tableRepo.deleteById(id);
    }

    @Override
    public List<AvailableTable> getAvailbeTables(Status status) {
        return tableRepo.findTableBooksByStatus(status);
    }
}
