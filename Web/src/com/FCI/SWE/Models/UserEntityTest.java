package com.FCI.SWE.Models;


import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.UserEntity;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class UserEntityTest {
	
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
			
	UserEntity toBeTested = new UserEntity();
	

  @Test
  public void UserEntity() {
    // constructor
  }

  @Test
  public void UserEntityStringStringStringString() {
    // constructor
  }

  @Test
  public void UserEntityStringStringString() {
    // constructor
  }

  @Test
  public void UserEntityStringStringStringint() {
    // constructor
  }

  @Test
  public void acceptRequset() {
	  System.out.println("acceptRequest is testing ...");
	  Assert.assertEquals("accept", toBeTested.acceptRequset("2","3"));
  }

  @Test
  public void getEmail() {
	  System.out.println("getmail is testing ...");
	  Assert.assertEquals("amr", toBeTested.getEmail());
  }

  @Test
  public void getFriend_name() {
	  System.out.println("getFriend is testing ...");
	  Assert.assertEquals("friend", toBeTested.getFriend_name());
  }

  @Test
  public void getId() {
	  System.out.println("getId is testing ...");
	  Assert.assertEquals("friend", toBeTested.getFriend_name());
  }

  @Test
  public void getName() {
	  System.out.println("getName is testing ...");
	  Assert.assertEquals("amr", toBeTested.getName());
  }

}
