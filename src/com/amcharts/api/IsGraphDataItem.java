package com.amcharts.api;

import java.util.List;

public interface IsGraphDataItem
{
	/**
	 * Opacity of the data item.
	 */
	public Double getAlpha();

	/**
	 * Opacity of the data item.
	 */
	public void setAlpha( Double alpha );

	/**
	 * Bullet type.
	 */
	public String getBullet();

	/**
	 * Bullet type.
	 */
	public void setBullet( String bullet );

	/**
	 * Bullet size.
	 */
	public Double getBulletSize();

	/**
	 * Bullet size.
	 */
	public void setBulletSize( Double bulletSize );

	/**
	 * Category value.
	 */
	public String getCategory();

	/**
	 * Category value.
	 */
	public void setCategory( String category );

	/**
	 * Color of the data item.
	 */
	public String getColor();

	/**
	 * Color of the data item.
	 */
	public void setColor( String color );

	/**
	 * Custom bullet (path to file name).
	 */
	public String getCustomBullet();

	/**
	 * Custom bullet (path to file name).
	 */
	public void setCustomBullet( String customBullet );

	/**
	 * Original object from data provider.
	 */
	public IsDataContext getDataContext();

	/**
	 * Original object from data provider.
	 */
	public void setDataContext( IsDataContext dataContext );

	/**
	 * Description.
	 */
	public String getDescription();

	/**
	 * Description.
	 */
	public void setDescription( String description );

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public List<String> getFillColors();

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public void setFillColors( List<String> fillColors );

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public IsPercents getPercents();

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public void setPercents( IsPercents percents );

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public IsSerialDataItem getSerialDataItem();

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public void setSerialDataItem( IsSerialDataItem serialDataItem );

	/**
	 * url
	 */
	public String getUrl();

	/**
	 * url
	 */
	public void setUrl( String url );

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public IsValues getValues();

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public void setValues( IsValues values );

	/**
	 * x coordinate of the data item.
	 */
	public Double getX();

	/**
	 * x coordinate of the data item.
	 */
	public void setX( Double x );

	/**
	 * y coordinate of the data item.
	 */
	public Double getY();

	/**
	 * y coordinate of the data item.
	 */
	public void setY( Double y );
}
