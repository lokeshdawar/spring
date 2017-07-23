package org.lucksoft.eurekaclientitemreview.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractItemReviews entity provides the base persistence definition of the
 * ItemReviews entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass

public abstract class AbstractItemReview implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer reviewId;
	private Integer itemId;
	private String itemReview;

	// Constructors

	/** default constructor */
	public AbstractItemReview() {
	}

	/** full constructor */
	public AbstractItemReview(Integer itemId, String itemReview) {
		this.itemId = itemId;
		this.itemReview = itemReview;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "review_id", unique = true, nullable = false)

	public Integer getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	@Column(name = "item_id", nullable = false)

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "item_review", nullable = false, length = 200)

	public String getItemReview() {
		return this.itemReview;
	}

	public void setItemReview(String itemReview) {
		this.itemReview = itemReview;
	}

}