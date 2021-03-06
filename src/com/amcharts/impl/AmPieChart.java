package com.amcharts.impl;

import com.amcharts.api.IsAmPieChart;
import com.amcharts.jso.AmPieChartJSO;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart
{

	public AmPieChart()
	{
	}

	public AmPieChart( String id )
	{
		super( id );
	}

	protected void init( String id )
	{
		super.init( id );
		jso = createJso();
		setType( "pie" );
	}

	private native AmPieChartJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmPieChart();
		return chart;
	}-*/;

	public AmPieChartJSO getJso()
	{
		return ( AmPieChartJSO ) super.getJso();
	}

	@Override
	public String getInnerRadius()
	{
		return getJso().getInnerRadius();
	}

	@Override
	public void setInnerRadius( String innerRadius )
	{
		getJso().setInnerRadius( innerRadius );
	}

	@Override
	public Double getLabelRadius()
	{
		return getJso().getLabelRadius();
	}

	@Override
	public void setLabelRadius( Double labelRadius )
	{
		getJso().setLabelRadius( labelRadius );
	}

	@Override
	public String getLabelRadiusField()
	{
		return getJso().getLabelRadiusField();
	}

	@Override
	public void setLabelRadiusField( String labelRadiusField )
	{
		getJso().setLabelRadiusField( labelRadiusField );
	}

	@Override
	public String getLabelText()
	{
		return getJso().getLabelText();
	}

	@Override
	public void setLabelText( String labelText )
	{
		getJso().setLabelText( labelText );
	}

	@Override
	public Double getMinRadius()
	{
		return getJso().getMinRadius();
	}

	@Override
	public void setMinRadius( Double minRadius )
	{
		getJso().setMinRadius( minRadius );
	}

	@Override
	public Double getPieAlpha()
	{
		return getJso().getPieAlpha();
	}

	@Override
	public void setPieAlpha( Double pieAlpha )
	{
		getJso().setPieAlpha( pieAlpha );
	}

	@Override
	public String getPieX()
	{
		return getJso().getPieX();
	}

	@Override
	public void setPieX( String pieX )
	{
		getJso().setPieX( pieX );
	}

	@Override
	public String getPieY()
	{
		return getJso().getPieY();
	}

	@Override
	public void setPieY( String pieY )
	{
		getJso().setPieY( pieY );
	}

	@Override
	public String getPullOutRadius()
	{
		return getJso().getPullOutRadius();
	}

	@Override
	public void setPullOutRadius( String pullOutRadius )
	{
		getJso().setPullOutRadius( pullOutRadius );
	}

	@Override
	public String getRadius()
	{
		return getJso().getRadius();
	}

	@Override
	public void setRadius( String radius )
	{
		getJso().setRadius( radius );
	}

	@Override
	public Double getStartAngle()
	{
		return getJso().getStartAngle();
	}

	@Override
	public void setStartAngle( Double startAngle )
	{
		getJso().setStartAngle( startAngle );
	}

	@Override
	public String getStartRadius()
	{
		return getJso().getStartRadius();
	}

	@Override
	public void setStartRadius( String startRadius )
	{
		getJso().setStartRadius( startRadius );
	}
}