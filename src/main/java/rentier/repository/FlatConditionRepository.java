package rentier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentier.model.FlatCondition;
import rentier.model.Homeware;

public interface FlatConditionRepository extends JpaRepository<FlatCondition, Long>{

}
