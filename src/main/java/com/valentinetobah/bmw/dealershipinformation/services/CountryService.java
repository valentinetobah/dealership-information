package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.Country;

import java.util.List;

public interface CountryService extends GenericService<Country> {
    Country findByCountryCode(String countryCode);
    Country findByName(String name);
    Country update(Country country, String id);
    List<Country> retrieveAll();
}
