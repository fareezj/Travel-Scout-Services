package com.wolf.TravelScout.controller.user;

import com.wolf.TravelScout.dao.user.UserDetailsRepository;
import com.wolf.TravelScout.model.user.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class UserDetailsController {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @GetMapping({"/getCurrentUser/{username}"})
    public DAOUser getCurrentUser (@PathVariable String username) {
        return userDetailsRepository.findByUsername(username);
    }

    @Transactional
    @PutMapping("/updateTrip/{userId}/{upcomingTrip}")
    public void updateUpcomingTrips (@PathVariable int userId, @PathVariable String upcomingTrip) {
        userDetailsRepository.updateUpcomingTrip(userId, upcomingTrip);
    }
}
