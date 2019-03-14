package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Cpu implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String appropriateType;

    private String series;

    private String craftsmanship;

    private String code;

    private String slotType;

    private String packageSize;

    private String cpuFrequency;

    private String accelerationFrequency;

    private String coreNumber;

    private String threadNumber;

    private String thirdCache;

    private String busSpecification;

    private String thermalPower;

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

    public String getAppropriateType() {
        return appropriateType;
    }

    public void setAppropriateType(String appropriateType) {
        this.appropriateType = appropriateType;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCraftsmanship() {
        return craftsmanship;
    }

    public void setCraftsmanship(String craftsmanship) {
        this.craftsmanship = craftsmanship;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public String getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(String cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public String getAccelerationFrequency() {
        return accelerationFrequency;
    }

    public void setAccelerationFrequency(String accelerationFrequency) {
        this.accelerationFrequency = accelerationFrequency;
    }

    public String getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(String coreNumber) {
        this.coreNumber = coreNumber;
    }

    public String getThreadNumber() {
        return threadNumber;
    }

    public void setThreadNumber(String threadNumber) {
        this.threadNumber = threadNumber;
    }

    public String getThirdCache() {
        return thirdCache;
    }

    public void setThirdCache(String thirdCache) {
        this.thirdCache = thirdCache;
    }

    public String getBusSpecification() {
        return busSpecification;
    }

    public void setBusSpecification(String busSpecification) {
        this.busSpecification = busSpecification;
    }

    public String getThermalPower() {
        return thermalPower;
    }

    public void setThermalPower(String thermalPower) {
        this.thermalPower = thermalPower;
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
        Cpu other = (Cpu) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAppropriateType() == null ? other.getAppropriateType() == null : this.getAppropriateType().equals(other.getAppropriateType()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getCraftsmanship() == null ? other.getCraftsmanship() == null : this.getCraftsmanship().equals(other.getCraftsmanship()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getSlotType() == null ? other.getSlotType() == null : this.getSlotType().equals(other.getSlotType()))
            && (this.getPackageSize() == null ? other.getPackageSize() == null : this.getPackageSize().equals(other.getPackageSize()))
            && (this.getCpuFrequency() == null ? other.getCpuFrequency() == null : this.getCpuFrequency().equals(other.getCpuFrequency()))
            && (this.getAccelerationFrequency() == null ? other.getAccelerationFrequency() == null : this.getAccelerationFrequency().equals(other.getAccelerationFrequency()))
            && (this.getCoreNumber() == null ? other.getCoreNumber() == null : this.getCoreNumber().equals(other.getCoreNumber()))
            && (this.getThreadNumber() == null ? other.getThreadNumber() == null : this.getThreadNumber().equals(other.getThreadNumber()))
            && (this.getThirdCache() == null ? other.getThirdCache() == null : this.getThirdCache().equals(other.getThirdCache()))
            && (this.getBusSpecification() == null ? other.getBusSpecification() == null : this.getBusSpecification().equals(other.getBusSpecification()))
            && (this.getThermalPower() == null ? other.getThermalPower() == null : this.getThermalPower().equals(other.getThermalPower()))
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
        result = prime * result + ((getAppropriateType() == null) ? 0 : getAppropriateType().hashCode());
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getCraftsmanship() == null) ? 0 : getCraftsmanship().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getSlotType() == null) ? 0 : getSlotType().hashCode());
        result = prime * result + ((getPackageSize() == null) ? 0 : getPackageSize().hashCode());
        result = prime * result + ((getCpuFrequency() == null) ? 0 : getCpuFrequency().hashCode());
        result = prime * result + ((getAccelerationFrequency() == null) ? 0 : getAccelerationFrequency().hashCode());
        result = prime * result + ((getCoreNumber() == null) ? 0 : getCoreNumber().hashCode());
        result = prime * result + ((getThreadNumber() == null) ? 0 : getThreadNumber().hashCode());
        result = prime * result + ((getThirdCache() == null) ? 0 : getThirdCache().hashCode());
        result = prime * result + ((getBusSpecification() == null) ? 0 : getBusSpecification().hashCode());
        result = prime * result + ((getThermalPower() == null) ? 0 : getThermalPower().hashCode());
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
        sb.append(", appropriateType=").append(appropriateType);
        sb.append(", series=").append(series);
        sb.append(", craftsmanship=").append(craftsmanship);
        sb.append(", code=").append(code);
        sb.append(", slotType=").append(slotType);
        sb.append(", packageSize=").append(packageSize);
        sb.append(", cpuFrequency=").append(cpuFrequency);
        sb.append(", accelerationFrequency=").append(accelerationFrequency);
        sb.append(", coreNumber=").append(coreNumber);
        sb.append(", threadNumber=").append(threadNumber);
        sb.append(", thirdCache=").append(thirdCache);
        sb.append(", busSpecification=").append(busSpecification);
        sb.append(", thermalPower=").append(thermalPower);
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