package com.amcharts.impl;

import com.amcharts.api.IsDateFormat;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class DateFormat implements IsDateFormat, IJavaScriptWrapper<JavaScriptObject>
{
	JavaScriptObject jso;

	public DateFormat()
	{
		jso = JavaScriptObject.createObject();
	}

	@Override
	public JavaScriptObject getJso()
	{
		return jso;
	}

	@Override
	public void setJso( JavaScriptObject jso )
	{
		this.jso = jso;
	}

	public native void setPeriod( String period )
	/*-{
		this.@com.amcharts.impl.DateFormat::jso.period = period;
	}-*/;

	public native String getPeriod()
	/*-{
		return this.@com.amcharts.impl.DateFormat::jso.period;
	}-*/;

	public native void setFormat( String format )
	/*-{
		this.@com.amcharts.impl.DateFormat::jso.format = format;
	}-*/;

	public native String getFormat()
	/*-{
		return this.@com.amcharts.impl.DateFormat::jso.format;
	}-*/;
}