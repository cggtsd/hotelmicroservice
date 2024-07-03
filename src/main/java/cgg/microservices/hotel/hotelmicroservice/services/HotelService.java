package cgg.microservices.hotel.hotelmicroservice.services;

import java.util.List;

import cgg.microservices.hotel.hotelmicroservice.entities.Hotel;

public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    // getall
    List<Hotel> getAllHotels();

    // get single
    Hotel getHotelById(String id);

}