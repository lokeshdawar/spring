package org.lucksoft.eurekaclientitemreview.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemReviewDao extends CrudRepository<ItemReview, Integer> {

}
