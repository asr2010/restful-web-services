package com.arpit.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean filtering() {
		return new SomeBean("Value1", "Value2", "Value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> filteringList() {
		return Arrays.asList(new SomeBean("Value1", "Value2", "Value3"),
				new SomeBean("Value4", "Value5", "Value6"));
	}

}
