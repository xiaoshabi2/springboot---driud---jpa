package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Druid
 * @description:
 * @author: ChenYu
 * @create: 2018-09-19 15:36
 **/
@RestController
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping(value = "saveCity")
    public String saveCity(String cityName,String cityIntroduce){
        City city = new City(cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

}
