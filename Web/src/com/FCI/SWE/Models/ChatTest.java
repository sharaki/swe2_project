package com.FCI.SWE.Models;

import java.util.*;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FCI.SWE.Models.Chat;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;


public class ChatTest {

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
	Chat Chat= new Chat();
	
	
	@Test
	public void CreateChatGroup()
	{
		String name="sw team"; String owner="shark"; String senders="shark"; String ides="3";
		Assert.assertEquals(true, Chat.CreateChatGroup(name, owner, senders, ides));
	}
	
	
  @Test
  public void MsgChatGroup() {
	  String id="2"; String Sender="amr"; String content="HELLO";
	  Assert.assertEquals(true, Chat.MsgChatGroup(id, Sender, content));
  }

  
  @Test
  public void ViewChatGroup() throws ParseException {
	  String userid="2";
	  ArrayList<Chat> actual = new ArrayList<Chat>();
	  String[] exp={"sw team", "shark", "2"};
	  actual.add(Chat);
	  Assert.assertEquals(actual, Chat.ViewChatGroup(userid));
  }
  
	String[] expec={"amr", "HELLO", "sw team"};
  @Test
  public void ViewMsgChatGroup() throws ParseException {
	  String id="2";
	  ArrayList<Chat> actual = new ArrayList<Chat>();
	  actual.add(Chat);
	  Assert.assertEquals(actual, Chat.ViewMsgChatGroup(id));
  }
}