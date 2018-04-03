package rentier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentier.model.Homeware;

public interface HomewareRepository extends JpaRepository<Homeware, Long>{

}
