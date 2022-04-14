package br.edu.insper.desagil.aula5.concord;

public class User {
	
	private String name;
	private int tag;
	
	public User(String name, int tag) {
		this.name = name;
		this.tag = tag;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public String fullName() {
		return name + "#" + String.format("%04d", tag);
	}
}
