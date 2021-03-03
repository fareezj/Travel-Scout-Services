package com.wolf.TravelScout.controller.trip;


import com.wolf.TravelScout.dao.trip.TripListRepository;
import com.wolf.TravelScout.model.JwtResponse;
import com.wolf.TravelScout.model.dashboard.DashboardDAO;
import com.wolf.TravelScout.model.trip.DAOTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<?> deleteTripById(@PathVariable int tripId) {
        tripListRepository.deleteById(tripId);
        return ResponseEntity.ok(new DashboardDAO("Trip Deleted"));
    }

    @PutMapping("/updateTrip/{tripId}")
    public DAOTrip updateTrip(@PathVariable int tripId, @RequestBody DAOTrip tripDetails) {

        Optional<DAOTrip> trip = tripListRepository.findById(tripId);
        if(!trip.isPresent()){
            return null;
        }
        return tripListRepository.save(tripDetails);

    }
}
