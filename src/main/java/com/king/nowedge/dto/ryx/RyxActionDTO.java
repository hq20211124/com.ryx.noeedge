package com.king.nowedge.dto.ryx;

/**
 * RyxAction entity. @author MyEclipse Persistence Tools
 */

public class RyxActionDTO implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String title;
	private String remark;
	private String rule;
	private String log;
	private Short type;
	private Short status;
	private Integer updateTime;

	// Constructors

	/** default constructor */
	public RyxActionDTO() {
	}

	/** minimal constructor */
	public RyxActionDTO(String name, String title, String remark, Short type,
			Short status, Integer updateTime) {
		this.name = name;
		this.title = title;
		this.remark = remark;
		this.type = type;
		this.status = status;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public RyxActionDTO(String name, String title, String remark, String rule,
			String log, Short type, Short status, Integer updateTime) {
		this.name = name;
		this.title = title;
		this.remark = remark;
		this.rule = rule;
		this.log = log;
		this.type = type;
		this.status = status;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

}