package com.valentinetobah.bmw.dealershipinformation.entities;


import lombok.*;

import javax.persistence.*;


@Entity
@Data
public class Country {

    @Id
    private String countryCode;
    @Column(nullable = false)
    private String name;

}
