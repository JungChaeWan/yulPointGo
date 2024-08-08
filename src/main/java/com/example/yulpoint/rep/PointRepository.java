package com.example.yulpoint.rep;

import com.example.yulpoint.vo.tb_point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointRepository extends JpaRepository<tb_point, Long> {
    tb_point findFirstByOwnerAndPointTypeOrderBySeqDesc(String owner, String pointType);
}
