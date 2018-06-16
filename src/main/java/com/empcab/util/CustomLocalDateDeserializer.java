/**
 * 
 */
package com.empcab.util;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * @author Madhu.R
 *
 */
public class CustomLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml
	 * .jackson.core.JsonParser,
	 * com.fasterxml.jackson.databind.DeserializationContext)
	 */
	@Override
	public LocalDate deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = arg0.getText();
		if (date != null)
			return LocalDate.parse(date, format);

		return null;
	}

}
