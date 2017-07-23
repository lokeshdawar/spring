/**
 * 
 */
package org.lucksoft.eurekaclientiteminfo.services;

import java.util.List;

import org.lucksoft.eurekaclientiteminfo.domain.ItemInfo;
import org.lucksoft.eurekaclientiteminfo.domain.ItemInfoDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lucky
 *
 */
public class ItemInfoServiceImpl implements ItemInfoService {
	
	@Autowired
	private ItemInfoDao iiDao;

	/* (non-Javadoc)
	 * @see org.lucksoft.eurekaclientiteminfo.services.ItemInfoService#getItemInfo(java.lang.Integer)
	 */
	@Override
	public List<ItemInfo> getItemInfo(Integer itemID) {
		return iiDao.findByItemId(itemID);
	}

}
