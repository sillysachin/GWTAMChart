package com.amcharts.jso;

import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsChartScrollbar;
import com.google.gwt.core.client.JavaScriptObject;

public final class ChartScrollbarJSO extends JavaScriptObject implements IsChartScrollbar
{
	protected ChartScrollbarJSO()
	{
	}

	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public final native boolean isAutoGridCount() /*-{
		return autoGridCount;
	}-*/;

	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public final native void setAutoGridCount( boolean autoGridCount ) /*-{
		this.autoGridCount = autoGridCount;
	}-*/;

	/**
	 * Background opacity.
	 */
	public final native double getBackgroundAlpha() /*-{
		return backgroundAlpha;
	}-*/;

	/**
	 * Background opacity.
	 */
	public final native void setBackgroundAlpha( double backgroundAlpha ) /*-{
		this.backgroundAlpha = backgroundAlpha;
	}-*/;

	/**
	 * Background color of the scrollbar.
	 */
	public final native String getBackgroundColor() /*-{
		return backgroundColor;
	}-*/;

	/**
	 * Background color of the scrollbar.
	 */
	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public final native IsCategoryAxis getCategoryAxis() /*-{
		return categoryAxis;
	}-*/;

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public final native void setCategoryAxis( IsCategoryAxis categoryAxis ) /*-{
		this.categoryAxis = categoryAxis;
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public final native double getDragIconHeight() /*-{
		return dragIconHeight;
	}-*/;

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public final native void setDragIconHeight( double dragIconHeight ) /*-{
		this.dragIconHeight = dragIconHeight;
	}-*/;

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public final native double getDragIconWidth() /*-{
		return dragIconWidth;
	}-*/;

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public final native void setDragIconWidth( double dragIconWidth ) /*-{
		this.dragIconWidth = dragIconWidth;
	}-*/;

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public final native IsAmGraph getGraph() /*-{
		return graph;
	}-*/;

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public final native void setGraph( IsAmGraph graph ) /*-{
		this.graph = graph;
	}-*/;

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public final native double getGraphFillAlpha() /*-{
		return graphFillAlpha;
	}-*/;

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public final native void setGraphFillAlpha( double graphFillAlpha ) /*-{
		this.graphFillAlpha = graphFillAlpha;
	}-*/;

	/**
	 * Graph fill color.
	 */
	public final native String getGraphFillColor() /*-{
		return graphFillColor;
	}-*/;

	/**
	 * Graph fill color.
	 */
	public final native void setGraphFillColor( String graphFillColor ) /*-{
		this.graphFillColor = graphFillColor;
	}-*/;

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public final native double getGraphLineAlpha() /*-{
		return graphLineAlpha;
	}-*/;

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public final native void setGraphLineAlpha( double graphLineAlpha ) /*-{
		this.graphLineAlpha = graphLineAlpha;
	}-*/;

	/**
	 * Graph line color.
	 */
	public final native String getGraphLineColor() /*-{
		return graphLineColor;
	}-*/;

	/**
	 * Graph line color.
	 */
	public final native void setGraphLineColor( String graphLineColor ) /*-{
		this.graphLineColor = graphLineColor;
	}-*/;

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public final native String getGraphType() /*-{
		return graphType;
	}-*/;

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public final native void setGraphType( String graphType ) /*-{
		this.graphType = graphType;
	}-*/;

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public final native double getGridAlpha() /*-{
		return gridAlpha;
	}-*/;

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public final native void setGridAlpha( double gridAlpha ) /*-{
		this.gridAlpha = gridAlpha;
	}-*/;

	/**
	 * Grid color.
	 */
	public final native String getGridColor() /*-{
		return gridColor;
	}-*/;

	/**
	 * Grid color.
	 */
	public final native void setGridColor( String gridColor ) /*-{
		this.gridColor = gridColor;
	}-*/;

	/**
	 * The number of grid lines.
	 */
	public final native double getGridCount() /*-{
		return gridCount;
	}-*/;

	/**
	 * The number of grid lines.
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.gridCount = gridCount;
	}-*/;

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public final native boolean isHideResizeGrips() /*-{
		return hideResizeGrips;
	}-*/;

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public final native void setHideResizeGrips( boolean hideResizeGrips ) /*-{
		this.hideResizeGrips = hideResizeGrips;
	}-*/;

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public final native double getMaximum() /*-{
		return maximum;
	}-*/;

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public final native void setMaximum( double maximum ) /*-{
		this.maximum = maximum;
	}-*/;

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public final native double getMinimum() /*-{
		return minimum;
	}-*/;

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public final native void setMinimum( double minimum ) /*-{
		this.minimum = minimum;
	}-*/;

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public final native double getOffset() /*-{
		return offset;
	}-*/;

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public final native void setOffset( double offset ) /*-{
		this.offset = offset;
	}-*/;

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public final native boolean isResizeEnabled() /*-{
		return resizeEnabled;
	}-*/;

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public final native void setResizeEnabled( boolean resizeEnabled ) /*-{
		this.resizeEnabled = resizeEnabled;
	}-*/;

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public final native double getScrollbarHeight() /*-{
		return scrollbarHeight;
	}-*/;

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public final native void setScrollbarHeight( double scrollbarHeight ) /*-{
		this.scrollbarHeight = scrollbarHeight;
	}-*/;

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public final native double getScrollDuration() /*-{
		return scrollDuration;
	}-*/;

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public final native void setScrollDuration( double scrollDuration ) /*-{
		this.scrollDuration = scrollDuration;
	}-*/;

	/**
	 * Selected backround opacity.
	 */
	public final native double getSelectedBackgroundAlpha() /*-{
		return selectedBackgroundAlpha;
	}-*/;

	/**
	 * Selected backround opacity.
	 */
	public final native void setSelectedBackgroundAlpha( double selectedBackgroundAlpha ) /*-{
		this.selectedBackgroundAlpha = selectedBackgroundAlpha;
	}-*/;

	/**
	 * Selected background color.
	 */
	public final native String getSelectedBackgroundColor() /*-{
		return selectedBackgroundColor;
	}-*/;

	/**
	 * Selected background color.
	 */
	public final native void setSelectedBackgroundColor( String selectedBackgroundColor ) /*-{
		this.selectedBackgroundColor = selectedBackgroundColor;
	}-*/;

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public final native double getSelectedGraphFillAlpha() /*-{
		return selectedGraphFillAlpha;
	}-*/;

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public final native void setSelectedGraphFillAlpha( double selectedGraphFillAlpha ) /*-{
		this.selectedGraphFillAlpha = selectedGraphFillAlpha;
	}-*/;

	/**
	 * Selected graph's fill color.
	 */
	public final native String getSelectedGraphFillColor() /*-{
		return selectedGraphFillColor;
	}-*/;

	/**
	 * Selected graph's fill color.
	 */
	public final native void setSelectedGraphFillColor( String selectedGraphFillColor ) /*-{
		this.selectedGraphFillColor = selectedGraphFillColor;
	}-*/;

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public final native double getSelectedGraphLineAlpha() /*-{
		return selectedGraphLineAlpha;
	}-*/;

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public final native void setSelectedGraphLineAlpha( double selectedGraphLineAlpha ) /*-{
		this.selectedGraphLineAlpha = selectedGraphLineAlpha;
	}-*/;

	/**
	 * Selected graph's line color.
	 */
	public final native String getSelectedGraphLineColor() /*-{
		return selectedGraphLineColor;
	}-*/;

	/**
	 * Selected graph's line color.
	 */
	public final native void setSelectedGraphLineColor( String selectedGraphLineColor ) /*-{
		this.selectedGraphLineColor = selectedGraphLineColor;
	}-*/;

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public final native boolean isUpdateOnReleaseOnly() /*-{
		return updateOnReleaseOnly;
	}-*/;

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public final native void setUpdateOnReleaseOnly( boolean updateOnReleaseOnly ) /*-{
		this.updateOnReleaseOnly = updateOnReleaseOnly;
	}-*/;
}
