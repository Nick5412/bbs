package com.nick.bean;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * @author Nick
 * @Classname AbstractTopic
 * @Date 2023/09/05 15:27
 * @Description 抽象主题类
 */
public abstract class AbstractTopic implements Serializable {
	@TableField(value = "title")
	private String title;
	@TableField(value = "content")
	private String content;
	@TableField(value = "publishtime")
	private String publishtime;
	@TableField(value = "modifytime")
	private String modifytime;
	@TableField(value = "uid")
	private Integer uid;
}
