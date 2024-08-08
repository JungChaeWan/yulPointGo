package com.example.yulpoint.controller;

import com.example.yulpoint.service.PointService;
import com.example.yulpoint.vo.tb_point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PointController {

    @Autowired
    private PointService pointService;

    @GetMapping("/selPoints")
    public tb_point getPointsByOwner(@RequestParam String owner, @RequestParam String pointType) {
        return pointService.getPointsByOwner(owner, pointType);
    }

    @GetMapping("/add")
    public tb_point addPoint(@ModelAttribute tb_point point) {
        return pointService.savePoint(point);
    }

}
