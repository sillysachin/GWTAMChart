package com.amcharts.impl.event;

import com.amcharts.jso.event.DataContextJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class DataContext implements IJavaScriptWrapper<DataContextJSO>
{
	private DataContextJSO jso;

	public native Integer getId()
	/*-{
		return this.@com.amcharts.impl.event.DataContext::jso.id;
	}-*/;

	public native void setId( Integer id )
	/*-{
		this.@com.amcharts.impl.event.DataContext::jso.id = id;
	}-*/;

	@Override
	public DataContextJSO getJso()
	{
		return jso;
	}

	@Override
	public void setJso( DataContextJSO jso )
	{
		this.jso = jso;
	}
}