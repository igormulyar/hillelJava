package database;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

/**
 * Created by IMulyar on 14.12.2015.
 */
public interface ProductDAO {

    Optional<Product> findById(int id);

    List<Product> findAll();

    void deleteById(int id);

    void update(Product product);

    void create(Product product);
}
