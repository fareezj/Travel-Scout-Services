package com.wolf.TravelScout.model.dashboard;

import javax.persistence.*;

@Entity
public class DashboardDAO {

    @Column(name = "dashboard_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dashboard_message")
    private String message;

    public DashboardDAO() {
    }

    public DashboardDAO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
