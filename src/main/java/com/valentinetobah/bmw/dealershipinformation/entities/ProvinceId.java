package com.valentinetobah.bmw.dealershipinformation.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProvinceId implements Serializable{

        private String provinceCode;

        private Country country;
}
