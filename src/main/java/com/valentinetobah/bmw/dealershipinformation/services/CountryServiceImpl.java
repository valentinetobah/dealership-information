package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.Country;
import com.valentinetobah.bmw.dealershipinformation.entities.Province;
import com.valentinetobah.bmw.dealershipinformation.repositories.CountryRepository;
import com.valentinetobah.bmw.dealershipinformation.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public Country findByCountryCode(String countryCode) {
        return countryRepository.findByCountryCode(countryCode);
    }

    @Override
    public Country update(Country country, String id) {

        Country existingCountry = countryRepository.findById(id).get();
        if(existingCountry != null)
            return countryRepository.save(country);

        return null;
    }

    @Override
    public List<Country> retrieveAll() {
        return countryRepository.findAll().stream().sorted(Comparator.comparing(Country::getName))
                .collect(Collectors.toList());
    }
}
