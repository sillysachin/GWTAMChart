package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsGraphDataItem;
import com.amcharts.api.IsSerialDataItem;
import com.google.gwt.core.client.JavaScriptObject;

//TODO: implements IsSerialDataItem
//com.google.gwt.dev.jjs.InternalCompilerException: Already seen an implementing JSO subtype (SerialDataItem) for interface (IsSerialDataItem) while examining newly-added type (SerialDataItemJSO). This is a bug in JSORestrictionsChecker.
public final class GraphDataItemJSO extends JavaScriptObject //implements IsGraphDataItem
{
	protected GraphDataItemJSO()
	{
	}

	/**
	 * Opacity of the data item.
	 */
	public final native double getAlpha() /*-{
		return alpha;
	}-*/;

	/**
	 * Opacity of the data item.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * Bullet type.
	 */
	public final native String getBullet() /*-{
		return bullet;
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
	public final native double getBulletSize() /*-{
		return bulletSize;
	}-*/;

	/**
	 * Bullet size.
	 */
	public final native void setBulletSize( double bulletSize ) /*-{
		this.bulletSize = bulletSize;
	}-*/;

	/**
	 * Category value.
	 */
	public final native String getCategory() /*-{
		return category;
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
		return color;
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
		return customBullet;
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
	public final native Object getDataContext() /*-{
		return dataContext;
	}-*/;

	/**
	 * Original object from data provider.
	 */
	public final native void setDataContext( Object dataContext ) /*-{
		this.dataContext = dataContext;
	}-*/;

	/**
	 * Description.
	 */
	public final native String getDescription() /*-{
		return description;
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
		return fillColors;
	}-*/;

	/**
	 * "Array of colors of the data item, used by column and candlestick chart only."
	 */
	public final native void setFillColors( List<String> fillColors ) /*-{
		this.fillColors = fillColors;
	}-*/;

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public final native Object getPercents() /*-{
		return percents;
	}-*/;

	/**
	 * Object which holds percents when recalculateToPercents is set to true.
	 */
	public final native void setPercents( Object percents ) /*-{
		this.percents = percents;
	}-*/;

	/**
	 * SerialDataItem of this graphDataItem
	 */
	public final native IsSerialDataItem getSerialDataItem() /*-{
		return serialDataItem;
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
		return url;
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
	public final native Object getValues() /*-{
		return values;
	}-*/;

	/**
	 * "Object which holds values of the data item (value, open, close, low, high)."
	 */
	public final native void setValues( Object values ) /*-{
		this.values = values;
	}-*/;

	/**
	 * x coordinate of the data item.
	 */
	public final native double getX() /*-{
		return x;
	}-*/;

	/**
	 * x coordinate of the data item.
	 */
	public final native void setX( double x ) /*-{
		this.x = x;
	}-*/;

	/**
	 * y coordinate of the data item.
	 */
	public final native double getY() /*-{
		return y;
	}-*/;

	/**
	 * y coordinate of the data item.
	 */
	public final native void setY( double y ) /*-{
		this.y = y;
	}-*/;
}
