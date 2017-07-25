/**
 * 
 */
package org.lucksoft.eurekaclientiteminfo.web;

import org.lucksoft.eurekaclientiteminfo.domain.ItemInfo;
import org.lucksoft.eurekaclientiteminfo.services.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucky
 *
 */

@RestController
public class ItemInfoRestController {
	
	@Autowired
	private ItemInfoService iiService;
	
	@GetMapping("/iteminfo/{itemId}")
	public ResponseEntity getItemById(@PathVariable("itemId")  int itemId){
		ItemInfo iInfo = iiService.getItemInfo(itemId);
		if (iInfo == null) {
			return new ResponseEntity("No Item Review found for ID " + itemId, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(iInfo, HttpStatus.OK);
	}
}
