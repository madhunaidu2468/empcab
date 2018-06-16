package com.empcab.util;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomLocalTimeDeSerializer extends JsonDeserializer<LocalTime> {

	@Override
	public LocalTime deserialize(JsonParser arg0, DeserializationContext ctxt)
			throws IOException {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("HH:mm:ss");
		String time = arg0.getText();
		if(time!=null && !time.isEmpty())
			return	LocalTime.parse(time, format);

		return null;
	}

}
