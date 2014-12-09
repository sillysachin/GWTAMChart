package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmCoordinateChart;
import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsCoordinateDataItem;
import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;

public class AmCoordinateChartJSO extends AmChartJSO implements IsAmCoordinateChart
{
	protected AmCoordinateChartJSO()
	{
	}

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public final native List<IsCoordinateDataItem> getChartData() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.chartData);
	}-*/;

	/**
	 * "Read-only. Array, holding processed chart's data."
	 */
	public final native void setChartData( List<Object> chartData ) /*-{
		this.chartData = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(chartData);
	}-*/;

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public final native List<String> getColors() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.colors);
	}-*/;

	/**
	 * "Specifies the colors of the graphs if the lineColor of a graph is not set. It there are more graphs then colors in this array, the chart picks random color."
	 */
	public final native void setColors( List<String> colors ) /*-{
		this.colors = @com.amcharts.impl.util.WrapperUtils::getJSOArray(Ljava/util/List;)(colors);
	}-*/;

	/**
	 * The array of graphs belonging to this chart.
	 */
	public final native List<IsAmGraph> getGraphs() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.graphs);
	}-*/;

	/**
	 * The array of graphs belonging to this chart.
	 */
	public final native void setGraphs( List<IsAmGraph> graphs ) /*-{
		this.graphs = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(graphs);
	}-*/;

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public final native Boolean isGridAboveGraphs() /*-{
		return this.gridAboveGraphs;
	}-*/;

	/**
	 * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
	 */
	public final native void setGridAboveGraphs( Boolean gridAboveGraphs ) /*-{
		this.gridAboveGraphs = gridAboveGraphs;
	}-*/;

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final native List<IsGuide> getGuides() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.guides);
	}-*/;

	/**
	 * "Instead of adding guides to the axes, you can push all of them to this array. In case guide has category or date defined, it will automatically will be assigned to the category axis. Otherwise to first value axis, unless you specify a different valueAxis for the guide."
	 */
	public final native void setGuides( List<IsGuide> guides ) /*-{
		this.guides = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(guides);
	}-*/;

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final native Boolean isSequencedAnimation() /*-{
		return this.sequencedAnimation;
	}-*/;

	/**
	 * Specifies whether the animation should be sequenced or all objects should appear at once.
	 */
	public final native void setSequencedAnimation( Boolean sequencedAnimation ) /*-{
		this.sequencedAnimation = sequencedAnimation;
	}-*/;

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public final native double getStartAlpha() /*-{
		return this.startAlpha;
	}-*/;

	/**
	 * "The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1."
	 */
	public final native void setStartAlpha( double startAlpha ) /*-{
		this.startAlpha = startAlpha;
	}-*/;

	/**
	 * "Duration of the animation, in seconds."
	 */
	public final native double getStartDuration() /*-{
		return this.startDuration;
	}-*/;

	/**
	 * "Duration of the animation, in seconds."
	 */
	public final native void setStartDuration( double startDuration ) /*-{
		this.startDuration = startDuration;
	}-*/;

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public final native String getStartEffect() /*-{
		return this.startEffect;
	}-*/;

	/**
	 * "Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce"
	 */
	public final native void setStartEffect( String startEffect ) /*-{
		this.startEffect = startEffect;
	}-*/;

	/**
	 * Target of url.
	 */
	public final native String getUrlTarget() /*-{
		return this.urlTarget;
	}-*/;

	/**
	 * Target of url.
	 */
	public final native void setUrlTarget( String urlTarget ) /*-{
		this.urlTarget = urlTarget;
	}-*/;

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public final native List<IsValueAxis> getValueAxes() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.valueAxes);
	}-*/;

	/**
	 * "The array of value axes. Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it."
	 */
	public final native void setValueAxes( List<IsValueAxis> valueAxes ) /*-{
		this.valueAxes = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(valueAxes);
	}-*/;
}
