package rentier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentier.model.Homeware;
import rentier.model.HomewarePrices;

public interface HomewarePricesRepository extends JpaRepository<HomewarePrices, Long>{

}
