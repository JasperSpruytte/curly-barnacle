package be.jasperspruytte.zeticon.assignment.assignment.db;

import be.jasperspruytte.zeticon.assignment.assignment.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
