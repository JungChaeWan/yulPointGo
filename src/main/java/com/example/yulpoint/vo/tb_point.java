package com.example.yulpoint.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_point")
public class tb_point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
    @Column(name = "\"usePoint\"")
    private Integer usePoint;
    @Column(name = "\"addPoint\"")
    private Integer addPoint;
    @Column(name = "\"balancePoint\"")
    private Integer balancePoint;
    private String reason;
    private String owner;
    @Column(name = "\"pointType\"")
    private String pointType;
    @Column(name = "\"regDttm\"")
    private String regDttm;
    public tb_point() {}

    public tb_point(Integer usePoint, Integer addPoint, Integer balancePoint, String reason, String owner, String pointType) {
        this.usePoint = usePoint;
        this.addPoint = addPoint;
        this.balancePoint = balancePoint;
        this.reason = reason;
        this.owner = owner;
        this.pointType = pointType;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    public String getRegDttm() {
        return regDttm;
    }

    public void setRegDttm(String regDttm) {
        this.regDttm = regDttm;
    }
}
