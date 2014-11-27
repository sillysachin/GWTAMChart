package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsAmLegendData;
import com.amcharts.api.IsFunction;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmLegendJSO extends JavaScriptObject implements IsAmLegend
{
	protected AmLegendJSO()
	{
	}

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public final native String getAlign() /*-{
		return align;
	}-*/;

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public final native void setAlign( String align ) /*-{
		this.align = align;
	}-*/;

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public final native Boolean isAutoMargins() /*-{
		return autoMargins;
	}-*/;

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public final native void setAutoMargins( Boolean autoMargins ) /*-{
		this.autoMargins = autoMargins;
	}-*/;

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public final native double getBackgroundAlpha() /*-{
		return backgroundAlpha;
	}-*/;

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public final native void setBackgroundAlpha( double backgroundAlpha ) /*-{
		this.backgroundAlpha = backgroundAlpha;
	}-*/;

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public final native String getBackgroundColor() /*-{
		return backgroundColor;
	}-*/;

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public final native double getBorderAlpha() /*-{
		return borderAlpha;
	}-*/;

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public final native String getBorderColor() /*-{
		return borderColor;
	}-*/;

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public final native void setBorderColor( String borderColor ) /*-{
		this.borderColor = borderColor;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public final native double getBottom() /*-{
		return bottom;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public final native void setBottom( double bottom ) /*-{
		this.bottom = bottom;
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public final native <T extends IsAmLegendData> List<T> getData() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.data);
	}-*/;

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public final native <T extends IsAmLegendData> void setData( List<T> data ) /*-{
		this.data = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(data);
	}-*/;

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public final native String getDivId() /*-{
		return divId;
	}-*/;

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public final native void setDivId( String divId ) /*-{
		this.divId = divId;
	}-*/;

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public final native Boolean isEqualWidths() /*-{
		return equalWidths;
	}-*/;

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public final native void setEqualWidths( Boolean equalWidths ) /*-{
		this.equalWidths = equalWidths;
	}-*/;

	/**
	 * Font size.
	 */
	public final native double getFontSize() /*-{
		return fontSize;
	}-*/;

	/**
	 * Font size.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public final native double getHorizontalGap() /*-{
		return horizontalGap;
	}-*/;

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public final native void setHorizontalGap( double horizontalGap ) /*-{
		this.horizontalGap = horizontalGap;
	}-*/;

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public final native String getLabelText() /*-{
		return labelText;
	}-*/;

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public final native void setLabelText( String labelText ) /*-{
		this.labelText = labelText;
	}-*/;

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public final native double getLabelWidth() /*-{
		return labelWidth;
	}-*/;

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public final native void setLabelWidth( double labelWidth ) /*-{
		this.labelWidth = labelWidth;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public final native double getLeft() /*-{
		return left;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public final native void setLeft( double left ) /*-{
		this.left = left;
	}-*/;

	/**
	 * Bottom margin.
	 */
	public final native double getMarginBottom() /*-{
		return marginBottom;
	}-*/;

	/**
	 * Bottom margin.
	 */
	public final native void setMarginBottom( double marginBottom ) /*-{
		this.marginBottom = marginBottom;
	}-*/;

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native double getMarginLeft() /*-{
		return marginLeft;
	}-*/;

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native void setMarginLeft( double marginLeft ) /*-{
		this.marginLeft = marginLeft;
	}-*/;

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native double getMarginRight() /*-{
		return marginRight;
	}-*/;

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native void setMarginRight( double marginRight ) /*-{
		this.marginRight = marginRight;
	}-*/;

	/**
	 * Top margin.
	 */
	public final native double getMarginTop() /*-{
		return marginTop;
	}-*/;

	/**
	 * Top margin.
	 */
	public final native void setMarginTop( double marginTop ) /*-{
		this.marginTop = marginTop;
	}-*/;

	/**
	 * Marker border opacity.
	 */
	public final native double getMarkerBorderAlpha() /*-{
		return markerBorderAlpha;
	}-*/;

	/**
	 * Marker border opacity.
	 */
	public final native void setMarkerBorderAlpha( double markerBorderAlpha ) /*-{
		this.markerBorderAlpha = markerBorderAlpha;
	}-*/;

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public final native String getMarkerBorderColor() /*-{
		return markerBorderColor;
	}-*/;

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public final native void setMarkerBorderColor( String markerBorderColor ) /*-{
		this.markerBorderColor = markerBorderColor;
	}-*/;

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public final native double getMarkerBorderThickness() /*-{
		return markerBorderThickness;
	}-*/;

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public final native void setMarkerBorderThickness( double markerBorderThickness ) /*-{
		this.markerBorderThickness = markerBorderThickness;
	}-*/;

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public final native String getMarkerDisabledColor() /*-{
		return markerDisabledColor;
	}-*/;

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public final native void setMarkerDisabledColor( String markerDisabledColor ) /*-{
		this.markerDisabledColor = markerDisabledColor;
	}-*/;

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public final native double getMarkerLabelGap() /*-{
		return markerLabelGap;
	}-*/;

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public final native void setMarkerLabelGap( double markerLabelGap ) /*-{
		this.markerLabelGap = markerLabelGap;
	}-*/;

	/**
	 * Size of the legend marker (key).
	 */
	public final native double getMarkerSize() /*-{
		return markerSize;
	}-*/;

	/**
	 * Size of the legend marker (key).
	 */
	public final native void setMarkerSize( double markerSize ) /*-{
		this.markerSize = markerSize;
	}-*/;

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native String getMarkerType() /*-{
		return markerType;
	}-*/;

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native void setMarkerType( String markerType ) /*-{
		this.markerType = markerType;
	}-*/;

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public final native double getMaxColumns() /*-{
		return maxColumns;
	}-*/;

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public final native void setMaxColumns( double maxColumns ) /*-{
		this.maxColumns = maxColumns;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native String getPeriodValueText() /*-{
		return periodValueText;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native void setPeriodValueText( String periodValueText ) /*-{
		this.periodValueText = periodValueText;
	}-*/;

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public final native String getPosition() /*-{
		return position;
	}-*/;

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public final native void setPosition( String position ) /*-{
		this.position = position;
	}-*/;

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public final native Boolean isReversedOrder() /*-{
		return reversedOrder;
	}-*/;

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public final native void setReversedOrder( Boolean reversedOrder ) /*-{
		this.reversedOrder = reversedOrder;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public final native double getRight() /*-{
		return right;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public final native void setRight( double right ) /*-{
		this.right = right;
	}-*/;

	/**
	 * Legend item text color on roll-over.
	 */
	public final native String getRollOverColor() /*-{
		return rollOverColor;
	}-*/;

	/**
	 * Legend item text color on roll-over.
	 */
	public final native void setRollOverColor( String rollOverColor ) /*-{
		this.rollOverColor = rollOverColor;
	}-*/;

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public final native double getRollOverGraphAlpha() /*-{
		return rollOverGraphAlpha;
	}-*/;

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public final native void setRollOverGraphAlpha( double rollOverGraphAlpha ) /*-{
		this.rollOverGraphAlpha = rollOverGraphAlpha;
	}-*/;

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public final native Boolean isShowEntries() /*-{
		return showEntries;
	}-*/;

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public final native void setShowEntries( Boolean showEntries ) /*-{
		this.showEntries = showEntries;
	}-*/;

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public final native double getSpacing() /*-{
		return spacing;
	}-*/;

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public final native void setSpacing( double spacing ) /*-{
		this.spacing = spacing;
	}-*/;

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public final native Boolean isSwitchable() /*-{
		return switchable;
	}-*/;

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public final native void setSwitchable( Boolean switchable ) /*-{
		this.switchable = switchable;
	}-*/;

	/**
	 * Legend switch color.
	 */
	public final native String getSwitchColor() /*-{
		return switchColor;
	}-*/;

	/**
	 * Legend switch color.
	 */
	public final native void setSwitchColor( String switchColor ) /*-{
		this.switchColor = switchColor;
	}-*/;

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public final native String getSwitchType() /*-{
		return switchType;
	}-*/;

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public final native void setSwitchType( String switchType ) /*-{
		this.switchType = switchType;
	}-*/;

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public final native Boolean isTextClickEnabled() /*-{
		return textClickEnabled;
	}-*/;

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public final native void setTextClickEnabled( Boolean textClickEnabled ) /*-{
		this.textClickEnabled = textClickEnabled;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public final native double getTop() /*-{
		return top;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public final native void setTop( double top ) /*-{
		this.top = top;
	}-*/;

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public final native Boolean isUseGraphSettings() /*-{
		return useGraphSettings;
	}-*/;

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public final native void setUseGraphSettings( Boolean useGraphSettings ) /*-{
		this.useGraphSettings = useGraphSettings;
	}-*/;

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public final native Boolean isUseMarkerColorForLabels() /*-{
		return useMarkerColorForLabels;
	}-*/;

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public final native void setUseMarkerColorForLabels( Boolean useMarkerColorForLabels ) /*-{
		this.useMarkerColorForLabels = useMarkerColorForLabels;
	}-*/;

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public final native Boolean isUseMarkerColorForValues() /*-{
		return useMarkerColorForValues;
	}-*/;

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public final native void setUseMarkerColorForValues( Boolean useMarkerColorForValues ) /*-{
		this.useMarkerColorForValues = useMarkerColorForValues;
	}-*/;

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public final native String getValueAlign() /*-{
		return valueAlign;
	}-*/;

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public final native void setValueAlign( String valueAlign ) /*-{
		this.valueAlign = valueAlign;
	}-*/;

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public final native IsFunction getValueFunction() /*-{
		return @com.amcharts.impl.JsFunction::getInstance(Lcom/google/gwt/core/client/JavaScriptObject;)(this.valueFunction);
	}-*/;

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public final native void setValueFunction( IsFunction valueFunction ) /*-{
		this.valueFunction = @com.amcharts.impl.JsFunction::getJSInstance(Lcom/amcharts/impl/JsFunction;)(valueFunction);
	}-*/;

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public final native String getValueText() /*-{
		return valueText;
	}-*/;

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public final native void setValueText( String valueText ) /*-{
		this.valueText = valueText;
	}-*/;

	/**
	 * Width of the value text.
	 */
	public final native double getValueWidth() /*-{
		return valueWidth;
	}-*/;

	/**
	 * Width of the value text.
	 */
	public final native void setValueWidth( double valueWidth ) /*-{
		this.valueWidth = valueWidth;
	}-*/;

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public final native double getVerticalGap() /*-{
		return verticalGap;
	}-*/;

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public final native void setVerticalGap( double verticalGap ) /*-{
		this.verticalGap = verticalGap;
	}-*/;

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public final native double getWidth() /*-{
		return width;
	}-*/;

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public final native void setWidth( double width ) /*-{
		this.width = width;
	}-*/;

	public final native int getId()
	/*-{
		return this.id;
	}-*/;

	public final native void setId( int id )
	/*-{
		this.id = id;
	}-*/;
}