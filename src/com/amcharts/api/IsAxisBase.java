package com.amcharts.api;

import java.util.List;

public interface IsAxisBase
{
	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public boolean isAutoGridCount();

	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public void setAutoGridCount( boolean autoGridCount );

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public double getAxisAlpha();

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public void setAxisAlpha( double axisAlpha );

	/**
	 * Axis color.
	 */
	public String getAxisColor();

	/**
	 * Axis color.
	 */
	public void setAxisColor( String axisColor );

	/**
	 * Thickness of the axis.
	 */
	public double getAxisThickness();

	/**
	 * Thickness of the axis.
	 */
	public void setAxisThickness( double axisThickness );

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public double getAxisX();

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public void setAxisX( double axisX );

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public double getAxisY();

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public void setAxisY( double axisY );

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public boolean isBoldLabels();

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public void setBoldLabels( boolean boldLabels );

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public String getColor();

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public void setColor( String color );

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public double getDashLength();

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public void setDashLength( double dashLength );

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public double getFillAlpha();

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public void setFillAlpha( double fillAlpha );

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public String getFillColor();

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public void setFillColor( String fillColor );

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public double getFontSize();

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public void setFontSize( double fontSize );

	/**
	 * Opacity of grid lines.
	 */
	public double getGridAlpha();

	/**
	 * Opacity of grid lines.
	 */
	public void setGridAlpha( double gridAlpha );

	/**
	 * Color of grid lines.
	 */
	public String getGridColor();

	/**
	 * Color of grid lines.
	 */
	public void setGridColor( String gridColor );

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public double getGridCount();

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public void setGridCount( double gridCount );

	/**
	 * Thickness of grid lines.
	 */
	public double getGridThickness();

	/**
	 * Thickness of grid lines.
	 */
	public void setGridThickness( double gridThickness );

	/**
	 * The array of guides belonging to this axis.
	 */
	public List<IsGuide> getGuides();

	/**
	 * The array of guides belonging to this axis.
	 */
	public void setGuides( List<IsGuide> guides );

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public boolean isIgnoreAxisWidth();

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public void setIgnoreAxisWidth( boolean ignoreAxisWidth );

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public boolean isInside();

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public void setInside( boolean inside );

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public double getLabelFrequency();

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public void setLabelFrequency( double labelFrequency );

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public double getLabelOffset();

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public void setLabelOffset( double labelOffset );

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public double getLabelRotation();

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public void setLabelRotation( double labelRotation );

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public boolean isLabelsEnabled();

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public void setLabelsEnabled( boolean labelsEnabled );

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public double getMinHorizontalGap();

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public void setMinHorizontalGap( double minHorizontalGap );

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public double getMinorGridAlpha();

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public void setMinorGridAlpha( double minorGridAlpha );

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public boolean isMinorGridEnabled();

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public void setMinorGridEnabled( boolean minorGridEnabled );

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public double getMinVerticalGap();

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public void setMinVerticalGap( double minVerticalGap );

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public double getOffset();

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public void setOffset( double offset );

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public String getPosition();

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public void setPosition( String position );

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public boolean isShowFirstLabel();

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public void setShowFirstLabel( boolean showFirstLabel );

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public boolean isShowLastLabel();

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public void setShowLastLabel( boolean showLastLabel );

	/**
	 * Length of the tick marks.
	 */
	public double getTickLength();

	/**
	 * Length of the tick marks.
	 */
	public void setTickLength( double tickLength );

	/**
	 * Title of the axis.
	 */
	public String getTitle();

	/**
	 * Title of the axis.
	 */
	public void setTitle( String title );

	/**
	 * Specifies if title should be bold or not.
	 */
	public boolean isTitleBold();

	/**
	 * Specifies if title should be bold or not.
	 */
	public void setTitleBold( boolean titleBold );

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public String getTitleColor();

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public void setTitleColor( String titleColor );

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public double getTitleFontSize();

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public void setTitleFontSize( double titleFontSize );
}
