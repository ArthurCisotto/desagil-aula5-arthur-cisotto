package br.edu.insper.desagil.aula5.concord;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String name;
	private List<User> listaUsuarios;

	public Channel(String name) {
		this.name = name;
		this.listaUsuarios = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int size(){
		return listaUsuarios.size();
	}
	
	public void addUser(User user) {
		for (User u : listaUsuarios) {
			if (u.getName().equals(user.getName()) && u.getTag() == user.getTag()) {
				return;
			}
		}
		listaUsuarios.add(user);
	}
}
