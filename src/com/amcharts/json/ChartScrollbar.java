package com.amcharts.json;

import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsChartScrollbar;

public final class ChartScrollbar implements IsChartScrollbar
{
	private Boolean autoGridCount;

	private double backgroundAlpha;

	private String backgroundColor;

	private IsCategoryAxis categoryAxis;

	private String color;

	private double dragIconHeight;

	private double dragIconWidth;

	private String graph;

	private double graphFillAlpha;

	private String graphFillColor;

	private double graphLineAlpha;

	private String graphLineColor;

	private String graphType;

	private double gridAlpha;

	private String gridColor;

	private double gridCount;

	private Boolean hideResizeGrips;

	private double maximum;

	private double minimum;

	private double offset;

	private Boolean resizeEnabled;

	private double scrollbarHeight;

	private double scrollDuration;

	private double selectedBackgroundAlpha;

	private String selectedBackgroundColor;

	private double selectedGraphFillAlpha;

	private String selectedGraphFillColor;

	private double selectedGraphLineAlpha;

	private String selectedGraphLineColor;

	private Boolean updateOnReleaseOnly;

	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public Boolean isAutoGridCount()
	{
		return autoGridCount;
	}

	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public void setAutoGridCount( Boolean autoGridCount )
	{
		this.autoGridCount = autoGridCount;
	}

	/**
	 * Background opacity.
	 */
	public double getBackgroundAlpha()
	{
		return backgroundAlpha;
	}

	/**
	 * Background opacity.
	 */
	public void setBackgroundAlpha( double backgroundAlpha )
	{
		this.backgroundAlpha = backgroundAlpha;
	}

	/**
	 * Background color of the scrollbar.
	 */
	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * Background color of the scrollbar.
	 */
	public void setBackgroundColor( String backgroundColor )
	{
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public IsCategoryAxis getCategoryAxis()
	{
		return categoryAxis;
	}

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public void setCategoryAxis( IsCategoryAxis categoryAxis )
	{
		this.categoryAxis = categoryAxis;
	}

	/**
	 * Text color.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Text color.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public double getDragIconHeight()
	{
		return dragIconHeight;
	}

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public void setDragIconHeight( double dragIconHeight )
	{
		this.dragIconHeight = dragIconHeight;
	}

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public double getDragIconWidth()
	{
		return dragIconWidth;
	}

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public void setDragIconWidth( double dragIconWidth )
	{
		this.dragIconWidth = dragIconWidth;
	}

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public String getGraph()
	{
		return graph;
	}

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public void setGraph( String graph )
	{
		this.graph = graph;
	}

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public double getGraphFillAlpha()
	{
		return graphFillAlpha;
	}

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public void setGraphFillAlpha( double graphFillAlpha )
	{
		this.graphFillAlpha = graphFillAlpha;
	}

	/**
	 * Graph fill color.
	 */
	public String getGraphFillColor()
	{
		return graphFillColor;
	}

	/**
	 * Graph fill color.
	 */
	public void setGraphFillColor( String graphFillColor )
	{
		this.graphFillColor = graphFillColor;
	}

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public double getGraphLineAlpha()
	{
		return graphLineAlpha;
	}

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public void setGraphLineAlpha( double graphLineAlpha )
	{
		this.graphLineAlpha = graphLineAlpha;
	}

	/**
	 * Graph line color.
	 */
	public String getGraphLineColor()
	{
		return graphLineColor;
	}

	/**
	 * Graph line color.
	 */
	public void setGraphLineColor( String graphLineColor )
	{
		this.graphLineColor = graphLineColor;
	}

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public String getGraphType()
	{
		return graphType;
	}

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public void setGraphType( String graphType )
	{
		this.graphType = graphType;
	}

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public double getGridAlpha()
	{
		return gridAlpha;
	}

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public void setGridAlpha( double gridAlpha )
	{
		this.gridAlpha = gridAlpha;
	}

	/**
	 * Grid color.
	 */
	public String getGridColor()
	{
		return gridColor;
	}

	/**
	 * Grid color.
	 */
	public void setGridColor( String gridColor )
	{
		this.gridColor = gridColor;
	}

	/**
	 * The number of grid lines.
	 */
	public double getGridCount()
	{
		return gridCount;
	}

	/**
	 * The number of grid lines.
	 */
	public void setGridCount( double gridCount )
	{
		this.gridCount = gridCount;
	}

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public Boolean isHideResizeGrips()
	{
		return hideResizeGrips;
	}

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public void setHideResizeGrips( Boolean hideResizeGrips )
	{
		this.hideResizeGrips = hideResizeGrips;
	}

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public double getMaximum()
	{
		return maximum;
	}

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public void setMaximum( double maximum )
	{
		this.maximum = maximum;
	}

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public double getMinimum()
	{
		return minimum;
	}

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public void setMinimum( double minimum )
	{
		this.minimum = minimum;
	}

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public double getOffset()
	{
		return offset;
	}

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public void setOffset( double offset )
	{
		this.offset = offset;
	}

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public Boolean isResizeEnabled()
	{
		return resizeEnabled;
	}

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public void setResizeEnabled( Boolean resizeEnabled )
	{
		this.resizeEnabled = resizeEnabled;
	}

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public double getScrollbarHeight()
	{
		return scrollbarHeight;
	}

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public void setScrollbarHeight( double scrollbarHeight )
	{
		this.scrollbarHeight = scrollbarHeight;
	}

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public double getScrollDuration()
	{
		return scrollDuration;
	}

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public void setScrollDuration( double scrollDuration )
	{
		this.scrollDuration = scrollDuration;
	}

	/**
	 * Selected backround opacity.
	 */
	public double getSelectedBackgroundAlpha()
	{
		return selectedBackgroundAlpha;
	}

	/**
	 * Selected backround opacity.
	 */
	public void setSelectedBackgroundAlpha( double selectedBackgroundAlpha )
	{
		this.selectedBackgroundAlpha = selectedBackgroundAlpha;
	}

	/**
	 * Selected background color.
	 */
	public String getSelectedBackgroundColor()
	{
		return selectedBackgroundColor;
	}

	/**
	 * Selected background color.
	 */
	public void setSelectedBackgroundColor( String selectedBackgroundColor )
	{
		this.selectedBackgroundColor = selectedBackgroundColor;
	}

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public double getSelectedGraphFillAlpha()
	{
		return selectedGraphFillAlpha;
	}

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public void setSelectedGraphFillAlpha( double selectedGraphFillAlpha )
	{
		this.selectedGraphFillAlpha = selectedGraphFillAlpha;
	}

	/**
	 * Selected graph's fill color.
	 */
	public String getSelectedGraphFillColor()
	{
		return selectedGraphFillColor;
	}

	/**
	 * Selected graph's fill color.
	 */
	public void setSelectedGraphFillColor( String selectedGraphFillColor )
	{
		this.selectedGraphFillColor = selectedGraphFillColor;
	}

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public double getSelectedGraphLineAlpha()
	{
		return selectedGraphLineAlpha;
	}

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public void setSelectedGraphLineAlpha( double selectedGraphLineAlpha )
	{
		this.selectedGraphLineAlpha = selectedGraphLineAlpha;
	}

	/**
	 * Selected graph's line color.
	 */
	public String getSelectedGraphLineColor()
	{
		return selectedGraphLineColor;
	}

	/**
	 * Selected graph's line color.
	 */
	public void setSelectedGraphLineColor( String selectedGraphLineColor )
	{
		this.selectedGraphLineColor = selectedGraphLineColor;
	}

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public Boolean isUpdateOnReleaseOnly()
	{
		return updateOnReleaseOnly;
	}

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public void setUpdateOnReleaseOnly( Boolean updateOnReleaseOnly )
	{
		this.updateOnReleaseOnly = updateOnReleaseOnly;
	}
}
