package com.samyem.webblocks.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Application implements IsSerializable {

	private Integer id;

	private String name = "Unnamed Application";
	private String description = "";

	/**
	 * Top level objects in the application. Starts with the first object
	 */
	private List<AppObject> objects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AppObject> getObjects() {
		return objects;
	}

	public void setObjects(List<AppObject> objects) {
		this.objects = objects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
