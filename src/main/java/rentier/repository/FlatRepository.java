package rentier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentier.model.Flat;

public interface FlatRepository extends JpaRepository<Flat, Long>{

}
