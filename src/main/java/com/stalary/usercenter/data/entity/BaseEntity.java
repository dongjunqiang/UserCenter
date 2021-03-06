package com.stalary.usercenter.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity
 *
 * @author lirongqian
 * @since 2018/03/24
 */
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(hidden = true)
    private Long id;

    /**
     * 最后更新时间
     */
    @JsonIgnore
    @UpdateTimestamp
    @ApiModelProperty(hidden=true)
    private Date updateTime;

    /**
     * 创建时间
     */
    @CreationTimestamp
    @ApiModelProperty(hidden=true)
    private Date createTime;

}