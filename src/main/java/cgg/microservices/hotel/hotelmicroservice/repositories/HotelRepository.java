package cgg.microservices.hotel.hotelmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.microservices.hotel.hotelmicroservice.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
