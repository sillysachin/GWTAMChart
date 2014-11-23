package com.amcharts.impl;

import com.amcharts.api.IsFacePattern;
import com.amcharts.jso.FacePatternJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class FacePattern implements IsFacePattern, IJavaScriptWrapper<FacePatternJSO>
{
	private FacePatternJSO jso;

	public FacePattern()
	{
		jso = createJso();
	}

	public native FacePatternJSO createJso() /*-{
		var jso = {}
		jso.className = 'FacePattern';
		return jso;
	}-*/;

	@Override
	public FacePatternJSO getJso()
	{
		return jso;
	}

	@Override
	public void setJso( FacePatternJSO jso )
	{
		this.jso = jso;
	}

	@Override
	public String getUrl()
	{
		return getJso().getUrl();
	}

	@Override
	public double getWidth()
	{
		return getJso().getWidth();
	}

	@Override
	public double getHeight()
	{
		return getJso().getHeight();
	}

	@Override
	public void setUrl( String url )
	{
		getJso().setUrl( url );
	}

	@Override
	public void setWidth( double width )
	{
		getJso().setWidth( width );
	}

	@Override
	public void setHeight( double height )
	{
		getJso().setHeight( height );
	}
}