package com.example.yulpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    private PointRepository pointRepository;

    public Point getPointById(Long id) {
        return pointRepository.findById(id).orElse(null);
    }

    public Point createPoint(Point point) {
        return pointRepository.save(point);
    }

    // 추가적인 비즈니스 로직...
}
