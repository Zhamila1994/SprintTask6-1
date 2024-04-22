package kz.bitlab.techorda.repository;

import kz.bitlab.techorda.model.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorsRepository extends JpaRepository<Operators,Long> {
}
