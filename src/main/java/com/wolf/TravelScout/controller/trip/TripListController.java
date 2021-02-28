package com.wolf.TravelScout.controller.trip;


import com.wolf.TravelScout.dao.trip.TripListRepository;
import com.wolf.TravelScout.model.trip.DAOTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TripListController {

    @Autowired
    TripListRepository tripListRepository;

    @PutMapping(value = "/addTrip")
    public DAOTrip addNewTrip(@RequestBody DAOTrip daoTrip) {
        return tripListRepository.save(daoTrip);
    }

    @GetMapping(value = "/getTrip")
    public List<DAOTrip> getTrip(){
        return tripListRepository.findAll();
    }

    @DeleteMapping(value = "/deleteTrip/{tripId}")
    public void deleteTripById(@PathVariable int tripId) {
        tripListRepository.deleteById(tripId);
    }
}
