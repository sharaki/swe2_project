package com.FCI.SWE.Models;


import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.User_timeLine;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class User_timeLineTest {
	
	private final LocalServiceTestHelper helper1 =
			new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

			@BeforeClass
			public void setUp() {
			helper1.setUp();
			}

			@AfterClass
			public void tearDown() {
			helper1.tearDown();
			}
			
	User_timeLine T = new User_timeLine();

  @Test
  public void getPage_ID() {
	  T.setPage_ID("page1");
	  System.out.println("getPage_ID is testing ...");
	  Assert.assertEquals("page1", T.getPage_ID());
  }

  @Test
  public void getPost_ID() {
	  T.setPost_ID("post1");
	  System.out.println("getPost_ID is testing ...");
	  Assert.assertEquals("post1", T.getPost_ID());
  }

  @Test
  public void getUser_id() {
	  T.setUser_id("3");
	  System.out.println("getUser_id is testing ...");
	  Assert.assertEquals("3", T.getUser_id());
  }

  @Test
  public void getUser_name() {
	  T.setUser_name("amr");
	  System.out.println("getUser_name is testing ...");
	  Assert.assertEquals("amr", T.getUser_name());
  }

  
}
