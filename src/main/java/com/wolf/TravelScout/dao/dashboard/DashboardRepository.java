package com.wolf.TravelScout.dao.dashboard;


import com.wolf.TravelScout.model.dashboard.DashboardDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends JpaRepository<DashboardDAO, Integer> {

}
