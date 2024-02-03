package com.piruntha.userlocation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_location")
public class UserLocation {
    @Id
    @GeneratedValue
    @Column(name = "LocationId")
    private int location_id;
    @Column(name = "userId")
    private int user_id;
    @Column(name = "Latitude")
    private double latitude;
    @Column(name = "Longitude")
    private double longitude;
    @Column(name = "UpdatedTime")
    private LocalDateTime updateTime;
}
