package com.amcharts.impl.listener;

import com.google.gwt.event.shared.EventHandler;

public interface AmChartHandler extends EventHandler
{
	void onEvent( AmChartEvent event );
}