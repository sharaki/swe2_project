package com.FCI.SWE.Models;

import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.Friends;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class FriendsTest {
	
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
	Friends friends= new Friends();
	
//	actual={"amr", "2"}
	
  @Test
  public void Friendlist() {
	  String user_id="3";
	  ArrayList<Friends> actual = new ArrayList<Friends>();
	  actual.add(friends);
	  Assert.assertEquals(actual, friends.Friendlist(user_id));
  }
}
