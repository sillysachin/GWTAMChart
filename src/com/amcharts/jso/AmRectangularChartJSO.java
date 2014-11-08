package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmRectangularChart;
import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.api.IsTrendLine;

public class AmRectangularChartJSO extends AmCoordinateChartJSO implements IsAmRectangularChart
{
	protected AmRectangularChartJSO()
	{
	}

	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public native final double getAngle() /*-{
		return angle;
	}-*/;

	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public native final void setAngle( double angle ) /*-{
		this.angle = angle;
	}-*/;

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public final native double getAutoMarginOffset() /*-{
		return autoMarginOffset;
	}-*/;

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public final native void setAutoMarginOffset( double autoMarginOffset ) /*-{
		this.autoMarginOffset = autoMarginOffset;
	}-*/;

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public final native boolean isAutoMargins() /*-{
		return autoMargins;
	}-*/;

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public final native void setAutoMargins( boolean autoMargins ) /*-{
		this.autoMargins = autoMargins;
	}-*/;

	/**
	 * Cursor of a chart.
	 */
	public final native IsChartCursor getChartCursor() /*-{
		return chartCursor;
	}-*/;

	/**
	 * Cursor of a chart.
	 */
	public final native void setChartCursor( IsChartCursor chartCursor ) /*-{
		this.chartCursor = chartCursor;
	}-*/;

	/**
	 * Chart's scrollbar.
	 */
	public final native IsChartScrollbar getChartScrollbar() /*-{
		return chartScrollbar;
	}-*/;

	/**
	 * Chart's scrollbar.
	 */
	public final native void setChartScrollbar( IsChartScrollbar chartScrollbar ) /*-{
		this.chartScrollbar = chartScrollbar;
	}-*/;

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public final native double getDepth3D() /*-{
		return depth3D;
	}-*/;

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public final native void setDepth3D( double depth3D ) /*-{
		this.depth3D = depth3D;
	}-*/;

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public final native double getMarginBottom() /*-{
		return marginBottom;
	}-*/;

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public final native void setMarginBottom( double marginBottom ) /*-{
		this.marginBottom = marginBottom;
	}-*/;

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public final native double getMarginLeft() /*-{
		return marginLeft;
	}-*/;

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public final native void setMarginLeft( double marginLeft ) /*-{
		this.marginLeft = marginLeft;
	}-*/;

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public final native double getMarginRight() /*-{
		return marginRight;
	}-*/;

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public final native void setMarginRight( double marginRight ) /*-{
		this.marginRight = marginRight;
	}-*/;

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public final native boolean isMarginsUpdated() /*-{
		return marginsUpdated;
	}-*/;

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public final native void setMarginsUpdated( boolean marginsUpdated ) /*-{
		this.marginsUpdated = marginsUpdated;
	}-*/;

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public final native double getMarginTop() /*-{
		return marginTop;
	}-*/;

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public final native void setMarginTop( double marginTop ) /*-{
		this.marginTop = marginTop;
	}-*/;

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public final native double getPlotAreaBorderAlpha() /*-{
		return plotAreaBorderAlpha;
	}-*/;

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public final native void setPlotAreaBorderAlpha( double plotAreaBorderAlpha ) /*-{
		this.plotAreaBorderAlpha = plotAreaBorderAlpha;
	}-*/;

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public final native String getPlotAreaBorderColor() /*-{
		return plotAreaBorderColor;
	}-*/;

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public final native void setPlotAreaBorderColor( String plotAreaBorderColor ) /*-{
		this.plotAreaBorderColor = plotAreaBorderColor;
	}-*/;

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final native double getPlotAreaFillAlphas() /*-{
		return plotAreaFillAlphas;
	}-*/;

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final native void setPlotAreaFillAlphas( double plotAreaFillAlphas ) /*-{
		this.plotAreaFillAlphas = plotAreaFillAlphas;
	}-*/;

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public final native String getPlotAreaFillColors() /*-{
		return plotAreaFillColors;
	}-*/;

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public final native void setPlotAreaFillColors( String plotAreaFillColors ) /*-{
		this.plotAreaFillColors = plotAreaFillColors;
	}-*/;

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public final native double getPlotAreaGradientAngle() /*-{
		return plotAreaGradientAngle;
	}-*/;

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public final native void setPlotAreaGradientAngle( double plotAreaGradientAngle ) /*-{
		this.plotAreaGradientAngle = plotAreaGradientAngle;
	}-*/;

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public final native List<IsTrendLine> getTrendLines() /*-{
		return trendLines;
	}-*/;

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public final native void setTrendLines( List<IsTrendLine> trendLines ) /*-{
		this.trendLines = trendLines;
	}-*/;

	/**
	 * Opacity of zoom-out button background.
	 */
	public final native double getZoomOutButtonAlpha() /*-{
		return zoomOutButtonAlpha;
	}-*/;

	/**
	 * Opacity of zoom-out button background.
	 */
	public final native void setZoomOutButtonAlpha( double zoomOutButtonAlpha ) /*-{
		this.zoomOutButtonAlpha = zoomOutButtonAlpha;
	}-*/;

	/**
	 * Zoom-out button background color.
	 */
	public final native String getZoomOutButtonColor() /*-{
		return zoomOutButtonColor;
	}-*/;

	/**
	 * Zoom-out button background color.
	 */
	public final native void setZoomOutButtonColor( String zoomOutButtonColor ) /*-{
		this.zoomOutButtonColor = zoomOutButtonColor;
	}-*/;

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public final native String getZoomOutButtonImage() /*-{
		return zoomOutButtonImage;
	}-*/;

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public final native void setZoomOutButtonImage( String zoomOutButtonImage ) /*-{
		this.zoomOutButtonImage = zoomOutButtonImage;
	}-*/;

	/**
	 * Size of zoom-out button image
	 */
	public final native double getZoomOutButtonImageSize() /*-{
		return zoomOutButtonImageSize;
	}-*/;

	/**
	 * Size of zoom-out button image
	 */
	public final native void setZoomOutButtonImageSize( double zoomOutButtonImageSize ) /*-{
		this.zoomOutButtonImageSize = zoomOutButtonImageSize;
	}-*/;

	/**
	 * Padding around the text and image.
	 */
	public final native double getZoomOutButtonPadding() /*-{
		return zoomOutButtonPadding;
	}-*/;

	/**
	 * Padding around the text and image.
	 */
	public final native void setZoomOutButtonPadding( double zoomOutButtonPadding ) /*-{
		this.zoomOutButtonPadding = zoomOutButtonPadding;
	}-*/;

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public final native double getZoomOutButtonRollOverAlpha() /*-{
		return zoomOutButtonRollOverAlpha;
	}-*/;

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public final native void setZoomOutButtonRollOverAlpha( double zoomOutButtonRollOverAlpha ) /*-{
		this.zoomOutButtonRollOverAlpha = zoomOutButtonRollOverAlpha;
	}-*/;

	/**
	 * Text in the zoom-out button.
	 */
	public final native String getZoomOutText() /*-{
		return zoomOutText;
	}-*/;

	/**
	 * Text in the zoom-out button.
	 */
	public final native void setZoomOutText( String zoomOutText ) /*-{
		this.zoomOutText = zoomOutText;
	}-*/;
}