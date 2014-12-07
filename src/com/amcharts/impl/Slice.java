package com.amcharts.impl;

import com.amcharts.api.IsDataContext;
import com.amcharts.api.IsSlice;
import com.amcharts.impl.event.DataItem;

public class Slice extends DataItem implements IsSlice
{
	protected Slice()
	{
	}

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getAlpha()
	 */
	@Override
	public final native double getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setAlpha(double)
	 */
	@Override
	public final native void setAlpha( double alpha )
	/*-{
		this.alpha = alpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getColor()
	 */
	@Override
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setColor(java.lang.String)
	 */
	@Override
	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getDataContext()
	 */
	@Override
	public final native IsDataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	public final native void setDataContext( IsDataContext dataContext )
	/*-{
		this.dataContext = dataContext;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getDescription()
	 */
	@Override
	public final native String getDescription()
	/*-{
		return this.description;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setDescription(java.lang.String)
	 */
	@Override
	public final native void setDescription( String description )
	/*-{
		this.description = description;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#isHidden()
	 */
	@Override
	public final native Boolean isHidden()
	/*-{
		return this.hidden;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setHidden(java.lang.Boolean)
	 */
	@Override
	public final native void setHidden( Boolean hidden )
	/*-{
		this.hidden = hidden;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getPercents()
	 */
	@Override
	public final native double getPercents()
	/*-{
		return this.percents;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setPercents(double)
	 */
	@Override
	public final native void setPercents( double percents )
	/*-{
		this.percents = percents;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#isPulled()
	 */
	@Override
	public final native Boolean isPulled()
	/*-{
		return this.pulled;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setPulled(java.lang.Boolean)
	 */
	@Override
	public final native void setPulled( Boolean pulled )
	/*-{
		this.pulled = pulled;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getTitle()
	 */
	@Override
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setTitle(java.lang.String)
	 */
	@Override
	public final native void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getUrl()
	 */
	@Override
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setUrl(java.lang.String)
	 */
	@Override
	public final native void setUrl( String url )
	/*-{
		this.url = url;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#getValue()
	 */
	@Override
	public final native double getValue()
	/*-{
		return this.value;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setValue(double)
	 */
	@Override
	public final native void setValue( double value )
	/*-{
		this.value = value;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#isVisibleInLegend()
	 */
	@Override
	public final native Boolean isVisibleInLegend()
	/*-{
		return this.visibleInLegend;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsSlice#setVisibleInLegend(java.lang.Boolean)
	 */
	@Override
	public final native void setVisibleInLegend( Boolean visibleInLegend )
	/*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;
}