package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class ImageModel {
@Id
 
private long id;
private String name;
private String type;
private byte[] pic;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public byte[] getPic() {
	return pic;
}
public void setPic(byte[] pic) {
	this.pic = pic;
}
public ImageModel(long id, String name, String type, byte[] pic) {

	this.id = id;
	this.name = name;
	this.type = type;
	this.pic = pic;
}
public ImageModel(String originalFilename, String contentType, byte[] bytes) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ImageModel [id=" + id + ", name=" + name + ", type=" + type + ", pic=" + Arrays.toString(pic) + "]";
}

}
