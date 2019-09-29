package com.dev.numbers;

public class Contact {
	private  String name;
	private Long phoneno;
	private  String group;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneno=" + phoneno + ", group=" + group + "]";
	}
	

}
