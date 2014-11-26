package com.amcharts.json.serializer;

import java.io.IOException;

import com.amcharts.api.IsFunction;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsFunctionSerializer extends JsonSerializer<IsFunction>
{
	@Override
	public void serialize( IsFunction jsfunction, JsonGenerator jgen, SerializerProvider provider ) throws IOException, JsonProcessingException
	{
		jgen.writeStartObject();
		jgen.writeObject(jsfunction.getFunctionString() );
		jgen.writeEndObject();
	}
}