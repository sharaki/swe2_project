package com.FCI.SWE.Models;

import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.Hashtag;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class HashtagTest {
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
	Hashtag Hashtag=new Hashtag();
  @Test
  public void AddHashtag() {
	  String name="amr";
	  String id="2";
	  Assert.assertEquals(1, Hashtag.AddHashtag(name, id));
  }
}
