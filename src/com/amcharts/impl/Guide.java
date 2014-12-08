package com.amcharts.impl;

import java.util.Date;

import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;
import com.amcharts.jso.GuideJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class Guide implements IJavaScriptWrapper<GuideJSO>, IsGuide
{
	private GuideJSO jso;

	public Guide()
	{
		jso = createJso();
	}

	public GuideJSO getJso()
	{
		return this.jso;
	}

	public void setJso( GuideJSO jso )
	{
		this.jso = jso;
	}

	private native GuideJSO createJso() /*-{
		var guide = new $wnd.AmCharts.Guide();
		return guide;
	}-*/;

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public final native Boolean isAbove() /*-{
		return this.@com.amcharts.impl.Guide::jso.above;
	}-*/;

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public final native void setAbove( Boolean above ) /*-{
		this.@com.amcharts.impl.Guide::jso.above = above;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public final native double getAngle() /*-{
		return this.@com.amcharts.impl.Guide::jso.angle;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public final native void setAngle( double angle ) /*-{
		this.@com.amcharts.impl.Guide::jso.angle = angle;
	}-*/;

	/**
	 * Baloon fill color.
	 */
	public final native String getBalloonColor() /*-{
		return this.@com.amcharts.impl.Guide::jso.balloonColor;
	}-*/;

	/**
	 * Baloon fill color.
	 */
	public final native void setBalloonColor( String balloonColor ) /*-{
		this.@com.amcharts.impl.Guide::jso.balloonColor = balloonColor;
	}-*/;

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public final native String getBalloonText() /*-{
		return this.@com.amcharts.impl.Guide::jso.balloonText;
	}-*/;

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public final native void setBalloonText( String balloonText ) /*-{
		this.@com.amcharts.impl.Guide::jso.balloonText = balloonText;
	}-*/;

	/**
	 * Specifies if label should be bold or not.
	 */
	public final native Boolean isBoldLabel() /*-{
		return this.@com.amcharts.impl.Guide::jso.boldLabel;
	}-*/;

	/**
	 * Specifies if label should be bold or not.
	 */
	public final native void setBoldLabel( Boolean boldLabel ) /*-{
		this.@com.amcharts.impl.Guide::jso.boldLabel = boldLabel;
	}-*/;

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public final native String getCategory() /*-{
		return this.@com.amcharts.impl.Guide::jso.category;
	}-*/;

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public final native void setCategory( String category ) /*-{
		this.@com.amcharts.impl.Guide::jso.category = category;
	}-*/;

	/**
	 * Color of a guide label.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.Guide::jso.color;
	}-*/;

	/**
	 * Color of a guide label.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.Guide::jso.color = color;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native double getDashLength() /*-{
		return this.@com.amcharts.impl.Guide::jso.dashLength;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.@com.amcharts.impl.Guide::jso.dashLength = dashLength;
	}-*/;

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public final native Date getDate() /*-{
		return this.@com.amcharts.impl.Guide::jso.date;
	}-*/;

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public final native void setDate( Date date ) /*-{
		this.@com.amcharts.impl.Guide::jso.date = date;
	}-*/;

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public final native Boolean isExpand() /*-{
		return this.@com.amcharts.impl.Guide::jso.expand;
	}-*/;

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public final native void setExpand( Boolean expand ) /*-{
		this.@com.amcharts.impl.Guide::jso.expand = expand;
	}-*/;

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public final native double getFillAlpha() /*-{
		return this.@com.amcharts.impl.Guide::jso.fillAlpha;
	}-*/;

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.@com.amcharts.impl.Guide::jso.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Fill color.
	 */
	public final native String getFillColor() /*-{
		return this.@com.amcharts.impl.Guide::jso.fillColor;
	}-*/;

	/**
	 * Fill color.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.@com.amcharts.impl.Guide::jso.fillColor = fillColor;
	}-*/;

	/**
	 * Font size of guide label.
	 */
	public final native double getFontSize() /*-{
		return this.@com.amcharts.impl.Guide::jso.fontSize;
	}-*/;

	/**
	 * Font size of guide label.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.Guide::jso.fontSize = fontSize;
	}-*/;

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.Guide::jso.id;
	}-*/;

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.Guide::jso.id = id;
	}-*/;

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public final native Boolean isInside() /*-{
		return this.@com.amcharts.impl.Guide::jso.inside;
	}-*/;

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public final native void setInside( Boolean inside ) /*-{
		this.@com.amcharts.impl.Guide::jso.inside = inside;
	}-*/;

	/**
	 * The label which will be displayed near the guide.
	 */
	public final native String getLabel() /*-{
		return this.@com.amcharts.impl.Guide::jso.label;
	}-*/;

	/**
	 * The label which will be displayed near the guide.
	 */
	public final native void setLabel( String label ) /*-{
		this.@com.amcharts.impl.Guide::jso.label = label;
	}-*/;

	/**
	 * Rotation angle of a guide label.
	 */
	public final native double getLabelRotation() /*-{
		return this.@com.amcharts.impl.Guide::jso.labelRotation;
	}-*/;

	/**
	 * Rotation angle of a guide label.
	 */
	public final native void setLabelRotation( double labelRotation ) /*-{
		this.@com.amcharts.impl.Guide::jso.labelRotation = labelRotation;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native double getLineAlpha() /*-{
		return this.@com.amcharts.impl.Guide::jso.lineAlpha;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native void setLineAlpha( double lineAlpha ) /*-{
		this.@com.amcharts.impl.Guide::jso.lineAlpha = lineAlpha;
	}-*/;

	/**
	 * Line color.
	 */
	public final native String getLineColor() /*-{
		return this.@com.amcharts.impl.Guide::jso.lineColor;
	}-*/;

	/**
	 * Line color.
	 */
	public final native void setLineColor( String lineColor ) /*-{
		this.@com.amcharts.impl.Guide::jso.lineColor = lineColor;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native double getLineThickness() /*-{
		return this.@com.amcharts.impl.Guide::jso.lineThickness;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native void setLineThickness( double lineThickness ) /*-{
		this.@com.amcharts.impl.Guide::jso.lineThickness = lineThickness;
	}-*/;

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public final native String getPosition() /*-{
		return this.@com.amcharts.impl.Guide::jso.position;
	}-*/;

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public final native void setPosition( String position ) /*-{
		this.@com.amcharts.impl.Guide::jso.position = position;
	}-*/;

	/**
	 * Tick length.
	 */
	public final native double getTickLength() /*-{
		return this.@com.amcharts.impl.Guide::jso.tickLength;
	}-*/;

	/**
	 * Tick length.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.@com.amcharts.impl.Guide::jso.tickLength = tickLength;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public final native double getToAngle() /*-{
		return this.@com.amcharts.impl.Guide::jso.toAngle;
	}-*/;

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public final native void setToAngle( double toAngle ) /*-{
		this.@com.amcharts.impl.Guide::jso.toAngle = toAngle;
	}-*/;

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public final native String getToCategory() /*-{
		return this.@com.amcharts.impl.Guide::jso.toCategory;
	}-*/;

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public final native void setToCategory( String toCategory ) /*-{
		this.@com.amcharts.impl.Guide::jso.toCategory = toCategory;
	}-*/;

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public final native Date getToDate() /*-{
		return this.@com.amcharts.impl.Guide::jso.toDate;
	}-*/;

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public final native void setToDate( Date toDate ) /*-{
		this.@com.amcharts.impl.Guide::jso.toDate = toDate;
	}-*/;

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public final native double getToValue() /*-{
		return this.@com.amcharts.impl.Guide::jso.toValue;
	}-*/;

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public final native void setToValue( double toValue ) /*-{
		this.@com.amcharts.impl.Guide::jso.toValue = toValue;
	}-*/;

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public final native double getValue() /*-{
		return this.@com.amcharts.impl.Guide::jso.value;
	}-*/;

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public final native void setValue( double value ) /*-{
		this.@com.amcharts.impl.Guide::jso.value = value;
	}-*/;

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public final native IsValueAxis getValueAxis() /*-{
		return this.@com.amcharts.impl.Guide::jso.valueAxis;
	}-*/;

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public final native void setValueAxis( IsValueAxis valueAxis ) /*-{
		this.@com.amcharts.impl.Guide::jso.valueAxis = valueAxis;
	}-*/;
}
