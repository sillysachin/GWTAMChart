package com.amcharts.jso;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;
import com.google.gwt.core.client.JavaScriptObject;

public final class ChartCursorJSO extends JavaScriptObject
{
	protected ChartCursorJSO()
	{
	}

	/**
	 * "If you set adjustment to -1, the balloon will be shown near previous, if you set it to 1 - near next data point."
	 */
	public final native double getAdjustment() /*-{
		return this.adjustment;
	}-*/;

	/**
	 * "If you set adjustment to -1, the balloon will be shown near previous, if you set it to 1 - near next data point."
	 */
	public final native void setAdjustment( double adjustment ) /*-{
		this.adjustment = adjustment;
	}-*/;

	/**
	 * "Duration of animation of a line, in seconds."
	 */
	public final native double getAnimationDuration() /*-{
		return this.animationDuration;
	}-*/;

	/**
	 * "Duration of animation of a line, in seconds."
	 */
	public final native void setAnimationDuration( double animationDuration ) /*-{
		this.animationDuration = animationDuration;
	}-*/;

	/**
	 * "Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated, it might be good idea to turn this off."
	 */
	public final native Boolean isAvoidBalloonOverlapping() /*-{
		return this.avoidBalloonOverlapping;
	}-*/;

	/**
	 * "Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated, it might be good idea to turn this off."
	 */
	public final native void setAvoidBalloonOverlapping( Boolean avoidBalloonOverlapping ) /*-{
		this.avoidBalloonOverlapping = avoidBalloonOverlapping;
	}-*/;

	/**
	 * Specifies if bullet for each graph will follow the cursor.
	 */
	public final native Boolean isBulletsEnabled() /*-{
		return this.bulletsEnabled;
	}-*/;

	/**
	 * Specifies if bullet for each graph will follow the cursor.
	 */
	public final native void setBulletsEnabled( Boolean bulletsEnabled ) /*-{
		this.bulletsEnabled = bulletsEnabled;
	}-*/;

	/**
	 * "Size of bullets, following the cursor."
	 */
	public final native double getBulletSize() /*-{
		return this.bulletSize;
	}-*/;

	/**
	 * "Size of bullets, following the cursor."
	 */
	public final native void setBulletSize( double bulletSize ) /*-{
		this.bulletSize = bulletSize;
	}-*/;

	/**
	 * Opacity of the category balloon.
	 */
	public final native double getCategoryBalloonAlpha() /*-{
		return this.categoryBalloonAlpha;
	}-*/;

	/**
	 * Opacity of the category balloon.
	 */
	public final native void setCategoryBalloonAlpha( double categoryBalloonAlpha ) /*-{
		this.categoryBalloonAlpha = categoryBalloonAlpha;
	}-*/;

	/**
	 * Color of the category balloon. cursorColor is used if not set.
	 */
	public final native String getCategoryBalloonColor() /*-{
		return this.categoryBalloonColor;
	}-*/;

	/**
	 * Color of the category balloon. cursorColor is used if not set.
	 */
	public final native void setCategoryBalloonColor( String categoryBalloonColor ) /*-{
		this.categoryBalloonColor = categoryBalloonColor;
	}-*/;

	/**
	 * Category balloon date format (used only if category axis parses dates). Check this page for instructions on how to format dates.
	 */
	public final native String getCategoryBalloonDateFormat() /*-{
		return this.categoryBalloonDateFormat;
	}-*/;

	/**
	 * Category balloon date format (used only if category axis parses dates). Check this page for instructions on how to format dates.
	 */
	public final native void setCategoryBalloonDateFormat( String categoryBalloonDateFormat ) /*-{
		this.categoryBalloonDateFormat = categoryBalloonDateFormat;
	}-*/;

	/**
	 * Specifies whether category balloon is enabled.
	 */
	public final native Boolean isCategoryBalloonEnabled() /*-{
		return this.categoryBalloonEnabled;
	}-*/;

	/**
	 * Specifies whether category balloon is enabled.
	 */
	public final native void setCategoryBalloonEnabled( Boolean categoryBalloonEnabled ) /*-{
		this.categoryBalloonEnabled = categoryBalloonEnabled;
	}-*/;

	/**
	 * "Allows formatting any category balloon text you want. categoryBalloonFunction should return this.a string which will be displayed in a balloon. When categoryBalloonFunction is called, category value (or date) is passed as an argument."
	 */
	public final native IsFunction getCategoryBalloonFunction() /*-{
		return @com.amcharts.impl.JsFunction::getInstance(Lcom/google/gwt/core/client/JavaScriptObject;)(this.categoryBalloonFunction);
	}-*/;

	/**
	 * "Allows formatting any category balloon text you want. categoryBalloonFunction should return this.a string which will be displayed in a balloon. When categoryBalloonFunction is called, category value (or date) is passed as an argument."
	 */
	public final native void setCategoryBalloonFunction( IsFunction categoryBalloonFunction ) /*-{
		this.categoryBalloonFunction = @com.amcharts.impl.JsFunction::getJSInstance(Lcom/amcharts/impl/JsFunction;)(categoryBalloonFunction);
	}-*/;

	/**
	 * Text color.
	 */
	public final native String getColor() /*-{
		return this.color;
	}-*/;

	/**
	 * Text color.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Opacity of the cursor line.
	 */
	public final native double getCursorAlpha() /*-{
		return this.cursorAlpha;
	}-*/;

	/**
	 * Opacity of the cursor line.
	 */
	public final native void setCursorAlpha( double cursorAlpha ) /*-{
		this.cursorAlpha = cursorAlpha;
	}-*/;

	/**
	 * Color of the cursor line.
	 */
	public final native String getCursorColor() /*-{
		return this.cursorColor;
	}-*/;

	/**
	 * Color of the cursor line.
	 */
	public final native void setCursorColor( String cursorColor ) /*-{
		this.cursorColor = cursorColor;
	}-*/;

	/**
	 * "Specifies where the cursor line should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). If you want the cursor to follow mouse and not to glue to the nearest data point, set 'mouse' here. Possible values are: start, middle, mouse."
	 */
	public final native String getCursorPosition() /*-{
		return this.cursorPosition;
	}-*/;

	/**
	 * "Specifies where the cursor line should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). If you want the cursor to follow mouse and not to glue to the nearest data point, set 'mouse' here. Possible values are: start, middle, mouse."
	 */
	public final native void setCursorPosition( String cursorPosition ) /*-{
		this.cursorPosition = cursorPosition;
	}-*/;

	/**
	 * Specifies whether cursor is enabled.
	 */
	public final native Boolean isEnabled() /*-{
		return this.enabled;
	}-*/;

	/**
	 * Specifies whether cursor is enabled.
	 */
	public final native void setEnabled( Boolean enabled ) /*-{
		this.enabled = enabled;
	}-*/;

	/**
	 * "If set to true, instead of a cursor line user will see a fill which width will always be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1 or some other small number if using this feature."
	 */
	public final native Boolean isFullWidth() /*-{
		return this.fullWidth;
	}-*/;

	/**
	 * "If set to true, instead of a cursor line user will see a fill which width will always be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1 or some other small number if using this feature."
	 */
	public final native void setFullWidth( Boolean fullWidth ) /*-{
		this.fullWidth = fullWidth;
	}-*/;

	/**
	 * "If you make graph's bullets invisible by setting their opacity to 0 and will set graphBulletAlpha to 1, the bullets will only appear at the cursor's position."
	 */
	public final native double getGraphBulletAlpha() /*-{
		return this.graphBulletAlpha;
	}-*/;

	/**
	 * "If you make graph's bullets invisible by setting their opacity to 0 and will set graphBulletAlpha to 1, the bullets will only appear at the cursor's position."
	 */
	public final native void setGraphBulletAlpha( double graphBulletAlpha ) /*-{
		this.graphBulletAlpha = graphBulletAlpha;
	}-*/;

	/**
	 * "Size of a graph's bullet (if available) at the cursor position. If you don't want the bullet to change it's size, set this property to 1."
	 */
	public final native double getGraphBulletSize() /*-{
		return this.graphBulletSize;
	}-*/;

	/**
	 * "Size of a graph's bullet (if available) at the cursor position. If you don't want the bullet to change it's size, set this property to 1."
	 */
	public final native void setGraphBulletSize( double graphBulletSize ) /*-{
		this.graphBulletSize = graphBulletSize;
	}-*/;

	/**
	 * "If this is set to true, only one balloon at a time will be displayed. Note, this is quite CPU consuming."
	 */
	public final native Boolean isOneBalloonOnly() /*-{
		return this.oneBalloonOnly;
	}-*/;

	/**
	 * "If this is set to true, only one balloon at a time will be displayed. Note, this is quite CPU consuming."
	 */
	public final native void setOneBalloonOnly( Boolean oneBalloonOnly ) /*-{
		this.oneBalloonOnly = oneBalloonOnly;
	}-*/;

	/**
	 * "If this is set to true, the user will be able to pan the chart (Serial only) instead of zooming."
	 */
	public final native Boolean isPan() /*-{
		return this.pan;
	}-*/;

	/**
	 * "If this is set to true, the user will be able to pan the chart (Serial only) instead of zooming."
	 */
	public final native void setPan( Boolean pan ) /*-{
		this.pan = pan;
	}-*/;

	/**
	 * Opacity of the selection.
	 */
	public final native double getSelectionAlpha() /*-{
		return this.selectionAlpha;
	}-*/;

	/**
	 * Opacity of the selection.
	 */
	public final native void setSelectionAlpha( double selectionAlpha ) /*-{
		this.selectionAlpha = selectionAlpha;
	}-*/;

	/**
	 * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button.
	 */
	public final native Boolean isSelectWithoutZooming() /*-{
		return this.selectWithoutZooming;
	}-*/;

	/**
	 * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button.
	 */
	public final native void setSelectWithoutZooming( Boolean selectWithoutZooming ) /*-{
		this.selectWithoutZooming = selectWithoutZooming;
	}-*/;

	/**
	 * "If true, the graph will display balloon on next available data point if currently hovered item doesn't have value for this graph."
	 */
	public final native Boolean isShowNextAvailable() /*-{
		return this.showNextAvailable;
	}-*/;

	/**
	 * "If true, the graph will display balloon on next available data point if currently hovered item doesn't have value for this graph."
	 */
	public final native void setShowNextAvailable( Boolean showNextAvailable ) /*-{
		this.showNextAvailable = showNextAvailable;
	}-*/;

	/**
	 * "Specifies whether value balloons are enabled. In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet."
	 */
	public final native Boolean isValueBalloonsEnabled() /*-{
		return this.valueBalloonsEnabled;
	}-*/;

	/**
	 * "Specifies whether value balloons are enabled. In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet."
	 */
	public final native void setValueBalloonsEnabled( Boolean valueBalloonsEnabled ) /*-{
		this.valueBalloonsEnabled = valueBalloonsEnabled;
	}-*/;

	/**
	 * Opacity of value line. Will use cursorAlpha value if not set.
	 */
	public final native double getValueLineAlpha() /*-{
		return this.valueLineAlpha;
	}-*/;

	/**
	 * Opacity of value line. Will use cursorAlpha value if not set.
	 */
	public final native void setValueLineAlpha( double valueLineAlpha ) /*-{
		this.valueLineAlpha = valueLineAlpha;
	}-*/;

	/**
	 * "Axis of value line. If you set valueLineBalloonEnabled to true, but you have more than one axis, you can use this property to indicate which axis should display balloon."
	 */
	public final native IsValueAxis getValueLineAxis() /*-{
		return this.valueLineAxis;
	}-*/;

	/**
	 * "Axis of value line. If you set valueLineBalloonEnabled to true, but you have more than one axis, you can use this property to indicate which axis should display balloon."
	 */
	public final native void setValueLineAxis( IsValueAxis valueLineAxis ) /*-{
		this.valueLineAxis = valueLineAxis;
	}-*/;

	/**
	 * "Specifies if value balloon next to value axis labels should be displayed. If you have more than one axis, set valueLineAxis property to indicate which axis should display the balloon."
	 */
	public final native Boolean isValueLineBalloonEnabled() /*-{
		return this.valueLineBalloonEnabled;
	}-*/;

	/**
	 * "Specifies if value balloon next to value axis labels should be displayed. If you have more than one axis, set valueLineAxis property to indicate which axis should display the balloon."
	 */
	public final native void setValueLineBalloonEnabled( Boolean valueLineBalloonEnabled ) /*-{
		this.valueLineBalloonEnabled = valueLineBalloonEnabled;
	}-*/;

	/**
	 * Specifies if cursor of Serial chart should display horizontal (or vertical if chart is rotated) line. This line might help users to compare distant values of a chart. You can also enable value balloon on this line by setting valueLineAxis property of ChartCursor.
	 */
	public final native Boolean isValueLineEnabled() /*-{
		return this.valueLineEnabled;
	}-*/;

	/**
	 * Specifies if cursor of Serial chart should display horizontal (or vertical if chart is rotated) line. This line might help users to compare distant values of a chart. You can also enable value balloon on this line by setting valueLineAxis property of ChartCursor.
	 */
	public final native void setValueLineEnabled( Boolean valueLineEnabled ) /*-{
		this.valueLineEnabled = valueLineEnabled;
	}-*/;

	/**
	 * "Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched to false automatically."
	 */
	public final native Boolean isZoomable() /*-{
		return this.zoomable;
	}-*/;

	/**
	 * "Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched to false automatically."
	 */
	public final native void setZoomable( Boolean zoomable ) /*-{
		this.zoomable = zoomable;
	}-*/;

	/**
	 * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
	 */
	public final native Boolean isZooming() /*-{
		return this.zooming;
	}-*/;

	/**
	 * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
	 */
	public final native void setZooming( Boolean zooming ) /*-{
		this.zooming = zooming;
	}-*/;
}