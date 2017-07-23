package org.lucksoft.eurekaclientiteminfo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ItemInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "item_info", catalog = "item_info")
public class ItemInfo extends AbstractItemInfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItemInfo() {
	}

	/** minimal constructor */
	public ItemInfo(Integer infoId, Integer itemId) {
		super(infoId, itemId);
	}

	/** full constructor */
	public ItemInfo(Integer infoId, Integer itemId, String itemInfo) {
		super(infoId, itemId, itemInfo);
	}

}
