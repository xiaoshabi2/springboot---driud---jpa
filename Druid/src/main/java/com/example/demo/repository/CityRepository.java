package com.example.demo.repository;

import com.example.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Druid
 * @description:
 * @author: ChenYu
 * @create: 2018-09-19 15:35
 **/
public interface CityRepository extends JpaRepository<City,Integer> {
}
