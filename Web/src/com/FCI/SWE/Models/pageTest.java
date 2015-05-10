package com.FCI.SWE.Models;


import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.page;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;



public class pageTest {
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
	
	page P = new page();

  @Test
  public void LikePost() throws ParseException {
	  
	 	Assert.assertEquals("true", P.LikePost("post1", "3"));
  }

  @Test
  public void PageSearch() {
	  ArrayList<page> pages = new ArrayList();
	  pages.add(P);
	  
	  Assert.assertEquals(pages, P.PageSearch("amr", "personal"));
  }

  @Test
  public void ViewPosts() {
	  ArrayList<page> posts = new ArrayList();
	  posts.add(P);
	  
	  Assert.assertEquals(posts, P.ViewPosts("page1"));
  }

  @Test
  public void newpage() {
	  Assert.assertEquals("done", P.newpage("owner", "amr", "personal"));
  }

  
}
