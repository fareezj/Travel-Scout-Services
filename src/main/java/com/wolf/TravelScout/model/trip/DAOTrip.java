package com.wolf.TravelScout.model.trip;

import com.wolf.TravelScout.model.user.DAOUser;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trip")
public class DAOTrip {

    @Column(name = "trip_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripId;

    @Column(name = "host_id")
    private int hostId;

    @Column(name = "country")
    private String country;

    @Column(name = "trip_name")
    private String tripName;

    @Column(name = "date")
    private String tripDate;

    @Column(name = "trip_type")
    private String tripType;

    @Column(name = "friend_list")
    private String friendList;

    public DAOTrip() {}

    public DAOTrip(int tripId, int hostId, String country, String tripName, String tripDate, String tripType, String friendList) {
        this.tripId = tripId;
        this.hostId = hostId;
        this.country = country;
        this.tripName = tripName;
        this.tripDate = tripDate;
        this.tripType = tripType;
        this.friendList = friendList;
    }

    public DAOTrip(int hostId, String country, String tripName, String tripDate, String tripType, String friendList) {
        this.country = country;
        this.tripId = tripId;
        this.hostId = hostId;
        this.tripName = tripName;
        this.tripDate = tripDate;
        this.tripType = tripType;
        this.friendList = friendList;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getFriendList() {
        return friendList;
    }

    public void setFriendList(String friendList) {
        this.friendList = friendList;
    }
}
