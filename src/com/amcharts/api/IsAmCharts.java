package com.amcharts.api;

import java.util.List;

public interface IsAmCharts
{
	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public Boolean isBaseHref();

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public void setBaseHref( Boolean baseHref );

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getDayNames();

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setDayNames( List<String> dayNames );

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getMonthNames();

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setMonthNames( List<String> monthNames );

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public double getProcessDelay();

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public void setProcessDelay( double processDelay );

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getShortDayNames();

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setShortDayNames( List<String> shortDayNames );

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getShortMonthNames();

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setShortMonthNames( List<String> shortMonthNames );

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public String getTheme();

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public void setTheme( String theme );

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public Boolean isUseUTC();

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public void setUseUTC( Boolean useUTC );
}
