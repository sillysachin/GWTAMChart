package com.amcharts.impl;

import com.amcharts.api.IsAmPieChart;
import com.amcharts.jso.AmPieChartJSO;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart
{
	public AmPieChart()
	{
		jso = createJso();
		setType( "pie" );
	}

	public native AmPieChartJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmPieChart();
		return chart;
	}-*/;

	public AmPieChartJSO getJso()
	{
		return ( AmPieChartJSO ) super.getJso();
	}

	public void setAngle( Double angle )
	{
		getJso().setAngle( angle );
	}

	public Double getAngle()
	{
		return getJso().getAngle();
	}

	@Override
	public String getBalloonText()
	{
		return getJso().getBalloonText();
	}

	@Override
	public void setBalloonText( String balloonText )
	{
		getJso().setBalloonText( balloonText );
	}

	public void setDepth3D( Double depth3D )
	{
		//TODO: The pie chart is not rendered clearly. casting is causing a bug.
		getJso().setDepth3D( depth3D );
	}

	public Double getDepth3D()
	{
		return getJso().getDepth3D();
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
	public Float getLabelRadius()
	{
		return getJso().getLabelRadius();
	}

	@Override
	public void setLabelRadius( Float labelRadius )
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
	public Float getMinRadius()
	{
		return getJso().getMinRadius();
	}

	@Override
	public void setMinRadius( Float minRadius )
	{
		getJso().setMinRadius( minRadius );
	}

	@Override
	public Float getPieAlpha()
	{
		return getJso().getPieAlpha();
	}

	@Override
	public void setPieAlpha( Float pieAlpha )
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
	public Float getStartAngle()
	{
		return getJso().getStartAngle();
	}

	@Override
	public void setStartAngle( Float startAngle )
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