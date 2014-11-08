package com.amcharts.impl.event.columnchart.valueaxis;

import com.amcharts.impl.event.AmChartEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Dispatched when valueAxis is logarithmic and values equal or less then zero were found in data.
 */
public class LogarithmicAxisFailedEvent extends AmChartEvent<LogarithmicAxisFailedHandler>
{
	public static final String NAME = "rollOverItem";

	private static final Type<LogarithmicAxisFailedHandler> TYPE = new Type<LogarithmicAxisFailedHandler>();

	public static Type<LogarithmicAxisFailedHandler> getType()
	{
		return TYPE;
	}

	public LogarithmicAxisFailedEvent()
	{
	}

	@Override
	public final Type<LogarithmicAxisFailedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( LogarithmicAxisFailedHandler handler )
	{
		handler.onLogarithmicAxisFailed( this );
	}

	public static String getName()
	{
		return NAME;
	}

	/**
	 * Register a handler for LogarithmicAxisFailedEvent events on the eventbus.
	 * 
	 * @param eventBus the {@link EventBus}
	 * @param handler an {@link LogarithmicAxisFailedHandler} instance
	 * @return an {@link HandlerRegistration} instance
	 */
	public static HandlerRegistration addHandler( EventBus eventBus, LogarithmicAxisFailedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}