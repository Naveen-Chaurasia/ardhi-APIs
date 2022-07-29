package com.ardhi.neo4jAccess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.ardhi.neo4jAccess.Entities.Level1;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
@SpringBootTest
class Neo4jAccessApplicationTests {
	
	@Test
	void contextLoads() {
	}
	 @Autowired
	    private WebApplicationContext wac;

	    private MockMvc mvc;
	
	 @Test
	   public void getLevel1CFRP() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/30";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 @Test
	   public void getLevel1Steel() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/40";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 @Test
	   public void getLevel1GFRP() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/0";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 @Test
	   public void getLevel2CFRP() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/30/Level2";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 @Test
	   public void getLevel2GFRP() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/0/Level2";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 @Test
	   public void getLevel2Steel() throws Exception {
		 DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
	        this.mvc = builder.build();
	      String uri = "/Level1/40/Level2";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);

	   }
	 
	 

}
