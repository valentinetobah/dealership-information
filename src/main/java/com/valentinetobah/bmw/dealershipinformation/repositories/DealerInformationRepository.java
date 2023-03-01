package com.valentinetobah.bmw.dealershipinformation.repositories;

import com.valentinetobah.bmw.dealershipinformation.entities.DealershipInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerInformationRepository extends JpaRepository<DealershipInformation, Long> {

    DealershipInformation findByDealershipName(String dealershipName);

}
