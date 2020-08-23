package com.github.xm.raspberry.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Auction implements Serializable {
    private Integer auctionId;

    private String auctionName;

    private BigDecimal auctionStartPrice;

    private BigDecimal auctionUpset;

    private Date auctionStartTime;

    private Date auctionEndTime;

    private String auctionPic;

    private String auctionDesc;

    private static final long serialVersionUID = 1L;

    public Integer getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName == null ? null : auctionName.trim();
    }

    public BigDecimal getAuctionStartPrice() {
        return auctionStartPrice;
    }

    public void setAuctionStartPrice(BigDecimal auctionStartPrice) {
        this.auctionStartPrice = auctionStartPrice;
    }

    public BigDecimal getAuctionUpset() {
        return auctionUpset;
    }

    public void setAuctionUpset(BigDecimal auctionUpset) {
        this.auctionUpset = auctionUpset;
    }

    public Date getAuctionStartTime() {
        return auctionStartTime;
    }

    public void setAuctionStartTime(Date auctionStartTime) {
        this.auctionStartTime = auctionStartTime;
    }

    public Date getAuctionEndTime() {
        return auctionEndTime;
    }

    public void setAuctionEndTime(Date auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
    }

    public String getAuctionPic() {
        return auctionPic;
    }

    public void setAuctionPic(String auctionPic) {
        this.auctionPic = auctionPic == null ? null : auctionPic.trim();
    }

    public String getAuctionDesc() {
        return auctionDesc;
    }

    public void setAuctionDesc(String auctionDesc) {
        this.auctionDesc = auctionDesc == null ? null : auctionDesc.trim();
    }
}