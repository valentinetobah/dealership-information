package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.Province;

import java.util.List;

public interface ProvinceService extends GenericService<Province> {

    Province findByProvinceCode(String provinceCode);

    Province findByName(String name);

    Province update(Province province, String id);

    List<Province> retrieveProvincesForCountryCode(String countryCode);
}
