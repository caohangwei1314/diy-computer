package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Monitor implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String productType;

    private String positioning;

    private String size;

    private String optimalResolution;

    private String ratio;

    private String hd;

    private String panelType;

    private String backlightType;

    private String dynamicContrast;

    private String staticContrast;

    private String responseTime;

    private String pointDistance;

    private String brightness;

    private String visibleArea;

    private String visibleAngle;

    private String displayColor;

    private String scanning;

    private String refreshRate;

    private String videoInterface;

    private String otherInterface;

    private Integer score;

    private String image;

    private BigDecimal price;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPositioning() {
        return positioning;
    }

    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOptimalResolution() {
        return optimalResolution;
    }

    public void setOptimalResolution(String optimalResolution) {
        this.optimalResolution = optimalResolution;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public String getBacklightType() {
        return backlightType;
    }

    public void setBacklightType(String backlightType) {
        this.backlightType = backlightType;
    }

    public String getDynamicContrast() {
        return dynamicContrast;
    }

    public void setDynamicContrast(String dynamicContrast) {
        this.dynamicContrast = dynamicContrast;
    }

    public String getStaticContrast() {
        return staticContrast;
    }

    public void setStaticContrast(String staticContrast) {
        this.staticContrast = staticContrast;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getPointDistance() {
        return pointDistance;
    }

    public void setPointDistance(String pointDistance) {
        this.pointDistance = pointDistance;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getVisibleArea() {
        return visibleArea;
    }

    public void setVisibleArea(String visibleArea) {
        this.visibleArea = visibleArea;
    }

    public String getVisibleAngle() {
        return visibleAngle;
    }

    public void setVisibleAngle(String visibleAngle) {
        this.visibleAngle = visibleAngle;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getScanning() {
        return scanning;
    }

    public void setScanning(String scanning) {
        this.scanning = scanning;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getVideoInterface() {
        return videoInterface;
    }

    public void setVideoInterface(String videoInterface) {
        this.videoInterface = videoInterface;
    }

    public String getOtherInterface() {
        return otherInterface;
    }

    public void setOtherInterface(String otherInterface) {
        this.otherInterface = otherInterface;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Monitor other = (Monitor) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getPositioning() == null ? other.getPositioning() == null : this.getPositioning().equals(other.getPositioning()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getOptimalResolution() == null ? other.getOptimalResolution() == null : this.getOptimalResolution().equals(other.getOptimalResolution()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getHd() == null ? other.getHd() == null : this.getHd().equals(other.getHd()))
            && (this.getPanelType() == null ? other.getPanelType() == null : this.getPanelType().equals(other.getPanelType()))
            && (this.getBacklightType() == null ? other.getBacklightType() == null : this.getBacklightType().equals(other.getBacklightType()))
            && (this.getDynamicContrast() == null ? other.getDynamicContrast() == null : this.getDynamicContrast().equals(other.getDynamicContrast()))
            && (this.getStaticContrast() == null ? other.getStaticContrast() == null : this.getStaticContrast().equals(other.getStaticContrast()))
            && (this.getResponseTime() == null ? other.getResponseTime() == null : this.getResponseTime().equals(other.getResponseTime()))
            && (this.getPointDistance() == null ? other.getPointDistance() == null : this.getPointDistance().equals(other.getPointDistance()))
            && (this.getBrightness() == null ? other.getBrightness() == null : this.getBrightness().equals(other.getBrightness()))
            && (this.getVisibleArea() == null ? other.getVisibleArea() == null : this.getVisibleArea().equals(other.getVisibleArea()))
            && (this.getVisibleAngle() == null ? other.getVisibleAngle() == null : this.getVisibleAngle().equals(other.getVisibleAngle()))
            && (this.getDisplayColor() == null ? other.getDisplayColor() == null : this.getDisplayColor().equals(other.getDisplayColor()))
            && (this.getScanning() == null ? other.getScanning() == null : this.getScanning().equals(other.getScanning()))
            && (this.getRefreshRate() == null ? other.getRefreshRate() == null : this.getRefreshRate().equals(other.getRefreshRate()))
            && (this.getVideoInterface() == null ? other.getVideoInterface() == null : this.getVideoInterface().equals(other.getVideoInterface()))
            && (this.getOtherInterface() == null ? other.getOtherInterface() == null : this.getOtherInterface().equals(other.getOtherInterface()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getPositioning() == null) ? 0 : getPositioning().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getOptimalResolution() == null) ? 0 : getOptimalResolution().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getHd() == null) ? 0 : getHd().hashCode());
        result = prime * result + ((getPanelType() == null) ? 0 : getPanelType().hashCode());
        result = prime * result + ((getBacklightType() == null) ? 0 : getBacklightType().hashCode());
        result = prime * result + ((getDynamicContrast() == null) ? 0 : getDynamicContrast().hashCode());
        result = prime * result + ((getStaticContrast() == null) ? 0 : getStaticContrast().hashCode());
        result = prime * result + ((getResponseTime() == null) ? 0 : getResponseTime().hashCode());
        result = prime * result + ((getPointDistance() == null) ? 0 : getPointDistance().hashCode());
        result = prime * result + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        result = prime * result + ((getVisibleArea() == null) ? 0 : getVisibleArea().hashCode());
        result = prime * result + ((getVisibleAngle() == null) ? 0 : getVisibleAngle().hashCode());
        result = prime * result + ((getDisplayColor() == null) ? 0 : getDisplayColor().hashCode());
        result = prime * result + ((getScanning() == null) ? 0 : getScanning().hashCode());
        result = prime * result + ((getRefreshRate() == null) ? 0 : getRefreshRate().hashCode());
        result = prime * result + ((getVideoInterface() == null) ? 0 : getVideoInterface().hashCode());
        result = prime * result + ((getOtherInterface() == null) ? 0 : getOtherInterface().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", classId=").append(classId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", productType=").append(productType);
        sb.append(", positioning=").append(positioning);
        sb.append(", size=").append(size);
        sb.append(", optimalResolution=").append(optimalResolution);
        sb.append(", ratio=").append(ratio);
        sb.append(", hd=").append(hd);
        sb.append(", panelType=").append(panelType);
        sb.append(", backlightType=").append(backlightType);
        sb.append(", dynamicContrast=").append(dynamicContrast);
        sb.append(", staticContrast=").append(staticContrast);
        sb.append(", responseTime=").append(responseTime);
        sb.append(", pointDistance=").append(pointDistance);
        sb.append(", brightness=").append(brightness);
        sb.append(", visibleArea=").append(visibleArea);
        sb.append(", visibleAngle=").append(visibleAngle);
        sb.append(", displayColor=").append(displayColor);
        sb.append(", scanning=").append(scanning);
        sb.append(", refreshRate=").append(refreshRate);
        sb.append(", videoInterface=").append(videoInterface);
        sb.append(", otherInterface=").append(otherInterface);
        sb.append(", score=").append(score);
        sb.append(", image=").append(image);
        sb.append(", price=").append(price);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}