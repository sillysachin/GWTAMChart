package com.amcharts.impl.wrapper;

import com.amcharts.impl.AmChart;
import com.google.gwt.user.client.ui.Widget;

public class AbstractChartWrapper implements IsChartWrapper
{
	private Widget amChartWrapper;

	protected AmChart amChart;

	private IsReadyCallback callback;

	@Override
	public Widget getChartWidget()
	{
		amChartWrapper = amChart.asWidget();
		return amChartWrapper;
	}

	@Override
	public void setChartWidget( Widget isWidget )
	{
		amChartWrapper = isWidget;
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

	public AmChart getAmChart()
	{
		return amChart;
	}

	public void setAmChart( AmChart amChart )
	{
		this.amChart = amChart;
	}
}