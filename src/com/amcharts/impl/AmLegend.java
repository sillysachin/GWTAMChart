package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsFunction;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.jso.AmLegendJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmLegend implements IJavaScriptWrapper<AmLegendJSO>, IsAmLegend
{
	private AmLegendJSO jso;

	public AmLegend()
	{
		jso = createJso();
	}

	public AmLegendJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmLegendJSO jso )
	{
		this.jso = jso;
	}

	//TODO: createJso with {} instead of JavaScriptObject.createObject();
	public native AmLegendJSO createJso() /*-{
		return {};
	}-*/;

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public final native String getAlign() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.align;
	}-*/;

	/**
	 * "Alignment of legend entries. Possible values are: 'left', 'center', 'right'."
	 */
	public final native void setAlign( String align ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.align = align;
	}-*/;

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public final native boolean isAutoMargins() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.autoMargins;
	}-*/;

	/**
	 * "Used if chart is Serial or XY. In case true, margins of the legend are adjusted and made equal to chart's margins."
	 */
	public final native void setAutoMargins( boolean autoMargins ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.autoMargins = autoMargins;
	}-*/;

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public final native double getBackgroundAlpha() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.backgroundAlpha;
	}-*/;

	/**
	 * Opacity of legend's background. Value range is 0 - 1
	 */
	public final native void setBackgroundAlpha( double backgroundAlpha ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.backgroundAlpha = backgroundAlpha;
	}-*/;

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public final native String getBackgroundColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.backgroundColor;
	}-*/;

	/**
	 * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
	 */
	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public final native double getBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.borderAlpha;
	}-*/;

	/**
	 * Opacity of chart's border. Value range is 0 - 1.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public final native String getBorderColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.borderColor;
	}-*/;

	/**
	 * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
	 */
	public final native void setBorderColor( String borderColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.borderColor = borderColor;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public final native double getBottom() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.bottom;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from bottom of the chart, in pixels."
	 */
	public final native void setBottom( double bottom ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.bottom = bottom;
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.color = color;
	}-*/;

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public final native List<JavaScriptObject> getData() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.data;
	}-*/;

	/**
	 * "You can pass array of objects with title, color, markerType values, for example: [{title: 'One', color: '#3366CC'},{title: 'Two', color: '#FFCC33'}]"
	 */
	public final native void setData( List<JavaScriptObject> data ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.data = data;
	}-*/;

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public final native String getDivId() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.divId;
	}-*/;

	/**
	 * You can set id of a div or a reference to div object in case you want the legend to be placed in a separate container.
	 */
	public final native void setDivId( String divId ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.divId = divId;
	}-*/;

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public final native boolean isEqualWidths() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.equalWidths;
	}-*/;

	/**
	 * Specifies if each of legend entry should be equal to the most wide entry. Won't look good if legend has more than one line.
	 */
	public final native void setEqualWidths( boolean equalWidths ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.equalWidths = equalWidths;
	}-*/;

	/**
	 * Font size.
	 */
	public final native double getFontSize() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.fontSize;
	}-*/;

	/**
	 * Font size.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.fontSize = fontSize;
	}-*/;

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public final native double getHorizontalGap() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.horizontalGap;
	}-*/;

	/**
	 * Horizontal space between legend item and left/right border.
	 */
	public final native void setHorizontalGap( double horizontalGap ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.horizontalGap = horizontalGap;
	}-*/;

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public final native String getLabelText() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.labelText;
	}-*/;

	/**
	 * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
	 */
	public final native void setLabelText( String labelText ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.labelText = labelText;
	}-*/;

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public final native double getLabelWidth() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.labelWidth;
	}-*/;

	/**
	 * "If width of the label is bigger than labelWidth, it will be wrapped."
	 */
	public final native void setLabelWidth( double labelWidth ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.labelWidth = labelWidth;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public final native double getLeft() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.left;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from left side of the chart, in pixels."
	 */
	public final native void setLeft( double left ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.left = left;
	}-*/;

	/**
	 * Bottom margin.
	 */
	public final native double getMarginBottom() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.marginBottom;
	}-*/;

	/**
	 * Bottom margin.
	 */
	public final native void setMarginBottom( double marginBottom ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.marginBottom = marginBottom;
	}-*/;

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native double getMarginLeft() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.marginLeft;
	}-*/;

	/**
	 * Left margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native void setMarginLeft( double marginLeft ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.marginLeft = marginLeft;
	}-*/;

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native double getMarginRight() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.marginRight;
	}-*/;

	/**
	 * Right margin. This property will be ignored if chart is Serial or XY and autoMargins property of the legend is true (default).
	 */
	public final native void setMarginRight( double marginRight ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.marginRight = marginRight;
	}-*/;

	/**
	 * Top margin.
	 */
	public final native double getMarginTop() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.marginTop;
	}-*/;

	/**
	 * Top margin.
	 */
	public final native void setMarginTop( double marginTop ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.marginTop = marginTop;
	}-*/;

	/**
	 * Marker border opacity.
	 */
	public final native double getMarkerBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerBorderAlpha;
	}-*/;

	/**
	 * Marker border opacity.
	 */
	public final native void setMarkerBorderAlpha( double markerBorderAlpha ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerBorderAlpha = markerBorderAlpha;
	}-*/;

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public final native String getMarkerBorderColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerBorderColor;
	}-*/;

	/**
	 * "Marker border color. If not set, will use the same color as marker."
	 */
	public final native void setMarkerBorderColor( String markerBorderColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerBorderColor = markerBorderColor;
	}-*/;

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public final native double getMarkerBorderThickness() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerBorderThickness;
	}-*/;

	/**
	 * "Thickness of the legend border. The default value (0) means the line will be a 'hairline' (1 px). In case marker type is line, this style will be used for line thickness."
	 */
	public final native void setMarkerBorderThickness( double markerBorderThickness ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerBorderThickness = markerBorderThickness;
	}-*/;

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public final native String getMarkerDisabledColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerDisabledColor;
	}-*/;

	/**
	 * The color of the disabled marker (when the graph is hidden).
	 */
	public final native void setMarkerDisabledColor( String markerDisabledColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerDisabledColor = markerDisabledColor;
	}-*/;

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public final native double getMarkerLabelGap() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerLabelGap;
	}-*/;

	/**
	 * "Space between legend marker and legend text, in pixels."
	 */
	public final native void setMarkerLabelGap( double markerLabelGap ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerLabelGap = markerLabelGap;
	}-*/;

	/**
	 * Size of the legend marker (key).
	 */
	public final native double getMarkerSize() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerSize;
	}-*/;

	/**
	 * Size of the legend marker (key).
	 */
	public final native void setMarkerSize( double markerSize ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerSize = markerSize;
	}-*/;

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native String getMarkerType() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.markerType;
	}-*/;

	/**
	 * "Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native void setMarkerType( String markerType ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.markerType = markerType;
	}-*/;

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public final native double getMaxColumns() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.maxColumns;
	}-*/;

	/**
	 * "Maximum number of columns in the legend. If Legend's position is set to 'right' or 'left', maxColumns is automatically set to 1."
	 */
	public final native void setMaxColumns( double maxColumns ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.maxColumns = maxColumns;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native String getPeriodValueText() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.periodValueText;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native void setPeriodValueText( String periodValueText ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.periodValueText = periodValueText;
	}-*/;

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public final native String getPosition() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.position;
	}-*/;

	/**
	 * "Position of a legend. Possible values are: 'bottom', 'top', 'left', 'right' and 'absolute'. In case 'absolute', you should set left and top properties too. (this setting is ignored in Stock charts). In case legend is used with AmMap, position is set to 'absolute' automatically."
	 */
	public final native void setPosition( String position ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.position = position;
	}-*/;

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public final native boolean isReversedOrder() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.reversedOrder;
	}-*/;

	/**
	 * Specifies whether legend entries should be placed in reversed order.
	 */
	public final native void setReversedOrder( boolean reversedOrder ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.reversedOrder = reversedOrder;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public final native double getRight() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.right;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from right side of the chart, in pixels."
	 */
	public final native void setRight( double right ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.right = right;
	}-*/;

	/**
	 * Legend item text color on roll-over.
	 */
	public final native String getRollOverColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.rollOverColor;
	}-*/;

	/**
	 * Legend item text color on roll-over.
	 */
	public final native void setRollOverColor( String rollOverColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.rollOverColor = rollOverColor;
	}-*/;

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public final native double getRollOverGraphAlpha() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.rollOverGraphAlpha;
	}-*/;

	/**
	 * "When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs."
	 */
	public final native void setRollOverGraphAlpha( double rollOverGraphAlpha ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.rollOverGraphAlpha = rollOverGraphAlpha;
	}-*/;

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public final native boolean isShowEntries() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.showEntries;
	}-*/;

	/**
	 * You can use this property to turn all the legend entries off.
	 */
	public final native void setShowEntries( boolean showEntries ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.showEntries = showEntries;
	}-*/;

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public final native double getSpacing() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.spacing;
	}-*/;

	/**
	 * "Horizontal space between legend items, in pixels."
	 */
	public final native void setSpacing( double spacing ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.spacing = spacing;
	}-*/;

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public final native boolean isSwitchable() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.switchable;
	}-*/;

	/**
	 * "Whether showing/hiding of graphs by clicking on the legend marker is enabled or not. In case legend is used with AmMap, this is set to false automatically."
	 */
	public final native void setSwitchable( boolean switchable ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.switchable = switchable;
	}-*/;

	/**
	 * Legend switch color.
	 */
	public final native String getSwitchColor() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.switchColor;
	}-*/;

	/**
	 * Legend switch color.
	 */
	public final native void setSwitchColor( String switchColor ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.switchColor = switchColor;
	}-*/;

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public final native String getSwitchType() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.switchType;
	}-*/;

	/**
	 * Legend switch type (in case the legend is switchable). Possible values are 'x' and 'v'.
	 */
	public final native void setSwitchType( String switchType ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.switchType = switchType;
	}-*/;

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public final native boolean isTextClickEnabled() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.textClickEnabled;
	}-*/;

	/**
	 * "If true, clicking on the text will show/hide balloon of the graph. Otherwise it will show/hide graph/slice, if switchable is set to true."
	 */
	public final native void setTextClickEnabled( boolean textClickEnabled ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.textClickEnabled = textClickEnabled;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public final native double getTop() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.top;
	}-*/;

	/**
	 * "In case legend position is set to 'absolute', you can set distance from top of the chart, in pixels."
	 */
	public final native void setTop( double top ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.top = top;
	}-*/;

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public final native boolean isUseGraphSettings() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.useGraphSettings;
	}-*/;

	/**
	 * "Legend markers can mirror graph�s settings, displaying a line and a real bullet as in the graph itself. Set this property to true if you want to enable this feature."
	 */
	public final native void setUseGraphSettings( boolean useGraphSettings ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.useGraphSettings = useGraphSettings;
	}-*/;

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public final native boolean isUseMarkerColorForLabels() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.useMarkerColorForLabels;
	}-*/;

	/**
	 * Labels will use marker color if you set this to true.
	 */
	public final native void setUseMarkerColorForLabels( boolean useMarkerColorForLabels ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.useMarkerColorForLabels = useMarkerColorForLabels;
	}-*/;

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public final native boolean isUseMarkerColorForValues() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.useMarkerColorForValues;
	}-*/;

	/**
	 * Specifies if legend values should be use same color as corresponding markers.
	 */
	public final native void setUseMarkerColorForValues( boolean useMarkerColorForValues ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.useMarkerColorForValues = useMarkerColorForValues;
	}-*/;

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public final native String getValueAlign() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.valueAlign;
	}-*/;

	/**
	 * Alignment of the value text. Possible values are 'left' and 'right'.
	 */
	public final native void setValueAlign( String valueAlign ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.valueAlign = valueAlign;
	}-*/;

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public final native IsFunction getValueFunction() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.valueFunction;
	}-*/;

	/**
	 * You can use it to format value labels in any way you want. Legend will call this method and will pass GraphDataItem and formatted text of currently hovered item (works only withChartCursor added to the chart). This method should return string which will be displayed as value in the legend.
	 */
	public final native void setValueFunction( IsFunction valueFunction ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.valueFunction = valueFunction;
	}-*/;

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public final native String getValueText() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.valueText;
	}-*/;

	/**
	 * "The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]."
	 */
	public final native void setValueText( String valueText ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.valueText = valueText;
	}-*/;

	/**
	 * Width of the value text.
	 */
	public final native double getValueWidth() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.valueWidth;
	}-*/;

	/**
	 * Width of the value text.
	 */
	public final native void setValueWidth( double valueWidth ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.valueWidth = valueWidth;
	}-*/;

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public final native double getVerticalGap() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.verticalGap;
	}-*/;

	/**
	 * Vertical space between legend items also between legend border and first and last legend row.
	 */
	public final native void setVerticalGap( double verticalGap ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.verticalGap = verticalGap;
	}-*/;

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public final native double getWidth() /*-{
		return this.@com.amcharts.impl.AmLegend::jso.width;
	}-*/;

	/**
	 * "Width of a legend, when position is set to absolute."
	 */
	public final native void setWidth( double width ) /*-{
		this.@com.amcharts.impl.AmLegend::jso.width = width;
	}-*/;

	/**
	 * Adds event listener to the object.
	 * type - string like 'clickLabel' (should be listed in 'events' section of this class or classes which extend this class). 
	 * handler - function which is called when event happens.
	 */
	public native void addListener( String eventName, AmChartListener handler )
	/*-{
		var legend = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var legendThis = this;
		console.log('addListener - > ' + eventName);
		legend
				.addListener(
						eventName,
						function(event) {
							legendThis.@com.amcharts.impl.AmLegend::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(handler,event);
							if (event.event == undefined) {
								console.log('Non Dom Event - > ' + event.type);
							} else {
								console.log('Dom Event - > ' + event.type);
							}
						});
	}-*/;

	public void handleListener( AmChartListener handler, AmChartEventJSO event )
	{
		handler.function( event );
	}

	/**
	 * Removes event listener from the legend object.
	 */
	//TODO: Need to provide better api than this.
	public native void removeListener( JavaScriptObject legendJSO, String type, JavaScriptObject handler )
	/*-{
		var legend = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		legend.removeListener(legendJSO, type, handler);
	}-*/;
}