package Versage.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Versage.fleetapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
