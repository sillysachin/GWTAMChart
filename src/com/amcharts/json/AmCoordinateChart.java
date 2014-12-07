package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmCoordinateChart;
import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsCoordinateDataItem;
import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;

public class AmCoordinateChart extends AmChart implements IsAmCoordinateChart
{
	private List<IsCoordinateDataItem> chartData;

	private List<String> colors;

	private List<IsAmGraph> graphs;

	private Boolean gridAboveGraphs;

	private List<IsGuide> guides;

	private Boolean sequencedAnimation;

	private double startAlpha;

	private double startDuration;

	private String startEffect;

	private String urlTarget;

	private List<IsValueAxis> valueAxes;

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public List<IsCoordinateDataItem> getChartData()
	{
		return chartData;
	}

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public List<String> getColors()
	{
		return colors;
	}

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public void setColors( List<String> colors )
	{
		this.colors = colors;
	}

	/**
	 * The array of graphs belonging to this chart.
	 */
	public List<IsAmGraph> getGraphs()
	{
		return graphs;
	}

	/**
	 * The array of graphs belonging to this chart.
	 */
	public void setGraphs( List<IsAmGraph> graphs )
	{
		this.graphs = graphs;
	}

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public Boolean isGridAboveGraphs()
	{
		return gridAboveGraphs;
	}

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public void setGridAboveGraphs( Boolean gridAboveGraphs )
	{
		this.gridAboveGraphs = gridAboveGraphs;
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public List<IsGuide> getGuides()
	{
		return guides;
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public void setGuides( List<IsGuide> guides )
	{
		this.guides = guides;
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public Boolean isSequencedAnimation()
	{
		return sequencedAnimation;
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public void setSequencedAnimation( Boolean sequencedAnimation )
	{
		this.sequencedAnimation = sequencedAnimation;
	}

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public double getStartAlpha()
	{
		return startAlpha;
	}

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public void setStartAlpha( double startAlpha )
	{
		this.startAlpha = startAlpha;
	}

	/**
	 * "Duration of the animation, in seconds."
	 */
	public double getStartDuration()
	{
		return startDuration;
	}

	/**
	 * "Duration of the animation, in seconds."
	 */
	public void setStartDuration( double startDuration )
	{
		this.startDuration = startDuration;
	}

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public String getStartEffect()
	{
		return startEffect;
	}

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public void setStartEffect( String startEffect )
	{
		this.startEffect = startEffect;
	}

	/**
	 * Target of url.
	 */
	public String getUrlTarget()
	{
		return urlTarget;
	}

	/**
	 * Target of url.
	 */
	public void setUrlTarget( String urlTarget )
	{
		this.urlTarget = urlTarget;
	}

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public List<IsValueAxis> getValueAxes()
	{
		return valueAxes;
	}

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public void setValueAxes( List<IsValueAxis> valueAxes )
	{
		this.valueAxes = valueAxes;
	}
}
