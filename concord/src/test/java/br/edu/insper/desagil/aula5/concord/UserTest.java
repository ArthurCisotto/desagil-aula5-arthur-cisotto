package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void buildWithNameAliceTag0() {
		User user = new User("alice", 0);
		assertEquals("alice#0000", user.fullName());
	}

	@Test
	void buildWithNameAliceTag1() {
		User user = new User("alice", 1);
		assertEquals("alice#0001", user.fullName());
	}

	@Test
	void buildWithNameAliceTag22() {
		User user = new User("alice", 22);
		assertEquals("alice#0022", user.fullName());
	}
	
	@Test
	void buildWithNameBobTag333() {
		User user = new User("bob", 333);
		assertEquals("bob#0333", user.fullName());
	}
	
	@Test
	void buildWithNameBobTag4444() {
		User user = new User("bob", 4444);
		assertEquals("bob#4444", user.fullName());
	}
	
	@Test
	void buildWithNameBobTag1234() {
		User user = new User("bob", 1234);
		assertEquals("bob#1234", user.fullName());
	}
	
}
