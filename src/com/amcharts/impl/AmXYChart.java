package com.amcharts.impl;

import com.amcharts.api.IsAmXYChart;
import com.amcharts.jso.AmXYChartJSO;

public final class AmXYChart extends AmRectangularChart implements IsAmXYChart
{
	public AmXYChart()
	{
	}

	public AmXYChart( String id )
	{
		super( id );
	}

	@Override
	protected void init( String id )
	{
		super.init( id );
		jso = createJso();
		//TODO: ENUM for type of chart.
		setType( "xy" );
	}

	private native AmXYChartJSO createJso() /*-{
		var chart = new $wnd.AmCharts.AmXYChart();
		return chart;
	}-*/;

	public AmXYChartJSO getJso()
	{
		return ( AmXYChartJSO ) this.jso;
	}

	public void setJso( AmXYChartJSO jso )
	{
		this.jso = jso;
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final Boolean isHideXScrollbar()
	{
		return getJso().isHideXScrollbar();
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final void setHideXScrollbar( Boolean hideXScrollbar )
	{
		getJso().setHideXScrollbar( hideXScrollbar );
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final Boolean isHideYScrollbar()
	{
		return getJso().isHideYScrollbar();
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final void setHideYScrollbar( Boolean hideYScrollbar )
	{
		getJso().setHideYScrollbar( hideYScrollbar );
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final double getMaxZoomFactor()
	{
		return getJso().getMaxZoomFactor();
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final void setMaxZoomFactor( double maxZoomFactor )
	{
		getJso().setMaxZoomFactor( maxZoomFactor );
	}

	/**
	 * 	Zooms out, charts shows all available data.
	 */
	public native void zoomOut()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.zoomOut();
	}-*/;
}
