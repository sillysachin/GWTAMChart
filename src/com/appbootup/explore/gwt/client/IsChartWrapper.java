package com.appbootup.explore.gwt.client;

import com.google.gwt.user.client.ui.Widget;

public interface IsChartWrapper
{
	Widget getChartWidget();

	void setChartWidget( Widget isWidget );

	void setReadyCallback( IsReadyCallback callback );

	IsReadyCallback getReadyCallback();
}