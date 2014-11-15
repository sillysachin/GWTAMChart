package com.amcharts.api;

import java.util.List;

public interface IsGaugeAxis
{
	/**
	 * Axis opacity.
	 */
	public double getAxisAlpha();

	/**
	 * Axis opacity.
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
	 * Thickness of the axis outline.
	 */
	public double getAxisThickness();

	/**
	 * Thickness of the axis outline.
	 */
	public void setAxisThickness( double axisThickness );

	/**
	 * Opacity of band fills.
	 */
	public double getBandAlpha();

	/**
	 * Opacity of band fills.
	 */
	public void setBandAlpha( double bandAlpha );

	/**
	 * Opacity of band outlines.
	 */
	public double getBandOutlineAlpha();

	/**
	 * Opacity of band outlines.
	 */
	public void setBandOutlineAlpha( double bandOutlineAlpha );

	/**
	 * Color of band outlines.
	 */
	public String getBandOutlineColor();

	/**
	 * Color of band outlines.
	 */
	public void setBandOutlineColor( String bandOutlineColor );

	/**
	 * Thickness of band outlines.
	 */
	public double getBandOutlineThickness();

	/**
	 * Thickness of band outlines.
	 */
	public void setBandOutlineThickness( double bandOutlineThickness );

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public List<IsGaugeBand> getBands();

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public void setBands( List<IsGaugeBand> bands );

	/**
	 * Text displayed below the axis center.
	 */
	public String getBottomText();

	/**
	 * Text displayed below the axis center.
	 */
	public void setBottomText( String bottomText );

	/**
	 * Specifies if text should be bold.
	 */
	public boolean isBottomTextBold();

	/**
	 * Specifies if text should be bold.
	 */
	public void setBottomTextBold( boolean bottomTextBold );

	/**
	 * Bottom text color.
	 */
	public String getBottomTextColor();

	/**
	 * Bottom text color.
	 */
	public void setBottomTextColor( String bottomTextColor );

	/**
	 * Font size of bottom text.
	 */
	public double getBottomTextFontSize();

	/**
	 * Font size of bottom text.
	 */
	public void setBottomTextFontSize( double bottomTextFontSize );

	/**
	 * X offset of bottom text.
	 */
	public double getBottomTextXOffset();

	/**
	 * X offset of bottom text.
	 */
	public void setBottomTextXOffset( double bottomTextYOffset );

	/**
	 * Y offset of bottom text.
	 */
	public double getBottomTextYOffset();

	/**
	 * Y offset of bottom text.
	 */
	public void setBottomTextYOffset( double bottomTextYOffset );

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public String getCenterX();

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public void setCenterX( String centerX );

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public String getCenterY();

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public void setCenterY( String centerY );

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public double getEndAngle();

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public void setEndAngle( double endAngle );

	/**
	 * Axis end (max) value
	 */
	public double getEndValue();

	/**
	 * Axis end (max) value
	 */
	public void setEndValue( double endValue );

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public double getGridCount();

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public void setGridCount( double gridCount );

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public boolean isGridInside();

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public void setGridInside( boolean gridInside );

	/**
	 * Unique id of an axis.
	 */
	public String getId();

	/**
	 * Unique id of an axis.
	 */
	public void setId( String id );

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public boolean isInside();

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public void setInside( boolean inside );

	/**
	 * Frequency of labels.
	 */
	public double getLabelFrequency();

	/**
	 * Frequency of labels.
	 */
	public void setLabelFrequency( double labelFrequency );

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public IsFunction getLabelFunction();

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public void setLabelFunction( IsFunction labelFunction );

	/**
	 * Distance from axis to the labels.
	 */
	public double getLabelOffset();

	/**
	 * Distance from axis to the labels.
	 */
	public void setLabelOffset( double labelOffset );

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public double getMinorTickInterval();

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public void setMinorTickInterval( double minorTickInterval );

	/**
	 * Length of a minor tick.
	 */
	public double getMinorTickLength();

	/**
	 * Length of a minor tick.
	 */
	public void setMinorTickLength( double minorTickLength );

	/**
	 * Axis radius.
	 */
	public String getRadius();

	/**
	 * Axis radius.
	 */
	public void setRadius( String radius );

	/**
	 * Specifies if the first label should be shown.
	 */
	public boolean isShowFirstLabel();

	/**
	 * Specifies if the first label should be shown.
	 */
	public void setShowFirstLabel( boolean showFirstLabel );

	/**
	 * Specifies if the last label should be shown.
	 */
	public boolean isShowLastLabel();

	/**
	 * Specifies if the last label should be shown.
	 */
	public void setShowLastLabel( boolean showLastLabel );

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public double getStartAngle();

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public void setStartAngle( double startAngle );

	/**
	 * Axis start (min) value.
	 */
	public double getStartValue();

	/**
	 * Axis start (min) value.
	 */
	public void setStartValue( double startValue );

	/**
	 * Opacity of axis ticks.
	 */
	public double getTickAlpha();

	/**
	 * Opacity of axis ticks.
	 */
	public void setTickAlpha( double tickAlpha );

	/**
	 * Color of axis ticks.
	 */
	public String getTickColor();

	/**
	 * Color of axis ticks.
	 */
	public void setTickColor( String tickColor );

	/**
	 * Length of a major tick.
	 */
	public double getTickLength();

	/**
	 * Length of a major tick.
	 */
	public void setTickLength( double tickLength );

	/**
	 * Tick thickness.
	 */
	public double getTickThickness();

	/**
	 * Tick thickness.
	 */
	public void setTickThickness( double tickThickness );

	/**
	 * Text displayed above the axis center.
	 */
	public String getTopText();

	/**
	 * Text displayed above the axis center.
	 */
	public void setTopText( String topText );

	/**
	 * Specifies if text should be bold.
	 */
	public boolean isTopTextBold();

	/**
	 * Specifies if text should be bold.
	 */
	public void setTopTextBold( boolean topTextBold );

	/**
	 * Color of top text.
	 */
	public String getTopTextColor();

	/**
	 * Color of top text.
	 */
	public void setTopTextColor( String topTextColor );

	/**
	 * Font size of top text.
	 */
	public double getTopTextFontSize();

	/**
	 * Font size of top text.
	 */
	public void setTopTextFontSize( double topTextFontSize );

	/**
	 * Y offset of top text.
	 */
	public double getTopTextYOffset();

	/**
	 * Y offset of top text.
	 */
	public void setTopTextYOffset( double topTextYOffset );

	/**
	 * A string which can be placed next to axis labels.
	 */
	public String getUnit();

	/**
	 * A string which can be placed next to axis labels.
	 */
	public void setUnit( String unit );

	/**
	 * Position of the unit.
	 */
	public String getUnitPosition();

	/**
	 * Position of the unit.
	 */
	public void setUnitPosition( String unitPosition );

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public boolean isUsePrefixes();

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public void setUsePrefixes( boolean usePrefixes );

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public double getValueInterval();

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public void setValueInterval( double valueInterval );
}
