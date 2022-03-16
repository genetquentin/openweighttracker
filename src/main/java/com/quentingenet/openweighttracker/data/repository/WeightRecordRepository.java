package com.quentingenet.openweighttracker.data.repository;

import com.quentingenet.openweighttracker.data.entity.WeightRecord;
import com.sun.xml.bind.v2.TODO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeightRecordRepository extends JpaRepository<WeightRecord, Integer> {

    //TODO: find all weight for an specific users
}
