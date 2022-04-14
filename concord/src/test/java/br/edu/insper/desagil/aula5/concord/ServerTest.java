package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServerTest {
	
	private Server s;
	
	@BeforeEach
	void setUp() {
		s = new Server("server");
	}
	@Test
	void addOneMember() {
		User user1 = new User("user1",1);
		s.addMember(user1);
		assertEquals(1, s.numberOfMembers());
		
	}
	@Test
	void addTwoMembers() {
		User user1 = new User("user1",1);
		User user2 = new User("user2",2);
		s.addMember(user1);
		s.addMember(user2);
		assertEquals(2, s.numberOfMembers());
	}
	@Test
	void addOneChannel() {
		s.addChannel("c1");
		assertEquals(1, s.numberOfChannels());
	}
    @Test
    void addTwoChannels() {
        s.addChannel("c1");
        s.addChannel("c2");
        assertEquals(2, s.numberOfChannels());
    }
    @Test
    void addChannelUser() {
        s.addChannel("c1");
        s.addChannel("c2");
        Member member = new Member(new User("Arthur", 3001));
        s.addChannelUser(0, member);
        Channel channel = s.getChannelByIndex(0);
        assertEquals(1, channel.size());
    }
}
