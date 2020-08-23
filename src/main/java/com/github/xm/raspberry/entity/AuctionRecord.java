package com.github.xm.raspberry.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AuctionRecord implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer auctionId;

    private Date auctionTime;

    private BigDecimal auctionPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public Date getAuctionTime() {
        return auctionTime;
    }

    public void setAuctionTime(Date auctionTime) {
        this.auctionTime = auctionTime;
    }

    public BigDecimal getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(BigDecimal auctionPrice) {
        this.auctionPrice = auctionPrice;
    }
}