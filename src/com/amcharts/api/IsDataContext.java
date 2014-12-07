package com.amcharts.api;


public interface IsDataContext
{
	public abstract Integer getId();

	public abstract void setId( Integer id );

	public abstract String getClassName();

	public abstract void setClassName( String className );

	public abstract String getColor();

	public abstract void setColor( String color );

	public abstract String getPercent();

	public abstract void setPercent( String percent );

	public abstract String getType();

	public abstract void setType( String type );

	public abstract String getSubSetTitle();
}