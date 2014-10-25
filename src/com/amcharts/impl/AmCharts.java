package com.amcharts.impl;


public class AmCharts {

	public AmCharts() {
	}

	public static AmSerialChart AmSerialChart() {
		AmSerialChart amSerialChart = new AmSerialChart();
		return amSerialChart;
	}
	
	public static AmGraph AmGraph(){
		AmGraph amGraph = new AmGraph();
		return amGraph;
	}

	public static AmPieChart AmPieChart() {
		AmPieChart amPieChart = new AmPieChart();
		return amPieChart;
	}
}