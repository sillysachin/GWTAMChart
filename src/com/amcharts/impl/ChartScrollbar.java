package com.amcharts.impl;

import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.jso.ChartScrollbarJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class ChartScrollbar implements IJavaScriptWrapper<ChartScrollbarJSO>, IsChartScrollbar
{
	private ChartScrollbarJSO jso;

	public ChartScrollbar()
	{
		jso = createJso();
	}

	public ChartScrollbarJSO getJso()
	{
		return this.jso;
	}

	public void setJso( ChartScrollbarJSO jso )
	{
		this.jso = jso;
	}

	public native ChartScrollbarJSO createJso()
	/*-{
		var chartScrollbar = new $wnd.AmCharts.ChartScrollbar();
		return chartScrollbar;
	}-*/;

	/**
	 * Specifies whether number of gridCount is specified automatically, according to the axis size.
	 */
	public final native boolean isAutoGridCount() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.autoGridCount;
	}-*/;

	/**
	 * Specifies whether number of gridCount is specified automatically, according to the axis size.
	 */
	public final native void setAutoGridCount( boolean autoGridCount ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.autoGridCount = autoGridCount;
	}-*/;

	/**
	 * Background opacity.
	 */
	public final native double getBackgroundAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.backgroundAlpha;
	}-*/;

	/**
	 * Background opacity.
	 */
	public final native void setBackgroundAlpha( double backgroundAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.backgroundAlpha = backgroundAlpha;
	}-*/;

	/**
	 * Background color of the scrollbar.
	 */
	public final native String getBackgroundColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.backgroundColor;
	}-*/;

	/**
	 * Background color of the scrollbar.
	 */
	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public final native IsCategoryAxis getCategoryAxis() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.categoryAxis;
	}-*/;

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public final native void setCategoryAxis( IsCategoryAxis categoryAxis ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.categoryAxis = categoryAxis;
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.color = color;
	}-*/;

	/**
	 * Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing.
	 */
	public final native double getDragIconHeight() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.dragIconHeight;
	}-*/;

	/**
	 * Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing.
	 */
	public final native void setDragIconHeight( double dragIconHeight ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.dragIconHeight = dragIconHeight;
	}-*/;

	/**
	 * Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing.
	 */
	public final native double getDragIconWidth() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.dragIconWidth;
	}-*/;

	/**
	 * Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing.
	 */
	public final native void setDragIconWidth( double dragIconWidth ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.dragIconWidth = dragIconWidth;
	}-*/;

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public final native String getGraph() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graph;
	}-*/;

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public final native void setGraph( String graph ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graph = graph;
	}-*/;

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public final native double getGraphFillAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graphFillAlpha;
	}-*/;

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public final native void setGraphFillAlpha( double graphFillAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graphFillAlpha = graphFillAlpha;
	}-*/;

	/**
	 * Graph fill color.
	 */
	public final native String getGraphFillColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graphFillColor;
	}-*/;

	/**
	 * Graph fill color.
	 */
	public final native void setGraphFillColor( String graphFillColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graphFillColor = graphFillColor;
	}-*/;

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public final native double getGraphLineAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graphLineAlpha;
	}-*/;

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public final native void setGraphLineAlpha( double graphLineAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graphLineAlpha = graphLineAlpha;
	}-*/;

	/**
	 * Graph line color.
	 */
	public final native String getGraphLineColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graphLineColor;
	}-*/;

	/**
	 * Graph line color.
	 */
	public final native void setGraphLineColor( String graphLineColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graphLineColor = graphLineColor;
	}-*/;

	/**
	 * by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc
	 */
	public final native String getGraphType() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.graphType;
	}-*/;

	/**
	 * by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc
	 */
	public final native void setGraphType( String graphType ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.graphType = graphType;
	}-*/;

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public final native double getGridAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.gridAlpha;
	}-*/;

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public final native void setGridAlpha( double gridAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.gridAlpha = gridAlpha;
	}-*/;

	/**
	 * Grid color.
	 */
	public final native String getGridColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.gridColor;
	}-*/;

	/**
	 * Grid color.
	 */
	public final native void setGridColor( String gridColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.gridColor = gridColor;
	}-*/;

	/**
	 * The number of grid lines.
	 */
	public final native double getGridCount() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.gridCount;
	}-*/;

	/**
	 * The number of grid lines.
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.gridCount = gridCount;
	}-*/;

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public final native boolean isHideResizeGrips() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.hideResizeGrips;
	}-*/;

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public final native void setHideResizeGrips( boolean hideResizeGrips ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.hideResizeGrips = hideResizeGrips;
	}-*/;

	/**
	 * Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
	 */
	public final native double getMaximum() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.maximum;
	}-*/;

	/**
	 * Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
	 */
	public final native void setMaximum( double maximum ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.maximum = maximum;
	}-*/;

	/**
	 * Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
	 */
	public final native double getMinimum() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.minimum;
	}-*/;

	/**
	 * Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
	 */
	public final native void setMinimum( double minimum ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.minimum = minimum;
	}-*/;

	/**
	 * Distance from plot area to scrollbar, in pixels.
	 */
	public final native double getOffset() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.offset;
	}-*/;

	/**
	 * Distance from plot area to scrollbar, in pixels.
	 */
	public final native void setOffset( double offset ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.offset = offset;
	}-*/;

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public final native boolean isResizeEnabled() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.resizeEnabled;
	}-*/;

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public final native void setResizeEnabled( boolean resizeEnabled ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.resizeEnabled = resizeEnabled;
	}-*/;

	/**
	 * Height (width, if chart is rotated) of a scrollbar.
	 */
	public final native double getScrollbarHeight() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.scrollbarHeight;
	}-*/;

	/**
	 * Height (width, if chart is rotated) of a scrollbar.
	 */
	public final native void setScrollbarHeight( double scrollbarHeight ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.scrollbarHeight = scrollbarHeight;
	}-*/;

	/**
	 * Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen.
	 */
	public final native double getScrollDuration() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.scrollDuration;
	}-*/;

	/**
	 * Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen.
	 */
	public final native void setScrollDuration( double scrollDuration ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.scrollDuration = scrollDuration;
	}-*/;

	/**
	 * Selected backround opacity.
	 */
	public final native double getSelectedBackgroundAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedBackgroundAlpha;
	}-*/;

	/**
	 * Selected backround opacity.
	 */
	public final native void setSelectedBackgroundAlpha( double selectedBackgroundAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedBackgroundAlpha = selectedBackgroundAlpha;
	}-*/;

	/**
	 * Selected background color.
	 */
	public final native String getSelectedBackgroundColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedBackgroundColor;
	}-*/;

	/**
	 * Selected background color.
	 */
	public final native void setSelectedBackgroundColor( String selectedBackgroundColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedBackgroundColor = selectedBackgroundColor;
	}-*/;

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public final native double getSelectedGraphFillAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphFillAlpha;
	}-*/;

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public final native void setSelectedGraphFillAlpha( double selectedGraphFillAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphFillAlpha = selectedGraphFillAlpha;
	}-*/;

	/**
	 * Selected graph's fill color.
	 */
	public final native String getSelectedGraphFillColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphFillColor;
	}-*/;

	/**
	 * Selected graph's fill color.
	 */
	public final native void setSelectedGraphFillColor( String selectedGraphFillColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphFillColor = selectedGraphFillColor;
	}-*/;

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public final native double getSelectedGraphLineAlpha() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphLineAlpha;
	}-*/;

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public final native void setSelectedGraphLineAlpha( double selectedGraphLineAlpha ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphLineAlpha = selectedGraphLineAlpha;
	}-*/;

	/**
	 * Selected graph's line color.
	 */
	public final native String getSelectedGraphLineColor() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphLineColor;
	}-*/;

	/**
	 * Selected graph's line color.
	 */
	public final native void setSelectedGraphLineColor( String selectedGraphLineColor ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.selectedGraphLineColor = selectedGraphLineColor;
	}-*/;

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public final native boolean isUpdateOnReleaseOnly() /*-{
		return this.@com.amcharts.impl.ChartScrollbar::jso.updateOnReleaseOnly;
	}-*/;

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public final native void setUpdateOnReleaseOnly( boolean updateOnReleaseOnly ) /*-{
		this.@com.amcharts.impl.ChartScrollbar::jso.updateOnReleaseOnly = updateOnReleaseOnly;
	}-*/;
}
