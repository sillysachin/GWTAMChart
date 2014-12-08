package com.amcharts.jso;

import com.amcharts.api.IsDurationUnits;
import com.google.gwt.core.client.JavaScriptObject;

public class DurationUnitsJSO extends JavaScriptObject implements IsDurationUnits
{
	protected DurationUnitsJSO()
	{
	}

	@Override
	public final native String getHh()
	/*-{
		return this.hh;
	}-*/;

	@Override
	public final native String getMm()
	/*-{
		return this.mm;
	}-*/;

	@Override
	public final native void setHh( String hh )
	/*-{
		this.hh = hh;
	}-*/;

	@Override
	public final native void setMm( String mm )
	/*-{
		this.mm = mm;
	}-*/;
}