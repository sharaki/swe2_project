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

	

public class NotificationsTest {

	String id;
	String name;
	String u_id;
	String u_name;
	String not;
	String n_id;
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

  Notifications note=new Notifications(id, name, u_id, u_name, not, n_id);
  @Test
  public void Notifications() {
	  Notifications note=new Notifications("2", "amr", "3", "shark", "accept", "8");
  }

  @Test
  public void Notifiy() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	  ArrayList arr = new ArrayList();
	  Assert.assertEquals(note.Notifiy("2"), arr);  
	  }

}
