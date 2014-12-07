package com.amcharts.impl.event;

import com.amcharts.api.IsSerialDataItem;
import com.amcharts.impl.AmChart;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AxisBase;
import com.amcharts.impl.Target;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Event;

public class AmChartEventJSO extends JavaScriptObject
{

	protected AmChartEventJSO()
	{
	}

	public final native AxisBase getAxis()
	/*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.axis)
		return axisBase;
	}-*/;

	public final native void setAxis( AxisBase axisBase )
	/*-{
		var axis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(axisBase)
		this.axis = axis;
	}-*/;

	public final native AmChart getChart()
	/*-{
		var amChart = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.chart)
		return amChart;
	}-*/;

	public final native void setChart( AmChart amChart )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amChart)
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

	public final native AmGraph getGraph()
	/*-{
		var amGraph = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.graph)
		return amGraph;
	}-*/;

	public final native void setGraph( AmGraph amGraph )
	/*-{
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amGraph)
		this.graph = graph;
	}-*/;

	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex( int index )
	/*-{
		this.index = index;
	}-*/;

	public final native ClickItem getClickItem()
	/*-{
		if (this.item != null) {
			this.item.className = 'ClickItem';
		}
		return this.item;
	}-*/;

	public final native void setClickItem( ClickItem item )
	/*-{
		this.item = item;
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

	public final native IsSerialDataItem getSerialDataItem()
	/*-{
		if (this.serialDataItem != null) {
			this.serialDataItem.className = 'SerialDataItem';
		}
		return this.serialDataItem;
	}-*/;

	public final native void setSerialDataItem( IsSerialDataItem serialDataItem )
	/*-{
		this.serialDataItem = serialDataItem;
	}-*/;

	//TODO: Is this always a instance of AmGraph
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

	public final ClickItem getItem()
	{
		return getClickItem();
	}
}