package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsGaugeAxis;
import com.amcharts.api.IsGaugeBand;
import com.google.gwt.core.client.JavaScriptObject;

public final class GaugeAxisJSO extends JavaScriptObject implements IsGaugeAxis
{
	protected GaugeAxisJSO()
	{
	}

	/**
	 * Axis opacity.
	 */
	public final native double getAxisAlpha() /*-{
		return this.axisAlpha;
	}-*/;

	/**
	 * Axis opacity.
	 */
	public final native void setAxisAlpha( double axisAlpha ) /*-{
		this.axisAlpha = axisAlpha;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native String getAxisColor() /*-{
		return this.axisColor;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native void setAxisColor( String axisColor ) /*-{
		this.axisColor = axisColor;
	}-*/;

	/**
	 * Thickness of the axis outline.
	 */
	public final native double getAxisThickness() /*-{
		return this.axisThickness;
	}-*/;

	/**
	 * Thickness of the axis outline.
	 */
	public final native void setAxisThickness( double axisThickness ) /*-{
		this.axisThickness = axisThickness;
	}-*/;

	/**
	 * Opacity of band fills.
	 */
	public final native double getBandAlpha() /*-{
		return this.bandAlpha;
	}-*/;

	/**
	 * Opacity of band fills.
	 */
	public final native void setBandAlpha( double bandAlpha ) /*-{
		this.bandAlpha = bandAlpha;
	}-*/;

	/**
	 * Opacity of band outlines.
	 */
	public final native double getBandOutlineAlpha() /*-{
		return this.bandOutlineAlpha;
	}-*/;

	/**
	 * Opacity of band outlines.
	 */
	public final native void setBandOutlineAlpha( double bandOutlineAlpha ) /*-{
		this.bandOutlineAlpha = bandOutlineAlpha;
	}-*/;

	/**
	 * Color of band outlines.
	 */
	public final native String getBandOutlineColor() /*-{
		return this.bandOutlineColor;
	}-*/;

	/**
	 * Color of band outlines.
	 */
	public final native void setBandOutlineColor( String bandOutlineColor ) /*-{
		this.bandOutlineColor = bandOutlineColor;
	}-*/;

	/**
	 * Thickness of band outlines.
	 */
	public final native double getBandOutlineThickness() /*-{
		return this.bandOutlineThickness;
	}-*/;

	/**
	 * Thickness of band outlines.
	 */
	public final native void setBandOutlineThickness( double bandOutlineThickness ) /*-{
		this.bandOutlineThickness = bandOutlineThickness;
	}-*/;

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public final native List<IsGaugeBand> getBands() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.bands);
	}-*/;

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public final native void setBands( List<IsGaugeBand> bands ) /*-{
		this.bands = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(bands);
	}-*/;

	/**
	 * Text displayed below the axis center.
	 */
	public final native String getBottomText() /*-{
		return this.bottomText;
	}-*/;

	/**
	 * Text displayed below the axis center.
	 */
	public final native void setBottomText( String bottomText ) /*-{
		this.bottomText = bottomText;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native Boolean isBottomTextBold() /*-{
		return this.bottomTextBold;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native void setBottomTextBold( Boolean bottomTextBold ) /*-{
		this.bottomTextBold = bottomTextBold;
	}-*/;

	/**
	 * Bottom text color.
	 */
	public final native String getBottomTextColor() /*-{
		return this.bottomTextColor;
	}-*/;

	/**
	 * Bottom text color.
	 */
	public final native void setBottomTextColor( String bottomTextColor ) /*-{
		this.bottomTextColor = bottomTextColor;
	}-*/;

	/**
	 * Font size of bottom text.
	 */
	public final native double getBottomTextFontSize() /*-{
		return this.bottomTextFontSize;
	}-*/;

	/**
	 * Font size of bottom text.
	 */
	public final native void setBottomTextFontSize( double bottomTextFontSize ) /*-{
		this.bottomTextFontSize = bottomTextFontSize;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native double getBottomTextYOffset() /*-{
		return this.bottomTextYOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native void setBottomTextXOffset( double bottomTextXOffset ) /*-{
		this.bottomTextXOffset = bottomTextXOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native double getBottomTextXOffset() /*-{
		return this.bottomTextXOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native void setBottomTextYOffset( double bottomTextYOffset ) /*-{
		this.bottomTextYOffset = bottomTextYOffset;
	}-*/;

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public final native String getCenterX() /*-{
		return this.centerX;
	}-*/;

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public final native void setCenterX( String centerX ) /*-{
		this.centerX = centerX;
	}-*/;

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public final native String getCenterY() /*-{
		return this.centerY;
	}-*/;

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public final native void setCenterY( String centerY ) /*-{
		this.centerY = centerY;
	}-*/;

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public final native double getEndAngle() /*-{
		return this.endAngle;
	}-*/;

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public final native void setEndAngle( double endAngle ) /*-{
		this.endAngle = endAngle;
	}-*/;

	/**
	 * Axis end (max) value
	 */
	public final native double getEndValue() /*-{
		return this.endValue;
	}-*/;

	/**
	 * Axis end (max) value
	 */
	public final native void setEndValue( double endValue ) /*-{
		this.endValue = endValue;
	}-*/;

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public final native double getGridCount() /*-{
		return this.gridCount;
	}-*/;

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.gridCount = gridCount;
	}-*/;

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public final native Boolean isGridInside() /*-{
		return this.gridInside;
	}-*/;

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public final native void setGridInside( Boolean gridInside ) /*-{
		this.gridInside = gridInside;
	}-*/;

	/**
	 * Unique id of an axis.
	 */
	public final native String getId() /*-{
		return this.id;
	}-*/;

	/**
	 * Unique id of an axis.
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public final native Boolean isInside() /*-{
		return this.inside;
	}-*/;

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public final native void setInside( Boolean inside ) /*-{
		this.inside = inside;
	}-*/;

	/**
	 * Frequency of labels.
	 */
	public final native double getLabelFrequency() /*-{
		return this.labelFrequency;
	}-*/;

	/**
	 * Frequency of labels.
	 */
	public final native void setLabelFrequency( double labelFrequency ) /*-{
		this.labelFrequency = labelFrequency;
	}-*/;

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public final native IsFunction getLabelFunction() /*-{
		return @com.amcharts.impl.JsFunction::getInstance(Lcom/google/gwt/core/client/JavaScriptObject;)(this.labelFunction);
	}-*/;

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public final native void setLabelFunction( IsFunction labelFunction ) /*-{
		this.labelFunction = labelFunction;
	}-*/;

	/**
	 * Distance from axis to the labels.
	 */
	public final native double getLabelOffset() /*-{
		return this.labelOffset;
	}-*/;

	/**
	 * Distance from axis to the labels.
	 */
	public final native void setLabelOffset( double labelOffset ) /*-{
		this.labelOffset = labelOffset;
	}-*/;

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public final native double getMinorTickInterval() /*-{
		return this.minorTickInterval;
	}-*/;

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public final native void setMinorTickInterval( double minorTickInterval ) /*-{
		this.minorTickInterval = minorTickInterval;
	}-*/;

	/**
	 * Length of a minor tick.
	 */
	public final native double getMinorTickLength() /*-{
		return this.minorTickLength;
	}-*/;

	/**
	 * Length of a minor tick.
	 */
	public final native void setMinorTickLength( double minorTickLength ) /*-{
		this.minorTickLength = minorTickLength;
	}-*/;

	/**
	 * Axis radius.
	 */
	public final native String getRadius() /*-{
		return this.radius;
	}-*/;

	/**
	 * Axis radius.
	 */
	public final native void setRadius( String radius ) /*-{
		this.radius = radius;
	}-*/;

	/**
	 * Specifies if the first label should be shown.
	 */
	public final native Boolean isShowFirstLabel() /*-{
		return this.showFirstLabel;
	}-*/;

	/**
	 * Specifies if the first label should be shown.
	 */
	public final native void setShowFirstLabel( Boolean showFirstLabel ) /*-{
		this.showFirstLabel = showFirstLabel;
	}-*/;

	/**
	 * Specifies if the last label should be shown.
	 */
	public final native Boolean isShowLastLabel() /*-{
		return this.showLastLabel;
	}-*/;

	/**
	 * Specifies if the last label should be shown.
	 */
	public final native void setShowLastLabel( Boolean showLastLabel ) /*-{
		this.showLastLabel = showLastLabel;
	}-*/;

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public final native double getStartAngle() /*-{
		return this.startAngle;
	}-*/;

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public final native void setStartAngle( double startAngle ) /*-{
		this.startAngle = startAngle;
	}-*/;

	/**
	 * Axis start (min) value.
	 */
	public final native double getStartValue() /*-{
		return this.startValue;
	}-*/;

	/**
	 * Axis start (min) value.
	 */
	public final native void setStartValue( double startValue ) /*-{
		this.startValue = startValue;
	}-*/;

	/**
	 * Opacity of axis ticks.
	 */
	public final native double getTickAlpha() /*-{
		return this.tickAlpha;
	}-*/;

	/**
	 * Opacity of axis ticks.
	 */
	public final native void setTickAlpha( double tickAlpha ) /*-{
		this.tickAlpha = tickAlpha;
	}-*/;

	/**
	 * Color of axis ticks.
	 */
	public final native String getTickColor() /*-{
		return this.tickColor;
	}-*/;

	/**
	 * Color of axis ticks.
	 */
	public final native void setTickColor( String tickColor ) /*-{
		this.tickColor = tickColor;
	}-*/;

	/**
	 * Length of a major tick.
	 */
	public final native double getTickLength() /*-{
		return this.tickLength;
	}-*/;

	/**
	 * Length of a major tick.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.tickLength = tickLength;
	}-*/;

	/**
	 * Tick thickness.
	 */
	public final native double getTickThickness() /*-{
		return this.tickThickness;
	}-*/;

	/**
	 * Tick thickness.
	 */
	public final native void setTickThickness( double tickThickness ) /*-{
		this.tickThickness = tickThickness;
	}-*/;

	/**
	 * Text displayed above the axis center.
	 */
	public final native String getTopText() /*-{
		return this.topText;
	}-*/;

	/**
	 * Text displayed above the axis center.
	 */
	public final native void setTopText( String topText ) /*-{
		this.topText = topText;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native Boolean isTopTextBold() /*-{
		return this.topTextBold;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native void setTopTextBold( Boolean topTextBold ) /*-{
		this.topTextBold = topTextBold;
	}-*/;

	/**
	 * Color of top text.
	 */
	public final native String getTopTextColor() /*-{
		return this.topTextColor;
	}-*/;

	/**
	 * Color of top text.
	 */
	public final native void setTopTextColor( String topTextColor ) /*-{
		this.topTextColor = topTextColor;
	}-*/;

	/**
	 * Font size of top text.
	 */
	public final native double getTopTextFontSize() /*-{
		return this.topTextFontSize;
	}-*/;

	/**
	 * Font size of top text.
	 */
	public final native void setTopTextFontSize( double topTextFontSize ) /*-{
		this.topTextFontSize = topTextFontSize;
	}-*/;

	/**
	 * Y offset of top text.
	 */
	public final native double getTopTextYOffset() /*-{
		return this.topTextYOffset;
	}-*/;

	/**
	 * Y offset of top text.
	 */
	public final native void setTopTextYOffset( double topTextYOffset ) /*-{
		this.topTextYOffset = topTextYOffset;
	}-*/;

	/**
	 * A string which can be placed next to axis labels.
	 */
	public final native String getUnit() /*-{
		return this.unit;
	}-*/;

	/**
	 * A string which can be placed next to axis labels.
	 */
	public final native void setUnit( String unit ) /*-{
		this.unit = unit;
	}-*/;

	/**
	 * Position of the unit.
	 */
	public final native String getUnitPosition() /*-{
		return this.unitPosition;
	}-*/;

	/**
	 * Position of the unit.
	 */
	public final native void setUnitPosition( String unitPosition ) /*-{
		this.unitPosition = unitPosition;
	}-*/;

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public final native Boolean isUsePrefixes() /*-{
		return this.usePrefixes;
	}-*/;

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public final native void setUsePrefixes( Boolean usePrefixes ) /*-{
		this.usePrefixes = usePrefixes;
	}-*/;

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public final native double getValueInterval() /*-{
		return this.valueInterval;
	}-*/;

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public final native void setValueInterval( double valueInterval ) /*-{
		this.valueInterval = valueInterval;
	}-*/;
}
