package com.valentinetobah.bmw.dealershipinformation.services;


import com.valentinetobah.bmw.dealershipinformation.entities.DealershipInformation;

import java.util.List;

public interface GenericService<T> {
    T save(T t);
}
