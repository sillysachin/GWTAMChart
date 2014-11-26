package com.amcharts.api;

import java.util.List;

public interface IsAmCoordinateChart extends IsAmChart
{
	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public List<Object> getChartData();

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public void setChartData( List<Object> chartData );

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public List<String> getColors();

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public void setColors( List<String> colors );

	/**
	 * The array of graphs belonging to this chart.
	 */
	public List<IsAmGraph> getGraphs();

	/**
	 * The array of graphs belonging to this chart.
	 */
	public void setGraphs( List<IsAmGraph> graphs );

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public Boolean isGridAboveGraphs();

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public void setGridAboveGraphs( Boolean gridAboveGraphs );

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public List<IsGuide> getGuides();

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public void setGuides( List<IsGuide> guides );

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public Boolean isSequencedAnimation();

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public void setSequencedAnimation( Boolean sequencedAnimation );

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public double getStartAlpha();

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public void setStartAlpha( double startAlpha );

	/**
	 * "Duration of the animation, in seconds."
	 */
	public double getStartDuration();

	/**
	 * "Duration of the animation, in seconds."
	 */
	public void setStartDuration( double startDuration );

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public String getStartEffect();

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public void setStartEffect( String startEffect );

	/**
	 * Target of url.
	 */
	public String getUrlTarget();

	/**
	 * Target of url.
	 */
	public void setUrlTarget( String urlTarget );

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public List<IsValueAxis> getValueAxes();

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public void setValueAxes( List<IsValueAxis> valueAxes );
}
