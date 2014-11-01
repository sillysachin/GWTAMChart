package com.amcharts.impl;

import com.amcharts.api.IsAmPieChart;
import com.amcharts.jso.AmPieChartJSO;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart{
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

	public void setAngle( double angle )
	{
		getJso().setAngle( angle );
	}

	public double getAngle()
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

	public void setDepth3D( double depth3D )
	{
		getJso().setDepth3D( depth3D );
	}

	public double getDepth3D()
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
	public double getLabelRadius()
	{
		return getJso().getLabelRadius();
	}

	@Override
	public void setLabelRadius( double labelRadius )
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
	public double getMinRadius()
	{
		return getJso().getMinRadius();
	}

	@Override
	public void setMinRadius( double minRadius )
	{
		getJso().setMinRadius( minRadius );
	}

	@Override
	public double getPieAlpha()
	{
		return getJso().getPieAlpha();
	}

	@Override
	public void setPieAlpha( double pieAlpha )
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
	public double getStartAngle()
	{
		return getJso().getStartAngle();
	}

	@Override
	public void setStartAngle( double startAngle )
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

	public native void validateData()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.validateData();
	}-*/;

	public native void addTitle( String title )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.addTitle(title);
	}-*/;
}