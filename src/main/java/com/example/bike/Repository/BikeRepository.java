package com.example.bike.Repository;
import com.example.bike.Model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository <Bike, Long> {
    public Bike GetBikeById(long id);
}
