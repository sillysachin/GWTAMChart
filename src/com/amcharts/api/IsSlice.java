package com.amcharts.api;

import com.amcharts.impl.event.DataContext;

public interface IsSlice
{

	public abstract double getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	public abstract void setAlpha( double alpha )
	/*-{
		this.alpha = alpha;
	}-*/;

	public abstract String getColor()
	/*-{
		return this.color;
	}-*/;

	public abstract void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	public abstract DataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	public abstract void setDataContext( DataContext dataContext )
	/*-{
		this.dataContext = dataContext;
	}-*/;

	public abstract String getDescription()
	/*-{
		return this.description;
	}-*/;

	public abstract void setDescription( String description )
	/*-{
		this.description = description;
	}-*/;

	public abstract Boolean isHidden()
	/*-{
		return this.hidden;
	}-*/;

	public abstract void setHidden( Boolean hidden )
	/*-{
		this.hidden = hidden;
	}-*/;

	public abstract double getPercents()
	/*-{
		return this.percents;
	}-*/;

	public abstract void setPercents( double percents )
	/*-{
		this.percents = percents;
	}-*/;

	public abstract Boolean isPulled()
	/*-{
		return this.pulled;
	}-*/;

	public abstract void setPulled( Boolean pulled )
	/*-{
		this.pulled = pulled;
	}-*/;

	public abstract String getTitle()
	/*-{
		return this.title;
	}-*/;

	public abstract void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;

	public abstract String getUrl()
	/*-{
		return this.url;
	}-*/;

	public abstract void setUrl( String url )
	/*-{
		this.url = url;
	}-*/;

	public abstract double getValue()
	/*-{
		return this.value;
	}-*/;

	public abstract void setValue( double value )
	/*-{
		this.value = value;
	}-*/;

	public abstract Boolean isVisibleInLegend()
	/*-{
		return this.visibleInLegend;
	}-*/;

	public abstract void setVisibleInLegend( Boolean visibleInLegend )
	/*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;

}