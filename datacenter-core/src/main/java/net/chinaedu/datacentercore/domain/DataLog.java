package net.chinaedu.datacentercore.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
@TableName("dc_data_log")
public class DataLog implements Serializable {
    private static final long serialVersionUID = -578862889937684676L;

    @TableId(type = IdType.INPUT)
    @TableField("id")
    private String id;
    @TableField("data_type")
    private Integer dataType;
    @TableField("remark")
    private String remark;
    @TableField("create_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getDataType() {
        return dataType;
    }
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
