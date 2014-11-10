package com.amcharts.impl.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;

public abstract class AmChartDomEvent<H extends EventHandler> extends GwtEvent<H>
{
	private AmChartEventJSO jso;

	public AmChartDomEvent()
	{
	}

	public AmChartDomEvent( AmChartEventJSO amChartEventJSO )
	{
		this.jso = amChartEventJSO;
	}

	public Event getEvent()
	{
		return getJso().getEvent();
	}

	public void setEvent( Event event )
	{
		this.getJso().setEvent( event );
	}

	public String getType()
	{
		return getJso().getType();
	}

	protected AmChartEventJSO getJso()
	{
		return jso;
	}

	public void setType( String type )
	{
		getJso().setType( type );
	}
}