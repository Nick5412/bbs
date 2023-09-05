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
 * @TableName tbl_board
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_board")
public class Board implements Serializable {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	@TableId(value = "boardid", type = IdType.AUTO)
	private Integer boardid;
	/**
	 *
	 */
	@TableField(value = "boardname")
	private String boardname;
	/**
	 *
	 */
	@TableField(value = "parentid")
	private Integer parentid;

}