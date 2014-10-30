package com.amcharts.impl;

import com.amcharts.api.IsLegend;
import com.amcharts.jso.LegendJSO;
import com.amcharts.jso.util.IdUtils;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class Legend implements IsLegend, IJavaScriptWrapper<LegendJSO>
{
	private LegendJSO jso;

	public Legend()
	{
		setJso( ( LegendJSO ) JavaScriptObject.createObject() );
	}

	@Override
	public LegendJSO getJso()
	{
		return this.jso;
	}

	@Override
	public void setJso( LegendJSO jso )
	{
		this.jso = jso;
		this.jso.setId( IdUtils.getId() );
	}

	@Override
	public String getMarkerType()
	{
		return getJso().getMarkerType();
	}

	@Override
	public void setMarkerType( String markerType )
	{
		getJso().setMarkerType( markerType );
	}

	@Override
	public String getPosition()
	{
		return getJso().getMarkerType();
	}

	@Override
	public void setPosition( String position )
	{
		getJso().setPosition( position );
	}

	@Override
	public int getMarginRight()
	{
		return getJso().getMarginRight();
	}

	@Override
	public void setMarginRight( int marginRight )
	{
		getJso().setMarginRight( marginRight );
	}

	@Override
	public boolean isAutoMargins()
	{
		return getJso().isAutoMargins();
	}

	@Override
	public void setAutoMargins( boolean autoMargins )
	{
		getJso().setAutoMargins( autoMargins );
	}
}