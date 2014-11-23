package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsAmLegendData;
import com.amcharts.api.IsFunction;

public final class AmLegend implements IsAmLegend
{
	private String align;

	private boolean autoMargins;

	private double backgroundAlpha;

	private String backgroundColor;

	private double borderAlpha;

	private String borderColor;

	private double bottom;

	private String color;

	private List< ? extends IsAmLegendData> data;

	private String divId;

	private boolean equalWidths;

	private double fontSize;

	private double horizontalGap;

	private String labelText;

	private double labelWidth;

	private double left;

	private double marginBottom;

	private double marginLeft;

	private double marginRight;

	private double marginTop;

	private double markerBorderAlpha;

	private String markerBorderColor;

	private double markerBorderThickness;

	private String markerDisabledColor;

	private double markerLabelGap;

	private double markerSize;

	private String markerType;

	private double maxColumns;

	private String periodValueText;

	private String position;

	private boolean reversedOrder;

	private double right;

	private String rollOverColor;

	private double rollOverGraphAlpha;

	private boolean showEntries;

	private double spacing;

	private boolean switchable;

	private String switchColor;

	private String switchType;

	private boolean textClickEnabled;

	private double top;

	private boolean useGraphSettings;

	private boolean useMarkerColorForLabels;

	private boolean useMarkerColorForValues;

	private String valueAlign;

	private IsFunction valueFunction;

	private String valueText;

	private double valueWidth;

	private double verticalGap;

	private double width;

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public String getAlign()
	{
		return align;
	}

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public void setAlign( String align )
	{
		this.align = align;
	}

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public boolean isAutoMargins()
	{
		return autoMargins;
	}

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public void setAutoMargins( boolean autoMargins )
	{
		this.autoMargins = autoMargins;
	}

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public double getBackgroundAlpha()
	{
		return backgroundAlpha;
	}

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public void setBackgroundAlpha( double backgroundAlpha )
	{
		this.backgroundAlpha = backgroundAlpha;
	}

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public void setBackgroundColor( String backgroundColor )
	{
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public double getBorderAlpha()
	{
		return borderAlpha;
	}

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public void setBorderAlpha( double borderAlpha )
	{
		this.borderAlpha = borderAlpha;
	}

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public String getBorderColor()
	{
		return borderColor;
	}

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public void setBorderColor( String borderColor )
	{
		this.borderColor = borderColor;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public double getBottom()
	{
		return bottom;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public void setBottom( double bottom )
	{
		this.bottom = bottom;
	}

	/**
	 * Text color.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Text color.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public <T extends IsAmLegendData> List<T> getData()
	{
		return ( List<T> ) data;
	}

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public <T extends IsAmLegendData> void setData( List<T> data )
	{
		this.data = data;
	}

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public String getDivId()
	{
		return divId;
	}

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public void setDivId( String divId )
	{
		this.divId = divId;
	}

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public boolean isEqualWidths()
	{
		return equalWidths;
	}

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public void setEqualWidths( boolean equalWidths )
	{
		this.equalWidths = equalWidths;
	}

	/**
	 * Font size.
	 */
	public double getFontSize()
	{
		return fontSize;
	}

	/**
	 * Font size.
	 */
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public double getHorizontalGap()
	{
		return horizontalGap;
	}

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public void setHorizontalGap( double horizontalGap )
	{
		this.horizontalGap = horizontalGap;
	}

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public String getLabelText()
	{
		return labelText;
	}

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public void setLabelText( String labelText )
	{
		this.labelText = labelText;
	}

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public double getLabelWidth()
	{
		return labelWidth;
	}

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public void setLabelWidth( double labelWidth )
	{
		this.labelWidth = labelWidth;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public double getLeft()
	{
		return left;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public void setLeft( double left )
	{
		this.left = left;
	}

	/**
	 * Bottom margin.
	 */
	public double getMarginBottom()
	{
		return marginBottom;
	}

	/**
	 * Bottom margin.
	 */
	public void setMarginBottom( double marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public double getMarginLeft()
	{
		return marginLeft;
	}

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public void setMarginLeft( double marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public double getMarginRight()
	{
		return marginRight;
	}

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public void setMarginRight( double marginRight )
	{
		this.marginRight = marginRight;
	}

	/**
	 * Top margin.
	 */
	public double getMarginTop()
	{
		return marginTop;
	}

	/**
	 * Top margin.
	 */
	public void setMarginTop( double marginTop )
	{
		this.marginTop = marginTop;
	}

	/**
	 * Marker border opacity.
	 */
	public double getMarkerBorderAlpha()
	{
		return markerBorderAlpha;
	}

	/**
	 * Marker border opacity.
	 */
	public void setMarkerBorderAlpha( double markerBorderAlpha )
	{
		this.markerBorderAlpha = markerBorderAlpha;
	}

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public String getMarkerBorderColor()
	{
		return markerBorderColor;
	}

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public void setMarkerBorderColor( String markerBorderColor )
	{
		this.markerBorderColor = markerBorderColor;
	}

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public double getMarkerBorderThickness()
	{
		return markerBorderThickness;
	}

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public void setMarkerBorderThickness( double markerBorderThickness )
	{
		this.markerBorderThickness = markerBorderThickness;
	}

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public String getMarkerDisabledColor()
	{
		return markerDisabledColor;
	}

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public void setMarkerDisabledColor( String markerDisabledColor )
	{
		this.markerDisabledColor = markerDisabledColor;
	}

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public double getMarkerLabelGap()
	{
		return markerLabelGap;
	}

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public void setMarkerLabelGap( double markerLabelGap )
	{
		this.markerLabelGap = markerLabelGap;
	}

	/**
	 * Size of the legend marker (key).
	 */
	public double getMarkerSize()
	{
		return markerSize;
	}

	/**
	 * Size of the legend marker (key).
	 */
	public void setMarkerSize( double markerSize )
	{
		this.markerSize = markerSize;
	}

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public String getMarkerType()
	{
		return markerType;
	}

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public void setMarkerType( String markerType )
	{
		this.markerType = markerType;
	}

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public double getMaxColumns()
	{
		return maxColumns;
	}

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public void setMaxColumns( double maxColumns )
	{
		this.maxColumns = maxColumns;
	}

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public String getPeriodValueText()
	{
		return periodValueText;
	}

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public void setPeriodValueText( String periodValueText )
	{
		this.periodValueText = periodValueText;
	}

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public void setPosition( String position )
	{
		this.position = position;
	}

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public boolean isReversedOrder()
	{
		return reversedOrder;
	}

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public void setReversedOrder( boolean reversedOrder )
	{
		this.reversedOrder = reversedOrder;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public double getRight()
	{
		return right;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public void setRight( double right )
	{
		this.right = right;
	}

	/**
	 * Legend item text color on roll-over.
	 */
	public String getRollOverColor()
	{
		return rollOverColor;
	}

	/**
	 * Legend item text color on roll-over.
	 */
	public void setRollOverColor( String rollOverColor )
	{
		this.rollOverColor = rollOverColor;
	}

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public double getRollOverGraphAlpha()
	{
		return rollOverGraphAlpha;
	}

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public void setRollOverGraphAlpha( double rollOverGraphAlpha )
	{
		this.rollOverGraphAlpha = rollOverGraphAlpha;
	}

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public boolean isShowEntries()
	{
		return showEntries;
	}

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public void setShowEntries( boolean showEntries )
	{
		this.showEntries = showEntries;
	}

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public double getSpacing()
	{
		return spacing;
	}

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public void setSpacing( double spacing )
	{
		this.spacing = spacing;
	}

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public boolean isSwitchable()
	{
		return switchable;
	}

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public void setSwitchable( boolean switchable )
	{
		this.switchable = switchable;
	}

	/**
	 * Legend switch color.
	 */
	public String getSwitchColor()
	{
		return switchColor;
	}

	/**
	 * Legend switch color.
	 */
	public void setSwitchColor( String switchColor )
	{
		this.switchColor = switchColor;
	}

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public String getSwitchType()
	{
		return switchType;
	}

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public void setSwitchType( String switchType )
	{
		this.switchType = switchType;
	}

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public boolean isTextClickEnabled()
	{
		return textClickEnabled;
	}

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public void setTextClickEnabled( boolean textClickEnabled )
	{
		this.textClickEnabled = textClickEnabled;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public double getTop()
	{
		return top;
	}

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public void setTop( double top )
	{
		this.top = top;
	}

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public boolean isUseGraphSettings()
	{
		return useGraphSettings;
	}

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public void setUseGraphSettings( boolean useGraphSettings )
	{
		this.useGraphSettings = useGraphSettings;
	}

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public boolean isUseMarkerColorForLabels()
	{
		return useMarkerColorForLabels;
	}

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public void setUseMarkerColorForLabels( boolean useMarkerColorForLabels )
	{
		this.useMarkerColorForLabels = useMarkerColorForLabels;
	}

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public boolean isUseMarkerColorForValues()
	{
		return useMarkerColorForValues;
	}

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public void setUseMarkerColorForValues( boolean useMarkerColorForValues )
	{
		this.useMarkerColorForValues = useMarkerColorForValues;
	}

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public String getValueAlign()
	{
		return valueAlign;
	}

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public void setValueAlign( String valueAlign )
	{
		this.valueAlign = valueAlign;
	}

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public IsFunction getValueFunction()
	{
		return valueFunction;
	}

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public void setValueFunction( IsFunction valueFunction )
	{
		this.valueFunction = valueFunction;
	}

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public String getValueText()
	{
		return valueText;
	}

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public void setValueText( String valueText )
	{
		this.valueText = valueText;
	}

	/**
	 * Width of the value text.
	 */
	public double getValueWidth()
	{
		return valueWidth;
	}

	/**
	 * Width of the value text.
	 */
	public void setValueWidth( double valueWidth )
	{
		this.valueWidth = valueWidth;
	}

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public double getVerticalGap()
	{
		return verticalGap;
	}

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public void setVerticalGap( double verticalGap )
	{
		this.verticalGap = verticalGap;
	}

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public void setWidth( double width )
	{
		this.width = width;
	}
}