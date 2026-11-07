package com.swappy.hotel.service.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swappy.hotel.service.entities.Hotel;
import com.swappy.hotel.service.exceptions.ResourceNotFoundException;
import com.swappy.hotel.service.repositories.HotelRepository;
import com.swappy.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // create
    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    // get all
    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    // get single
    @Override
    public Hotel get(Long id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id: " + id));
    }
}