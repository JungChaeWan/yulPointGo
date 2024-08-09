package com.example.yulpoint.service;

import com.example.yulpoint.rep.PointRepository;
import com.example.yulpoint.vo.tb_point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {

    @Autowired
    private PointRepository pointRepository;

    public tb_point getPointsByOwner(String owner, String pointType) {
        return pointRepository.findFirstByOwnerAndPointTypeOrderBySeqDesc(owner, pointType);
    }

    public tb_point savePoint(tb_point point) {
        tb_point selPoint = pointRepository.findFirstByOwnerAndPointTypeOrderBySeqDesc(point.getOwner(), point.getPointType());
        if (point.getUsePoint() != null && point.getUsePoint() > 0) {
            point.setBalancePoint(selPoint.getBalancePoint()-point.getUsePoint());
        }

        if (point.getAddPoint() != null && point.getAddPoint() > 0) {
            point.setBalancePoint(selPoint.getBalancePoint()+point.getAddPoint());
        }

        return pointRepository.save(point);
    }
}
