package com.piruntha.userlocation.service;

import com.piruntha.userlocation.dto.request.UserLocationRequest;
import com.piruntha.userlocation.entity.UserLocation;
import com.piruntha.userlocation.repository.UserLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserLocationService {
    @Autowired
    private UserLocationRepository userLocationRepository;

    public UserLocation addUserLocation( UserLocationRequest userLocationRequest, int user_id){
        UserLocation location = new UserLocation();
        location.setUser_id(user_id);
        location.setLatitude(userLocationRequest.getLatitude());
        location.setLongitude(userLocationRequest.getLongitude());
        location.setUpdateTime(LocalDateTime.now());
        return userLocationRepository.save(location);
    }
    
}
