package com.amcharts.impl.event;

import com.google.gwt.event.dom.client.MouseEvent;
import com.google.gwt.event.shared.EventHandler;

public abstract class AmChartEvent<H extends EventHandler> extends MouseEvent<H>
{
	DataItem dataItem;
}