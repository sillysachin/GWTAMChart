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

	public final native void setEvent( Event event )
	/*-{
		this.event = event;
	}-*/;

	public final native DataItem getDataItem()
	/*-{
		if (this.dataItem != null) {
			this.dataItem.className = 'DataItem';
		}
		return this.dataItem;
	}-*/;

	public final native void setDataItem( DataItem dataItem )
	/*-{
		this.dataItem = dataItem;
	}-*/;

	public final native SerialDataItem getSerialDataItem()
	/*-{
		if (this.serialDataItem != null) {
			this.serialDataItem.className = 'SerialDataItem';
		}
		return this.serialDataItem;
	}-*/;

	public final native void setSerialDataItem( SerialDataItem serialDataItem )
	/*-{
		this.serialDataItem = serialDataItem;
	}-*/;

	public final native Target getTarget()
	/*-{
		return this.target;
	}-*/;

	public final native void setTarget( Target target )
	/*-{
		if (this.target != null) {
			this.target.className = 'Target';
		}
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
		if (this.value != null) {
			this.value.className = 'Value';
		}
		this.value = value;
	}-*/;

	public final native Object getStartValue()
	/*-{
		return this.startValue;
	}-*/;

	public final native void setStartValue( Object startValue )
	/*-{
		if (this.startValue != null) {
			this.startValue.className = 'StartValue';
		}
		this.startValue = startValue;
	}-*/;

	public final native Object getEndValue()
	/*-{
		return endValue;
	}-*/;

	public final native void setEndValue( Object endValue )
	/*-{
		if (this.endValue != null) {
			this.endValue.className = 'EndValue';
		}
		this.endValue = endValue;
	}-*/;
}