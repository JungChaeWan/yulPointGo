package com.example.yulpoint.controller;

import com.example.yulpoint.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/points")
public class PointController {

    @Autowired
    private PointService pointService;

    @GetMapping("/{id}")
    public ResponseEntity<Point> getPoint(@PathVariable Long id) {
        Point point = pointService.getPointById(id);
        if (point != null) {
            return ResponseEntity.ok(point);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Point> createPoint(@RequestBody Point point) {
        Point createdPoint = pointService.createPoint(point);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPoint);
    }

    // 다른 CRUD 메서드들...
}
