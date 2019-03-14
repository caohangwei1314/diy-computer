package com.example.demo.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class HeatSink implements Serializable {
    private Long pkId;

    private Long classId;

    private Long userId;

    private String name;

    private String type;

    private String mothed;

    private String scope;

    private String size;

    private String weight;

    private String temperature;

    private String powerParameter;

    private String inputPower;

    private String life;

    private String fanSize;

    private String bearingType;

    private String maxRevolution;

    private String revolutionDescription;

    private String maxVolume;

    private String windPressure;

    private String noise;

    private String heatPipes;

    private String pipesMaterial;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMothed() {
        return mothed;
    }

    public void setMothed(String mothed) {
        this.mothed = mothed;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPowerParameter() {
        return powerParameter;
    }

    public void setPowerParameter(String powerParameter) {
        this.powerParameter = powerParameter;
    }

    public String getInputPower() {
        return inputPower;
    }

    public void setInputPower(String inputPower) {
        this.inputPower = inputPower;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getFanSize() {
        return fanSize;
    }

    public void setFanSize(String fanSize) {
        this.fanSize = fanSize;
    }

    public String getBearingType() {
        return bearingType;
    }

    public void setBearingType(String bearingType) {
        this.bearingType = bearingType;
    }

    public String getMaxRevolution() {
        return maxRevolution;
    }

    public void setMaxRevolution(String maxRevolution) {
        this.maxRevolution = maxRevolution;
    }

    public String getRevolutionDescription() {
        return revolutionDescription;
    }

    public void setRevolutionDescription(String revolutionDescription) {
        this.revolutionDescription = revolutionDescription;
    }

    public String getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(String maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getWindPressure() {
        return windPressure;
    }

    public void setWindPressure(String windPressure) {
        this.windPressure = windPressure;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getHeatPipes() {
        return heatPipes;
    }

    public void setHeatPipes(String heatPipes) {
        this.heatPipes = heatPipes;
    }

    public String getPipesMaterial() {
        return pipesMaterial;
    }

    public void setPipesMaterial(String pipesMaterial) {
        this.pipesMaterial = pipesMaterial;
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
        HeatSink other = (HeatSink) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMothed() == null ? other.getMothed() == null : this.getMothed().equals(other.getMothed()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getTemperature() == null ? other.getTemperature() == null : this.getTemperature().equals(other.getTemperature()))
            && (this.getPowerParameter() == null ? other.getPowerParameter() == null : this.getPowerParameter().equals(other.getPowerParameter()))
            && (this.getInputPower() == null ? other.getInputPower() == null : this.getInputPower().equals(other.getInputPower()))
            && (this.getLife() == null ? other.getLife() == null : this.getLife().equals(other.getLife()))
            && (this.getFanSize() == null ? other.getFanSize() == null : this.getFanSize().equals(other.getFanSize()))
            && (this.getBearingType() == null ? other.getBearingType() == null : this.getBearingType().equals(other.getBearingType()))
            && (this.getMaxRevolution() == null ? other.getMaxRevolution() == null : this.getMaxRevolution().equals(other.getMaxRevolution()))
            && (this.getRevolutionDescription() == null ? other.getRevolutionDescription() == null : this.getRevolutionDescription().equals(other.getRevolutionDescription()))
            && (this.getMaxVolume() == null ? other.getMaxVolume() == null : this.getMaxVolume().equals(other.getMaxVolume()))
            && (this.getWindPressure() == null ? other.getWindPressure() == null : this.getWindPressure().equals(other.getWindPressure()))
            && (this.getNoise() == null ? other.getNoise() == null : this.getNoise().equals(other.getNoise()))
            && (this.getHeatPipes() == null ? other.getHeatPipes() == null : this.getHeatPipes().equals(other.getHeatPipes()))
            && (this.getPipesMaterial() == null ? other.getPipesMaterial() == null : this.getPipesMaterial().equals(other.getPipesMaterial()))
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
        result = prime * result + ((getMothed() == null) ? 0 : getMothed().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        result = prime * result + ((getPowerParameter() == null) ? 0 : getPowerParameter().hashCode());
        result = prime * result + ((getInputPower() == null) ? 0 : getInputPower().hashCode());
        result = prime * result + ((getLife() == null) ? 0 : getLife().hashCode());
        result = prime * result + ((getFanSize() == null) ? 0 : getFanSize().hashCode());
        result = prime * result + ((getBearingType() == null) ? 0 : getBearingType().hashCode());
        result = prime * result + ((getMaxRevolution() == null) ? 0 : getMaxRevolution().hashCode());
        result = prime * result + ((getRevolutionDescription() == null) ? 0 : getRevolutionDescription().hashCode());
        result = prime * result + ((getMaxVolume() == null) ? 0 : getMaxVolume().hashCode());
        result = prime * result + ((getWindPressure() == null) ? 0 : getWindPressure().hashCode());
        result = prime * result + ((getNoise() == null) ? 0 : getNoise().hashCode());
        result = prime * result + ((getHeatPipes() == null) ? 0 : getHeatPipes().hashCode());
        result = prime * result + ((getPipesMaterial() == null) ? 0 : getPipesMaterial().hashCode());
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
        sb.append(", mothed=").append(mothed);
        sb.append(", scope=").append(scope);
        sb.append(", size=").append(size);
        sb.append(", weight=").append(weight);
        sb.append(", temperature=").append(temperature);
        sb.append(", powerParameter=").append(powerParameter);
        sb.append(", inputPower=").append(inputPower);
        sb.append(", life=").append(life);
        sb.append(", fanSize=").append(fanSize);
        sb.append(", bearingType=").append(bearingType);
        sb.append(", maxRevolution=").append(maxRevolution);
        sb.append(", revolutionDescription=").append(revolutionDescription);
        sb.append(", maxVolume=").append(maxVolume);
        sb.append(", windPressure=").append(windPressure);
        sb.append(", noise=").append(noise);
        sb.append(", heatPipes=").append(heatPipes);
        sb.append(", pipesMaterial=").append(pipesMaterial);
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