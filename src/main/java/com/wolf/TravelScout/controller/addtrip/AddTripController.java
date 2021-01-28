package com.wolf.TravelScout.controller.addtrip;

import com.wolf.TravelScout.dao.addtrip.SearchFriendRepository;
import com.wolf.TravelScout.model.dashboard.DashboardDAO;
import com.wolf.TravelScout.model.user.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddTripController {

    @Autowired
    SearchFriendRepository searchFriendRepository;

    @GetMapping({ "/searchfriend/{username}" })
    public List<DAOUser> searchFriend(@PathVariable String username) {
        return searchFriendRepository.findByUsernameContaining(username);
    }
}
