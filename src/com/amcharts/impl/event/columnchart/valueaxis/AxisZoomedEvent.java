package com.amcharts.impl.event.columnchart.valueaxis;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * XY chart only. Dispatched when axis is zoomed.
 */
public class AxisZoomedEvent extends AmChartEvent<AxisZoomedHandler>
{
	public static final String NAME = "axisZoomed";

	Object startValue;

	Object endValue;

	private static final Type<AxisZoomedHandler> TYPE = new Type<AxisZoomedHandler>();

	public static Type<AxisZoomedHandler> getType()
	{
		return TYPE;
	}

	public AxisZoomedEvent()
	{
	}

	@Override
	public final Type<AxisZoomedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( AxisZoomedHandler handler )
	{
		handler.onAxisZoomed( this );
	}

	public static String getName()
	{
		return NAME;
	}

	/**
	 * Register a handler for AxisZoomedEvent events on the eventbus.
	 * 
	 * @param eventBus the {@link EventBus}
	 * @param handler an {@link AxisZoomedHandler} instance
	 * @return an {@link HandlerRegistration} instance
	 */
	public static HandlerRegistration addHandler( EventBus eventBus, AxisZoomedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}

	public Object getStartValue()
	{
		if ( startValue == null )
		{
			startValue = extractStartValue();
		}
		return startValue;
	}

	public void setStartValue( Object startValue )
	{
		this.startValue = startValue;
	}

	public native Object extractStartValue()
	/*-{
		this.startValue.className = 'StartValue';
		return this.startValue;
	}-*/;

	public native Object extractStartValue( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.startValue.className = 'StartValue';
		return amChartEventJSO.startValue;
	}-*/;

	public Object getEndValue()
	{
		if ( endValue == null )
		{
			endValue = extractEndValue();
		}
		return endValue;
	}

	public void setEndValue( Object endValue )
	{
		this.endValue = endValue;
	}

	public native Object extractEndValue()
	/*-{
		this.endValue.className = 'EndValue';
		return this.endValue;
	}-*/;

	public native Object extractEndValue( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.endValue.className = 'EndValue';
		return amChartEventJSO.endValue;
	}-*/;
}