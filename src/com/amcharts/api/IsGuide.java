package com.amcharts.api;

import java.util.Date;

public interface IsGuide
{
	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public Boolean isAbove();

	/**
	 * "If you set it to true, the guide will be displayed above the graphs."
	 */
	public void setAbove( Boolean above );

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public double getAngle();

	/**
	 * "Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines."
	 */
	public void setAngle( double angle );

	/**
	 * Baloon fill color.
	 */
	public String getBalloonColor();

	/**
	 * Baloon fill color.
	 */
	public void setBalloonColor( String balloonColor );

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public String getBalloonText();

	/**
	 * The text which will be displayed if the user rolls-over the guide.
	 */
	public void setBalloonText( String balloonText );

	/**
	 * Specifies if label should be bold or not.
	 */
	public Boolean isBoldLabel();

	/**
	 * Specifies if label should be bold or not.
	 */
	public void setBoldLabel( Boolean boldLabel );

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public String getCategory();

	/**
	 * Category of the guide (in case the guide is for category axis).
	 */
	public void setCategory( String category );

	/**
	 * Color of a guide label.
	 */
	public String getColor();

	/**
	 * Color of a guide label.
	 */
	public void setColor( String color );

	/**
	 * Dash length.
	 */
	public double getDashLength();

	/**
	 * Dash length.
	 */
	public void setDashLength( double dashLength );

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public Date getDate();

	/**
	 * Date of the guide (in case the guide is for category axis and parseDates is set to true).
	 */
	public void setDate( Date date );

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public Boolean isExpand();

	/**
	 * "Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell."
	 */
	public void setExpand( Boolean expand );

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public double getFillAlpha();

	/**
	 * Fill opacity. Value range is 0 - 1.
	 */
	public void setFillAlpha( double fillAlpha );

	/**
	 * Fill color.
	 */
	public String getFillColor();

	/**
	 * Fill color.
	 */
	public void setFillColor( String fillColor );

	/**
	 * Font size of guide label.
	 */
	public double getFontSize();

	/**
	 * Font size of guide label.
	 */
	public void setFontSize( double fontSize );

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public String getId();

	/**
	 * "Unique id of a Guide. You don't need to set it, unless you want to."
	 */
	public void setId( String id );

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public Boolean isInside();

	/**
	 * Specifies whether label should be placed inside or outside plot area.
	 */
	public void setInside( Boolean inside );

	/**
	 * The label which will be displayed near the guide.
	 */
	public String getLabel();

	/**
	 * The label which will be displayed near the guide.
	 */
	public void setLabel( String label );

	/**
	 * Rotation angle of a guide label.
	 */
	public double getLabelRotation();

	/**
	 * Rotation angle of a guide label.
	 */
	public void setLabelRotation( double labelRotation );

	/**
	 * Line opacity.
	 */
	public double getLineAlpha();

	/**
	 * Line opacity.
	 */
	public void setLineAlpha( double lineAlpha );

	/**
	 * Line color.
	 */
	public String getLineColor();

	/**
	 * Line color.
	 */
	public void setLineColor( String lineColor );

	/**
	 * Line thickness.
	 */
	public double getLineThickness();

	/**
	 * Line thickness.
	 */
	public void setLineThickness( double lineThickness );

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public String getPosition();

	/**
	 * Position of guide label. Possible values are 'left' or 'right' for horizontal axis and 'top' or 'bottom' for vertical axis.
	 */
	public void setPosition( String position );

	/**
	 * Tick length.
	 */
	public double getTickLength();

	/**
	 * Tick length.
	 */
	public void setTickLength( double tickLength );

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public double getToAngle();

	/**
	 * "Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines."
	 */
	public void setToAngle( double toAngle );

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public String getToCategory();

	/**
	 * To' category of the guide (in case the guide is for category axis).
	 */
	public void setToCategory( String toCategory );

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public Date getToDate();

	/**
	 * "To' date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both date and toDate, the space between these two dates can be filled with color."
	 */
	public void setToDate( Date toDate );

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public double getToValue();

	/**
	 * To' value of the guide (in case the guide is for value axis).
	 */
	public void setToValue( double toValue );

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public double getValue();

	/**
	 * Value of the guide (in case the guide is for value axis).
	 */
	public void setValue( double value );

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public IsValueAxis getValueAxis();

	/**
	 * "Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value axis should be used."
	 */
	public void setValueAxis( IsValueAxis valueAxis );
}
