package com.amcharts.impl;

import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.event.DataItem;

public class Slice extends DataItem
{
	protected Slice()
	{
	}

	public final native double getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	public final native void setAlpha( double alpha )
	/*-{
		this.alpha = alpha;
	}-*/;

	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	public final native DataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	public final native void setDataContext( DataContext dataContext )
	/*-{
		this.dataContext = dataContext;
	}-*/;

	public final native String getDescription()
	/*-{
		return this.description;
	}-*/;

	public final native void setDescription( String description )
	/*-{
		this.description = description;
	}-*/;

	public final native Boolean isHidden()
	/*-{
		return this.hidden;
	}-*/;

	public final native void setHidden( Boolean hidden )
	/*-{
		this.hidden = hidden;
	}-*/;

	public final native double getPercents()
	/*-{
		return this.percents;
	}-*/;

	public final native void setPercents( double percents )
	/*-{
		this.percents = percents;
	}-*/;

	public final native Boolean isPulled()
	/*-{
		return this.pulled;
	}-*/;

	public final native void setPulled( Boolean pulled )
	/*-{
		this.pulled = pulled;
	}-*/;

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;

	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl( String url )
	/*-{
		this.url = url;
	}-*/;

	public final native double getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue( double value )
	/*-{
		this.value = value;
	}-*/;

	public final native Boolean isVisibleInLegend()
	/*-{
		return this.visibleInLegend;
	}-*/;

	public final native void setVisibleInLegend( Boolean visibleInLegend )
	/*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;
}