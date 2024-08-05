package com.example.yulpoint.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer usePoint;
    private Integer addPoint;
    private Integer balancePoint;
    private String reason;

    // 기본 생성자
    public Point() {}

    // 매개변수 있는 생성자
    public Point(Integer usePoint, Integer addPoint, Integer balancePoint, String reason) {
        this.usePoint = usePoint;
        this.addPoint = addPoint;
        this.balancePoint = balancePoint;
        this.reason = reason;
    }

    // Getter 및 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(Integer usePoint) {
        this.usePoint = usePoint;
    }

    public Integer getAddPoint() {
        return addPoint;
    }

    public void setAddPoint(Integer addPoint) {
        this.addPoint = addPoint;
    }

    public Integer getBalancePoint() {
        return balancePoint;
    }

    public void setBalancePoint(Integer balancePoint) {
        this.balancePoint = balancePoint;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
