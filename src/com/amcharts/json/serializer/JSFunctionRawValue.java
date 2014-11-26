package com.amcharts.json.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class JSFunctionRawValue implements JsonSerializable
{
	protected String iFunction = null;

	protected boolean iDoubleQuote = false;

	public JSFunctionRawValue( String aFunction )
	{
		super();
		iFunction = aFunction;
		iDoubleQuote = false;
	}

	public JSFunctionRawValue( String aFunction, boolean aDoubleQuote )
	{
		super();
		iFunction = aFunction;
		iDoubleQuote = aDoubleQuote;
	}

	/* (non-Javadoc)
	 * @see org.codehaus.jackson.map.JsonSerializableWithType#serializeWithType(org.codehaus.jackson.JsonGenerator,    org.codehaus.jackson.map.SerializerProvider, org.codehaus.jackson.map.TypeSerializer)
	 */
	public void serializeWithType( JsonGenerator aJsonGenerator, SerializerProvider aSerializerProvider, TypeSerializer aTypeSerializer ) throws IOException, JsonProcessingException
	{
		if ( iDoubleQuote )
			aJsonGenerator.writeRawValue( "\"" + iFunction + "\"" );
		else
			aJsonGenerator.writeRawValue( iFunction );
	}

	public void serialize( JsonGenerator aJsonGenerator, SerializerProvider aSerializerProvider ) throws IOException, JsonProcessingException
	{
		if ( iDoubleQuote )
			aJsonGenerator.writeRawValue( "\"" + iFunction + "\"" );
		else
			aJsonGenerator.writeRawValue( iFunction );
	}
}
