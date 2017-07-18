package org.lucksoft.eurekaclientitemreview.services;

import java.util.List;

import org.lucksoft.eurekaclientitemreview.domain.ItemReview;

public interface ItemReviewService {
	
	public List<ItemReview> getItemReviews(int itemID);
}
