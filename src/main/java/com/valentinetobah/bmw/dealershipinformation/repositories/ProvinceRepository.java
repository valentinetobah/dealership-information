package com.valentinetobah.bmw.dealershipinformation.repositories;

import com.valentinetobah.bmw.dealershipinformation.entities.Country;
import com.valentinetobah.bmw.dealershipinformation.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> {

    Province findByProvinceCode(String provinceCode);
    Province findByName(String name);
    List<Province> findByCountry_CountryCode(String countryCode);
}
