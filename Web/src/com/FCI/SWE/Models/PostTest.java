package com.FCI.SWE.Models;


import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.Post;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class PostTest {

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
			
	Post P = new Post();
	
	
  @Test
  public void LikePost() {
	  
	  try {
		Assert.assertEquals("true", P.LikePost("post1", "3"));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @Test
  public void ViewPosts() {
	  
	  ArrayList<Post> posts = new ArrayList();
	  posts.add(P);
	  
	  Assert.assertEquals(posts, P.ViewPosts("3"));
  }

  @Test
  public void getContent() {
	  P.setContent("content");
	  Assert.assertEquals("content", P.getContent());
  }

  @Test
  public void getFeelings() {
	  P.setFeelings("feelings");
	  Assert.assertEquals("feelings", P.getFeelings());
  }

  @Test
  public void newpost() {
	 
	  Assert.assertEquals("post", P.newpost("3", "amr", "sad", "I'm sad", "personal"));
  }
}
