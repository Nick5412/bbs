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
 * @TableName tbl_user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_user")
public class User implements Serializable {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	@TableId(value = "uid", type = IdType.AUTO)
	private Integer uid;
	/**
	 *
	 */
	@TableField(value = "uname")
	private String uname;
	/**
	 *
	 */
	@TableField(value = "upass")
	private String upass;
	/**
	 *
	 */
	@TableField(value = "head")
	private String head;
	/**
	 *
	 */
	@TableField(value = "regtime")
	private String regtime;
	/**
	 *
	 */
	@TableField(value = "gender")
	private GenderType gender;

}