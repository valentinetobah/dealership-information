package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.Province;
import com.valentinetobah.bmw.dealershipinformation.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService{

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public Province findByProvinceCode(String provinceCode) {
        return provinceRepository.findByProvinceCode(provinceCode);
    }

    @Override
    public Province findByName(String name) {
        return provinceRepository.findByName(name);
    }

    @Override
    public Province update(Province province, String id) {

        Province existingProvince = provinceRepository.findById(id).get();
        if(existingProvince != null)
            return provinceRepository.save(province);

        return null;
    }

    @Override
    public List<Province> retrieveProvincesForCountryCode(String countryCode) {
        return provinceRepository.findByCountry_CountryCode(countryCode);
    }

}
