package com.amcharts.impl;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;

public class AmChartLayoutPanel extends ResizeComposite
{
	String id;

	private LayoutPanel divWrapper = new LayoutPanel();

	protected AmChartLayoutPanel()
	{
		init();
	}

	protected AmChartLayoutPanel( String id )
	{
		init( id );
	}

	protected void init()
	{
		init( Document.get().createUniqueId() );
	}

	protected void init( String id )
	{
		setId( id );
		divWrapper.addStyleName( "gwt-AmChartLayoutPanel" );
		initWidget( divWrapper );
	}

	public void setId( String id )
	{
		this.id = id;
		divWrapper.getElement().setId( id );
	}

	public String getId()
	{
		return id;
	}
}