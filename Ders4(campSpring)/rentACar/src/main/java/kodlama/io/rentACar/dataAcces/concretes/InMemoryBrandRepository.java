package kodlama.io.rentACar.dataAcces.concretes;

import kodlama.io.rentACar.Entities.concretes.Brand;
import kodlama.io.rentACar.dataAcces.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu sınıf bir dataacces nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand>brands;

    public InMemoryBrandRepository() {
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Renault"));
        brands.add(new Brand(3,"Fiat"));
        brands.add(new Brand(4,"Audi"));
    }
    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
