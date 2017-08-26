package com.sqtd.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Request;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sqtd.demo.helloWorld.controller.HelloWorldController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo2ApplicationTests {

	private MockMvc mvc;
	
	@Before
	public void before (){
		this.mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}
	
	@Test
	public void contextLoads() throws Exception {
		
		RequestBuilder req = get("/index/main");
		mvc.perform(req).andExpect(status().isOk()).andExpect(content().string("hello world"));
		
	}

}
