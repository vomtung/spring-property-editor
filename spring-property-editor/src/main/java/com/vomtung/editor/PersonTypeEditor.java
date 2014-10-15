package com.vomtung.editor;

import java.beans.PropertyEditorSupport;

import com.vomtung.bean.PersonType;

public class PersonTypeEditor extends PropertyEditorSupport {

	public void setAsText(String text) {
		String upperText = text.toUpperCase();
		PersonType pt = new PersonType();
		pt.setTypeName(upperText);
		setValue(pt);
	}
	
}
