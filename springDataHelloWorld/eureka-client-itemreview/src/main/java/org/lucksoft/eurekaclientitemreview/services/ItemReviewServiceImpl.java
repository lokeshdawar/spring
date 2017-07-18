package org.lucksoft.eurekaclientitemreview.services;

import java.util.ArrayList;
import java.util.List;

import org.lucksoft.eurekaclientitemreview.domain.ItemReview;
import org.lucksoft.eurekaclientitemreview.domain.ItemReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewServiceImpl implements ItemReviewService {
	
	@Autowired
	private ItemReviewDao itemReviewDao;
	
	public List<ItemReview> getItemReviews(int itemID) {
		List<ItemReview> itl= new ArrayList<ItemReview>();
		itl.add(itemReviewDao.findOne(itemID));
		return itl;
	}
}
