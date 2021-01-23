package com.wolf.TravelScout.dao.addtrip;

import com.wolf.TravelScout.model.user.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchFriendRepository extends JpaRepository<DAOUser, Integer> {

    List<DAOUser> findByUsername(String username);
}
