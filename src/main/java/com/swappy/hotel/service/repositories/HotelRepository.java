package com.swappy.hotel.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swappy.hotel.service.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}