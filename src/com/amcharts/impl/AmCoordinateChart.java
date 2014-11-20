package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmCoordinateChart;
import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;
import com.amcharts.jso.AmCoordinateChartJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class AmCoordinateChart extends AmChart implements IJavaScriptWrapper, IsAmCoordinateChart
{
	protected AmCoordinateChart()
	{
	}

	public AmCoordinateChartJSO getJso()
	{
		return ( AmCoordinateChartJSO ) this.jso;
	}

	public void setJso( AmCoordinateChartJSO jso )
	{
		this.jso = jso;
	}

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public final List<Object> getChartData()
	{
		return getJso().getChartData();
	}

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public final void setChartData( List<Object> chartData )
	{
		getJso().setChartData( chartData );
	}

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public final List<String> getColors()
	{
		return getJso().getColors();
	}

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public final void setColors( List<String> colors )
	{
		getJso().setColors( colors );
	}

	/**
	 * The array of graphs belonging to this chart.
	 */
	public final List<IsAmGraph> getGraphs()
	{
		return getJso().getGraphs();
	}

	/**
	 * The array of graphs belonging to this chart.
	 */
	public final void setGraphs( List<IsAmGraph> graphs )
	{
		getJso().setGraphs( graphs );
	}

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public final boolean isGridAboveGraphs()
	{
		return getJso().isGridAboveGraphs();
	}

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public final void setGridAboveGraphs( boolean gridAboveGraphs )
	{
		getJso().setGridAboveGraphs( gridAboveGraphs );
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final List<IsGuide> getGuides()
	{
		return getJso().getGuides();
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final void setGuides( List<IsGuide> guides )
	{
		getJso().setGuides( guides );
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final boolean isSequencedAnimation()
	{
		return getJso().isSequencedAnimation();
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final void setSequencedAnimation( boolean sequencedAnimation )
	{
		getJso().setSequencedAnimation( sequencedAnimation );
	}

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public final double getStartAlpha()
	{
		return getJso().getStartAlpha();
	}

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public final void setStartAlpha( double startAlpha )
	{
		getJso().setStartAlpha( startAlpha );
	}

	/**
	 * "Duration of the animation, in seconds."
	 */
	public final double getStartDuration()
	{
		return getJso().getStartDuration();
	}

	/**
	 * "Duration of the animation, in seconds."
	 */
	public final void setStartDuration( double startDuration )
	{
		getJso().setStartDuration( startDuration );
	}

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public final String getStartEffect()
	{
		return getJso().getStartEffect();
	}

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public final void setStartEffect( String startEffect )
	{
		getJso().setStartEffect( startEffect );
	}

	/**
	 * Target of url.
	 */
	public final String getUrlTarget()
	{
		return getJso().getUrlTarget();
	}

	/**
	 * Target of url.
	 */
	public final void setUrlTarget( String urlTarget )
	{
		getJso().setUrlTarget( urlTarget );
	}

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public final List<IsValueAxis> getValueAxes()
	{
		return getJso().getValueAxes();
	}

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public final void setValueAxes( List<IsValueAxis> valueAxes )
	{
		getJso().setValueAxes( valueAxes );
	}
}