package com.wolf.TravelScout.dao.user;

import com.wolf.TravelScout.model.user.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<DAOUser, Integer> {

    DAOUser findByUsername (String username);

    @Modifying
    @Query("Update DAOUser u set u.upcomingTrip = :upcomingTrip where u.userId = :userId")
    void updateUpcomingTrip(@Param(value = "userId") int userId, @Param(value = "upcomingTrip") String phone);
}
