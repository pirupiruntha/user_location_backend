package com.piruntha.userlocation.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserLocationRequest {
    private int user_id;
    private double latitude;
    private double longitude;
}
