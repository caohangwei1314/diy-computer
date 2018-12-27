package com.example.demo.product.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Diy implements Serializable {
    private Long pkId;

    private Long userId;

    private Long cpu;

    private Long board;

    private Long ram;

    private Long disk;

    private Long ssd;

    private Long graphics;

    private Long monitor;

    private Long chassis;

    private Long power;

    private Long heakSink;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public Long getBoard() {
        return board;
    }

    public void setBoard(Long board) {
        this.board = board;
    }

    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    public Long getDisk() {
        return disk;
    }

    public void setDisk(Long disk) {
        this.disk = disk;
    }

    public Long getSsd() {
        return ssd;
    }

    public void setSsd(Long ssd) {
        this.ssd = ssd;
    }

    public Long getGraphics() {
        return graphics;
    }

    public void setGraphics(Long graphics) {
        this.graphics = graphics;
    }

    public Long getMonitor() {
        return monitor;
    }

    public void setMonitor(Long monitor) {
        this.monitor = monitor;
    }

    public Long getChassis() {
        return chassis;
    }

    public void setChassis(Long chassis) {
        this.chassis = chassis;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Long getHeakSink() {
        return heakSink;
    }

    public void setHeakSink(Long heakSink) {
        this.heakSink = heakSink;
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
        Diy other = (Diy) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCpu() == null ? other.getCpu() == null : this.getCpu().equals(other.getCpu()))
            && (this.getBoard() == null ? other.getBoard() == null : this.getBoard().equals(other.getBoard()))
            && (this.getRam() == null ? other.getRam() == null : this.getRam().equals(other.getRam()))
            && (this.getDisk() == null ? other.getDisk() == null : this.getDisk().equals(other.getDisk()))
            && (this.getSsd() == null ? other.getSsd() == null : this.getSsd().equals(other.getSsd()))
            && (this.getGraphics() == null ? other.getGraphics() == null : this.getGraphics().equals(other.getGraphics()))
            && (this.getMonitor() == null ? other.getMonitor() == null : this.getMonitor().equals(other.getMonitor()))
            && (this.getChassis() == null ? other.getChassis() == null : this.getChassis().equals(other.getChassis()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getHeakSink() == null ? other.getHeakSink() == null : this.getHeakSink().equals(other.getHeakSink()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCpu() == null) ? 0 : getCpu().hashCode());
        result = prime * result + ((getBoard() == null) ? 0 : getBoard().hashCode());
        result = prime * result + ((getRam() == null) ? 0 : getRam().hashCode());
        result = prime * result + ((getDisk() == null) ? 0 : getDisk().hashCode());
        result = prime * result + ((getSsd() == null) ? 0 : getSsd().hashCode());
        result = prime * result + ((getGraphics() == null) ? 0 : getGraphics().hashCode());
        result = prime * result + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        result = prime * result + ((getChassis() == null) ? 0 : getChassis().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getHeakSink() == null) ? 0 : getHeakSink().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", cpu=").append(cpu);
        sb.append(", board=").append(board);
        sb.append(", ram=").append(ram);
        sb.append(", disk=").append(disk);
        sb.append(", ssd=").append(ssd);
        sb.append(", graphics=").append(graphics);
        sb.append(", monitor=").append(monitor);
        sb.append(", chassis=").append(chassis);
        sb.append(", power=").append(power);
        sb.append(", heakSink=").append(heakSink);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}