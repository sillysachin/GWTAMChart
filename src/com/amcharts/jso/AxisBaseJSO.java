package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAxisBase;
import com.amcharts.api.IsGuide;
import com.google.gwt.core.client.JavaScriptObject;

public class AxisBaseJSO extends JavaScriptObject implements IsAxisBase
{
	protected AxisBaseJSO()
	{
	}

	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public final native Boolean isAutoGridCount() /*-{
		return autoGridCount;
	}-*/;

	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public final native void setAutoGridCount( Boolean autoGridCount ) /*-{
		this.autoGridCount = autoGridCount;
	}-*/;

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public final native double getAxisAlpha() /*-{
		return axisAlpha;
	}-*/;

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public final native void setAxisAlpha( double axisAlpha ) /*-{
		this.axisAlpha = axisAlpha;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native String getAxisColor() /*-{
		return axisColor;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native void setAxisColor( String axisColor ) /*-{
		this.axisColor = axisColor;
	}-*/;

	/**
	 * Thickness of the axis.
	 */
	public final native double getAxisThickness() /*-{
		return axisThickness;
	}-*/;

	/**
	 * Thickness of the axis.
	 */
	public final native void setAxisThickness( double axisThickness ) /*-{
		this.axisThickness = axisThickness;
	}-*/;

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public final native double getAxisX() /*-{
		return axisX;
	}-*/;

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public final native void setAxisX( double axisX ) /*-{
		this.axisX = axisX;
	}-*/;

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public final native double getAxisY() /*-{
		return axisY;
	}-*/;

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public final native void setAxisY( double axisY ) /*-{
		this.axisY = axisY;
	}-*/;

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public final native Boolean isBoldLabels() /*-{
		return boldLabels;
	}-*/;

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public final native void setBoldLabels( Boolean boldLabels ) /*-{
		this.boldLabels = boldLabels;
	}-*/;

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public final native double getDashLength() /*-{
		return dashLength;
	}-*/;

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.dashLength = dashLength;
	}-*/;

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native double getFillAlpha() /*-{
		return fillAlpha;
	}-*/;

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native String getFillColor() /*-{
		return fillColor;
	}-*/;

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.fillColor = fillColor;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native double getFontSize() /*-{
		return fontSize;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Opacity of grid lines.
	 */
	public final native double getGridAlpha() /*-{
		return gridAlpha;
	}-*/;

	/**
	 * Opacity of grid lines.
	 */
	public final native void setGridAlpha( double gridAlpha ) /*-{
		this.gridAlpha = gridAlpha;
	}-*/;

	/**
	 * Color of grid lines.
	 */
	public final native String getGridColor() /*-{
		return gridColor;
	}-*/;

	/**
	 * Color of grid lines.
	 */
	public final native void setGridColor( String gridColor ) /*-{
		this.gridColor = gridColor;
	}-*/;

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public final native double getGridCount() /*-{
		return gridCount;
	}-*/;

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.gridCount = gridCount;
	}-*/;

	/**
	 * Thickness of grid lines.
	 */
	public final native double getGridThickness() /*-{
		return gridThickness;
	}-*/;

	/**
	 * Thickness of grid lines.
	 */
	public final native void setGridThickness( double gridThickness ) /*-{
		this.gridThickness = gridThickness;
	}-*/;

	/**
	 * The array of guides belonging to this axis.
	 */
	public final native <T extends IsGuide> List<T> getGuides() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.guides);
	}-*/;

	/**
	 * The array of guides belonging to this axis.
	 */
	public final native <T extends IsGuide> void setGuides( List<T> guides ) /*-{
		this.guides = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(guides);
	}-*/;

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public final native Boolean isIgnoreAxisWidth() /*-{
		return ignoreAxisWidth;
	}-*/;

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public final native void setIgnoreAxisWidth( Boolean ignoreAxisWidth ) /*-{
		this.ignoreAxisWidth = ignoreAxisWidth;
	}-*/;

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public final native Boolean isInside() /*-{
		return inside;
	}-*/;

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public final native void setInside( Boolean inside ) /*-{
		this.inside = inside;
	}-*/;

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public final native double getLabelFrequency() /*-{
		return labelFrequency;
	}-*/;

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public final native void setLabelFrequency( double labelFrequency ) /*-{
		this.labelFrequency = labelFrequency;
	}-*/;

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public final native double getLabelOffset() /*-{
		return labelOffset;
	}-*/;

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public final native void setLabelOffset( double labelOffset ) /*-{
		this.labelOffset = labelOffset;
	}-*/;

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public final native double getLabelRotation() /*-{
		return labelRotation;
	}-*/;

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public final native void setLabelRotation( double labelRotation ) /*-{
		this.labelRotation = labelRotation;
	}-*/;

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public final native Boolean isLabelsEnabled() /*-{
		return labelsEnabled;
	}-*/;

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public final native void setLabelsEnabled( Boolean labelsEnabled ) /*-{
		this.labelsEnabled = labelsEnabled;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public final native double getMinHorizontalGap() /*-{
		return minHorizontalGap;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public final native void setMinHorizontalGap( double minHorizontalGap ) /*-{
		this.minHorizontalGap = minHorizontalGap;
	}-*/;

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public final native double getMinorGridAlpha() /*-{
		return minorGridAlpha;
	}-*/;

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public final native void setMinorGridAlpha( double minorGridAlpha ) /*-{
		this.minorGridAlpha = minorGridAlpha;
	}-*/;

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public final native Boolean isMinorGridEnabled() /*-{
		return minorGridEnabled;
	}-*/;

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public final native void setMinorGridEnabled( Boolean minorGridEnabled ) /*-{
		this.minorGridEnabled = minorGridEnabled;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public final native double getMinVerticalGap() /*-{
		return minVerticalGap;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public final native void setMinVerticalGap( double minVerticalGap ) /*-{
		this.minVerticalGap = minVerticalGap;
	}-*/;

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public final native double getOffset() /*-{
		return offset;
	}-*/;

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public final native void setOffset( double offset ) /*-{
		this.offset = offset;
	}-*/;

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public final native String getPosition() /*-{
		return position;
	}-*/;

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public final native void setPosition( String position ) /*-{
		this.position = position;
	}-*/;

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public final native Boolean isShowFirstLabel() /*-{
		return showFirstLabel;
	}-*/;

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public final native void setShowFirstLabel( Boolean showFirstLabel ) /*-{
		this.showFirstLabel = showFirstLabel;
	}-*/;

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public final native Boolean isShowLastLabel() /*-{
		return showLastLabel;
	}-*/;

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public final native void setShowLastLabel( Boolean showLastLabel ) /*-{
		this.showLastLabel = showLastLabel;
	}-*/;

	/**
	 * Length of the tick marks.
	 */
	public final native double getTickLength() /*-{
		return tickLength;
	}-*/;

	/**
	 * Length of the tick marks.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.tickLength = tickLength;
	}-*/;

	/**
	 * Title of the axis.
	 */
	public final native String getTitle() /*-{
		return title;
	}-*/;

	/**
	 * Title of the axis.
	 */
	public final native void setTitle( String title ) /*-{
		this.title = title;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native Boolean isTitleBold() /*-{
		return titleBold;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native void setTitleBold( Boolean titleBold ) /*-{
		this.titleBold = titleBold;
	}-*/;

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public final native String getTitleColor() /*-{
		return titleColor;
	}-*/;

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public final native void setTitleColor( String titleColor ) /*-{
		this.titleColor = titleColor;
	}-*/;

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public final native double getTitleFontSize() /*-{
		return titleFontSize;
	}-*/;

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public final native void setTitleFontSize( double titleFontSize ) /*-{
		this.titleFontSize = titleFontSize;
	}-*/;
}
