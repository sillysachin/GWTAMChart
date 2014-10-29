package com.amcharts.api;

public interface IsMenuItem
{

	public abstract String getIcon() /*-{
										return this.@com.amcharts.impl.MenuItem::jso.icon;
										}-*/;

	public abstract void setIcon( String icon ) /*-{
												this.@com.amcharts.impl.MenuItem::jso.icon = icon;
												}-*/;

	public abstract String getFormat() /*-{
										return this.@com.amcharts.impl.MenuItem::jso.format;
										}-*/;

	public abstract void setFormat( String format ) /*-{
													this.@com.amcharts.impl.MenuItem::jso.format = format;
													}-*/;

}