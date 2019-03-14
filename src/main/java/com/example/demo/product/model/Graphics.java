package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Graphics implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String vendor;

    private String chip;

    private String series;

    private String craftsmanship;

    private String code;

    private String codeFrequency;

    private String cuda;

    private String memoryFrequency;

    private String memoryType;

    private String memoryCapacity;

    private String memoryBandwidth;

    private String maximumResolution;

    private String interfaceType;

    private String ioInterface;

    private String powerInterface;

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

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
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

    public String getCodeFrequency() {
        return codeFrequency;
    }

    public void setCodeFrequency(String codeFrequency) {
        this.codeFrequency = codeFrequency;
    }

    public String getCuda() {
        return cuda;
    }

    public void setCuda(String cuda) {
        this.cuda = cuda;
    }

    public String getMemoryFrequency() {
        return memoryFrequency;
    }

    public void setMemoryFrequency(String memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getMemoryBandwidth() {
        return memoryBandwidth;
    }

    public void setMemoryBandwidth(String memoryBandwidth) {
        this.memoryBandwidth = memoryBandwidth;
    }

    public String getMaximumResolution() {
        return maximumResolution;
    }

    public void setMaximumResolution(String maximumResolution) {
        this.maximumResolution = maximumResolution;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getIoInterface() {
        return ioInterface;
    }

    public void setIoInterface(String ioInterface) {
        this.ioInterface = ioInterface;
    }

    public String getPowerInterface() {
        return powerInterface;
    }

    public void setPowerInterface(String powerInterface) {
        this.powerInterface = powerInterface;
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
        Graphics other = (Graphics) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getVendor() == null ? other.getVendor() == null : this.getVendor().equals(other.getVendor()))
            && (this.getChip() == null ? other.getChip() == null : this.getChip().equals(other.getChip()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getCraftsmanship() == null ? other.getCraftsmanship() == null : this.getCraftsmanship().equals(other.getCraftsmanship()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCodeFrequency() == null ? other.getCodeFrequency() == null : this.getCodeFrequency().equals(other.getCodeFrequency()))
            && (this.getCuda() == null ? other.getCuda() == null : this.getCuda().equals(other.getCuda()))
            && (this.getMemoryFrequency() == null ? other.getMemoryFrequency() == null : this.getMemoryFrequency().equals(other.getMemoryFrequency()))
            && (this.getMemoryType() == null ? other.getMemoryType() == null : this.getMemoryType().equals(other.getMemoryType()))
            && (this.getMemoryCapacity() == null ? other.getMemoryCapacity() == null : this.getMemoryCapacity().equals(other.getMemoryCapacity()))
            && (this.getMemoryBandwidth() == null ? other.getMemoryBandwidth() == null : this.getMemoryBandwidth().equals(other.getMemoryBandwidth()))
            && (this.getMaximumResolution() == null ? other.getMaximumResolution() == null : this.getMaximumResolution().equals(other.getMaximumResolution()))
            && (this.getInterfaceType() == null ? other.getInterfaceType() == null : this.getInterfaceType().equals(other.getInterfaceType()))
            && (this.getIoInterface() == null ? other.getIoInterface() == null : this.getIoInterface().equals(other.getIoInterface()))
            && (this.getPowerInterface() == null ? other.getPowerInterface() == null : this.getPowerInterface().equals(other.getPowerInterface()))
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
        result = prime * result + ((getVendor() == null) ? 0 : getVendor().hashCode());
        result = prime * result + ((getChip() == null) ? 0 : getChip().hashCode());
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getCraftsmanship() == null) ? 0 : getCraftsmanship().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCodeFrequency() == null) ? 0 : getCodeFrequency().hashCode());
        result = prime * result + ((getCuda() == null) ? 0 : getCuda().hashCode());
        result = prime * result + ((getMemoryFrequency() == null) ? 0 : getMemoryFrequency().hashCode());
        result = prime * result + ((getMemoryType() == null) ? 0 : getMemoryType().hashCode());
        result = prime * result + ((getMemoryCapacity() == null) ? 0 : getMemoryCapacity().hashCode());
        result = prime * result + ((getMemoryBandwidth() == null) ? 0 : getMemoryBandwidth().hashCode());
        result = prime * result + ((getMaximumResolution() == null) ? 0 : getMaximumResolution().hashCode());
        result = prime * result + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        result = prime * result + ((getIoInterface() == null) ? 0 : getIoInterface().hashCode());
        result = prime * result + ((getPowerInterface() == null) ? 0 : getPowerInterface().hashCode());
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
        sb.append(", vendor=").append(vendor);
        sb.append(", chip=").append(chip);
        sb.append(", series=").append(series);
        sb.append(", craftsmanship=").append(craftsmanship);
        sb.append(", code=").append(code);
        sb.append(", codeFrequency=").append(codeFrequency);
        sb.append(", cuda=").append(cuda);
        sb.append(", memoryFrequency=").append(memoryFrequency);
        sb.append(", memoryType=").append(memoryType);
        sb.append(", memoryCapacity=").append(memoryCapacity);
        sb.append(", memoryBandwidth=").append(memoryBandwidth);
        sb.append(", maximumResolution=").append(maximumResolution);
        sb.append(", interfaceType=").append(interfaceType);
        sb.append(", ioInterface=").append(ioInterface);
        sb.append(", powerInterface=").append(powerInterface);
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