package com.amcharts.json;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsMenuItemOutput;

public final class MenuItemOutput implements IsMenuItemOutput
{
	private String backgroundColor;

	private String fileName;

	private String format;

	private String output;

	private String render;

	private double dpi;

	private IsFunction onclick;

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public void setBackgroundColor( String backgroundColor )
	{
		this.backgroundColor = backgroundColor;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName( String fileName )
	{
		this.fileName = fileName;
	}

	public String getFormat()
	{
		return format;
	}

	public void setFormat( String format )
	{
		this.format = format;
	}

	public String getOutput()
	{
		return output;
	}

	public void setOutput( String output )
	{
		this.output = output;
	}

	public String getRender()
	{
		return render;
	}

	public void setRender( String render )
	{
		this.render = render;
	}

	public double getDpi()
	{
		return dpi;
	}

	public void setDpi( double dpi )
	{
		this.dpi = dpi;
	}

	public IsFunction getOnclick()
	{
		return onclick;
	}

	public void setOnclick( IsFunction onclick )
	{
		this.onclick = onclick;
	}
}