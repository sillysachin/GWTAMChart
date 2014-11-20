package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmCharts;

public final class AmCharts implements IsAmCharts
{
	private boolean baseHref;

	private List<String> dayNames;

	private List<String> monthNames;

	private double processDelay;

	private List<String> shortDayNames;

	private List<String> shortMonthNames;

	private String theme;

	private boolean useUTC;

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public boolean isBaseHref()
	{
		return baseHref;
	}

	/**
	 * Set it to true if you have base href set for your page. This will fix rendering problems in Firefox caused by base href.
	 */
	public void setBaseHref( boolean baseHref )
	{
		this.baseHref = baseHref;
	}

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getDayNames()
	{
		return dayNames;
	}

	/**
	 * "Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setDayNames( List<String> dayNames )
	{
		this.dayNames = dayNames;
	}

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getMonthNames()
	{
		return monthNames;
	}

	/**
	 * "Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setMonthNames( List<String> monthNames )
	{
		this.monthNames = monthNames;
	}

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public double getProcessDelay()
	{
		return processDelay;
	}

	/**
	 * Delay in ms at which each chart on the page should be rendered. This is very handy if you have a lot of charts on the page and do not want to overload the device CPU.
	 */
	public void setProcessDelay( double processDelay )
	{
		this.processDelay = processDelay;
	}

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getShortDayNames()
	{
		return shortDayNames;
	}

	/**
	 * "Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setShortDayNames( List<String> shortDayNames )
	{
		this.shortDayNames = shortDayNames;
	}

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public List<String> getShortMonthNames()
	{
		return shortMonthNames;
	}

	/**
	 * "Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)"
	 */
	public void setShortMonthNames( List<String> shortMonthNames )
	{
		this.shortMonthNames = shortMonthNames;
	}

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public String getTheme()
	{
		return theme;
	}

	/**
	 * "You can set theme for all the charts on your page by setting: AmCharts.theme =AmCharts.themes.light; // or some other theme. If you are creating charts using JavaScript API, not JSON, then this is quite a comfortable way, as you won't need to pass theme to each object you create. Note, you should set theme before write method is called. There is no way to change theme of already created chart, you have to create chart's instance once more if you want to change theme."
	 */
	public void setTheme( String theme )
	{
		this.theme = theme;
	}

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public boolean isUseUTC()
	{
		return useUTC;
	}

	/**
	 * Set it to true if you want UTC time to be used instead of local time.
	 */
	public void setUseUTC( boolean useUTC )
	{
		this.useUTC = useUTC;
	}
}