package com.amcharts.impl;

import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AmCharts extends Composite implements IJavaScriptWrapper
{
	protected JavaScriptObject jso;

	private LayoutPanel divWrapper = new LayoutPanel();

	protected AmCharts( JavaScriptObject configJSO )
	{
		init( configJSO );
	}

	public void init( JavaScriptObject configJSO )
	{
		setId( Document.get().createUniqueId() );
		initWidget( divWrapper );
		jso = createJso( configJSO );
	}

	public void setId( String id )
	{
		divWrapper.getElement().setId( id );
		//TODO: need to verify how this impacts the chart which uses the id for finding the parent container.
	}

	public String getId()
	{
		return divWrapper.getElement().getId();
	}

	private native JavaScriptObject createJso( JavaScriptObject configJSO )
	/*-{
		var id = this.@com.amcharts.impl.AmCharts::getId();
		return $wnd.AmCharts.makeChart(id, configJSO);
	}-*/;

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
}