package com.wolf.TravelScout.dao.trip;

import com.wolf.TravelScout.model.trip.DAOTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripListRepository extends JpaRepository<DAOTrip, Integer> {


}
