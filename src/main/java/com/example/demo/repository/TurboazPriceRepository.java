package com.example.demo.repository;

import com.example.demo.entity.TurboazPEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public interface TurboazPriceRepository extends CrudRepository< TurboazPEntity,Long> {

    TurboazPEntity findById(long id);
    ArrayList <TurboazPEntity> findAll ();
}
