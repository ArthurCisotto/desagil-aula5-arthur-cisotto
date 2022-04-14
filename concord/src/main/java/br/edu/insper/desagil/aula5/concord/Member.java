package br.edu.insper.desagil.aula5.concord;

public class Member {
	
	private User user;
	private boolean manageServer;
	private boolean manageChannel;
	
	public Member(User user) {
		this.user = user;
		this.manageServer = false;
		this.manageChannel = false;
	}

	public boolean isManageServer() {
		return manageServer;
	}

	public void setManageServer(boolean manageServer) {
		this.manageServer = manageServer;
	}

	public boolean isManageChannel() {
		return manageChannel;
	}

	public void setManageChannel(boolean manageChannel) {
		this.manageChannel = manageChannel;
	}

	public User getUser() {
		return user;
	}
}
