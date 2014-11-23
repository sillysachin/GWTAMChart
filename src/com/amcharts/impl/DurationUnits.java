package com.amcharts.impl;

import com.amcharts.api.IsDurationUnits;
import com.amcharts.jso.DurationUnitsJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class DurationUnits implements IsDurationUnits, IJavaScriptWrapper<DurationUnitsJSO>
{
	DurationUnitsJSO jso;

	public DurationUnits()
	{
		jso = createJso();
	}

	public native DurationUnitsJSO createJso() /*-{
		var jso = {}
		jso.className = 'DurationUnits';
		return jso;
	}-*/;

	@Override
	public DurationUnitsJSO getJso()
	{
		return jso;
	}

	@Override
	public void setJso( DurationUnitsJSO jso )
	{
		this.jso = jso;
	}

	@Override
	public String getHh()
	{
		return getJso().getHh();
	}

	@Override
	public String getMm()
	{
		return getJso().getMm();
	}

	@Override
	public void setHh( String hh )
	{
		getJso().setHh( hh );
	}

	@Override
	public void setMm( String mm )
	{
		getJso().setMm( mm );
	}
}