package com.amcharts.api;

import java.util.List;

public interface IsAmLegend
{
	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public String getAlign();

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public void setAlign( String align );

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public boolean isAutoMargins();

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public void setAutoMargins( boolean autoMargins );

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public double getBackgroundAlpha();

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public void setBackgroundAlpha( double backgroundAlpha );

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public String getBackgroundColor();

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public void setBackgroundColor( String backgroundColor );

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public double getBorderAlpha();

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public void setBorderAlpha( double borderAlpha );

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public String getBorderColor();

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public void setBorderColor( String borderColor );

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public double getBottom();

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public void setBottom( double bottom );

	/**
	 * Text color.
	 */
	public String getColor();

	/**
	 * Text color.
	 */
	public void setColor( String color );

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 * @param <T>
	 */
	public <T extends IsAmLegendData> List<T> getData();

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 * @param <T>
	 */
	public <T extends IsAmLegendData> void setData( List<T> data );

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public String getDivId();

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public void setDivId( String divId );

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public boolean isEqualWidths();

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public void setEqualWidths( boolean equalWidths );

	/**
	 * Font size.
	 */
	public double getFontSize();

	/**
	 * Font size.
	 */
	public void setFontSize( double fontSize );

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public double getHorizontalGap();

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public void setHorizontalGap( double horizontalGap );

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public String getLabelText();

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public void setLabelText( String labelText );

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public double getLabelWidth();

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public void setLabelWidth( double labelWidth );

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public double getLeft();

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public void setLeft( double left );

	/**
	 * Bottom margin.
	 */
	public double getMarginBottom();

	/**
	 * Bottom margin.
	 */
	public void setMarginBottom( double marginBottom );

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public double getMarginLeft();

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public void setMarginLeft( double marginLeft );

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public double getMarginRight();

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public void setMarginRight( double marginRight );

	/**
	 * Top margin.
	 */
	public double getMarginTop();

	/**
	 * Top margin.
	 */
	public void setMarginTop( double marginTop );

	/**
	 * Marker border opacity.
	 */
	public double getMarkerBorderAlpha();

	/**
	 * Marker border opacity.
	 */
	public void setMarkerBorderAlpha( double markerBorderAlpha );

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public String getMarkerBorderColor();

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public void setMarkerBorderColor( String markerBorderColor );

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public double getMarkerBorderThickness();

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public void setMarkerBorderThickness( double markerBorderThickness );

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public String getMarkerDisabledColor();

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public void setMarkerDisabledColor( String markerDisabledColor );

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public double getMarkerLabelGap();

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public void setMarkerLabelGap( double markerLabelGap );

	/**
	 * Size of the legend marker (key).
	 */
	public double getMarkerSize();

	/**
	 * Size of the legend marker (key).
	 */
	public void setMarkerSize( double markerSize );

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public String getMarkerType();

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public void setMarkerType( String markerType );

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public double getMaxColumns();

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public void setMaxColumns( double maxColumns );

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public String getPeriodValueText();

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public void setPeriodValueText( String periodValueText );

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public String getPosition();

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public void setPosition( String position );

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public boolean isReversedOrder();

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public void setReversedOrder( boolean reversedOrder );

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public double getRight();

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public void setRight( double right );

	/**
	 * Legend item text color on roll-over.
	 */
	public String getRollOverColor();

	/**
	 * Legend item text color on roll-over.
	 */
	public void setRollOverColor( String rollOverColor );

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public double getRollOverGraphAlpha();

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public void setRollOverGraphAlpha( double rollOverGraphAlpha );

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public boolean isShowEntries();

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public void setShowEntries( boolean showEntries );

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public double getSpacing();

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public void setSpacing( double spacing );

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public boolean isSwitchable();

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public void setSwitchable( boolean switchable );

	/**
	 * Legend switch color.
	 */
	public String getSwitchColor();

	/**
	 * Legend switch color.
	 */
	public void setSwitchColor( String switchColor );

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public String getSwitchType();

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public void setSwitchType( String switchType );

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public boolean isTextClickEnabled();

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public void setTextClickEnabled( boolean textClickEnabled );

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public double getTop();

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public void setTop( double top );

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public boolean isUseGraphSettings();

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public void setUseGraphSettings( boolean useGraphSettings );

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public boolean isUseMarkerColorForLabels();

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public void setUseMarkerColorForLabels( boolean useMarkerColorForLabels );

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public boolean isUseMarkerColorForValues();

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public void setUseMarkerColorForValues( boolean useMarkerColorForValues );

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public String getValueAlign();

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public void setValueAlign( String valueAlign );

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public IsFunction getValueFunction();

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public void setValueFunction( IsFunction valueFunction );

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public String getValueText();

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public void setValueText( String valueText );

	/**
	 * Width of the value text.
	 */
	public double getValueWidth();

	/**
	 * Width of the value text.
	 */
	public void setValueWidth( double valueWidth );

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public double getVerticalGap();

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public void setVerticalGap( double verticalGap );

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public double getWidth();

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public void setWidth( double width );
}
