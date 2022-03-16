package com.quentingenet.openweighttracker.service;

import com.quentingenet.openweighttracker.data.entity.WeightRecord;
import com.quentingenet.openweighttracker.data.repository.WeightRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightRecordService {

    @Autowired
    private WeightRecordRepository weightRecordRepository;

    public List<WeightRecord> getAllWeights() {
        return weightRecordRepository.findAll();
    }
}
