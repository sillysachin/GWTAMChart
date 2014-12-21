package com.amcharts.impl.wrapper;

import com.amcharts.impl.AmChart;
import com.google.gwt.user.client.ui.Widget;

public class AbstractChartWrapper implements IsChartWrapper
{
	private Widget amChartWidget;

	private AmChart amChart;

	private IsReadyCallback callback;

	@Override
	public Widget getChartWidget()
	{
		if ( amChartWidget == null && amChart != null )
		{
			amChartWidget = amChart.asWidget();
		}
		return amChartWidget;
	}

	@Override
	public void setChartWidget( Widget chartWidget )
	{
		amChartWidget = chartWidget;
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

	public void setSize( String width, String height )
	{
	}
}