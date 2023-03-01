package com.valentinetobah.bmw.dealershipinformation.repositories;

import com.valentinetobah.bmw.dealershipinformation.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCountryCode(String countryCode);
    Country findByName(String name);
}
