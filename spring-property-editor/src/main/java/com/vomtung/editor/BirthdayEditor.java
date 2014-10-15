package com.vomtung.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayEditor extends PropertyEditorSupport {

	public void setAsText(String text) {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date birthdate;
		try {
			birthdate = (Date)formatter.parse(text);
			setValue(birthdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
