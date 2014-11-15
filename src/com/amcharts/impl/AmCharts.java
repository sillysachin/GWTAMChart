package com.amcharts.impl;

import com.google.web.bindery.event.shared.SimpleEventBus;

public class AmCharts
{
	static final SimpleEventBus EVENT_BUS = new SimpleEventBus();

	public AmCharts()
	{
	}

	public static AmSerialChart AmSerialChart()
	{
		AmSerialChart amSerialChart = new AmSerialChart();
		return amSerialChart;
	}

	public static AmXYChart AmXYChart()
	{
		AmXYChart amXYChart = new AmXYChart();
		return amXYChart;
	}

	public static AmFunnelChart AmFunnelChart()
	{
		AmFunnelChart amFunnelChart = new AmFunnelChart();
		return amFunnelChart;
	}

	public static AmAngularGauge AmAngularGauge()
	{
		AmAngularGauge amAngularGauge = new AmAngularGauge();
		return amAngularGauge;
	}

	public static AmPieChart AmPieChart()
	{
		AmPieChart amPieChart = new AmPieChart();
		return amPieChart;
	}

	public static AmGraph AmGraph()
	{
		AmGraph amGraph = new AmGraph();
		return amGraph;
	}

	public static ValueAxis ValueAxis()
	{
		ValueAxis valueAxis = new ValueAxis();
		return valueAxis;
	}

	public static CategoryAxis CategoryAxis()
	{
		CategoryAxis categoryAxis = new CategoryAxis();
		return categoryAxis;
	}

	public static ChartCursor ChartCursor()
	{
		ChartCursor chartCursor = new ChartCursor();
		return chartCursor;
	}

	public static ChartScrollbar ChartScrollbar()
	{
		ChartScrollbar chartScrollbar = new ChartScrollbar();
		return chartScrollbar;
	}

	public static Guide Guide()
	{
		Guide guide = new Guide();
		return guide;
	}

	public static TrendLine TrendLine()
	{
		TrendLine trendLine = new TrendLine();
		return trendLine;
	}

	public static AmBalloon AmBalloon()
	{
		AmBalloon amBalloon = new AmBalloon();
		return amBalloon;
	}
}