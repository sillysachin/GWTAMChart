package com.appbootup.explore.gwt.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonBuilderFactory
{
	private static final JsonBuilderFactory INSTANCE = new JsonBuilderFactory();

	private static JsonRenderer JACKSON_INSTANCE = new JsonRenderer();

	private static final Gson GSON_INSTANCE = new GsonBuilder().create();

	public static JsonBuilderFactory getInstance()
	{
		return JsonBuilderFactory.INSTANCE;
	}

	private JsonBuilderFactory()
	{
	}

	public JsonRenderer getJacksonRenderer()
	{
		return JsonBuilderFactory.JACKSON_INSTANCE;
	}

	public Gson getGsonRenderer()
	{
		return GSON_INSTANCE;
	}
}