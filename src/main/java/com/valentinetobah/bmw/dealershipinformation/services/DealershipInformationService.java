package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.DealershipInformation;

import java.util.List;

public interface DealershipInformationService extends GenericService<DealershipInformation> {

    DealershipInformation findByID(Long id);
    DealershipInformation findByDealershipName(String dealershipName);
    DealershipInformation update(DealershipInformation dealershipInformation, Long id);
    List<DealershipInformation> retrieveAll();
}
