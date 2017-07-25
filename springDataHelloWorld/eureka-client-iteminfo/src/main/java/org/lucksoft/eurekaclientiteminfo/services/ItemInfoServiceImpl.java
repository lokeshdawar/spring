/**
 * 
 */
package org.lucksoft.eurekaclientiteminfo.services;

import org.lucksoft.eurekaclientiteminfo.domain.ItemInfo;
import org.lucksoft.eurekaclientiteminfo.domain.ItemInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lucky
 *
 */
@Service
public class ItemInfoServiceImpl implements ItemInfoService {
	
	@Autowired
	private ItemInfoDao iiDao;

	/* (non-Javadoc)
	 * @see org.lucksoft.eurekaclientiteminfo.services.ItemInfoService#getItemInfo(java.lang.Integer)
	 */
	@Override
	public ItemInfo getItemInfo(Integer itemID) {
		return iiDao.findByItemId(itemID);
	}

}
