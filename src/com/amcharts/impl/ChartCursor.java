package com.amcharts.impl;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.jso.ChartCursorJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public final class ChartCursor implements IJavaScriptWrapper<ChartCursorJSO>, IsChartCursor
{
	private ChartCursorJSO jso;

	public ChartCursor()
	{
		jso = createJso();
	}

	public ChartCursorJSO getJso()
	{
		return this.jso;
	}

	public void setJso( ChartCursorJSO jso )
	{
		this.jso = jso;
	}

	public native ChartCursorJSO createJso() /*-{
		var chartCursor = new $wnd.AmCharts.ChartCursor();
		return chartCursor;
	}-*/;

	/**
	 * "If you set adjustment to -1, the balloon will be shown near previous, if you set it to 1 - near next data point."
	 */
	public final native double getAdjustment() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.adjustment;
	}-*/;

	/**
	 * "If you set adjustment to -1, the balloon will be shown near previous, if you set it to 1 - near next data point."
	 */
	public final native void setAdjustment( double adjustment ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.adjustment = adjustment;
	}-*/;

	/**
	 * "Duration of animation of a line, in seconds."
	 */
	public final native double getAnimationDuration() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.animationDuration;
	}-*/;

	/**
	 * "Duration of animation of a line, in seconds."
	 */
	public final native void setAnimationDuration( double animationDuration ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.animationDuration = animationDuration;
	}-*/;

	/**
	 * "Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated, it might be good idea to turn this off."
	 */
	public final native Boolean isAvoidBalloonOverlapping() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.avoidBalloonOverlapping;
	}-*/;

	/**
	 * "Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated, it might be good idea to turn this off."
	 */
	public final native void setAvoidBalloonOverlapping( Boolean avoidBalloonOverlapping ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.avoidBalloonOverlapping = avoidBalloonOverlapping;
	}-*/;

	/**
	 * Specifies if bullet for each graph will follow the cursor.
	 */
	public final native Boolean isBulletsEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.bulletsEnabled;
	}-*/;

	/**
	 * Specifies if bullet for each graph will follow the cursor.
	 */
	public final native void setBulletsEnabled( Boolean bulletsEnabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.bulletsEnabled = bulletsEnabled;
	}-*/;

	/**
	 * "Size of bullets, following the cursor."
	 */
	public final native double getBulletSize() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.bulletSize;
	}-*/;

	/**
	 * "Size of bullets, following the cursor."
	 */
	public final native void setBulletSize( double bulletSize ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.bulletSize = bulletSize;
	}-*/;

	/**
	 * Opacity of the category balloon.
	 */
	public final native double getCategoryBalloonAlpha() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonAlpha;
	}-*/;

	/**
	 * Opacity of the category balloon.
	 */
	public final native void setCategoryBalloonAlpha( double categoryBalloonAlpha ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonAlpha = categoryBalloonAlpha;
	}-*/;

	/**
	 * Color of the category balloon. cursorColor is used if not set.
	 */
	public final native String getCategoryBalloonColor() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonColor;
	}-*/;

	/**
	 * Color of the category balloon. cursorColor is used if not set.
	 */
	public final native void setCategoryBalloonColor( String categoryBalloonColor ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonColor = categoryBalloonColor;
	}-*/;

	/**
	 * Category balloon date format (used only if category axis parses dates). Check this page for instructions on how to format dates.
	 */
	public final native String getCategoryBalloonDateFormat() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonDateFormat;
	}-*/;

	/**
	 * Category balloon date format (used only if category axis parses dates). Check this page for instructions on how to format dates.
	 */
	public final native void setCategoryBalloonDateFormat( String categoryBalloonDateFormat ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonDateFormat = categoryBalloonDateFormat;
	}-*/;

	/**
	 * Specifies whether category balloon is enabled.
	 */
	public final native Boolean isCategoryBalloonEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonEnabled;
	}-*/;

	/**
	 * Specifies whether category balloon is enabled.
	 */
	public final native void setCategoryBalloonEnabled( Boolean categoryBalloonEnabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonEnabled = categoryBalloonEnabled;
	}-*/;

	/**
	 * "Allows formatting any category balloon text you want. categoryBalloonFunction should return a string which will be displayed in a balloon. When categoryBalloonFunction is called, category value (or date) is passed as an argument."
	 */
	public final native IsFunction getCategoryBalloonFunction() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonFunction;
	}-*/;

	/**
	 * "Allows formatting any category balloon text you want. categoryBalloonFunction should return a string which will be displayed in a balloon. When categoryBalloonFunction is called, category value (or date) is passed as an argument."
	 */
	public final native void setCategoryBalloonFunction( IsFunction categoryBalloonFunction ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.categoryBalloonFunction = categoryBalloonFunction;
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.color = color;
	}-*/;

	/**
	 * Opacity of the cursor line.
	 */
	public final native double getCursorAlpha() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.cursorAlpha;
	}-*/;

	/**
	 * Opacity of the cursor line.
	 */
	public final native void setCursorAlpha( double cursorAlpha ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.cursorAlpha = cursorAlpha;
	}-*/;

	/**
	 * Color of the cursor line.
	 */
	public final native String getCursorColor() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.cursorColor;
	}-*/;

	/**
	 * Color of the cursor line.
	 */
	public final native void setCursorColor( String cursorColor ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.cursorColor = cursorColor;
	}-*/;

	/**
	 * "Specifies where the cursor line should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). If you want the cursor to follow mouse and not to glue to the nearest data point, set 'mouse' here. Possible values are: start, middle, mouse."
	 */
	public final native String getCursorPosition() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.cursorPosition;
	}-*/;

	/**
	 * "Specifies where the cursor line should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). If you want the cursor to follow mouse and not to glue to the nearest data point, set 'mouse' here. Possible values are: start, middle, mouse."
	 */
	public final native void setCursorPosition( String cursorPosition ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.cursorPosition = cursorPosition;
	}-*/;

	/**
	 * Specifies whether cursor is enabled.
	 */
	public final native Boolean isEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.enabled;
	}-*/;

	/**
	 * Specifies whether cursor is enabled.
	 */
	public final native void setEnabled( Boolean enabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.enabled = enabled;
	}-*/;

	/**
	 * "If set to true, instead of a cursor line user will see a fill which width will always be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1 or some other small number if using this feature."
	 */
	public final native Boolean isFullWidth() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.fullWidth;
	}-*/;

	/**
	 * "If set to true, instead of a cursor line user will see a fill which width will always be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1 or some other small number if using this feature."
	 */
	public final native void setFullWidth( Boolean fullWidth ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.fullWidth = fullWidth;
	}-*/;

	/**
	 * "If you make graph's bullets invisible by setting their opacity to 0 and will set graphBulletAlpha to 1, the bullets will only appear at the cursor's position."
	 */
	public final native double getGraphBulletAlpha() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.graphBulletAlpha;
	}-*/;

	/**
	 * "If you make graph's bullets invisible by setting their opacity to 0 and will set graphBulletAlpha to 1, the bullets will only appear at the cursor's position."
	 */
	public final native void setGraphBulletAlpha( double graphBulletAlpha ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.graphBulletAlpha = graphBulletAlpha;
	}-*/;

	/**
	 * "Size of a graph's bullet (if available) at the cursor position. If you don't want the bullet to change it's size, set this property to 1."
	 */
	public final native double getGraphBulletSize() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.graphBulletSize;
	}-*/;

	/**
	 * "Size of a graph's bullet (if available) at the cursor position. If you don't want the bullet to change it's size, set this property to 1."
	 */
	public final native void setGraphBulletSize( double graphBulletSize ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.graphBulletSize = graphBulletSize;
	}-*/;

	/**
	 * "If this is set to true, only one balloon at a time will be displayed. Note, this is quite CPU consuming."
	 */
	public final native Boolean isOneBalloonOnly() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.oneBalloonOnly;
	}-*/;

	/**
	 * "If this is set to true, only one balloon at a time will be displayed. Note, this is quite CPU consuming."
	 */
	public final native void setOneBalloonOnly( Boolean oneBalloonOnly ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.oneBalloonOnly = oneBalloonOnly;
	}-*/;

	/**
	 * "If this is set to true, the user will be able to pan the chart (Serial only) instead of zooming."
	 */
	public final native Boolean isPan() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.pan;
	}-*/;

	/**
	 * "If this is set to true, the user will be able to pan the chart (Serial only) instead of zooming."
	 */
	public final native void setPan( Boolean pan ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.pan = pan;
	}-*/;

	/**
	 * Opacity of the selection.
	 */
	public final native double getSelectionAlpha() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.selectionAlpha;
	}-*/;

	/**
	 * Opacity of the selection.
	 */
	public final native void setSelectionAlpha( double selectionAlpha ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.selectionAlpha = selectionAlpha;
	}-*/;

	/**
	 * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button.
	 */
	public final native Boolean isSelectWithoutZooming() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.selectWithoutZooming;
	}-*/;

	/**
	 * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button.
	 */
	public final native void setSelectWithoutZooming( Boolean selectWithoutZooming ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.selectWithoutZooming = selectWithoutZooming;
	}-*/;

	/**
	 * "If true, the graph will display balloon on next available data point if currently hovered item doesn't have value for this graph."
	 */
	public final native Boolean isShowNextAvailable() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.showNextAvailable;
	}-*/;

	/**
	 * "If true, the graph will display balloon on next available data point if currently hovered item doesn't have value for this graph."
	 */
	public final native void setShowNextAvailable( Boolean showNextAvailable ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.showNextAvailable = showNextAvailable;
	}-*/;

	/**
	 * "Specifies whether value balloons are enabled. In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet."
	 */
	public final native Boolean isValueBalloonsEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.valueBalloonsEnabled;
	}-*/;

	/**
	 * "Specifies whether value balloons are enabled. In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet."
	 */
	public final native void setValueBalloonsEnabled( Boolean valueBalloonsEnabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.valueBalloonsEnabled = valueBalloonsEnabled;
	}-*/;

	/**
	 * Opacity of value line. Will use cursorAlpha value if not set.
	 */
	public final native double getValueLineAlpha() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.valueLineAlpha;
	}-*/;

	/**
	 * Opacity of value line. Will use cursorAlpha value if not set.
	 */
	public final native void setValueLineAlpha( double valueLineAlpha ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.valueLineAlpha = valueLineAlpha;
	}-*/;

	/**
	 * "Axis of value line. If you set valueLineBalloonEnabled to true, but you have more than one axis, you can use this property to indicate which axis should display balloon."
	 */
	public final native IsValueAxis getValueLineAxis() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.valueLineAxis;
	}-*/;

	/**
	 * "Axis of value line. If you set valueLineBalloonEnabled to true, but you have more than one axis, you can use this property to indicate which axis should display balloon."
	 */
	public final native void setValueLineAxis( IsValueAxis valueLineAxis ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.valueLineAxis = valueLineAxis;
	}-*/;

	/**
	 * "Specifies if value balloon next to value axis labels should be displayed. If you have more than one axis, set valueLineAxis property to indicate which axis should display the balloon."
	 */
	public final native Boolean isValueLineBalloonEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.valueLineBalloonEnabled;
	}-*/;

	/**
	 * "Specifies if value balloon next to value axis labels should be displayed. If you have more than one axis, set valueLineAxis property to indicate which axis should display the balloon."
	 */
	public final native void setValueLineBalloonEnabled( Boolean valueLineBalloonEnabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.valueLineBalloonEnabled = valueLineBalloonEnabled;
	}-*/;

	/**
	 * Specifies if cursor of Serial chart should display horizontal (or vertical if chart is rotated) line. This line might help users to compare distant values of a chart. You can also enable value balloon on this line by setting valueLineAxis property of ChartCursor.
	 */
	public final native Boolean isValueLineEnabled() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.valueLineEnabled;
	}-*/;

	/**
	 * Specifies if cursor of Serial chart should display horizontal (or vertical if chart is rotated) line. This line might help users to compare distant values of a chart. You can also enable value balloon on this line by setting valueLineAxis property of ChartCursor.
	 */
	public final native void setValueLineEnabled( Boolean valueLineEnabled ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.valueLineEnabled = valueLineEnabled;
	}-*/;

	/**
	 * "Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched to false automatically."
	 */
	public final native Boolean isZoomable() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.zoomable;
	}-*/;

	/**
	 * "Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched to false automatically."
	 */
	public final native void setZoomable( Boolean zoomable ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.zoomable = zoomable;
	}-*/;

	/**
	 * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
	 */
	public final native Boolean isZooming() /*-{
		return this.@com.amcharts.impl.ChartCursor::jso.zooming;
	}-*/;

	/**
	 * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
	 */
	public final native void setZooming( Boolean zooming ) /*-{
		this.@com.amcharts.impl.ChartCursor::jso.zooming = zooming;
	}-*/;

	/**
	 * Adds event listener to the object.
	 * type - string like 'clickLabel' (should be listed in 'events' section of this class or classes which extend this class). 
	 * handler - function which is called when event happens.
	 */
	public native void addListener( String eventName, AmChartListener handler )
	/*-{
		var chartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var chartCursorThis = this;
		chartCursor
				.addListener(
						eventName,
						function(event) {
							chartCursorThis.@com.amcharts.impl.AxisBase::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(handler,event);
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
	 * Removes event listener from the chartCursor object.
	 */
	//TODO: Need to provide better api than this.
	public native void removeListener( JavaScriptObject obj, String type, JavaScriptObject handler )
	/*-{
		var chartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chartCursor.removeListener(obj, type, handler);
	}-*/;
}