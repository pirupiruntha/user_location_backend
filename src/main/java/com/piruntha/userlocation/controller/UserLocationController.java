package com.piruntha.userlocation.controller;

import com.piruntha.userlocation.common.StatusCode;
import com.piruntha.userlocation.dto.request.UserLocationRequest;
import com.piruntha.userlocation.dto.response.ApiResponse;
import com.piruntha.userlocation.dto.response.UserLocationResponse;
import com.piruntha.userlocation.entity.UserLocation;
import com.piruntha.userlocation.exception.UserLocationException;
import com.piruntha.userlocation.service.UserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserLocationController {
    @Autowired
    private UserLocationService userLocationService;
    @PostMapping("/{user_id}/locations")
    public ResponseEntity<ApiResponse> addUserCurrentLocation(@RequestBody UserLocationRequest userLocationRequest, @PathVariable int user_id) throws UserLocationException {
        return ResponseEntity.ok(ApiResponse.forStatus(StatusCode.S000)
                .withMessage(StatusCode.S000.getMessage())
                .withPayload(userLocationService.addUserLocation(userLocationRequest, user_id)));
    }

    @GetMapping("/{user_id}/location")
    public ResponseEntity<ApiResponse> getUserCurrentLocation(@PathVariable int userId) throws UserLocationException{
        return ResponseEntity.ok(ApiResponse.forStatus(StatusCode.S000)
                .withMessage(StatusCode.S000.getMessage())
                .withPayload(userLocationService.getCurrentUserLocation(userId)));
    }

    @MessageMapping("/{user_id}/user-locations")
    public UserLocation sendUserLocation(@Payload UserLocation userLocation){
        return userLocationService.saveLocation(userLocation);

    }
}
