package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsDataContext;
import com.amcharts.api.IsGraphDataItem;
import com.amcharts.api.IsPercents;
import com.amcharts.api.IsSerialDataItem;
import com.amcharts.api.IsValues;
import com.amcharts.impl.event.DataItem;

public final class GraphDataItem extends DataItem implements IsGraphDataItem
{
	protected GraphDataItem()
	{
	}

	public final native Double getColumnHeight()
	/*-{
		return this.columnHeight;
	}-*/;

	public final native void setColumnHeight( Double columnHeight )
	/*-{
		this.columnHeight = columnHeight;
	}-*/;

	public final native Double getColumnWidth()
	/*-{
		return this.columnWidth;
	}-*/;

	public final native void setColumnWidth( Double columnWidth )
	/*-{
		this.columnWidth = columnWidth;
	}-*/;

	public final native Boolean getIsNegative()
	/*-{
		return this.isNegative;
	}-*/;

	public final native void setIsNegative( Boolean isNegative )
	/*-{
		this.isNegative = isNegative;
	}-*/;

	/**
	 * Opacity of the data item.
	 */
	public final native Double getAlpha() /*-{
		return this.alpha;
	}-*/;

	/**
	 * Opacity of the data item.
	 */
	public final native void setAlpha( Double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * Bullet type.
	 */
	public final native String getBullet() /*-{
		return this.bullet;
	}-*/;

	/**
	 * Bullet type.
	 */
	public final native void setBullet( String bullet ) /*-{
		this.bullet = bullet;
	}-*/;

	/**
	 * Bullet size.
	 */
	public final native Double getBulletSize() /*-{
		return this.bulletSize;
	}-*/;

	/**
	 * Bullet size.
	 */
	public final native void setBulletSize( Double bulletSize ) /*-{
		this.bulletSize = bulletSize;
	}-*/;

	/**
	 * Category value.
	 */
	public final native String getCategory() /*-{
		return this.category;
	}-*/;

	/**
	 * Category value.
	 */
	public final native void setCategory( String category ) /*-{
		this.category = category;
	}-*/;

	/**
	 * Color of the data item.
	 */
	public final native String getColor() /*-{
		return this.color;
	}-*/;

	/**
	 * Color of the data item.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Custom bullet (path to file name).
	 */
	public final native String getCustomBullet() /*-{
		return this.customBullet;
	}-*/;

	/**
	 * Custom bullet (path to file name).
	 */
	public final native void setCustomBullet( String customBullet ) /*-{
		this.customBullet = customBullet;
	}-*/;

	/**
	 * Original object from data provider.
	 */
	public final native IsDataContext getDataContext() /*-{
		return this.dataContext;
	}-*/;

	/**
	 * Original object from data provider.
	 */
	public final native void setDataContext( IsDataContext dataContext ) /*-{
		this.dataContext = dataContext;
	}-*/;

	/**
	 * Description.
	 */
	public final native String getDescription() /*-{
		return this.description;
	}-*/;

	/**
	 * Description.
	 */
	public final native void setDescription( String description ) /*-{
		this.description = description;
	}-*/;

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public final native List<String> getFillColors() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.fillColors);
	}-*/;

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public final native void setFillColors( List<String> fillColors ) /*-{
		this.fillColors = @com.amcharts.impl.util.WrapperUtils::getJSOArray(Ljava/util/List;)(fillColors);
	}-*/;

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public final native IsPercents getPercents() /*-{
		return this.percents;
	}-*/;

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public final native void setPercents( IsPercents percents ) /*-{
		this.percents = percents;
	}-*/;

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public final native IsSerialDataItem getSerialDataItem() /*-{
		return this.serialDataItem;
	}-*/;

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public final native void setSerialDataItem( IsSerialDataItem serialDataItem ) /*-{
		this.serialDataItem = serialDataItem;
	}-*/;

	/**
	 * url
	 */
	public final native String getUrl() /*-{
		return this.url;
	}-*/;

	/**
	 * url
	 */
	public final native void setUrl( String url ) /*-{
		this.url = url;
	}-*/;

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public final native IsValues getValues() /*-{
		return this.values;
	}-*/;

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public final native void setValues( IsValues values ) /*-{
		this.values = values;
	}-*/;

	/**
	 * x coordinate of the data item.
	 */
	public final native Double getX() /*-{
		return this.x;
	}-*/;

	/**
	 * x coordinate of the data item.
	 */
	public final native void setX( Double x ) /*-{
		this.x = x;
	}-*/;

	/**
	 * y coordinate of the data item.
	 */
	public final native Double getY() /*-{
		return this.y;
	}-*/;

	/**
	 * y coordinate of the data item.
	 */
	public final native void setY( Double y ) /*-{
		this.y = y;
	}-*/;
}