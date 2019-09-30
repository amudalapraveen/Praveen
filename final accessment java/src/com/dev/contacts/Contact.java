package com.dev.contacts;

public class Contact {
	
		private String name;
		private long phoneNo;
		private String message;
		private String group;
		public String getGroup() {
			return group;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Contact [name=" + name + ", phoneNo=" + phoneNo + ", message=" + message + ", group=" + group + "]";
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}


	}
