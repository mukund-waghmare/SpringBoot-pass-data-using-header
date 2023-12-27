package com.ty.headerparameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/info")
	public String test(@RequestHeader String token)
	{
		return token;
	}

}
