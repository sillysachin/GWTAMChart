package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsDataContext;
import com.amcharts.api.IsGraphDataItem;
import com.amcharts.api.IsSerialDataItem;

public final class GraphDataItem implements IsGraphDataItem
{
	private double alpha;

	private String bullet;

	private double bulletSize;

	private String category;

	private String color;

	private String customBullet;

	private IsDataContext dataContext;

	private String description;

	private List<String> fillColors;

	private Object percents;

	private IsSerialDataItem serialDataItem;

	private String url;

	private Object values;

	private double x;

	private double y;

	/**
	 * Opacity of the data item.
	 */
	public double getAlpha()
	{
		return alpha;
	}

	/**
	 * Opacity of the data item.
	 */
	public void setAlpha( double alpha )
	{
		this.alpha = alpha;
	}

	/**
	 * Bullet type.
	 */
	public String getBullet()
	{
		return bullet;
	}

	/**
	 * Bullet type.
	 */
	public void setBullet( String bullet )
	{
		this.bullet = bullet;
	}

	/**
	 * Bullet size.
	 */
	public double getBulletSize()
	{
		return bulletSize;
	}

	/**
	 * Bullet size.
	 */
	public void setBulletSize( double bulletSize )
	{
		this.bulletSize = bulletSize;
	}

	/**
	 * Category value.
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Category value.
	 */
	public void setCategory( String category )
	{
		this.category = category;
	}

	/**
	 * Color of the data item.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of the data item.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Custom bullet (path to file name).
	 */
	public String getCustomBullet()
	{
		return customBullet;
	}

	/**
	 * Custom bullet (path to file name).
	 */
	public void setCustomBullet( String customBullet )
	{
		this.customBullet = customBullet;
	}

	/**
	 * Original object from data provider.
	 */
	public IsDataContext getDataContext()
	{
		return dataContext;
	}

	/**
	 * Original object from data provider.
	 */
	public void setDataContext( IsDataContext dataContext )
	{
		this.dataContext = dataContext;
	}

	/**
	 * Description.
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Description.
	 */
	public void setDescription( String description )
	{
		this.description = description;
	}

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public List<String> getFillColors()
	{
		return fillColors;
	}

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public void setFillColors( List<String> fillColors )
	{
		this.fillColors = fillColors;
	}

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public Object getPercents()
	{
		return percents;
	}

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public void setPercents( Object percents )
	{
		this.percents = percents;
	}

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public IsSerialDataItem getSerialDataItem()
	{
		return serialDataItem;
	}

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public void setSerialDataItem( IsSerialDataItem serialDataItem )
	{
		this.serialDataItem = serialDataItem;
	}

	/**
	 * url
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * url
	 */
	public void setUrl( String url )
	{
		this.url = url;
	}

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public Object getValues()
	{
		return values;
	}

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public void setValues( Object values )
	{
		this.values = values;
	}

	/**
	 * x coordinate of the data item.
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * x coordinate of the data item.
	 */
	public void setX( double x )
	{
		this.x = x;
	}

	/**
	 * y coordinate of the data item.
	 */
	public double getY()
	{
		return y;
	}

	/**
	 * y coordinate of the data item.
	 */
	public void setY( double y )
	{
		this.y = y;
	}
}
