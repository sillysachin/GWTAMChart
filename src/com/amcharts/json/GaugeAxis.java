package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsGaugeAxis;
import com.amcharts.api.IsGaugeBand;

public final class GaugeAxis implements IsGaugeAxis
{
	private double axisAlpha;

	private String axisColor;

	private double axisThickness;

	private double bandAlpha;

	private double bandOutlineAlpha;

	private String bandOutlineColor;

	private double bandOutlineThickness;

	private List<IsGaugeBand> bands;

	private String bottomText;

	private Boolean bottomTextBold;

	private String bottomTextColor;

	private double bottomTextFontSize;

	private double bottomTextXOffset;

	private double bottomTextYOffset;

	private String centerX;

	private String centerY;

	private double endAngle;

	private double endValue;

	private double gridCount;

	private Boolean gridInside;

	private String id;

	private Boolean inside;

	private double labelFrequency;

	private IsFunction labelFunction;

	private double labelOffset;

	private double minorTickInterval;

	private double minorTickLength;

	private String radius;

	private Boolean showFirstLabel;

	private Boolean showLastLabel;

	private double startAngle;

	private double startValue;

	private double tickAlpha;

	private String tickColor;

	private double tickLength;

	private double tickThickness;

	private String topText;

	private Boolean topTextBold;

	private String topTextColor;

	private double topTextFontSize;

	private double topTextYOffset;

	private String unit;

	private String unitPosition;

	private Boolean usePrefixes;

	private double valueInterval;

	/**
	 * Axis opacity.
	 */
	public double getAxisAlpha()
	{
		return axisAlpha;
	}

	/**
	 * Axis opacity.
	 */
	public void setAxisAlpha( double axisAlpha )
	{
		this.axisAlpha = axisAlpha;
	}

	/**
	 * Axis color.
	 */
	public String getAxisColor()
	{
		return axisColor;
	}

	/**
	 * Axis color.
	 */
	public void setAxisColor( String axisColor )
	{
		this.axisColor = axisColor;
	}

	/**
	 * Thickness of the axis outline.
	 */
	public double getAxisThickness()
	{
		return axisThickness;
	}

	/**
	 * Thickness of the axis outline.
	 */
	public void setAxisThickness( double axisThickness )
	{
		this.axisThickness = axisThickness;
	}

	/**
	 * Opacity of band fills.
	 */
	public double getBandAlpha()
	{
		return bandAlpha;
	}

	/**
	 * Opacity of band fills.
	 */
	public void setBandAlpha( double bandAlpha )
	{
		this.bandAlpha = bandAlpha;
	}

	/**
	 * Opacity of band outlines.
	 */
	public double getBandOutlineAlpha()
	{
		return bandOutlineAlpha;
	}

	/**
	 * Opacity of band outlines.
	 */
	public void setBandOutlineAlpha( double bandOutlineAlpha )
	{
		this.bandOutlineAlpha = bandOutlineAlpha;
	}

	/**
	 * Color of band outlines.
	 */
	public String getBandOutlineColor()
	{
		return bandOutlineColor;
	}

	/**
	 * Color of band outlines.
	 */
	public void setBandOutlineColor( String bandOutlineColor )
	{
		this.bandOutlineColor = bandOutlineColor;
	}

	/**
	 * Thickness of band outlines.
	 */
	public double getBandOutlineThickness()
	{
		return bandOutlineThickness;
	}

	/**
	 * Thickness of band outlines.
	 */
	public void setBandOutlineThickness( double bandOutlineThickness )
	{
		this.bandOutlineThickness = bandOutlineThickness;
	}

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public List<IsGaugeBand> getBands()
	{
		return bands;
	}

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public void setBands( List<IsGaugeBand> bands )
	{
		this.bands = bands;
	}

	/**
	 * Text displayed below the axis center.
	 */
	public String getBottomText()
	{
		return bottomText;
	}

	/**
	 * Text displayed below the axis center.
	 */
	public void setBottomText( String bottomText )
	{
		this.bottomText = bottomText;
	}

	/**
	 * Specifies if text should be bold.
	 */
	public Boolean isBottomTextBold()
	{
		return bottomTextBold;
	}

	/**
	 * Specifies if text should be bold.
	 */
	public void setBottomTextBold( Boolean bottomTextBold )
	{
		this.bottomTextBold = bottomTextBold;
	}

	/**
	 * Bottom text color.
	 */
	public String getBottomTextColor()
	{
		return bottomTextColor;
	}

	/**
	 * Bottom text color.
	 */
	public void setBottomTextColor( String bottomTextColor )
	{
		this.bottomTextColor = bottomTextColor;
	}

	/**
	 * Font size of bottom text.
	 */
	public double getBottomTextFontSize()
	{
		return bottomTextFontSize;
	}

	/**
	 * Font size of bottom text.
	 */
	public void setBottomTextFontSize( double bottomTextFontSize )
	{
		this.bottomTextFontSize = bottomTextFontSize;
	}

	/**
	 * Y offset of bottom text.
	 */
	public double getBottomTextYOffset()
	{
		return bottomTextYOffset;
	}

	/**
	 * Y offset of bottom text.
	 */
	public void setBottomTextYOffset( double bottomTextYOffset )
	{
		this.bottomTextYOffset = bottomTextYOffset;
	}

	/**
	 * X offset of bottom text.
	 */
	public double getBottomTextXOffset()
	{
		return bottomTextXOffset;
	}

	/**
	 * X offset of bottom text.
	 */
	public void setBottomTextXOffset( double bottomTextXOffset )
	{
		this.bottomTextXOffset = bottomTextXOffset;
	}

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public String getCenterX()
	{
		return centerX;
	}

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public void setCenterX( String centerX )
	{
		this.centerX = centerX;
	}

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public String getCenterY()
	{
		return centerY;
	}

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public void setCenterY( String centerY )
	{
		this.centerY = centerY;
	}

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public double getEndAngle()
	{
		return endAngle;
	}

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public void setEndAngle( double endAngle )
	{
		this.endAngle = endAngle;
	}

	/**
	 * Axis end (max) value
	 */
	public double getEndValue()
	{
		return endValue;
	}

	/**
	 * Axis end (max) value
	 */
	public void setEndValue( double endValue )
	{
		this.endValue = endValue;
	}

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public double getGridCount()
	{
		return gridCount;
	}

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public void setGridCount( double gridCount )
	{
		this.gridCount = gridCount;
	}

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public Boolean isGridInside()
	{
		return gridInside;
	}

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public void setGridInside( Boolean gridInside )
	{
		this.gridInside = gridInside;
	}

	/**
	 * Unique id of an axis.
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Unique id of an axis.
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public Boolean isInside()
	{
		return inside;
	}

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public void setInside( Boolean inside )
	{
		this.inside = inside;
	}

	/**
	 * Frequency of labels.
	 */
	public double getLabelFrequency()
	{
		return labelFrequency;
	}

	/**
	 * Frequency of labels.
	 */
	public void setLabelFrequency( double labelFrequency )
	{
		this.labelFrequency = labelFrequency;
	}

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public IsFunction getLabelFunction()
	{
		return labelFunction;
	}

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public void setLabelFunction( IsFunction labelFunction )
	{
		this.labelFunction = labelFunction;
	}

	/**
	 * Distance from axis to the labels.
	 */
	public double getLabelOffset()
	{
		return labelOffset;
	}

	/**
	 * Distance from axis to the labels.
	 */
	public void setLabelOffset( double labelOffset )
	{
		this.labelOffset = labelOffset;
	}

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public double getMinorTickInterval()
	{
		return minorTickInterval;
	}

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public void setMinorTickInterval( double minorTickInterval )
	{
		this.minorTickInterval = minorTickInterval;
	}

	/**
	 * Length of a minor tick.
	 */
	public double getMinorTickLength()
	{
		return minorTickLength;
	}

	/**
	 * Length of a minor tick.
	 */
	public void setMinorTickLength( double minorTickLength )
	{
		this.minorTickLength = minorTickLength;
	}

	/**
	 * Axis radius.
	 */
	public String getRadius()
	{
		return radius;
	}

	/**
	 * Axis radius.
	 */
	public void setRadius( String radius )
	{
		this.radius = radius;
	}

	/**
	 * Specifies if the first label should be shown.
	 */
	public Boolean isShowFirstLabel()
	{
		return showFirstLabel;
	}

	/**
	 * Specifies if the first label should be shown.
	 */
	public void setShowFirstLabel( Boolean showFirstLabel )
	{
		this.showFirstLabel = showFirstLabel;
	}

	/**
	 * Specifies if the last label should be shown.
	 */
	public Boolean isShowLastLabel()
	{
		return showLastLabel;
	}

	/**
	 * Specifies if the last label should be shown.
	 */
	public void setShowLastLabel( Boolean showLastLabel )
	{
		this.showLastLabel = showLastLabel;
	}

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public double getStartAngle()
	{
		return startAngle;
	}

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public void setStartAngle( double startAngle )
	{
		this.startAngle = startAngle;
	}

	/**
	 * Axis start (min) value.
	 */
	public double getStartValue()
	{
		return startValue;
	}

	/**
	 * Axis start (min) value.
	 */
	public void setStartValue( double startValue )
	{
		this.startValue = startValue;
	}

	/**
	 * Opacity of axis ticks.
	 */
	public double getTickAlpha()
	{
		return tickAlpha;
	}

	/**
	 * Opacity of axis ticks.
	 */
	public void setTickAlpha( double tickAlpha )
	{
		this.tickAlpha = tickAlpha;
	}

	/**
	 * Color of axis ticks.
	 */
	public String getTickColor()
	{
		return tickColor;
	}

	/**
	 * Color of axis ticks.
	 */
	public void setTickColor( String tickColor )
	{
		this.tickColor = tickColor;
	}

	/**
	 * Length of a major tick.
	 */
	public double getTickLength()
	{
		return tickLength;
	}

	/**
	 * Length of a major tick.
	 */
	public void setTickLength( double tickLength )
	{
		this.tickLength = tickLength;
	}

	/**
	 * Tick thickness.
	 */
	public double getTickThickness()
	{
		return tickThickness;
	}

	/**
	 * Tick thickness.
	 */
	public void setTickThickness( double tickThickness )
	{
		this.tickThickness = tickThickness;
	}

	/**
	 * Text displayed above the axis center.
	 */
	public String getTopText()
	{
		return topText;
	}

	/**
	 * Text displayed above the axis center.
	 */
	public void setTopText( String topText )
	{
		this.topText = topText;
	}

	/**
	 * Specifies if text should be bold.
	 */
	public Boolean isTopTextBold()
	{
		return topTextBold;
	}

	/**
	 * Specifies if text should be bold.
	 */
	public void setTopTextBold( Boolean topTextBold )
	{
		this.topTextBold = topTextBold;
	}

	/**
	 * Color of top text.
	 */
	public String getTopTextColor()
	{
		return topTextColor;
	}

	/**
	 * Color of top text.
	 */
	public void setTopTextColor( String topTextColor )
	{
		this.topTextColor = topTextColor;
	}

	/**
	 * Font size of top text.
	 */
	public double getTopTextFontSize()
	{
		return topTextFontSize;
	}

	/**
	 * Font size of top text.
	 */
	public void setTopTextFontSize( double topTextFontSize )
	{
		this.topTextFontSize = topTextFontSize;
	}

	/**
	 * Y offset of top text.
	 */
	public double getTopTextYOffset()
	{
		return topTextYOffset;
	}

	/**
	 * Y offset of top text.
	 */
	public void setTopTextYOffset( double topTextYOffset )
	{
		this.topTextYOffset = topTextYOffset;
	}

	/**
	 * A string which can be placed next to axis labels.
	 */
	public String getUnit()
	{
		return unit;
	}

	/**
	 * A string which can be placed next to axis labels.
	 */
	public void setUnit( String unit )
	{
		this.unit = unit;
	}

	/**
	 * Position of the unit.
	 */
	public String getUnitPosition()
	{
		return unitPosition;
	}

	/**
	 * Position of the unit.
	 */
	public void setUnitPosition( String unitPosition )
	{
		this.unitPosition = unitPosition;
	}

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public Boolean isUsePrefixes()
	{
		return usePrefixes;
	}

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public void setUsePrefixes( Boolean usePrefixes )
	{
		this.usePrefixes = usePrefixes;
	}

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public double getValueInterval()
	{
		return valueInterval;
	}

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public void setValueInterval( double valueInterval )
	{
		this.valueInterval = valueInterval;
	}
}
