package com.amcharts.api;

public interface IsChartScrollbar
{
	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public boolean isAutoGridCount();

	/**
	 * "Specifies whether number of gridCount is specified automatically, according to the axis size."
	 */
	public void setAutoGridCount( boolean autoGridCount );

	/**
	 * Background opacity.
	 */
	public double getBackgroundAlpha();

	/**
	 * Background opacity.
	 */
	public void setBackgroundAlpha( double backgroundAlpha );

	/**
	 * Background color of the scrollbar.
	 */
	public String getBackgroundColor();

	/**
	 * Background color of the scrollbar.
	 */
	public void setBackgroundColor( String backgroundColor );

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public IsCategoryAxis getCategoryAxis();

	/**
	 * Read-only. Category axis of the scrollbar.
	 */
	public void setCategoryAxis( IsCategoryAxis categoryAxis );

	/**
	 * Text color.
	 */
	public String getColor();

	/**
	 * Text color.
	 */
	public void setColor( String color );

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public double getDragIconHeight();

	/**
	 * "Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public void setDragIconHeight( double dragIconHeight );

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public double getDragIconWidth();

	/**
	 * "Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want it to be distorted because of resizing."
	 */
	public void setDragIconWidth( double dragIconWidth );

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public String getGraph();

	/**
	 * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
	 */
	public void setGraph( String graph );

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public double getGraphFillAlpha();

	/**
	 * Graph fill opacity. Value range is 0 - 1.
	 */
	public void setGraphFillAlpha( double graphFillAlpha );

	/**
	 * Graph fill color.
	 */
	public String getGraphFillColor();

	/**
	 * Graph fill color.
	 */
	public void setGraphFillColor( String graphFillColor );

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public double getGraphLineAlpha();

	/**
	 * Graph line opacity. Value range is 0 - 1.
	 */
	public void setGraphLineAlpha( double graphLineAlpha );

	/**
	 * Graph line color.
	 */
	public String getGraphLineColor();

	/**
	 * Graph line color.
	 */
	public void setGraphLineColor( String graphLineColor );

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public String getGraphType();

	/**
	 * "by default the graph type is the same as the original graph's type, however in case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column, step, smoothedLine, candlestick, ohlc"
	 */
	public void setGraphType( String graphType );

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public double getGridAlpha();

	/**
	 * Grid opacity. Value range is 0 - 1.
	 */
	public void setGridAlpha( double gridAlpha );

	/**
	 * Grid color.
	 */
	public String getGridColor();

	/**
	 * Grid color.
	 */
	public void setGridColor( String gridColor );

	/**
	 * The number of grid lines.
	 */
	public double getGridCount();

	/**
	 * The number of grid lines.
	 */
	public void setGridCount( double gridCount );

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public boolean isHideResizeGrips();

	/**
	 * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
	 */
	public void setHideResizeGrips( boolean hideResizeGrips );

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public double getMaximum();

	/**
	 * "Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public void setMaximum( double maximum );

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public double getMinimum();

	/**
	 * "Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set."
	 */
	public void setMinimum( double minimum );

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public double getOffset();

	/**
	 * "Distance from plot area to scrollbar, in pixels."
	 */
	public void setOffset( double offset );

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public boolean isResizeEnabled();

	/**
	 * Specifies whether scrollbar has a resize feature.
	 */
	public void setResizeEnabled( boolean resizeEnabled );

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public double getScrollbarHeight();

	/**
	 * "Height (width, if chart is rotated) of a scrollbar."
	 */
	public void setScrollbarHeight( double scrollbarHeight );

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public double getScrollDuration();

	/**
	 * "Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly should be set to false in order animation to happen."
	 */
	public void setScrollDuration( double scrollDuration );

	/**
	 * Selected backround opacity.
	 */
	public double getSelectedBackgroundAlpha();

	/**
	 * Selected backround opacity.
	 */
	public void setSelectedBackgroundAlpha( double selectedBackgroundAlpha );

	/**
	 * Selected background color.
	 */
	public String getSelectedBackgroundColor();

	/**
	 * Selected background color.
	 */
	public void setSelectedBackgroundColor( String selectedBackgroundColor );

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public double getSelectedGraphFillAlpha();

	/**
	 * Selected graph's fill opacity. Value range is 0 - 1.
	 */
	public void setSelectedGraphFillAlpha( double selectedGraphFillAlpha );

	/**
	 * Selected graph's fill color.
	 */
	public String getSelectedGraphFillColor();

	/**
	 * Selected graph's fill color.
	 */
	public void setSelectedGraphFillColor( String selectedGraphFillColor );

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public double getSelectedGraphLineAlpha();

	/**
	 * Selected graph's line opacity. Value range is 0 - 1.
	 */
	public void setSelectedGraphLineAlpha( double selectedGraphLineAlpha );

	/**
	 * Selected graph's line color.
	 */
	public String getSelectedGraphLineColor();

	/**
	 * Selected graph's line color.
	 */
	public void setSelectedGraphLineColor( String selectedGraphLineColor );

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public boolean isUpdateOnReleaseOnly();

	/**
	 * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user releases mouse button.
	 */
	public void setUpdateOnReleaseOnly( boolean updateOnReleaseOnly );
}
