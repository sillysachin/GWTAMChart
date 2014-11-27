package com.appbootup.explore.gwt.server;

import java.util.Locale;

import com.amcharts.api.IsFunction;
import com.amcharts.json.serializer.JsFunctionSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRenderer
{
	private final ObjectMapper jacksonMapper;

	private final ChartsJacksonModule jacksonModule;

	/**
	 * The default mapper can be used to bypass the serializers registered in the {@link ChartsJacksonModule}.
	 */
	public final static ObjectMapper DEFAULT_MAPPER = createDefaultObjectMapper();

	public JsonRenderer()
	{
		this.jacksonModule = new ChartsJacksonModule();
		jacksonModule.addSerializer( IsFunction.class, new JsFunctionSerializer() );
		this.jacksonMapper = createJacksonMapper();
	}

	/**
	 * This method gives the opportunity to add a custom serializer to serialize one of the amchart classes. 
	 * It may be necessary to serialize certain classes differently for different web frameworks.
	 *
	 * @param clazz
	 *            the option class
	 * @param serializer
	 *            the serializer responsible for serializing objects of the option class.
	 */
	public <T> void addSerializer( final Class<T> clazz, final JsonSerializer<T> serializer )
	{
		this.jacksonModule.addSerializer( clazz, serializer );
	}

	private ObjectMapper createJacksonMapper()
	{
		ObjectMapper mapper = createDefaultObjectMapper();
		mapper.setLocale( Locale.ENGLISH );
		mapper.registerModule( this.jacksonModule );
		return mapper;
	}

	private static ObjectMapper createDefaultObjectMapper()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable( SerializationFeature.INDENT_OUTPUT );
		mapper.disable( SerializationFeature.WRITE_NULL_MAP_VALUES );
		mapper.disable( SerializationFeature.FAIL_ON_EMPTY_BEANS );
		mapper.setSerializationInclusion( Include.NON_NULL );
		return mapper;
	}

	public String toJson( final Object object )
	{
		try
		{
			return this.jacksonMapper.writeValueAsString( object );
		}
		catch ( Exception e )
		{
			throw new RuntimeException( "Error trying to serialize object of type " + object
					.getClass().getName() + " into JSON!", e );
		}
	}

	public <T> T fromJson( final String json, final Class<T> targetClazz )
	{
		try
		{
			return this.jacksonMapper.readValue( json, targetClazz );
		}
		catch ( Exception e )
		{
			throw new RuntimeException( "Error trying to deserialize object of type " + targetClazz.getName() + " into JSON!", e );
		}
	}
}