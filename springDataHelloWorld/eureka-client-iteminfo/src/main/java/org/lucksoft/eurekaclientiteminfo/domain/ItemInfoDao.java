package org.lucksoft.eurekaclientiteminfo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemInfoDao extends CrudRepository<ItemInfo, Integer> {
	public ItemInfo findByItemId(Integer item_id);
}
