package com.amcharts.impl;

import com.amcharts.api.IsAmRadarChart;
import com.amcharts.jso.AmRadarChartJSO;

public final class AmRadarChart extends AmCoordinateChart implements IsAmRadarChart
{
	protected AmRadarChart()
	{
		jso = createJso();
		setType("radar");
	}

	public AmRadarChartJSO getJso()
	{
		return ( AmRadarChartJSO ) this.jso;
	}

	public void setJso( AmRadarChartJSO jso )
	{
		this.jso = jso;
	}

	private native AmRadarChartJSO createJso() /*-{
		var chart = new $wnd.AmCharts.AmRadarChart();
		return chart;
	}-*/;

	/**
	 * Field in your data provider containing categories.
	 */
	public final String getCategoryField()
	{
		return getJso().getCategoryField();
	}

	/**
	 * Field in your data provider containing categories.
	 */
	public final void setCategoryField( String categoryField )
	{
		getJso().setCategoryField( categoryField );
	}

	/**
	 * Bottom margin of the chart.
	 */
	public final double getMarginBottom()
	{
		return getJso().getMarginBottom();
	}

	/**
	 * Bottom margin of the chart.
	 */
	public final void setMarginBottom( double marginBottom )
	{
		getJso().setMarginBottom( marginBottom );
	}

	/**
	 * Left margin of the chart.
	 */
	public final double getMarginLeft()
	{
		return getJso().getMarginLeft();
	}

	/**
	 * Left margin of the chart.
	 */
	public final void setMarginLeft( double marginLeft )
	{
		getJso().setMarginLeft( marginLeft );
	}

	/**
	 * Right margin of the chart.
	 */
	public final double getMarginRight()
	{
		return getJso().getMarginRight();
	}

	/**
	 * Right margin of the chart.
	 */
	public final void setMarginRight( double marginRight )
	{
		getJso().setMarginRight( marginRight );
	}

	/**
	 * Top margin of the chart.
	 */
	public final double getMarginTop()
	{
		return getJso().getMarginTop();
	}

	/**
	 * Top margin of the chart.
	 */
	public final void setMarginTop( double marginTop )
	{
		getJso().setMarginTop( marginTop );
	}

	/**
	 * Radius of a radar.
	 */
	public final String getRadius()
	{
		return getJso().getRadius();
	}

	/**
	 * Radius of a radar.
	 */
	public final void setRadius( String radius )
	{
		getJso().setRadius( radius );
	}
}
