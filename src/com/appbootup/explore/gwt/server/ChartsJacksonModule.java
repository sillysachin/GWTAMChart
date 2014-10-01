package com.appbootup.explore.gwt.server;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.Version;

public class ChartsJacksonModule extends SimpleModule
{
	private static final long serialVersionUID = 1L;

	public ChartsJacksonModule()
	{
		super( "chart", new Version( 2, 5, 2, null, "com.appbootup.explore", "chart" ) );
	}
}