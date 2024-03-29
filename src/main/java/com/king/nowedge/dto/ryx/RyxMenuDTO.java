package com.king.nowedge.dto.ryx;

/**
 * RyxMenu entity. @author MyEclipse Persistence Tools
 */

public class RyxMenuDTO implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private Integer pid;
	private Integer sort;
	private String url;
	private Boolean hide;
	private String tip;
	private String group;
	private String icon;

	// Constructors

	/** default constructor */
	public RyxMenuDTO() {
	}

	/** minimal constructor */
	public RyxMenuDTO(String title, Integer pid, Integer sort, String url,
			Boolean hide, String tip) {
		this.title = title;
		this.pid = pid;
		this.sort = sort;
		this.url = url;
		this.hide = hide;
		this.tip = tip;
	}

	/** full constructor */
	public RyxMenuDTO(String title, Integer pid, Integer sort, String url,
			Boolean hide, String tip, String group, String icon) {
		this.title = title;
		this.pid = pid;
		this.sort = sort;
		this.url = url;
		this.hide = hide;
		this.tip = tip;
		this.group = group;
		this.icon = icon;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getHide() {
		return this.hide;
	}

	public void setHide(Boolean hide) {
		this.hide = hide;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}