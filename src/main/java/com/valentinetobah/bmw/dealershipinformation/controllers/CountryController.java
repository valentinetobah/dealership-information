package com.valentinetobah.bmw.dealershipinformation.controllers;


import com.valentinetobah.bmw.dealershipinformation.entities.Country;
import com.valentinetobah.bmw.dealershipinformation.entities.Province;
import com.valentinetobah.bmw.dealershipinformation.services.CountryService;
import com.valentinetobah.bmw.dealershipinformation.services.ProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CountryController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/countries")
    public List<Country> getAllCountries(){
       return countryService.retrieveAll();
    }

    @GetMapping("/countries/{countryCode}")
    public Country getCountryByCountryCode(@PathVariable String countryCode){
        return countryService.findByCountryCode(countryCode);
    }

    @GetMapping("/countries/{countryCode}/provinces")
    public List<Province> getAllProvincesForCountryCode(@PathVariable String countryCode){
        return provinceService.retrieveProvincesForCountryCode(countryCode);
    }

}
