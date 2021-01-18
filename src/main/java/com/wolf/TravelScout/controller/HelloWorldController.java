package com.wolf.TravelScout.controller;

import com.wolf.TravelScout.dao.dashboard.DashboardRepository;
import com.wolf.TravelScout.model.dashboard.DashboardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    DashboardRepository dashboardRepository;

    @RequestMapping({ "/hello" })
    public List<DashboardDAO> firstPage() {
        return dashboardRepository.findAll();
    }

}