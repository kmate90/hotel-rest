package hu.progmasters.hotelrest.domain.dto;

import hu.progmasters.hotelrest.domain.Hotel;
import hu.progmasters.hotelrest.domain.HotelRating;

public class HotelListItem {

    private Long id;
    private String name;
    private HotelRating stars;


    public HotelListItem(Hotel hotel) {
        this.id=hotel.getId();
        this.name=hotel.getName();
        this.stars=hotel.getStars();
    }
}
