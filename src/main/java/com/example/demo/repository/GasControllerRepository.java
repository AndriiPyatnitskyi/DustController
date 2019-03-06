package com.example.demo.repository;

import com.example.demo.model.GasController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasControllerRepository extends CrudRepository<GasController, String> {

}
