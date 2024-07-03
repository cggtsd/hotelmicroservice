package cgg.microservices.hotel.hotelmicroservice.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cgg.microservices.hotel.hotelmicroservice.entities.Hotel;
import cgg.microservices.hotel.hotelmicroservice.exceptions.ResourceNotFoundException;
import cgg.microservices.hotel.hotelmicroservice.repositories.HotelRepository;
import cgg.microservices.hotel.hotelmicroservice.services.HotelService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!"));
    }

}
