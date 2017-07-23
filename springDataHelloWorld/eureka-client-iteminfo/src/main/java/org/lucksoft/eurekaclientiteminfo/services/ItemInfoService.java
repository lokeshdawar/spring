package org.lucksoft.eurekaclientiteminfo.services;

import java.util.List;

import org.lucksoft.eurekaclientiteminfo.domain.ItemInfo;

public interface ItemInfoService {
	List<ItemInfo> getItemInfo(Integer itemID);
}
