package com.piruntha.userlocation.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserLocationResponse {
    private int location_id;
    private double latitude;
    private double longitude;
    private LocalDateTime updateTime;

}
