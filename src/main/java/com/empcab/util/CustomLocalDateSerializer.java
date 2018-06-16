/**
 * 
 */
package com.empcab.util;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author Madhu.R
 *
 */
public class CustomLocalDateSerializer extends JsonSerializer<LocalDate> {

	private static DateTimeFormatter formatter = DateTimeFormatter
			.ofPattern("yyyy-MM-dd");

	@Override
	public void serialize(LocalDate value, JsonGenerator gen,
			SerializerProvider arg2) throws IOException {

		gen.writeString(formatter.format(value));
	}
}