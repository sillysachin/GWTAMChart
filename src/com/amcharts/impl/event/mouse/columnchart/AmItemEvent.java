package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.impl.SerialDataItem;
import com.amcharts.impl.Target;
import com.amcharts.impl.event.AmChartDomEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class AmItemEvent<H extends AmChartHandler> extends AmChartDomEvent<H>
{
	private SerialDataItem serialDataItem;

	private Object value;

	private Target target;

	public AmItemEvent()
	{
	}

	public AmItemEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
		this.setSerialDataItem( extractSerialDataItem( amChartEventJSO ) );
	}

	public native SerialDataItem extractSerialDataItem()
	/*-{
		this.serialDataItem.className = 'SerialDataItem';
		return this.dataItem;
	}-*/;

	public native SerialDataItem extractSerialDataItem( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.serialDataItem.className = 'SerialDataItem';
		return amChartEventJSO.serialDataItem;
	}-*/;

	public SerialDataItem getSerialDataItem()
	{
		if ( serialDataItem == null )
		{
			serialDataItem = extractSerialDataItem();
		}
		return serialDataItem;
	}

	public void setSerialDataItem( SerialDataItem serialDataItem )
	{
		this.serialDataItem = serialDataItem;
	}

	public native Object extractValue()
	/*-{
		this.value.className = 'Value';
		return this.value;
	}-*/;

	public native Object extractValue( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.value.className = 'Value';
		return amChartEventJSO.value;
	}-*/;

	public Object getValue()
	{
		if ( value == null )
		{
			value = extractValue();
		}
		return value;
	}

	public void setValue( Object value )
	{
		this.value = value;
	}

	public native Target extractTarget()
	/*-{
		this.target.className = 'Target';
		return this.target;
	}-*/;

	public native Target extractTarget( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.target.className = 'Target';
		return amChartEventJSO.target;
	}-*/;

	public Target getTarget()
	{
		if ( target == null )
		{
			target = extractTarget();
		}
		return target;
	}

	public void setTarget( Target target )
	{
		this.target = target;
	}
}