package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAxisBase;
import com.amcharts.api.IsGuide;

public class AxisBase implements IsAxisBase
{
	private Boolean autoGridCount;

	private double axisAlpha;

	private String axisColor;

	private double axisThickness;

	private double axisX;

	private double axisY;

	private Boolean boldLabels;

	private String color;

	private double dashLength;

	private double fillAlpha;

	private String fillColor;

	private double fontSize;

	private double gridAlpha;

	private String gridColor;

	private double gridCount;

	private double gridThickness;

	private List< ? extends IsGuide> guides;

	private Boolean ignoreAxisWidth;

	private Boolean inside;

	private double labelFrequency;

	private double labelOffset;

	private double labelRotation;

	private Boolean labelsEnabled;

	private double minHorizontalGap;

	private double minorGridAlpha;

	private Boolean minorGridEnabled;

	private double minVerticalGap;

	private double offset;

	private String position;

	private Boolean showFirstLabel;

	private Boolean showLastLabel;

	private double tickLength;

	private String title;

	private Boolean titleBold;

	private String titleColor;

	private double titleFontSize;

	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public Boolean isAutoGridCount()
	{
		return autoGridCount;
	}

	/**
	 * 'Specifies whether number of gridCount is specified automatically, acoarding to the axis size.'
	 */
	public void setAutoGridCount( Boolean autoGridCount )
	{
		this.autoGridCount = autoGridCount;
	}

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public double getAxisAlpha()
	{
		return axisAlpha;
	}

	/**
	 * Axis opacity. Value range is 0 - 1.
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
	 * Thickness of the axis.
	 */
	public double getAxisThickness()
	{
		return axisThickness;
	}

	/**
	 * Thickness of the axis.
	 */
	public void setAxisThickness( double axisThickness )
	{
		this.axisThickness = axisThickness;
	}

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public double getAxisX()
	{
		return axisX;
	}

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public void setAxisX( double axisX )
	{
		this.axisX = axisX;
	}

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public double getAxisY()
	{
		return axisY;
	}

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public void setAxisY( double axisY )
	{
		this.axisY = axisY;
	}

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public Boolean isBoldLabels()
	{
		return boldLabels;
	}

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public void setBoldLabels( Boolean boldLabels )
	{
		this.boldLabels = boldLabels;
	}

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public double getDashLength()
	{
		return dashLength;
	}

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public void setDashLength( double dashLength )
	{
		this.dashLength = dashLength;
	}

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public double getFillAlpha()
	{
		return fillAlpha;
	}

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public void setFillAlpha( double fillAlpha )
	{
		this.fillAlpha = fillAlpha;
	}

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public String getFillColor()
	{
		return fillColor;
	}

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public void setFillColor( String fillColor )
	{
		this.fillColor = fillColor;
	}

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public double getFontSize()
	{
		return fontSize;
	}

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	/**
	 * Opacity of grid lines.
	 */
	public double getGridAlpha()
	{
		return gridAlpha;
	}

	/**
	 * Opacity of grid lines.
	 */
	public void setGridAlpha( double gridAlpha )
	{
		this.gridAlpha = gridAlpha;
	}

	/**
	 * Color of grid lines.
	 */
	public String getGridColor()
	{
		return gridColor;
	}

	/**
	 * Color of grid lines.
	 */
	public void setGridColor( String gridColor )
	{
		this.gridColor = gridColor;
	}

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public double getGridCount()
	{
		return gridCount;
	}

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public void setGridCount( double gridCount )
	{
		this.gridCount = gridCount;
	}

	/**
	 * Thickness of grid lines.
	 */
	public double getGridThickness()
	{
		return gridThickness;
	}

	/**
	 * Thickness of grid lines.
	 */
	public void setGridThickness( double gridThickness )
	{
		this.gridThickness = gridThickness;
	}

	/**
	 * The array of guides belonging to this axis.
	 */
	public List< ? extends IsGuide> getGuides()
	{
		return guides;
	}

	/**
	 * The array of guides belonging to this axis.
	 */
	public void setGuides( List< ? extends IsGuide> guides )
	{
		this.guides = guides;
	}

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public Boolean isIgnoreAxisWidth()
	{
		return ignoreAxisWidth;
	}

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public void setIgnoreAxisWidth( Boolean ignoreAxisWidth )
	{
		this.ignoreAxisWidth = ignoreAxisWidth;
	}

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public Boolean isInside()
	{
		return inside;
	}

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public void setInside( Boolean inside )
	{
		this.inside = inside;
	}

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public double getLabelFrequency()
	{
		return labelFrequency;
	}

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public void setLabelFrequency( double labelFrequency )
	{
		this.labelFrequency = labelFrequency;
	}

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public double getLabelOffset()
	{
		return labelOffset;
	}

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public void setLabelOffset( double labelOffset )
	{
		this.labelOffset = labelOffset;
	}

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public double getLabelRotation()
	{
		return labelRotation;
	}

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public void setLabelRotation( double labelRotation )
	{
		this.labelRotation = labelRotation;
	}

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public Boolean isLabelsEnabled()
	{
		return labelsEnabled;
	}

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public void setLabelsEnabled( Boolean labelsEnabled )
	{
		this.labelsEnabled = labelsEnabled;
	}

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public double getMinHorizontalGap()
	{
		return minHorizontalGap;
	}

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public void setMinHorizontalGap( double minHorizontalGap )
	{
		this.minHorizontalGap = minHorizontalGap;
	}

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public double getMinorGridAlpha()
	{
		return minorGridAlpha;
	}

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public void setMinorGridAlpha( double minorGridAlpha )
	{
		this.minorGridAlpha = minorGridAlpha;
	}

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public Boolean isMinorGridEnabled()
	{
		return minorGridEnabled;
	}

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public void setMinorGridEnabled( Boolean minorGridEnabled )
	{
		this.minorGridEnabled = minorGridEnabled;
	}

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public double getMinVerticalGap()
	{
		return minVerticalGap;
	}

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public void setMinVerticalGap( double minVerticalGap )
	{
		this.minVerticalGap = minVerticalGap;
	}

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public double getOffset()
	{
		return offset;
	}

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public void setOffset( double offset )
	{
		this.offset = offset;
	}

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public void setPosition( String position )
	{
		this.position = position;
	}

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public Boolean isShowFirstLabel()
	{
		return showFirstLabel;
	}

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public void setShowFirstLabel( Boolean showFirstLabel )
	{
		this.showFirstLabel = showFirstLabel;
	}

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public Boolean isShowLastLabel()
	{
		return showLastLabel;
	}

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public void setShowLastLabel( Boolean showLastLabel )
	{
		this.showLastLabel = showLastLabel;
	}

	/**
	 * Length of the tick marks.
	 */
	public double getTickLength()
	{
		return tickLength;
	}

	/**
	 * Length of the tick marks.
	 */
	public void setTickLength( double tickLength )
	{
		this.tickLength = tickLength;
	}

	/**
	 * Title of the axis.
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Title of the axis.
	 */
	public void setTitle( String title )
	{
		this.title = title;
	}

	/**
	 * Specifies if title should be bold or not.
	 */
	public Boolean isTitleBold()
	{
		return titleBold;
	}

	/**
	 * Specifies if title should be bold or not.
	 */
	public void setTitleBold( Boolean titleBold )
	{
		this.titleBold = titleBold;
	}

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public String getTitleColor()
	{
		return titleColor;
	}

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public void setTitleColor( String titleColor )
	{
		this.titleColor = titleColor;
	}

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public double getTitleFontSize()
	{
		return titleFontSize;
	}

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public void setTitleFontSize( double titleFontSize )
	{
		this.titleFontSize = titleFontSize;
	}
}
