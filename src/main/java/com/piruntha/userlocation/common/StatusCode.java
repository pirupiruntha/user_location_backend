package com.piruntha.userlocation.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public enum StatusCode {
    S000("Success"),
    E401("Unauthorized"),
    E403("Forbidden"),
    E404("Resource not found"),
    E405("Not Allowed to execute");
    private final String message;
}

