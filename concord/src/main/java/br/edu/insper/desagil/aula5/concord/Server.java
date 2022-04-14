package br.edu.insper.desagil.aula5.concord;

import java.util.ArrayList;
import java.util.List;

public class Server {

	private String nome;
	private List<Member> members;
	private List<Channel> channels;
	
	public Server(String nome) {
		this.nome = nome;
		this.members = new ArrayList<>();
		this.channels = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int numberOfMembers() {
		return members.size();
	}
	
	public int numberOfChannels() {
		return channels.size();
	}
	
	public void addMember(User user) {
		members.add(new Member(user));
	}
	
	public void addChannel(String name) {
		channels.add(new Channel(name));
	}
	
	public void addChannelUser(int i, Member member) {
		channels.get(i).addUser(member.getUser());
	}
	
	public Channel getChannelByIndex(int i) {
		return channels.get(i);
	}
}
