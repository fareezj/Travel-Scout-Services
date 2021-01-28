package com.wolf.TravelScout.model.user;

public class UserDTO {

    private String username;
    private String password;
    private String firstName;
    private String phone;
    private String email;
    private String profileImage;
    private String upcomingTrip;

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

    public String getUpcomingTrip() {
        return upcomingTrip;
    }

    public void setUpcomingTrip(String upcomingTrip) {
        this.upcomingTrip = upcomingTrip;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
