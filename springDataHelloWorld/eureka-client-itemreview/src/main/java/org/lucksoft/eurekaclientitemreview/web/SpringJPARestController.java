package org.lucksoft.eurekaclientitemreview.web;


import java.util.List;

import org.lucksoft.eurekaclientitemreview.domain.ItemReview;
import org.lucksoft.eurekaclientitemreview.services.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SpringJPARestController {

	@Autowired
	private ItemReviewService uService;
	
	@GetMapping("/itemreviews/{itemID}")
	public ResponseEntity getUser(@PathVariable("itemID") int itemID) {
		//return uService.getUser(id);
		List<ItemReview> user = uService.getItemReviews(itemID);
		if (user == null) {
			return new ResponseEntity("No user found for ID " + itemID, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(user, HttpStatus.OK);
	}
}
