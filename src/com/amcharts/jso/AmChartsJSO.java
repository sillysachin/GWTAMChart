package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmCharts;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmChartsJSO extends JavaScriptObject implements IsAmCharts
{
	protected AmChartsJSO()
	{
	}

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public final native Boolean isBaseHref() /*-{
		return this.baseHref;
	}-*/;

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public final native void setBaseHref( Boolean baseHref ) /*-{
		this.baseHref = baseHref;
	}-*/;

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native List<String> getDayNames() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.dayNames);
	}-*/;

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native void setDayNames( List<String> dayNames ) /*-{
		this.dayNames = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(dayNames);
	}-*/;

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native List<String> getMonthNames() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.monthNames);
	}-*/;

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native void setMonthNames( List<String> monthNames ) /*-{
		this.monthNames = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(monthNames);
	}-*/;

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public final native double getProcessDelay() /*-{
		return this.processDelay;
	}-*/;

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public final native void setProcessDelay( double processDelay ) /*-{
		this.processDelay = processDelay;
	}-*/;

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native List<String> getShortDayNames() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.shortDayNames);
	}-*/;

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native void setShortDayNames( List<String> shortDayNames ) /*-{
		this.shortDayNames = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(shortDayNames);
	}-*/;

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native List<String> getShortMonthNames() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.shortMonthNames);
	}-*/;

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public final native void setShortMonthNames( List<String> shortMonthNames ) /*-{
		this.shortMonthNames = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(shortMonthNames);
	}-*/;

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public final native String getTheme() /*-{
		return this.theme;
	}-*/;

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public final native void setTheme( String theme ) /*-{
		this.theme = theme;
	}-*/;

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public final native Boolean isUseUTC() /*-{
		return this.useUTC;
	}-*/;

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public final native void setUseUTC( Boolean useUTC ) /*-{
		this.useUTC = useUTC;
	}-*/;
}
