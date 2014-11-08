package com.amcharts.impl.event;

import com.amcharts.impl.AmChart;
import com.google.web.bindery.event.shared.Event;

public abstract class AmChartEvent<H extends AmChartHandler> extends Event<H>
{
	private AmChart chart;

	private AmChartEventJSO jso;

	public AmChartEvent()
	{
	}

	public AmChartEvent( AmChartEventJSO amChartEventJSO )
	{
		this.setChart( extractChart( amChartEventJSO ) );
	}

	public AmChart getChart()
	{
		if ( chart == null )
		{
			chart = extractChart();
		}
		return chart;
	}

	public void setChart( AmChart chart )
	{
		this.chart = chart;
	}

	public native AmChart extractChart()
	/*-{
		this.@com.amcharts.impl.event.AmChartEvent::chart = this.chart;
		return this.chart;
	}-*/;

	public native AmChart extractChart( AmChartEventJSO amChartEventJSO )
	/*-{
		this.@com.amcharts.impl.event.AmChartEvent::chart = amChartEventJSO.chart;
		return amChartEventJSO.chart;
	}-*/;

	public String getEventType()
	{
		return getJso().getType();
	}

	private AmChartEventJSO getJso()
	{
		return jso;
	}
}