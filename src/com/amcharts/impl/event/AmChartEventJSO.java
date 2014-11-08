package com.amcharts.impl.event;

import com.amcharts.impl.SerialDataItem;
import com.amcharts.impl.Target;
import com.amcharts.jso.AmChartJSO;
import com.amcharts.jso.AxisBaseJSO;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Event;

public class AmChartEventJSO extends JavaScriptObject
{
	protected AmChartEventJSO()
	{
	}

	public final native AxisBaseJSO getAxis()
	/*-{
		return this.axis;
	}-*/;

	public final native void setAxis( AxisBaseJSO axis )
	/*-{
		this.axis = axis;
	}-*/;

	public final native AmChartJSO getChart()
	/*-{
		return this.chart;
	}-*/;

	public final native void setChart( AmChartJSO chart )
	/*-{
		this.chart = chart;
	}-*/;

	public final native Event getEvent()
	/*-{
		return this.event;
	}-*/;

	public final native void getEvent( Event event )
	/*-{
		this.event = event;
	}-*/;

	public final native DataItem getDataItem()
	/*-{
		return this.dataItem;
	}-*/;

	public final native void setDataItem( DataItem dataItem )
	/*-{
		this.dataItem = dataItem;
	}-*/;

	public final native SerialDataItem setSerialDataItem()
	/*-{
		return this.serialDataItem;
	}-*/;

	public final native void getSerialDataItem( SerialDataItem serialDataItem )
	/*-{
		this.serialDataItem = serialDataItem;
	}-*/;

	public final native Target getTarget()
	/*-{
		return this.target;
	}-*/;

	public final native void setTarget( Target target )
	/*-{
		this.target = target;
	}-*/;

	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	public final native void setType( String type )
	/*-{
		this.type = type;
	}-*/;

	public final native Object getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue( Object value )
	/*-{
		this.value = value;
	}-*/;
}