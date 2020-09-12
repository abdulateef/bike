package com.example.bike.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponse {
    private String statusMessage;
    private int responseCode;
    private Object data;
    public ServiceResponse(int responseCode){
        this.responseCode = responseCode;

    }
}
