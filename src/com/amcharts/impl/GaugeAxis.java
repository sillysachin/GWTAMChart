package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsGaugeAxis;
import com.amcharts.api.IsGaugeBand;
import com.amcharts.jso.GaugeAxisJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class GaugeAxis implements IJavaScriptWrapper<GaugeAxisJSO>, IsGaugeAxis
{
	private GaugeAxisJSO jso;

	protected GaugeAxis()
	{
		jso = createJso();
	}

	public GaugeAxisJSO getJso()
	{
		return this.jso;
	}

	public void setJso( GaugeAxisJSO jso )
	{
		this.jso = jso;
	}

	public native GaugeAxisJSO createJso() /*-{
		return this.jso;
	}-*/;

	/**
	 * Axis opacity.
	 */
	public final native double getAxisAlpha() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.axisAlpha;
	}-*/;

	/**
	 * Axis opacity.
	 */
	public final native void setAxisAlpha( double axisAlpha ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.axisAlpha = axisAlpha;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native String getAxisColor() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.axisColor;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native void setAxisColor( String axisColor ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.axisColor = axisColor;
	}-*/;

	/**
	 * Thickness of the axis outline.
	 */
	public final native double getAxisThickness() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.axisThickness;
	}-*/;

	/**
	 * Thickness of the axis outline.
	 */
	public final native void setAxisThickness( double axisThickness ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.axisThickness = axisThickness;
	}-*/;

	/**
	 * Opacity of band fills.
	 */
	public final native double getBandAlpha() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bandAlpha;
	}-*/;

	/**
	 * Opacity of band fills.
	 */
	public final native void setBandAlpha( double bandAlpha ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bandAlpha = bandAlpha;
	}-*/;

	/**
	 * Opacity of band outlines.
	 */
	public final native double getBandOutlineAlpha() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineAlpha;
	}-*/;

	/**
	 * Opacity of band outlines.
	 */
	public final native void setBandOutlineAlpha( double bandOutlineAlpha ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineAlpha = bandOutlineAlpha;
	}-*/;

	/**
	 * Color of band outlines.
	 */
	public final native String getBandOutlineColor() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineColor;
	}-*/;

	/**
	 * Color of band outlines.
	 */
	public final native void setBandOutlineColor( String bandOutlineColor ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineColor = bandOutlineColor;
	}-*/;

	/**
	 * Thickness of band outlines.
	 */
	public final native double getBandOutlineThickness() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineThickness;
	}-*/;

	/**
	 * Thickness of band outlines.
	 */
	public final native void setBandOutlineThickness( double bandOutlineThickness ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bandOutlineThickness = bandOutlineThickness;
	}-*/;

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public final native List<IsGaugeBand> getBands() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bands;
	}-*/;

	/**
	 * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
	 */
	public final native void setBands( List<IsGaugeBand> bands ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bands = bands;
	}-*/;

	/**
	 * Text displayed below the axis center.
	 */
	public final native String getBottomText() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomText;
	}-*/;

	/**
	 * Text displayed below the axis center.
	 */
	public final native void setBottomText( String bottomText ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomText = bottomText;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native boolean isBottomTextBold() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomTextBold;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native void setBottomTextBold( boolean bottomTextBold ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomTextBold = bottomTextBold;
	}-*/;

	/**
	 * Bottom text color.
	 */
	public final native String getBottomTextColor() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomTextColor;
	}-*/;

	/**
	 * Bottom text color.
	 */
	public final native void setBottomTextColor( String bottomTextColor ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomTextColor = bottomTextColor;
	}-*/;

	/**
	 * Font size of bottom text.
	 */
	public final native double getBottomTextFontSize() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomTextFontSize;
	}-*/;

	/**
	 * Font size of bottom text.
	 */
	public final native void setBottomTextFontSize( double bottomTextFontSize ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomTextFontSize = bottomTextFontSize;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native double getBottomTextYOffset() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomTextYOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native void setBottomTextXOffset( double bottomTextXOffset ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomTextXOffset = bottomTextXOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native double getBottomTextXOffset() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.bottomTextXOffset;
	}-*/;

	/**
	 * Y offset of bottom text.
	 */
	public final native void setBottomTextYOffset( double bottomTextYOffset ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.bottomTextYOffset = bottomTextYOffset;
	}-*/;

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public final native String getCenterX() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.centerX;
	}-*/;

	/**
	 * "X position of the axis, relative to the center of the gauge."
	 */
	public final native void setCenterX( String centerX ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.centerX = centerX;
	}-*/;

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public final native String getCenterY() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.centerY;
	}-*/;

	/**
	 * "Y position of the axis, relative to the center of the gauge."
	 */
	public final native void setCenterY( String centerY ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.centerY = centerY;
	}-*/;

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public final native double getEndAngle() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.endAngle;
	}-*/;

	/**
	 * Axis end angle. Valid values are from - 180 to 180.
	 */
	public final native void setEndAngle( double endAngle ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.endAngle = endAngle;
	}-*/;

	/**
	 * Axis end (max) value
	 */
	public final native double getEndValue() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.endValue;
	}-*/;

	/**
	 * Axis end (max) value
	 */
	public final native void setEndValue( double endValue ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.endValue = endValue;
	}-*/;

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public final native double getGridCount() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.gridCount;
	}-*/;

	/**
	 * "Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check your values and choose a proper gridCount which would result grids at round numbers."
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.gridCount = gridCount;
	}-*/;

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public final native boolean isGridInside() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.gridInside;
	}-*/;

	/**
	 * Specifies if grid should be drawn inside or outside the axis.
	 */
	public final native void setGridInside( boolean gridInside ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.gridInside = gridInside;
	}-*/;

	/**
	 * Unique id of an axis.
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.id;
	}-*/;

	/**
	 * Unique id of an axis.
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.id = id;
	}-*/;

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public final native boolean isInside() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.inside;
	}-*/;

	/**
	 * Specifies if labels should be placed inside or outside the axis.
	 */
	public final native void setInside( boolean inside ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.inside = inside;
	}-*/;

	/**
	 * Frequency of labels.
	 */
	public final native double getLabelFrequency() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.labelFrequency;
	}-*/;

	/**
	 * Frequency of labels.
	 */
	public final native void setLabelFrequency( double labelFrequency ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.labelFrequency = labelFrequency;
	}-*/;

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public final native IsFunction getLabelFunction() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.labelFunction;
	}-*/;

	/**
	 * You can use this function to format axis labels. This function is called and value is passed as a attribute: labelFunction(value);
	 */
	public final native void setLabelFunction( IsFunction labelFunction ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.labelFunction = labelFunction;
	}-*/;

	/**
	 * Distance from axis to the labels.
	 */
	public final native double getLabelOffset() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.labelOffset;
	}-*/;

	/**
	 * Distance from axis to the labels.
	 */
	public final native void setLabelOffset( double labelOffset ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.labelOffset = labelOffset;
	}-*/;

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public final native double getMinorTickInterval() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.minorTickInterval;
	}-*/;

	/**
	 * "Interval, at which minor ticks should be placed."
	 */
	public final native void setMinorTickInterval( double minorTickInterval ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.minorTickInterval = minorTickInterval;
	}-*/;

	/**
	 * Length of a minor tick.
	 */
	public final native double getMinorTickLength() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.minorTickLength;
	}-*/;

	/**
	 * Length of a minor tick.
	 */
	public final native void setMinorTickLength( double minorTickLength ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.minorTickLength = minorTickLength;
	}-*/;

	/**
	 * Axis radius.
	 */
	public final native String getRadius() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.radius;
	}-*/;

	/**
	 * Axis radius.
	 */
	public final native void setRadius( String radius ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.radius = radius;
	}-*/;

	/**
	 * Specifies if the first label should be shown.
	 */
	public final native boolean isShowFirstLabel() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.showFirstLabel;
	}-*/;

	/**
	 * Specifies if the first label should be shown.
	 */
	public final native void setShowFirstLabel( boolean showFirstLabel ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.showFirstLabel = showFirstLabel;
	}-*/;

	/**
	 * Specifies if the last label should be shown.
	 */
	public final native boolean isShowLastLabel() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.showLastLabel;
	}-*/;

	/**
	 * Specifies if the last label should be shown.
	 */
	public final native void setShowLastLabel( boolean showLastLabel ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.showLastLabel = showLastLabel;
	}-*/;

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public final native double getStartAngle() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.startAngle;
	}-*/;

	/**
	 * Axis start angle. Valid values are from - 180 to 180.
	 */
	public final native void setStartAngle( double startAngle ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.startAngle = startAngle;
	}-*/;

	/**
	 * Axis start (min) value.
	 */
	public final native double getStartValue() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.startValue;
	}-*/;

	/**
	 * Axis start (min) value.
	 */
	public final native void setStartValue( double startValue ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.startValue = startValue;
	}-*/;

	/**
	 * Opacity of axis ticks.
	 */
	public final native double getTickAlpha() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.tickAlpha;
	}-*/;

	/**
	 * Opacity of axis ticks.
	 */
	public final native void setTickAlpha( double tickAlpha ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.tickAlpha = tickAlpha;
	}-*/;

	/**
	 * Color of axis ticks.
	 */
	public final native String getTickColor() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.tickColor;
	}-*/;

	/**
	 * Color of axis ticks.
	 */
	public final native void setTickColor( String tickColor ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.tickColor = tickColor;
	}-*/;

	/**
	 * Length of a major tick.
	 */
	public final native double getTickLength() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.tickLength;
	}-*/;

	/**
	 * Length of a major tick.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.tickLength = tickLength;
	}-*/;

	/**
	 * Tick thickness.
	 */
	public final native double getTickThickness() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.tickThickness;
	}-*/;

	/**
	 * Tick thickness.
	 */
	public final native void setTickThickness( double tickThickness ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.tickThickness = tickThickness;
	}-*/;

	/**
	 * Text displayed above the axis center.
	 */
	public final native String getTopText() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.topText;
	}-*/;

	/**
	 * Text displayed above the axis center.
	 */
	public final native void setTopText( String topText ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.topText = topText;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native boolean isTopTextBold() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.topTextBold;
	}-*/;

	/**
	 * Specifies if text should be bold.
	 */
	public final native void setTopTextBold( boolean topTextBold ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.topTextBold = topTextBold;
	}-*/;

	/**
	 * Color of top text.
	 */
	public final native String getTopTextColor() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.topTextColor;
	}-*/;

	/**
	 * Color of top text.
	 */
	public final native void setTopTextColor( String topTextColor ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.topTextColor = topTextColor;
	}-*/;

	/**
	 * Font size of top text.
	 */
	public final native double getTopTextFontSize() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.topTextFontSize;
	}-*/;

	/**
	 * Font size of top text.
	 */
	public final native void setTopTextFontSize( double topTextFontSize ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.topTextFontSize = topTextFontSize;
	}-*/;

	/**
	 * Y offset of top text.
	 */
	public final native double getTopTextYOffset() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.topTextYOffset;
	}-*/;

	/**
	 * Y offset of top text.
	 */
	public final native void setTopTextYOffset( double topTextYOffset ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.topTextYOffset = topTextYOffset;
	}-*/;

	/**
	 * A string which can be placed next to axis labels.
	 */
	public final native String getUnit() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.unit;
	}-*/;

	/**
	 * A string which can be placed next to axis labels.
	 */
	public final native void setUnit( String unit ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.unit = unit;
	}-*/;

	/**
	 * Position of the unit.
	 */
	public final native String getUnitPosition() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.unitPosition;
	}-*/;

	/**
	 * Position of the unit.
	 */
	public final native void setUnitPosition( String unitPosition ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.unitPosition = unitPosition;
	}-*/;

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public final native boolean isUsePrefixes() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.usePrefixes;
	}-*/;

	/**
	 * Specifies if small and big numbers should use prefixes to make them more readable.
	 */
	public final native void setUsePrefixes( boolean usePrefixes ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.usePrefixes = usePrefixes;
	}-*/;

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public final native double getValueInterval() /*-{
		return this.@com.amcharts.impl.GaugeAxis::jso.valueInterval;
	}-*/;

	/**
	 * "Interval, at which ticks with values should be placed."
	 */
	public final native void setValueInterval( double valueInterval ) /*-{
		this.@com.amcharts.impl.GaugeAxis::jso.valueInterval = valueInterval;
	}-*/;
	
	/**
	 * Sets bottom text.
	 */
//	public native void setBottomText(String text)
//	/*-{
//		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
//		gaugeAxis.setBottomText(text);
//	}-*/;
	
	/**
	 * 	Sets top text.
	 */
//	public native void setTopText(String text)
//	/*-{
//		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
//		gaugeAxis.setTopText(text);
//	}-*/;	
	
	/**
	 * Returns angle of the value.
	 */
	public native double value2angle(double value)
	/*-{
		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return gaugeAxis.value2angle(value);
	}-*/;
}
