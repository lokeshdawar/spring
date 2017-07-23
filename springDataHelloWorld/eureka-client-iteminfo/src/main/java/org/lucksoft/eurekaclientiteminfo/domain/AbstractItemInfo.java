package org.lucksoft.eurekaclientiteminfo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractItemInfo entity provides the base persistence definition of the
 * ItemInfo entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass

public abstract class AbstractItemInfo implements java.io.Serializable {

	// Fields

	private Integer infoId;
	private Integer itemId;
	private String itemInfo;

	// Constructors

	/** default constructor */
	public AbstractItemInfo() {
	}

	/** minimal constructor */
	public AbstractItemInfo(Integer infoId, Integer itemId) {
		this.infoId = infoId;
		this.itemId = itemId;
	}

	/** full constructor */
	public AbstractItemInfo(Integer infoId, Integer itemId, String itemInfo) {
		this.infoId = infoId;
		this.itemId = itemId;
		this.itemInfo = itemInfo;
	}

	// Property accessors
	@Id

	@Column(name = "info_id", unique = true, nullable = false)

	public Integer getInfoId() {
		return this.infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	@Column(name = "item_id", nullable = false)

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "item_info", length = 200)

	public String getItemInfo() {
		return this.itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

}