package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Motherboard implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String integratedChip;

    private String series;

    private String mainChipset;

    private String displayChip;

    private String audioChip;

    private String nicChip;

    private String cpuType;

    private String cpuSocket;

    private String ramType;

    private String maxRam;

    private String ramDescription;

    private String pciE;

    private String pciESocket;

    private String storageInterface;

    private String usb;

    private String video;

    private String power;

    private String other;

    private String type;

    private String shape;

    private String bios;

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

    public String getIntegratedChip() {
        return integratedChip;
    }

    public void setIntegratedChip(String integratedChip) {
        this.integratedChip = integratedChip;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMainChipset() {
        return mainChipset;
    }

    public void setMainChipset(String mainChipset) {
        this.mainChipset = mainChipset;
    }

    public String getDisplayChip() {
        return displayChip;
    }

    public void setDisplayChip(String displayChip) {
        this.displayChip = displayChip;
    }

    public String getAudioChip() {
        return audioChip;
    }

    public void setAudioChip(String audioChip) {
        this.audioChip = audioChip;
    }

    public String getNicChip() {
        return nicChip;
    }

    public void setNicChip(String nicChip) {
        this.nicChip = nicChip;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(String maxRam) {
        this.maxRam = maxRam;
    }

    public String getRamDescription() {
        return ramDescription;
    }

    public void setRamDescription(String ramDescription) {
        this.ramDescription = ramDescription;
    }

    public String getPciE() {
        return pciE;
    }

    public void setPciE(String pciE) {
        this.pciE = pciE;
    }

    public String getPciESocket() {
        return pciESocket;
    }

    public void setPciESocket(String pciESocket) {
        this.pciESocket = pciESocket;
    }

    public String getStorageInterface() {
        return storageInterface;
    }

    public void setStorageInterface(String storageInterface) {
        this.storageInterface = storageInterface;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
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
        Motherboard other = (Motherboard) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIntegratedChip() == null ? other.getIntegratedChip() == null : this.getIntegratedChip().equals(other.getIntegratedChip()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getMainChipset() == null ? other.getMainChipset() == null : this.getMainChipset().equals(other.getMainChipset()))
            && (this.getDisplayChip() == null ? other.getDisplayChip() == null : this.getDisplayChip().equals(other.getDisplayChip()))
            && (this.getAudioChip() == null ? other.getAudioChip() == null : this.getAudioChip().equals(other.getAudioChip()))
            && (this.getNicChip() == null ? other.getNicChip() == null : this.getNicChip().equals(other.getNicChip()))
            && (this.getCpuType() == null ? other.getCpuType() == null : this.getCpuType().equals(other.getCpuType()))
            && (this.getCpuSocket() == null ? other.getCpuSocket() == null : this.getCpuSocket().equals(other.getCpuSocket()))
            && (this.getRamType() == null ? other.getRamType() == null : this.getRamType().equals(other.getRamType()))
            && (this.getMaxRam() == null ? other.getMaxRam() == null : this.getMaxRam().equals(other.getMaxRam()))
            && (this.getRamDescription() == null ? other.getRamDescription() == null : this.getRamDescription().equals(other.getRamDescription()))
            && (this.getPciE() == null ? other.getPciE() == null : this.getPciE().equals(other.getPciE()))
            && (this.getPciESocket() == null ? other.getPciESocket() == null : this.getPciESocket().equals(other.getPciESocket()))
            && (this.getStorageInterface() == null ? other.getStorageInterface() == null : this.getStorageInterface().equals(other.getStorageInterface()))
            && (this.getUsb() == null ? other.getUsb() == null : this.getUsb().equals(other.getUsb()))
            && (this.getVideo() == null ? other.getVideo() == null : this.getVideo().equals(other.getVideo()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getShape() == null ? other.getShape() == null : this.getShape().equals(other.getShape()))
            && (this.getBios() == null ? other.getBios() == null : this.getBios().equals(other.getBios()))
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
        result = prime * result + ((getIntegratedChip() == null) ? 0 : getIntegratedChip().hashCode());
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getMainChipset() == null) ? 0 : getMainChipset().hashCode());
        result = prime * result + ((getDisplayChip() == null) ? 0 : getDisplayChip().hashCode());
        result = prime * result + ((getAudioChip() == null) ? 0 : getAudioChip().hashCode());
        result = prime * result + ((getNicChip() == null) ? 0 : getNicChip().hashCode());
        result = prime * result + ((getCpuType() == null) ? 0 : getCpuType().hashCode());
        result = prime * result + ((getCpuSocket() == null) ? 0 : getCpuSocket().hashCode());
        result = prime * result + ((getRamType() == null) ? 0 : getRamType().hashCode());
        result = prime * result + ((getMaxRam() == null) ? 0 : getMaxRam().hashCode());
        result = prime * result + ((getRamDescription() == null) ? 0 : getRamDescription().hashCode());
        result = prime * result + ((getPciE() == null) ? 0 : getPciE().hashCode());
        result = prime * result + ((getPciESocket() == null) ? 0 : getPciESocket().hashCode());
        result = prime * result + ((getStorageInterface() == null) ? 0 : getStorageInterface().hashCode());
        result = prime * result + ((getUsb() == null) ? 0 : getUsb().hashCode());
        result = prime * result + ((getVideo() == null) ? 0 : getVideo().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getShape() == null) ? 0 : getShape().hashCode());
        result = prime * result + ((getBios() == null) ? 0 : getBios().hashCode());
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
        sb.append(", integratedChip=").append(integratedChip);
        sb.append(", series=").append(series);
        sb.append(", mainChipset=").append(mainChipset);
        sb.append(", displayChip=").append(displayChip);
        sb.append(", audioChip=").append(audioChip);
        sb.append(", nicChip=").append(nicChip);
        sb.append(", cpuType=").append(cpuType);
        sb.append(", cpuSocket=").append(cpuSocket);
        sb.append(", ramType=").append(ramType);
        sb.append(", maxRam=").append(maxRam);
        sb.append(", ramDescription=").append(ramDescription);
        sb.append(", pciE=").append(pciE);
        sb.append(", pciESocket=").append(pciESocket);
        sb.append(", storageInterface=").append(storageInterface);
        sb.append(", usb=").append(usb);
        sb.append(", video=").append(video);
        sb.append(", power=").append(power);
        sb.append(", other=").append(other);
        sb.append(", type=").append(type);
        sb.append(", shape=").append(shape);
        sb.append(", bios=").append(bios);
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