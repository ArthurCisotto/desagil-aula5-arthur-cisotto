package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChannelTest {
	
	private Channel c;
	@BeforeEach 
	void setUp() {
		c = new Channel("channel");
	}
	@Test
	void addTwoUsersSameNameAndTag() {
		User user1 = new User("Arthur", 3001);
		User user2 = new User("Arthur", 3001);
		c.addUser(user1);
		c.addUser(user2);
		assertEquals(1, c.size());
	}
	@Test
	void addTwoUsersDifferentNameAndTag() {
		User user1 = new User("Arthur", 3001);
		User user2 = new User("Alessandra", 2611);
		c.addUser(user1);
		c.addUser(user2);
		assertEquals(2, c.size());
	}
}
