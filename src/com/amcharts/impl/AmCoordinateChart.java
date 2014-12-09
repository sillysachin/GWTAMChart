package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmCoordinateChart;
import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsCoordinateDataItem;
import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;
import com.amcharts.jso.AmCoordinateChartJSO;

public class AmCoordinateChart extends AmChart implements IsAmCoordinateChart
{
	private List<IsValueAxis> valueAxes;

	private List<IsGuide> guides;

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
	public final List<IsCoordinateDataItem> getChartData()
	{
		return getJso().getChartData();
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
	public final Boolean isGridAboveGraphs()
	{
		return getJso().isGridAboveGraphs();
	}

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public final void setGridAboveGraphs( Boolean gridAboveGraphs )
	{
		getJso().setGridAboveGraphs( gridAboveGraphs );
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final List<IsGuide> getGuides()
	{
		return this.guides;
	}

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final void setGuides( List<IsGuide> guides )
	{
		this.guides = guides;
		getJso().setGuides( guides );
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final Boolean isSequencedAnimation()
	{
		return getJso().isSequencedAnimation();
	}

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final void setSequencedAnimation( Boolean sequencedAnimation )
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
		return this.valueAxes;
	}

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public final void setValueAxes( List<IsValueAxis> valueAxes )
	{
		this.valueAxes = valueAxes;
		getJso().setValueAxes( valueAxes );
	}

	/**
	 * Adds a graph to the chart.
	 */
	public native void addGraph( AmGraph amGraph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amGraph);
		chart.addGraph(graph);
	}-*/;

	/**
	 * Adds value axis to the chart. One value axis is created automatically, so if you don't want to change anything or add more value axes, you don't need to add it.
	 */
	public native void addValueAxis( ValueAxis valueAxis )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var axis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(valueAxis);
		chart.addValueAxis(axis);
	}-*/;

	/**
	 * You can trigger the animation of the chart.
	 */
	public native void animateAgain()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.animateAgain();
	}-*/;

	/**
	 * Returns graph by id.
	 */
	public native AmGraph getGraphById( String id )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var graph = chart.getGraphById(id);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(graph);
		return amGraph;
	}-*/;

	/**
	 * Returns value axis by id.
	 */
	public native ValueAxis getValueAxisById( String id )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var axis = chart.getValueAxisById(id);
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(axis);
		return valueAxis;
	}-*/;

	/**
	 * Hide the graph (if it is visible). Usually this method is called from the Legend, when you click on the legend marker.
	 */
	public native void hideGraph( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.hideGraph(amGraph);
	}-*/;

	/**
	 * Hide value balloon of a graph. Usually this method is called from the Legend, when you click on the legend text.
	 */
	public native void hideGraphsBalloon( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.hideGraphsBalloon(amGraph);
	}-*/;

	/**
	 * Highlight the graph. Usually this method is called from the Legend, when you roll-over the legend entry.
	 */
	public native void highlightGraph( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.highlightGraph(amGraph);
	}-*/;

	/**
	 * Removes graph from the chart.
	 */
	public native void removeGraph( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.removeGraph(amGraph);
	}-*/;

	/**
	 * Removes value axis from the chart. When you remove value axis, all graphs assigned to this axis are also removed.
	 */
	public native void removeValueAxis( ValueAxis valueAxis )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var axis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(valueAxis);
		chart.removeValueAxis(axis);
	}-*/;

	/**
	 * Show the graph (if it is hidden). Usually this method is called from the Legend, when you click on the legend marker.
	 */
	public native void showGraph( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.showGraph(amGraph);
	}-*/;

	/**
	 * Show value balloon of a graph. Usually this method is called from the Legend, when you click on the legend text.
	 */
	public native void showGraphsBalloon( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.showGraphsBalloon(amGraph);
	}-*/;

	/**
	 * UnhighlightGraph the graph. Usually this method is called from the Legend, when you roll-out the legend entry.
	 */
	public native void unhighlightGraph( AmGraph graph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amGraph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(graph);
		chart.unhighlightGraph(amGraph);
	}-*/;
}