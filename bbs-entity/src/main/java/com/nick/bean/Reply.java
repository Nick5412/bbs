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
 * @TableName tbl_reply
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_reply")
public class Reply extends AbstractTopic implements Serializable {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	@TableId(value = "replyid", type = IdType.AUTO)
	private Integer replyid;
	/**
	 *
	 */
	@TableField(value = "topicid")
	private Integer topicid;

}