package com.piruntha.userlocation.controller;

import com.piruntha.userlocation.dto.request.UserLocationRequest;
import com.piruntha.userlocation.entity.UserLocation;
import com.piruntha.userlocation.service.UserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserLocationController {
    @Autowired
    private UserLocationService userLocationService;
    @PostMapping("/{user_id}/locations")
    public ResponseEntity<String> addUserCurrentLocation(@RequestBody UserLocationRequest userLocationRequest, @PathVariable int user_id){
           return ResponseEntity.ok("Location record created for user " + user_id);
    }

//    @GetMapping("/{user_id}/locations")
//    public List<UserLocation> getUserCurrentLocation(@PathVariable int userId){
//        return userLocationService.getCurrentUserLocation(userId);
//    }
}
