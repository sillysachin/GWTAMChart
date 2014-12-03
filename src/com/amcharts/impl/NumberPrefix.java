package com.amcharts.impl;

import com.amcharts.api.IsNumberPrefix;
import com.google.gwt.core.client.JavaScriptObject;

public class NumberPrefix extends JavaScriptObject implements IsNumberPrefix
{
	protected NumberPrefix()
	{
	}

	@Override
	public final native String getNumber()
	/*-{
		return this.number;
	}-*/;

	@Override
	public final native void setNumber( String number )
	/*-{
		this.number = number;
	}-*/;

	@Override
	public final native String getPrefix()
	/*-{
		return this.prefix;
	}-*/;

	@Override
	public final native void setPrefix( String prefix )
	/*-{
		this.prefix = prefix;
	}-*/;
}