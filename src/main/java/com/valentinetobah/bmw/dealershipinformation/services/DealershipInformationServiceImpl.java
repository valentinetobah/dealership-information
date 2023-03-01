package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.DealershipInformation;
import com.valentinetobah.bmw.dealershipinformation.repositories.DealerInformationRepository;
import com.valentinetobah.bmw.dealershipinformation.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealershipInformationServiceImpl implements DealershipInformationService {

    @Autowired
    private DealerInformationRepository dealerInformationRepository;

    @Autowired
    private ProvinceRepository provinceRepository;


    @Override
    public DealershipInformation save(DealershipInformation dealershipInformation){
        return dealerInformationRepository.save(dealershipInformation);
    }
    @Override
    public DealershipInformation findByDealershipName(String dealershipName){
        return dealerInformationRepository.findByDealershipName(dealershipName);
    }

    @Override
    public DealershipInformation findByID(Long dealershipId){
        return dealerInformationRepository.findById(dealershipId).get();
    }
    @Override
    public DealershipInformation update(DealershipInformation dealershipInformation, Long dealershipId){
        DealershipInformation existingDealershipInformation = dealerInformationRepository.findById(dealershipId).get();

        if(existingDealershipInformation != null){
            if(!existingDealershipInformation.getDealershipName().equals(dealershipInformation.getDealershipName()) )
                existingDealershipInformation.setDealershipName(dealershipInformation.getDealershipName());

            if(!existingDealershipInformation.getLine1().equals(dealershipInformation.getLine1()) )
                existingDealershipInformation.setLine1(dealershipInformation.getLine1());

            if(!existingDealershipInformation.getLine2().equals(dealershipInformation.getLine2()) )
            existingDealershipInformation.setLine2(dealershipInformation.getLine2());

            if(!existingDealershipInformation.getSuburb().equals(dealershipInformation.getSuburb()) )
                existingDealershipInformation.setSuburb(dealershipInformation.getSuburb());

            if(!existingDealershipInformation.getCity().equals(dealershipInformation.getCity()) )
                existingDealershipInformation.setCity(dealershipInformation.getCity());

            if(!existingDealershipInformation.getProvince().equals(dealershipInformation.getProvince())
                    && provinceRepository.findByProvinceCode(dealershipInformation.getProvince().getProvinceCode()) != null)
                existingDealershipInformation
                        .setProvince(provinceRepository.findByProvinceCode(dealershipInformation.getProvince().getProvinceCode()));

            if(existingDealershipInformation.getPostalCode() != (dealershipInformation.getPostalCode()) )
                existingDealershipInformation.setPostalCode(dealershipInformation.getPostalCode());

            return dealerInformationRepository.save(existingDealershipInformation);
        }

        return null;
    }
    @Override
    public List<DealershipInformation> retrieveAll(){
        return dealerInformationRepository.findAll();
    }

}
