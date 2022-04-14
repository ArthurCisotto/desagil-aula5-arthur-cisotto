package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberTest {
	
	private Member member;
	
	@BeforeEach
	void setUp() {
		User user = new User("ottosic", 3001);
		member = new Member(user);
	}
	@Test
	void build() {
		assertNotNull(member.getUser());
		assertFalse(member.isManageServer());
		assertFalse(member.isManageChannel());
	}
	@Test
	void changeManageServer() {
		member.setManageServer(true);
		assertTrue(member.isManageServer());
	}
	@Test
	void changeManageChannel() {
		member.setManageChannel(true);;
		assertTrue(member.isManageChannel());
	}

}
