package com.example.bike.Services;

import com.example.bike.Model.Bike;
import com.example.bike.Repository.BikeRepository;
import com.example.bike.Util.Constants;
import com.example.bike.VO.ServiceResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {
     @Autowired
    private BikeRepository bikeRepository;

     public ServiceResponse GetAllBikes() {
         ServiceResponse response = new ServiceResponse(Constants.ERROR_CODE);
         try {
             var bikes = bikeRepository.findAll();
             response.setData(bikes);
         }catch (Exception ex){
             response.setStatusMessage(Constants.ERROR_PROCESSING);
             response.setResponseCode(Constants.ERROR_CODE);
             return  response;
         }
         response.setResponseCode(Constants.SUCCESS_CODE);
         response.setStatusMessage(Constants.OPERATION_SUCCESS);
         return  response;
     }

     public  ServiceResponse GetBikeById(long id){
         ServiceResponse response = new ServiceResponse(Constants.ERROR_CODE);
         try{
             var bike = bikeRepository.getOne(id);
             response.setStatusMessage(Constants.OPERATION_SUCCESS);
             response.setResponseCode(Constants.SUCCESS_CODE);
             response.setData(bike);
             return  response;
         }catch (Exception ex )
         {
             response.setResponseCode(Constants.ERROR_CODE);
             response.setStatusMessage(Constants.ERROR_PROCESSING);
         }

        return response;
     }

    public ServiceResponse CreateBike(Bike bike){
        ServiceResponse response = new ServiceResponse(Constants.ERROR_CODE);
        try
        {
            bikeRepository.save(bike);
            response.setStatusMessage(Constants.OPERATION_SUCCESS);
            response.setResponseCode(Constants.ERROR_CODE);
        }catch (Exception ex)
        {
          response.setResponseCode(Constants.ERROR_CODE);
          response.setStatusMessage(Constants.ERROR_PROCESSING);
          return  response;
        }

        return  response;
    }
}
