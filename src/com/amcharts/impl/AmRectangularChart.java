package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmRectangularChart;
import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.api.IsTrendLine;
import com.amcharts.jso.AmRectangularChartJSO;

public class AmRectangularChart extends AmCoordinateChart implements IsAmRectangularChart
{
	protected AmRectangularChart()
	{
	}

	public AmRectangularChartJSO getJso()
	{
		return ( AmRectangularChartJSO ) this.jso;
	}

	public void setJso( AmRectangularChartJSO jso )
	{
		this.jso = jso;
	}

	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public final double getAngle()
	{
		return getJso().getAngle();
	}

	/**
	 * The angle of the 3D part of plot area. This creates a 3D effect (if the 'depth3D' is > 0).
	 */
	public final void setAngle( double angle )
	{
		getJso().setAngle( angle );
	}

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public final double getAutoMarginOffset()
	{
		return getJso().getAutoMarginOffset();
	}

	/**
	 * "Space left from axis labels/title to the chart's outside border, if autoMargins set to true."
	 */
	public final void setAutoMarginOffset( double autoMarginOffset )
	{
		getJso().setAutoMarginOffset( autoMarginOffset );
	}

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public final boolean isAutoMargins()
	{
		return getJso().isAutoMargins();
	}

	/**
	 * "Specifies if margins of a chart should be calculated automatically so that labels of axes would fit. The chart will adjust only margins with axes. Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties."
	 */
	public final void setAutoMargins( boolean autoMargins )
	{
		getJso().setAutoMargins( autoMargins );
	}

	/**
	 * Cursor of a chart.
	 */
	public final IsChartCursor getChartCursor()
	{
		return getJso().getChartCursor();
	}

	/**
	 * Cursor of a chart.
	 */
	public final void setChartCursor( IsChartCursor chartCursor )
	{
		getJso().setChartCursor( chartCursor );
	}

	/**
	 * Chart's scrollbar.
	 */
	public final IsChartScrollbar getChartScrollbar()
	{
		return getJso().getChartScrollbar();
	}

	/**
	 * Chart's scrollbar.
	 */
	public final void setChartScrollbar( IsChartScrollbar chartScrollbar )
	{
		getJso().setChartScrollbar( chartScrollbar );
	}

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public final double getDepth3D()
	{
		return getJso().getDepth3D();
	}

	/**
	 * The depth of the 3D part of plot area. This creates a 3D effect (if the 'angle' is > 0).
	 */
	public final void setDepth3D( double depth3D )
	{
		getJso().setDepth3D( depth3D );
	}

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public final double getMarginBottom()
	{
		return getJso().getMarginBottom();
	}

	/**
	 * "Number of pixels between the container's bottom border and plot area. This space can be used for bottom axis' values. If autoMargin is true and bottom side has axis, this property is ignored."
	 */
	public final void setMarginBottom( double marginBottom )
	{
		getJso().setMarginBottom( marginBottom );
	}

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public final double getMarginLeft()
	{
		return getJso().getMarginLeft();
	}

	/**
	 * "Number of pixels between the container's left border and plot area. This space can be used for left axis' values. If autoMargin is true and left side has axis, this property is ignored."
	 */
	public final void setMarginLeft( double marginLeft )
	{
		getJso().setMarginLeft( marginLeft );
	}

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public final double getMarginRight()
	{
		return getJso().getMarginRight();
	}

	/**
	 * "Number of pixels between the container's right border and plot area. This space can be used for Right axis' values. If autoMargin is true and right side has axis, this property is ignored."
	 */
	public final void setMarginRight( double marginRight )
	{
		getJso().setMarginRight( marginRight );
	}

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public final boolean isMarginsUpdated()
	{
		return getJso().isMarginsUpdated();
	}

	/**
	 * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
	 */
	public final void setMarginsUpdated( boolean marginsUpdated )
	{
		getJso().setMarginsUpdated( marginsUpdated );
	}

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public final double getMarginTop()
	{
		return getJso().getMarginTop();
	}

	/**
	 * "Number of pixels between the container's top border and plot area. This space can be used for top axis' values. If autoMargin is true and top side has axis, this property is ignored."
	 */
	public final void setMarginTop( double marginTop )
	{
		getJso().setMarginTop( marginTop );
	}

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public final double getPlotAreaBorderAlpha()
	{
		return getJso().getPlotAreaBorderAlpha();
	}

	/**
	 * The opacity of plot area's border. Value range is 0 - 1.
	 */
	public final void setPlotAreaBorderAlpha( double plotAreaBorderAlpha )
	{
		getJso().setPlotAreaBorderAlpha( plotAreaBorderAlpha );
	}

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public final String getPlotAreaBorderColor()
	{
		return getJso().getPlotAreaBorderColor();
	}

	/**
	 * "The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0. Set it to a value higher than 0 to make it visible."
	 */
	public final void setPlotAreaBorderColor( String plotAreaBorderColor )
	{
		getJso().setPlotAreaBorderColor( plotAreaBorderColor );
	}

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final double getPlotAreaFillAlphas()
	{
		return getJso().getPlotAreaFillAlphas();
	}

	/**
	 * "Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final void setPlotAreaFillAlphas( double plotAreaFillAlphas )
	{
		getJso().setPlotAreaFillAlphas( plotAreaFillAlphas );
	}

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public final String getPlotAreaFillColors()
	{
		return getJso().getPlotAreaFillColors();
	}

	/**
	 * "You can set both one color if you need a solid color or array of colors to generate gradients, for example: ['#000000', '#0000CC']"
	 */
	public final void setPlotAreaFillColors( String plotAreaFillColors )
	{
		getJso().setPlotAreaFillColors( plotAreaFillColors );
	}

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public final double getPlotAreaGradientAngle()
	{
		return getJso().getPlotAreaGradientAngle();
	}

	/**
	 * "If you are using gradients to fill the plot area, you can use this property to set gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180, 270."
	 */
	public final void setPlotAreaGradientAngle( double plotAreaGradientAngle )
	{
		getJso().setPlotAreaGradientAngle( plotAreaGradientAngle );
	}

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public final List<IsTrendLine> getTrendLines()
	{
		return getJso().getTrendLines();
	}

	/**
	 * Array of trend lines added to a chart. You can add trend lines to a chart using this array or access already existing trend lines
	 */
	public final void setTrendLines( List<IsTrendLine> trendLines )
	{
		getJso().setTrendLines( trendLines );
	}

	/**
	 * Opacity of zoom-out button background.
	 */
	public final double getZoomOutButtonAlpha()
	{
		return getJso().getZoomOutButtonAlpha();
	}

	/**
	 * Opacity of zoom-out button background.
	 */
	public final void setZoomOutButtonAlpha( double zoomOutButtonAlpha )
	{
		getJso().setZoomOutButtonAlpha( zoomOutButtonAlpha );
	}

	/**
	 * Zoom-out button background color.
	 */
	public final String getZoomOutButtonColor()
	{
		return getJso().getZoomOutButtonColor();
	}

	/**
	 * Zoom-out button background color.
	 */
	public final void setZoomOutButtonColor( String zoomOutButtonColor )
	{
		getJso().setZoomOutButtonColor( zoomOutButtonColor );
	}

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public final String getZoomOutButtonImage()
	{
		return getJso().getZoomOutButtonImage();
	}

	/**
	 * "Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png. You might want to have white lens when background is dark. Or you can simply use your own image."
	 */
	public final void setZoomOutButtonImage( String zoomOutButtonImage )
	{
		getJso().setZoomOutButtonImage( zoomOutButtonImage );
	}

	/**
	 * Size of zoom-out button image
	 */
	public final double getZoomOutButtonImageSize()
	{
		return getJso().getZoomOutButtonImageSize();
	}

	/**
	 * Size of zoom-out button image
	 */
	public final void setZoomOutButtonImageSize( double zoomOutButtonImageSize )
	{
		getJso().setZoomOutButtonImageSize( zoomOutButtonImageSize );
	}

	/**
	 * Padding around the text and image.
	 */
	public final double getZoomOutButtonPadding()
	{
		return getJso().getZoomOutButtonPadding();
	}

	/**
	 * Padding around the text and image.
	 */
	public final void setZoomOutButtonPadding( double zoomOutButtonPadding )
	{
		getJso().setZoomOutButtonPadding( zoomOutButtonPadding );
	}

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public final double getZoomOutButtonRollOverAlpha()
	{
		return getJso().getZoomOutButtonRollOverAlpha();
	}

	/**
	 * Opacity of zoom-out button background when mouse is over it.
	 */
	public final void setZoomOutButtonRollOverAlpha( double zoomOutButtonRollOverAlpha )
	{
		getJso().setZoomOutButtonRollOverAlpha( zoomOutButtonRollOverAlpha );
	}

	/**
	 * Text in the zoom-out button.
	 */
	public final String getZoomOutText()
	{
		return getJso().getZoomOutText();
	}

	/**
	 * Text in the zoom-out button.
	 */
	public final void setZoomOutText( String zoomOutText )
	{
		getJso().setZoomOutText( zoomOutText );
	}

	public native void addChartCursor( IsChartCursor chartCursor )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var varChartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartCursor)
		chart.addChartCursor(varChartCursor);
	}-*/;

	public native void removeChartCursor()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.removeChartCursor();
	}-*/;

	public native void addChartScrollbar( IsChartScrollbar chartScrollbar )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var varChartScrollbar = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartScrollbar)
		chart.addChartScrollbar(varChartScrollbar);
	}-*/;

	public native void removeChartScrollbar()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.removeChartScrollbar();
	}-*/;

	public native void addTrendLine( IsTrendLine trendLine )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var varTrendLine = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(trendLine)
		chart.addTrendLine(varTrendLine);
	}-*/;

	public native void removeTrendLine( IsTrendLine trendLine )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var varTrendLine = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(trendLine)
		chart.removeTrendLine(varTrendLine);
	}-*/;
}