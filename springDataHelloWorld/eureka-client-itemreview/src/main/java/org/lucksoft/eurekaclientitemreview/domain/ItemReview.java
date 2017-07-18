package org.lucksoft.eurekaclientitemreview.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ItemReviews entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "item_reviews", catalog = "item_review")
public class ItemReview extends AbstractItemReview implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItemReview() {
	}

	/** full constructor */
	public ItemReview(Integer itemId, String itemReview) {
		super(itemId, itemReview);
	}

}
