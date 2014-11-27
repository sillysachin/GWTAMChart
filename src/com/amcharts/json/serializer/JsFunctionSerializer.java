package com.amcharts.json.serializer;

import java.io.IOException;

import com.amcharts.api.IsFunction;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;

public class JsFunctionSerializer extends JsonSerializer<IsFunction>
{
	private RawSerializer<String> rawSerializer = new RawSerializer<String>( String.class );

	@Override
	public void serialize( IsFunction jsfunction, JsonGenerator jsonGenerator, SerializerProvider serializerProvider ) throws IOException, JsonProcessingException
	{
        rawSerializer.serialize(jsfunction.getFunctionString(), jsonGenerator, serializerProvider);
	}
}