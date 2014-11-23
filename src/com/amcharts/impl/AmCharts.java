package com.amcharts.impl;

import java.util.Date;
import java.util.List;

import com.amcharts.api.IsAmCharts;
import com.amcharts.jso.AmChartsJSO;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class AmCharts implements IsAmCharts
{
	static final SimpleEventBus EVENT_BUS = new SimpleEventBus();

	public static final AmChartTheme[] themes = AmChartTheme.values();

	private AmChartsJSO jso;

	protected AmCharts()
	{
		jso = createJso();
	}

	public AmChartsJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmChartsJSO jso )
	{
		this.jso = jso;
	}

	public native AmChartsJSO createJso() /*-{
		return $wnd.AmCharts;
	}-*/;

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public final native boolean isBaseHref() /*-{
		return this.@com.amcharts.impl.AmCharts::jso.baseHref;
	}-*/;

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public final native void setBaseHref( boolean baseHref ) /*-{
		this.@com.amcharts.impl.AmCharts::jso.baseHref = baseHref;
	}-*/;

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final List<String> getDayNames()
	{
		return getJso().getDayNames();
	}

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final void setDayNames( List<String> dayNames )
	{
		getJso().setDayNames( dayNames );
	}

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final List<String> getMonthNames()
	{
		return getJso().getMonthNames();
	}

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final void setMonthNames( List<String> monthNames )
	{
		getJso().setMonthNames( monthNames );
	}

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public final native double getProcessDelay() /*-{
		return this.@com.amcharts.impl.AmCharts::jso.processDelay;
	}-*/;

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public final native void setProcessDelay( double processDelay ) /*-{
		this.@com.amcharts.impl.AmCharts::jso.processDelay = processDelay;
	}-*/;

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final List<String> getShortDayNames()
	{
		return getJso().getShortDayNames();
	}

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final void setShortDayNames( List<String> shortDayNames )
	{
		getJso().setShortDayNames( shortDayNames );
	}

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final List<String> getShortMonthNames()
	{
		return getJso().getShortMonthNames();
	}

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final void setShortMonthNames( List<String> shortMonthNames )
	{
		getJso().setShortMonthNames( shortMonthNames );
	}

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public final native String getTheme() /*-{
		return this.@com.amcharts.impl.AmCharts::jso.theme;
	}-*/;

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme = AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public final native void setTheme( String theme ) /*-{
		this.@com.amcharts.impl.AmCharts::jso.theme = theme;
	}-*/;

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public final native boolean isUseUTC() /*-{
		return this.@com.amcharts.impl.AmCharts::jso.useUTC;
	}-*/;

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public final native void setUseUTC( boolean useUTC ) /*-{
		this.@com.amcharts.impl.AmCharts::jso.useUTC = useUTC;
	}-*/;

	/**
	 * handler is a method which will be called before initializing the chart. types is array of strings, 
	 * specifying which chart types should call this method. If you don't set any type, all the charts will call this method. 
	 * When handler method is called, chart instance is passed as an attribute. 
	 * You can use this feature to preprocess chart data or do some other things you need before initializing the chart.
	 */
	//TODO: InitHandler ?
	//	public native void addInitHandler( InitHandler initHandler, List<String> chartTypes )
	//	/*-{
	//		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
	//		var types = []
	//		AmCharts.addInitHandler(handler, types);
	//	}-*/;

	/**
	 * Clears all the charts on page, removes listeners and intervals.
	 */
	public native void clear()
	/*-{
		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		AmCharts.clear();
	}-*/;

	/**
	 * You can use this method to format date object into date string.
	 */
	public native void clear( Date date, String format )
	/*-{
		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		AmCharts.formatDate(date, format);
	}-*/;

	/**
	 * Returns string formatter with the provided settings. Formatter is an object with precision, decimalSeparator and thousandsSeparator defined.
	 * Example: {precision: 2, decimalSeparator: '.', thousandsSeparator: ','}; If you don't need to adjust precision set it to -1. 
	 * zeroCount defines how many zeros should be added after comma (useful when formatting currencies).
	 */
	//TODO: Class for formatter
	public native void formatNumber( double number, JavaScriptObject formatter, int zeroCount )
	/*-{
		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		AmCharts.formatNumber(number, formatter, zeroCount);
	}-*/;

	/**
	 * Creates chart. divId is id of a chart container, chartConfig is JSON object with chart properties defined and delay is time in ms, in which the chart should be rendered (renders instantly if not set).
	 */
	public native void makeChart( String divId, JavaScriptObject chartConfig, double delay )
	/*-{
		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		AmCharts.makeChart(divId, chartConfig, delay);
	}-*/;

	/**
	 * You can use this method to convert date string to date object. 
	 * Please note, that literal name codes such as MMM or MMMM are not supported.
	 */
	public native void makeChart( String string, String format )
	/*-{
		var AmCharts = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		AmCharts.stringToDate(string, format)
	}-*/;

	public static AmSerialChart AmSerialChart()
	{
		AmSerialChart amSerialChart = new AmSerialChart();
		return amSerialChart;
	}

	public static AmSerialChart AmSerialChart( AmChartTheme theme )
	{
		AmSerialChart amSerialChart = AmSerialChart();
		amSerialChart.setTheme( theme.name().toLowerCase() );
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

	public static AmRadarChart AmRadarChart()
	{
		AmRadarChart amRadarChart = new AmRadarChart();
		return amRadarChart;
	}

	public static GaugeAxis GaugeAxis()
	{
		GaugeAxis gaugeAxis = new GaugeAxis();
		return gaugeAxis;
	}

	public static GaugeArrow GaugeArrow()
	{
		GaugeArrow gaugeArrow = new GaugeArrow();
		return gaugeArrow;
	}

	public static GaugeBand GaugeBand()
	{
		GaugeBand gaugeBand = new GaugeBand();
		return gaugeBand;
	}

	public static AmExport AmExport()
	{
		AmExport amExport = new AmExport();
		return amExport;
	}

	public static ExportConfig ExportConfig()
	{
		ExportConfig exportConfig = new ExportConfig();
		return exportConfig;
	}

	public static MenuItemStyle MenuItemStyle()
	{
		MenuItemStyle menuItemStyle = new MenuItemStyle();
		return menuItemStyle;
	}

	public static MenuItemOutput MenuItemOutput()
	{
		MenuItemOutput menuItemOutput = new MenuItemOutput();
		return menuItemOutput;
	}

	public static Item Item()
	{
		Item item = new Item();
		return item;
	}

	public static AmLegend AmLegend()
	{
		AmLegend amLegend = new AmLegend();
		return amLegend;
	}
}