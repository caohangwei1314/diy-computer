package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Ssd implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String positioning;

    private String capacity;

    private String interfaceType;

    private String architecture;

    private String cache;

    private String masterChip;

    private String rwSpeed;

    private String writeSpeed;

    private String iopsRead;

    private String iopsWrite;

    private String consumption;

    private String troubleFree;

    private String systemRequire;

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

    public String getPositioning() {
        return positioning;
    }

    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getMasterChip() {
        return masterChip;
    }

    public void setMasterChip(String masterChip) {
        this.masterChip = masterChip;
    }

    public String getRwSpeed() {
        return rwSpeed;
    }

    public void setRwSpeed(String rwSpeed) {
        this.rwSpeed = rwSpeed;
    }

    public String getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(String writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public String getIopsRead() {
        return iopsRead;
    }

    public void setIopsRead(String iopsRead) {
        this.iopsRead = iopsRead;
    }

    public String getIopsWrite() {
        return iopsWrite;
    }

    public void setIopsWrite(String iopsWrite) {
        this.iopsWrite = iopsWrite;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getTroubleFree() {
        return troubleFree;
    }

    public void setTroubleFree(String troubleFree) {
        this.troubleFree = troubleFree;
    }

    public String getSystemRequire() {
        return systemRequire;
    }

    public void setSystemRequire(String systemRequire) {
        this.systemRequire = systemRequire;
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
        Ssd other = (Ssd) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPositioning() == null ? other.getPositioning() == null : this.getPositioning().equals(other.getPositioning()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getInterfaceType() == null ? other.getInterfaceType() == null : this.getInterfaceType().equals(other.getInterfaceType()))
            && (this.getArchitecture() == null ? other.getArchitecture() == null : this.getArchitecture().equals(other.getArchitecture()))
            && (this.getCache() == null ? other.getCache() == null : this.getCache().equals(other.getCache()))
            && (this.getMasterChip() == null ? other.getMasterChip() == null : this.getMasterChip().equals(other.getMasterChip()))
            && (this.getRwSpeed() == null ? other.getRwSpeed() == null : this.getRwSpeed().equals(other.getRwSpeed()))
            && (this.getWriteSpeed() == null ? other.getWriteSpeed() == null : this.getWriteSpeed().equals(other.getWriteSpeed()))
            && (this.getIopsRead() == null ? other.getIopsRead() == null : this.getIopsRead().equals(other.getIopsRead()))
            && (this.getIopsWrite() == null ? other.getIopsWrite() == null : this.getIopsWrite().equals(other.getIopsWrite()))
            && (this.getConsumption() == null ? other.getConsumption() == null : this.getConsumption().equals(other.getConsumption()))
            && (this.getTroubleFree() == null ? other.getTroubleFree() == null : this.getTroubleFree().equals(other.getTroubleFree()))
            && (this.getSystemRequire() == null ? other.getSystemRequire() == null : this.getSystemRequire().equals(other.getSystemRequire()))
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
        result = prime * result + ((getPositioning() == null) ? 0 : getPositioning().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getInterfaceType() == null) ? 0 : getInterfaceType().hashCode());
        result = prime * result + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        result = prime * result + ((getCache() == null) ? 0 : getCache().hashCode());
        result = prime * result + ((getMasterChip() == null) ? 0 : getMasterChip().hashCode());
        result = prime * result + ((getRwSpeed() == null) ? 0 : getRwSpeed().hashCode());
        result = prime * result + ((getWriteSpeed() == null) ? 0 : getWriteSpeed().hashCode());
        result = prime * result + ((getIopsRead() == null) ? 0 : getIopsRead().hashCode());
        result = prime * result + ((getIopsWrite() == null) ? 0 : getIopsWrite().hashCode());
        result = prime * result + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        result = prime * result + ((getTroubleFree() == null) ? 0 : getTroubleFree().hashCode());
        result = prime * result + ((getSystemRequire() == null) ? 0 : getSystemRequire().hashCode());
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
        sb.append(", positioning=").append(positioning);
        sb.append(", capacity=").append(capacity);
        sb.append(", interfaceType=").append(interfaceType);
        sb.append(", architecture=").append(architecture);
        sb.append(", cache=").append(cache);
        sb.append(", masterChip=").append(masterChip);
        sb.append(", rwSpeed=").append(rwSpeed);
        sb.append(", writeSpeed=").append(writeSpeed);
        sb.append(", iopsRead=").append(iopsRead);
        sb.append(", iopsWrite=").append(iopsWrite);
        sb.append(", consumption=").append(consumption);
        sb.append(", troubleFree=").append(troubleFree);
        sb.append(", systemRequire=").append(systemRequire);
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