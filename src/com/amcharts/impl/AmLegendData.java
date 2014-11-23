package com.amcharts.impl;

import com.amcharts.api.IsAmLegendData;
import com.amcharts.jso.AmLegendDataJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class AmLegendData implements IsAmLegendData, IJavaScriptWrapper<AmLegendDataJSO>
{
	AmLegendDataJSO jso;

	public AmLegendData()
	{
		jso = createJso();
	}

	public AmLegendDataJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmLegendDataJSO jso )
	{
		this.jso = jso;
	}

	//TODO: createJso with {} instead of JavaScriptObject.createObject();
	public native AmLegendDataJSO createJso()
	/*-{
		var jso = {}
		jso.className = 'AmLegendData';
		return jso;
	}-*/;

	@Override
	public String getTitle()
	{
		return getJso().getTitle();
	}

	@Override
	public String getColor()
	{
		return getJso().getColor();
	}

	@Override
	public String getMarkerType()
	{
		return getJso().getMarkerType();
	}

	@Override
	public void setTitle( String title )
	{
		getJso().setTitle( title );
	}

	@Override
	public void setColor( String color )
	{
		getJso().setColor( color );

	}

	@Override
	public void setMarkerType( String markerType )
	{
		getJso().setMarkerType( markerType );
	}
}