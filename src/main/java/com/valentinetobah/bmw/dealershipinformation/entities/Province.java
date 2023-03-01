package com.valentinetobah.bmw.dealershipinformation.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@IdClass(ProvinceId.class)
public class Province {

    @Id
    private String provinceCode;
    @Column(nullable = false)
    private String name;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "countryCode", nullable = false)
    private Country country;

}
