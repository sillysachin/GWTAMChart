package com.amcharts.json;

import com.amcharts.api.IsAmPieChart;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart
{
	private String innerRadius;

	private Double labelRadius;

	private String labelRadiusField;

	private String labelText;

	private Double minRadius;

	private Double pieAlpha;

	private String pieX;

	private String pieY;

	private String pullOutRadius;

	private String radius;

	private Double startAngle;

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
	public Double getLabelRadius()
	{
		return labelRadius;
	}

	@Override
	public void setLabelRadius( Double labelRadius )
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
	public Double getMinRadius()
	{
		return minRadius;
	}

	@Override
	public void setMinRadius( Double minRadius )
	{
		this.minRadius = minRadius;
	}

	@Override
	public Double getPieAlpha()
	{
		return pieAlpha;
	}

	@Override
	public void setPieAlpha( Double pieAlpha )
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
	public Double getStartAngle()
	{
		return startAngle;
	}

	@Override
	public void setStartAngle( Double startAngle )
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