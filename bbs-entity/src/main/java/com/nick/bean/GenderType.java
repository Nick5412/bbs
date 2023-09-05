package com.nick.bean;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author Nick
 * @Classname GenderType
 * @Date 2023/09/05 15:25
 * @Description 性别类型
 */
public enum GenderType {
	FEMALE("女", 0),
	MALE("男", 1);

	private String key;
	//标记数据库存的值
	@EnumValue
	private Integer value;

	GenderType(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
