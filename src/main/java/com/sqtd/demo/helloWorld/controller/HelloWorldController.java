package com.sqtd.demo.helloWorld.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sqtd.demo.entity.User;

@RestController
@RequestMapping(value = "/index")
public class HelloWorldController {
	@RequestMapping(value = "main")
	public String index() {
		return "hello world";
	}

	@RequestMapping(value = "map")
	public Map<String, String> index2(@RequestParam String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("age", "20");
		return map;
	}
	
	@RequestMapping(value = "/user/{id}/{name}")
	public User getUser(@PathVariable int id,@PathVariable String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}

}
