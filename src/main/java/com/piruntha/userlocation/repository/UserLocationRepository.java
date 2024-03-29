package com.piruntha.userlocation.repository;

import com.piruntha.userlocation.entity.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation, Integer> {
}
