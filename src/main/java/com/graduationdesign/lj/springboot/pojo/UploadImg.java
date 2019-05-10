package com.graduationdesign.lj.springboot.pojo;

public class UploadImg {
	private int id;
	private String file_name;
	private String location;
	private int upload_user;
	private int role_id;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getUpload_user() {
		return upload_user;
	}
	public void setUpload_user(int upload_user) {
		this.upload_user = upload_user;
	}

}
