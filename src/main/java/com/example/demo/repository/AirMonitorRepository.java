package com.example.demo.repository;

import com.example.demo.model.AirMonitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirMonitorRepository extends CrudRepository<AirMonitor, String> {

}
