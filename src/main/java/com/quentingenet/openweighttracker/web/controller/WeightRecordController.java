package com.quentingenet.openweighttracker.web.controller;

import com.quentingenet.openweighttracker.data.entity.WeightRecord;
import com.quentingenet.openweighttracker.service.WeightRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/v1/weights")
public class WeightRecordController {

    @Autowired
    private WeightRecordService weightRecordService;

    @GetMapping("/all")
    public ResponseEntity<List<WeightRecord>> getAllWeights() {
        try {
            return ResponseEntity.ok(weightRecordService.getAllWeights());
        } catch (NoSuchElementException nse) {
            return ResponseEntity.notFound().build();
        }

    };
}
