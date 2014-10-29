package com.amcharts.impl;

public class AmCharts
{

	public AmCharts()
	{
	}

	public static AmSerialChart AmSerialChart()
	{
		AmSerialChart amSerialChart = new AmSerialChart();
		return amSerialChart;
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

	public static ChartCursor ChartCursor()
	{
		ChartCursor chartCursor = new ChartCursor();
		return chartCursor;
	}

	public static AmPieChart AmPieChart()
	{
		AmPieChart amPieChart = new AmPieChart();
		return amPieChart;
	}

	public static TrendLine TrendLine()
	{
		TrendLine trendLine = new TrendLine();
		return trendLine;
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
}