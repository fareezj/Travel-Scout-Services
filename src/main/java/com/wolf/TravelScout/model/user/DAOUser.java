package com.wolf.TravelScout.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser {

    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "upcoming_trip")
    private String upcomingTrip;

    public DAOUser() {}

    public DAOUser(int userId, String username, String password, String firstName, String phone, String email, String profileImage, String upcomingTrip) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.profileImage = profileImage;
        this.upcomingTrip = upcomingTrip;
    }

    public DAOUser(String username, String password, String firstName, String phone, String email, String profileImage, String upcomingTrip) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.profileImage = profileImage;
        this.upcomingTrip = upcomingTrip;
    }

    public int getId() {
        return userId;
    }

    public void setId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String lastName) {
        this.phone = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getUpcomingTrip() {
        return upcomingTrip;
    }

    public void setUpcomingTrip(String upcomingTrip) {
        this.upcomingTrip = upcomingTrip;
    }
}
