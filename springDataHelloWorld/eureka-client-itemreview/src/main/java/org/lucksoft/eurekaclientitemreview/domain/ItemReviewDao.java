package org.lucksoft.eurekaclientitemreview.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemReviewDao extends CrudRepository<ItemReview, Integer> {
	List<ItemReview> findByItemId(Integer itemId);
}
