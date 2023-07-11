package ir.schoolservice.repository;

import ir.schoolservice.model.Dars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// to show to spring booth
public interface DarsRepository extends CrudRepository<Dars, Long> {
}
