package com.example.bike.Controllers;

import com.example.bike.Model.Bike;
import com.example.bike.Services.BikeService;
import com.example.bike.VO.ServiceResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/bikes/")
public class BikeController{

    @Autowired
    private BikeService bikeService;
    @GetMapping("/all")
    public ResponseEntity<ServiceResponse> GetBilkes(){
        var result =  bikeService.GetAllBikes();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ServiceResponse Create(@RequestBody Bike bike)
    {
        return  bikeService.CreateBike(bike);
    }

    @GetMapping("/{id}")
    public  ServiceResponse GetById(@PathVariable("id") long id)
    {
        return  bikeService.GetBikeById(id);
    }
}
