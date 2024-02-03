package com.piruntha.userlocation.service;

import com.piruntha.userlocation.dto.request.UserLocationRequest;
import com.piruntha.userlocation.dto.response.UserLocationResponse;
import com.piruntha.userlocation.entity.UserLocation;
import com.piruntha.userlocation.exception.UserLocationException;
import com.piruntha.userlocation.repository.UserLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Optional<UserLocation> getCurrentUserLocation( int user_id) {
        Optional<UserLocation> currentUserLocation = userLocationRepository.findById(user_id);

        if (currentUserLocation.isPresent()) {
            UserLocation userLocation = currentUserLocation.get();
            return userLocationRepository.findById(user_id);

        } else {
            throw new UserLocationException("user {} current location not found"+ user_id);
        }
    }

    public UserLocation saveLocation(UserLocation location) {
        userLocationRepository.save(location);
        return location;
    }

}
