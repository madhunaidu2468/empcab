package com.empcab.util;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomLocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime>
{

	@Override
	public LocalDateTime deserialize(JsonParser arg0, DeserializationContext arg1) throws IOException {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String date = arg0.getText();
		if(date!=null)
			return	LocalDateTime.parse(date, format);

		return null;
	}


}
