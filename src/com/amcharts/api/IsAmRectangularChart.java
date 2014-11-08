package com.amcharts.api;

import java.util.List;

public interface IsAmRectangularChart
{
	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public double getAngle();

	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public void setAngle( double angle );

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public double getAutoMarginOffset();

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public void setAutoMarginOffset( double autoMarginOffset );

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public boolean isAutoMargins();

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public void setAutoMargins( boolean autoMargins );

	/**
	 * Cursor of a chart.
	 */
	public IsChartCursor getChartCursor();

	/**
	 * Cursor of a chart.
	 */
	public void setChartCursor( IsChartCursor chartCursor );

	/**
	 * Chart's scrollbar.
	 */
	public IsChartScrollbar getChartScrollbar();

	/**
	 * Chart's scrollbar.
	 */
	public void setChartScrollbar( IsChartScrollbar chartScrollbar );

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public double getDepth3D();

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public void setDepth3D( double depth3D );

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public double getMarginBottom();

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public void setMarginBottom( double marginBottom );

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public double getMarginLeft();

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public void setMarginLeft( double marginLeft );

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public double getMarginRight();

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public void setMarginRight( double marginRight );

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public boolean isMarginsUpdated();

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public void setMarginsUpdated( boolean marginsUpdated );

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public double getMarginTop();

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public void setMarginTop( double marginTop );

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public double getPlotAreaBorderAlpha();

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public void setPlotAreaBorderAlpha( double plotAreaBorderAlpha );

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public String getPlotAreaBorderColor();

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public void setPlotAreaBorderColor( String plotAreaBorderColor );

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public double getPlotAreaFillAlphas();

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public void setPlotAreaFillAlphas( double plotAreaFillAlphas );

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public String getPlotAreaFillColors();

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public void setPlotAreaFillColors( String plotAreaFillColors );

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public double getPlotAreaGradientAngle();

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public void setPlotAreaGradientAngle( double plotAreaGradientAngle );

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public List<IsTrendLine> getTrendLines();

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public void setTrendLines( List<IsTrendLine> trendLines );

	/**
	 * Opacity of zoom-out button background.
	 */
	public double getZoomOutButtonAlpha();

	/**
	 * Opacity of zoom-out button background.
	 */
	public void setZoomOutButtonAlpha( double zoomOutButtonAlpha );

	/**
	 * Zoom-out button background color.
	 */
	public String getZoomOutButtonColor();

	/**
	 * Zoom-out button background color.
	 */
	public void setZoomOutButtonColor( String zoomOutButtonColor );

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public String getZoomOutButtonImage();

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public void setZoomOutButtonImage( String zoomOutButtonImage );

	/**
	 * Size of zoom-out button image
	 */
	public double getZoomOutButtonImageSize();

	/**
	 * Size of zoom-out button image
	 */
	public void setZoomOutButtonImageSize( double zoomOutButtonImageSize );

	/**
	 * Padding around the text and image.
	 */
	public double getZoomOutButtonPadding();

	/**
	 * Padding around the text and image.
	 */
	public void setZoomOutButtonPadding( double zoomOutButtonPadding );

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public double getZoomOutButtonRollOverAlpha();

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public void setZoomOutButtonRollOverAlpha( double zoomOutButtonRollOverAlpha );

	/**
	 * Text in the zoom-out button.
	 */
	public String getZoomOutText();

	/**
	 * Text in the zoom-out button.
	 */
	public void setZoomOutText( String zoomOutText );
}
