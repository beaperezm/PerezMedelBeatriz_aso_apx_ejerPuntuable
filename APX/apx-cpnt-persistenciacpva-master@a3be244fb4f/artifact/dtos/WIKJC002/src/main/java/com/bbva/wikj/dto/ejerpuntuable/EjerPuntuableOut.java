package com.bbva.wikj.dto.ejerpuntuable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class EjerPuntuableOut implements Serializable  {

	private String id;
	private String dateField;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateField() {
		return dateField;
	}

	public void setDateField(String dateField) {
		this.dateField = dateField;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("date", dateField)
			.toString();
	}
}
