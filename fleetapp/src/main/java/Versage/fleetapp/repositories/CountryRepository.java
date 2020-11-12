package Versage.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Versage.fleetapp.models.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
