package com.amcharts.json;

import com.amcharts.api.IsAmPieChart;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart
{
	private String innerRadius;

	private double labelRadius;

	private String labelRadiusField;

	private String labelText;

	private double minRadius;

	private double pieAlpha;

	private String pieX;

	private String pieY;

	private String pullOutRadius;

	private String radius;

	private double startAngle;

	private String startRadius;


	@Override
	public String getInnerRadius()
	{
		return innerRadius;
	}

	@Override
	public void setInnerRadius( String innerRadius )
	{
		this.innerRadius = innerRadius;
	}

	@Override
	public double getLabelRadius()
	{
		return labelRadius;
	}

	@Override
	public void setLabelRadius( double labelRadius )
	{
		this.labelRadius = labelRadius;
	}

	@Override
	public String getLabelRadiusField()
	{
		return labelRadiusField;
	}

	@Override
	public void setLabelRadiusField( String labelRadiusField )
	{
		this.labelRadiusField = labelRadiusField;
	}

	@Override
	public String getLabelText()
	{
		return labelText;
	}

	@Override
	public void setLabelText( String labelText )
	{
		this.labelText = labelText;
	}

	@Override
	public double getMinRadius()
	{
		return minRadius;
	}

	@Override
	public void setMinRadius( double minRadius )
	{
		this.minRadius = minRadius;
	}

	@Override
	public double getPieAlpha()
	{
		return pieAlpha;
	}

	@Override
	public void setPieAlpha( double pieAlpha )
	{
		this.pieAlpha = pieAlpha;
	}

	@Override
	public String getPieX()
	{
		return pieX;
	}

	@Override
	public void setPieX( String pieX )
	{
		this.pieX = pieX;
	}

	@Override
	public String getPieY()
	{
		return pieY;
	}

	@Override
	public void setPieY( String pieY )
	{
		this.pieY = pieY;
	}

	@Override
	public String getPullOutRadius()
	{
		return pullOutRadius;
	}

	@Override
	public void setPullOutRadius( String pullOutRadius )
	{
		this.pullOutRadius = pullOutRadius;
	}

	@Override
	public String getRadius()
	{
		return radius;
	}

	@Override
	public void setRadius( String radius )
	{
		this.radius = radius;
	}

	@Override
	public double getStartAngle()
	{
		return startAngle;
	}

	@Override
	public void setStartAngle( double startAngle )
	{
		this.startAngle = startAngle;
	}

	@Override
	public String getStartRadius()
	{
		return startRadius;
	}

	@Override
	public void setStartRadius( String startRadius )
	{
		this.startRadius = startRadius;
	}
}