package com.nick.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @TableName tbl_topic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_topic")
public class Topic extends AbstractTopic implements Serializable {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	@TableId(value = "topicid", type = IdType.AUTO)
	private Integer topicid;
	/**
	 *
	 */
	@TableField(value = "boardid")
	private Integer boardid;

}