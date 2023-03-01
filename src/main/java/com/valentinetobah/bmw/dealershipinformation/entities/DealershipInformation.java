package com.valentinetobah.bmw.dealershipinformation.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class DealershipInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dealershipId;
    @Column(nullable = false)
    private String dealershipName;
    @Column(nullable = false)
    private String line1;
    private String line2;
    private String suburb;
    @Column(nullable = false)
    private String city;
    @ManyToOne(optional = false)
    @JoinColumns({@JoinColumn(name="provinceCode") , @JoinColumn(name="countryCode")})
    private Province province;
    @Column(nullable = false)
    private int postalCode;

}
