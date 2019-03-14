package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Power implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String type;

    private String scope;

    private String rate;

    private String description;

    private String size;

    private String motherboardInterface;

    private String cpuInterface;

    private String graphicsInterface;

    private String hdType;

    private String powerInterface;

    private String acInput;

    private String output;

    private Integer score;

    private String image;

    private BigDecimal price;

    private Date gmtCreate;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMotherboardInterface() {
        return motherboardInterface;
    }

    public void setMotherboardInterface(String motherboardInterface) {
        this.motherboardInterface = motherboardInterface;
    }

    public String getCpuInterface() {
        return cpuInterface;
    }

    public void setCpuInterface(String cpuInterface) {
        this.cpuInterface = cpuInterface;
    }

    public String getGraphicsInterface() {
        return graphicsInterface;
    }

    public void setGraphicsInterface(String graphicsInterface) {
        this.graphicsInterface = graphicsInterface;
    }

    public String getHdType() {
        return hdType;
    }

    public void setHdType(String hdType) {
        this.hdType = hdType;
    }

    public String getPowerInterface() {
        return powerInterface;
    }

    public void setPowerInterface(String powerInterface) {
        this.powerInterface = powerInterface;
    }

    public String getAcInput() {
        return acInput;
    }

    public void setAcInput(String acInput) {
        this.acInput = acInput;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
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
        Power other = (Power) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getMotherboardInterface() == null ? other.getMotherboardInterface() == null : this.getMotherboardInterface().equals(other.getMotherboardInterface()))
            && (this.getCpuInterface() == null ? other.getCpuInterface() == null : this.getCpuInterface().equals(other.getCpuInterface()))
            && (this.getGraphicsInterface() == null ? other.getGraphicsInterface() == null : this.getGraphicsInterface().equals(other.getGraphicsInterface()))
            && (this.getHdType() == null ? other.getHdType() == null : this.getHdType().equals(other.getHdType()))
            && (this.getPowerInterface() == null ? other.getPowerInterface() == null : this.getPowerInterface().equals(other.getPowerInterface()))
            && (this.getAcInput() == null ? other.getAcInput() == null : this.getAcInput().equals(other.getAcInput()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()))
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
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getMotherboardInterface() == null) ? 0 : getMotherboardInterface().hashCode());
        result = prime * result + ((getCpuInterface() == null) ? 0 : getCpuInterface().hashCode());
        result = prime * result + ((getGraphicsInterface() == null) ? 0 : getGraphicsInterface().hashCode());
        result = prime * result + ((getHdType() == null) ? 0 : getHdType().hashCode());
        result = prime * result + ((getPowerInterface() == null) ? 0 : getPowerInterface().hashCode());
        result = prime * result + ((getAcInput() == null) ? 0 : getAcInput().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
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
        sb.append(", type=").append(type);
        sb.append(", scope=").append(scope);
        sb.append(", rate=").append(rate);
        sb.append(", description=").append(description);
        sb.append(", size=").append(size);
        sb.append(", motherboardInterface=").append(motherboardInterface);
        sb.append(", cpuInterface=").append(cpuInterface);
        sb.append(", graphicsInterface=").append(graphicsInterface);
        sb.append(", hdType=").append(hdType);
        sb.append(", powerInterface=").append(powerInterface);
        sb.append(", acInput=").append(acInput);
        sb.append(", output=").append(output);
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