package com.appbootup.explore.gwt.client;

import com.google.gwt.user.client.ui.Widget;

public class AbstractChartWrapper implements IsChartWrapper
{
	private Widget content;

	private IsReadyCallback callback;

	@Override
	public Widget getChartWidget()
	{
		return content;
	}

	@Override
	public void setChartWidget( Widget isWidget )
	{
		content = isWidget;
	}

	@Override
	public void setReadyCallback( IsReadyCallback callback )
	{
		this.callback = callback;
	}

	@Override
	public IsReadyCallback getReadyCallback()
	{
		return this.callback;
	}
}