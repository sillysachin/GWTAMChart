package com.amcharts.api;


public interface IsValueAxis
{

	public abstract IsTitle getTitle();

	public abstract void setTitle( IsTitle title );

	public abstract AxisPosition getPosition();

	public abstract void setPosition( AxisPosition position );

}