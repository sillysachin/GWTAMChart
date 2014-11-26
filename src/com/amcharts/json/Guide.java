package com.amcharts.json;

import java.util.Date;

import com.amcharts.api.IsGuide;
import com.amcharts.api.IsValueAxis;

public final class Guide implements IsGuide
{
	private Boolean above;

	private double angle;

	private String balloonColor;

	private String balloonText;

	private Boolean boldLabel;

	private String category;

	private String color;

	private double dashLength;

	private Date date;

	private Boolean expand;

	private double fillAlpha;

	private String fillColor;

	private double fontSize;

	private String id;

	private Boolean inside;

	private String label;

	private double labelRotation;

	private double lineAlpha;

	private String lineColor;

	private double lineThickness;

	private String position;

	private double tickLength;

	private double toAngle;

	private String toCategory;

	private Date toDate;

	private double toValue;

	private double value;

	private IsValueAxis valueAxis;

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public Boolean isAbove()
	{
		return above;
	}

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public void setAbove( Boolean above )
	{
		this.above = above;
	}

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public double getAngle()
	{
		return angle;
	}

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public void setAngle( double angle )
	{
		this.angle = angle;
	}

	/**
	 * Baloon fill color.
	 */
	public String getBalloonColor()
	{
		return balloonColor;
	}

	/**
	 * Baloon fill color.
	 */
	public void setBalloonColor( String balloonColor )
	{
		this.balloonColor = balloonColor;
	}

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public String getBalloonText()
	{
		return balloonText;
	}

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public void setBalloonText( String balloonText )
	{
		this.balloonText = balloonText;
	}

	/**
	 * Specifies if label should be bold or not.
	 */
	public Boolean isBoldLabel()
	{
		return boldLabel;
	}

	/**
	 * Specifies if label should be bold or not.
	 */
	public void setBoldLabel( Boolean boldLabel )
	{
		this.boldLabel = boldLabel;
	}

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public void setCategory( String category )
	{
		this.category = category;
	}

	/**
	 * Color of a guide label.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of a guide label.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Dash length.
	 */
	public double getDashLength()
	{
		return dashLength;
	}

	/**
	 * Dash length.
	 */
	public void setDashLength( double dashLength )
	{
		this.dashLength = dashLength;
	}

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public void setDate( Date date )
	{
		this.date = date;
	}

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public Boolean isExpand()
	{
		return expand;
	}

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public void setExpand( Boolean expand )
	{
		this.expand = expand;
	}

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public double getFillAlpha()
	{
		return fillAlpha;
	}

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public void setFillAlpha( double fillAlpha )
	{
		this.fillAlpha = fillAlpha;
	}

	/**
	 * Fill color.
	 */
	public String getFillColor()
	{
		return fillColor;
	}

	/**
	 * Fill color.
	 */
	public void setFillColor( String fillColor )
	{
		this.fillColor = fillColor;
	}

	/**
	 * Font size of guide label.
	 */
	public double getFontSize()
	{
		return fontSize;
	}

	/**
	 * Font size of guide label.
	 */
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public Boolean isInside()
	{
		return inside;
	}

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public void setInside( Boolean inside )
	{
		this.inside = inside;
	}

	/**
	 * The label which will be displayed near the guide.
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * The label which will be displayed near the guide.
	 */
	public void setLabel( String label )
	{
		this.label = label;
	}

	/**
	 * Rotation angle of a guide label.
	 */
	public double getLabelRotation()
	{
		return labelRotation;
	}

	/**
	 * Rotation angle of a guide label.
	 */
	public void setLabelRotation( double labelRotation )
	{
		this.labelRotation = labelRotation;
	}

	/**
	 * Line opacity.
	 */
	public double getLineAlpha()
	{
		return lineAlpha;
	}

	/**
	 * Line opacity.
	 */
	public void setLineAlpha( double lineAlpha )
	{
		this.lineAlpha = lineAlpha;
	}

	/**
	 * Line color.
	 */
	public String getLineColor()
	{
		return lineColor;
	}

	/**
	 * Line color.
	 */
	public void setLineColor( String lineColor )
	{
		this.lineColor = lineColor;
	}

	/**
	 * Line thickness.
	 */
	public double getLineThickness()
	{
		return lineThickness;
	}

	/**
	 * Line thickness.
	 */
	public void setLineThickness( double lineThickness )
	{
		this.lineThickness = lineThickness;
	}

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public void setPosition( String position )
	{
		this.position = position;
	}

	/**
	 * Tick length.
	 */
	public double getTickLength()
	{
		return tickLength;
	}

	/**
	 * Tick length.
	 */
	public void setTickLength( double tickLength )
	{
		this.tickLength = tickLength;
	}

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public double getToAngle()
	{
		return toAngle;
	}

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public void setToAngle( double toAngle )
	{
		this.toAngle = toAngle;
	}

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public String getToCategory()
	{
		return toCategory;
	}

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public void setToCategory( String toCategory )
	{
		this.toCategory = toCategory;
	}

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public Date getToDate()
	{
		return toDate;
	}

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public void setToDate( Date toDate )
	{
		this.toDate = toDate;
	}

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public double getToValue()
	{
		return toValue;
	}

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public void setToValue( double toValue )
	{
		this.toValue = toValue;
	}

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public void setValue( double value )
	{
		this.value = value;
	}

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public IsValueAxis getValueAxis()
	{
		return valueAxis;
	}

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public void setValueAxis( IsValueAxis valueAxis )
	{
		this.valueAxis = valueAxis;
	}
}
