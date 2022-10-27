package kodlama.io.rentACar.dataAcces.abstracts;

import kodlama.io.rentACar.Entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
