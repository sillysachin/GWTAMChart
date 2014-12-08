package com.amcharts.jso;

import java.util.Date;

import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;
import com.google.gwt.core.client.JavaScriptObject;

public final class GuideJSO extends JavaScriptObject implements IsGuide
{
	protected GuideJSO()
	{
	}

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public final native Boolean isAbove() /*-{
		return this.above;
	}-*/;

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public final native void setAbove( Boolean above ) /*-{
		this.above = above;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public final native double getAngle() /*-{
		return this.angle;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public final native void setAngle( double angle ) /*-{
		this.angle = angle;
	}-*/;

	/**
	 * Baloon fill color.
	 */
	public final native String getBalloonColor() /*-{
		return this.balloonColor;
	}-*/;

	/**
	 * Baloon fill color.
	 */
	public final native void setBalloonColor( String balloonColor ) /*-{
		this.balloonColor = balloonColor;
	}-*/;

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public final native String getBalloonText() /*-{
		return this.balloonText;
	}-*/;

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public final native void setBalloonText( String balloonText ) /*-{
		this.balloonText = balloonText;
	}-*/;

	/**
	 * Specifies if label should be bold or not.
	 */
	public final native Boolean isBoldLabel() /*-{
		return this.boldLabel;
	}-*/;

	/**
	 * Specifies if label should be bold or not.
	 */
	public final native void setBoldLabel( Boolean boldLabel ) /*-{
		this.boldLabel = boldLabel;
	}-*/;

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public final native String getCategory() /*-{
		return this.category;
	}-*/;

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public final native void setCategory( String category ) /*-{
		this.category = category;
	}-*/;

	/**
	 * Color of a guide label.
	 */
	public final native String getColor() /*-{
		return this.color;
	}-*/;

	/**
	 * Color of a guide label.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native double getDashLength() /*-{
		return this.dashLength;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.dashLength = dashLength;
	}-*/;

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public final native Date getDate() /*-{
		return this.date;
	}-*/;

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public final native void setDate( Date date ) /*-{
		this.date = date;
	}-*/;

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public final native Boolean isExpand() /*-{
		return this.expand;
	}-*/;

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public final native void setExpand( Boolean expand ) /*-{
		this.expand = expand;
	}-*/;

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public final native double getFillAlpha() /*-{
		return this.fillAlpha;
	}-*/;

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Fill color.
	 */
	public final native String getFillColor() /*-{
		return this.fillColor;
	}-*/;

	/**
	 * Fill color.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.fillColor = fillColor;
	}-*/;

	/**
	 * Font size of guide label.
	 */
	public final native double getFontSize() /*-{
		return this.fontSize;
	}-*/;

	/**
	 * Font size of guide label.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.id;
	}-*/;

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public final native Boolean isInside() /*-{
		return this.inside;
	}-*/;

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public final native void setInside( Boolean inside ) /*-{
		this.inside = inside;
	}-*/;

	/**
	 * The label which will be displayed near the guide.
	 */
	public final native String getLabel() /*-{
		return this.label;
	}-*/;

	/**
	 * The label which will be displayed near the guide.
	 */
	public final native void setLabel( String label ) /*-{
		this.label = label;
	}-*/;

	/**
	 * Rotation angle of a guide label.
	 */
	public final native double getLabelRotation() /*-{
		return this.labelRotation;
	}-*/;

	/**
	 * Rotation angle of a guide label.
	 */
	public final native void setLabelRotation( double labelRotation ) /*-{
		this.labelRotation = labelRotation;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native double getLineAlpha() /*-{
		return this.lineAlpha;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native void setLineAlpha( double lineAlpha ) /*-{
		this.lineAlpha = lineAlpha;
	}-*/;

	/**
	 * Line color.
	 */
	public final native String getLineColor() /*-{
		return this.lineColor;
	}-*/;

	/**
	 * Line color.
	 */
	public final native void setLineColor( String lineColor ) /*-{
		this.lineColor = lineColor;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native double getLineThickness() /*-{
		return this.lineThickness;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native void setLineThickness( double lineThickness ) /*-{
		this.lineThickness = lineThickness;
	}-*/;

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public final native String getPosition() /*-{
		return this.position;
	}-*/;

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public final native void setPosition( String position ) /*-{
		this.position = position;
	}-*/;

	/**
	 * Tick length.
	 */
	public final native double getTickLength() /*-{
		return this.tickLength;
	}-*/;

	/**
	 * Tick length.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.tickLength = tickLength;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public final native double getToAngle() /*-{
		return this.toAngle;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public final native void setToAngle( double toAngle ) /*-{
		this.toAngle = toAngle;
	}-*/;

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public final native String getToCategory() /*-{
		return this.toCategory;
	}-*/;

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public final native void setToCategory( String toCategory ) /*-{
		this.toCategory = toCategory;
	}-*/;

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public final native Date getToDate() /*-{
		return this.toDate;
	}-*/;

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public final native void setToDate( Date toDate ) /*-{
		this.toDate = toDate;
	}-*/;

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public final native double getToValue() /*-{
		return this.toValue;
	}-*/;

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public final native void setToValue( double toValue ) /*-{
		this.toValue = toValue;
	}-*/;

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public final native double getValue() /*-{
		return this.value;
	}-*/;

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public final native void setValue( double value ) /*-{
		this.value = value;
	}-*/;

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public final native IsValueAxis getValueAxis() /*-{
		return this.valueAxis;
	}-*/;

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public final native void setValueAxis( IsValueAxis valueAxis ) /*-{
		this.valueAxis = valueAxis;
	}-*/;
}
