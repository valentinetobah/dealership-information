package com.valentinetobah.bmw.dealershipinformation.controllers;


import com.valentinetobah.bmw.dealershipinformation.entities.DealershipInformation;
import com.valentinetobah.bmw.dealershipinformation.entities.Province;
import com.valentinetobah.bmw.dealershipinformation.services.DealershipInformationService;
import com.valentinetobah.bmw.dealershipinformation.services.ProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DealershipController {

    @Autowired
    private DealershipInformationService dealershipInformationService;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/dealerships")
    public List<DealershipInformation> getAllDealerships(){
       return dealershipInformationService.retrieveAll();
    }

    @PostMapping("/dealerships")
    public DealershipInformation saveDealershipInformation(@RequestBody DealershipInformation dealershipInformation){

        String provinceCode = dealershipInformation.getProvince().getProvinceCode();
        Province province = provinceService.findByProvinceCode(provinceCode);

        if(province == null || province.equals(""))
            log.error("No Province Found for the Province Code Provided");

        dealershipInformation.setProvince(province);
        return dealershipInformationService.save(dealershipInformation);
    }

    @GetMapping("/dealerships/{dealershipId}")
    public DealershipInformation getDealershipInformation(@PathVariable Long dealershipId){
        return dealershipInformationService.findByID(dealershipId);
    }
    @PutMapping("/dealerships/{dealershipId}")
    public DealershipInformation updateDealershipInformation(@RequestBody DealershipInformation dealershipInformation,
                                                             @PathVariable Long dealershipId){
        return dealershipInformationService.update(dealershipInformation, dealershipId);
    }
}
