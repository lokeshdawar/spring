package org.lucksoft.eurekaclientiteminfo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemInfoDao extends CrudRepository<ItemInfo, Integer> {
	public List<ItemInfo> findByItemId(Integer item_id);
}
