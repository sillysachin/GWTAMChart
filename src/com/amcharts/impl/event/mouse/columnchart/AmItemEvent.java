package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.api.IsSerialDataItem;
import com.amcharts.impl.Target;
import com.amcharts.impl.event.AmChartDomEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartHandler;
import com.amcharts.jso.AxisBaseJSO;

public abstract class AmItemEvent<H extends AmChartHandler> extends AmChartDomEvent<H>
{
	public AmItemEvent()
	{
	}

	public AmItemEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	public IsSerialDataItem getSerialDataItem()
	{
		return getJso().getSerialDataItem();
	}

	public void setSerialDataItem( IsSerialDataItem serialDataItem )
	{
		getJso().setSerialDataItem( serialDataItem );
	}

	public Object getValue()
	{
		return getJso().getValue();
	}

	public void setValue( Object value )
	{
		getJso().setValue( value );
	}

	public Target getTarget()
	{
		return getJso().getTarget();
	}

	public void setTarget( Target target )
	{
		getJso().setTarget( target );
	}

	public AxisBaseJSO getAxis()
	{
		return getJso().getAxis();
	}

	public void setAxis( AxisBaseJSO axis )
	{
		getJso().setAxis( axis );
	}
}