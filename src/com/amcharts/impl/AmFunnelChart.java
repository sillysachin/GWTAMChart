package com.amcharts.impl;

import com.amcharts.api.IsAmFunnelChart;
import com.amcharts.jso.AmFunnelChartJSO;

public class AmFunnelChart extends AmSlicedChart implements IsAmFunnelChart
{
	public AmFunnelChart()
	{
		jso = createJso();
		setType( "funnel" );
	}

	public native AmFunnelChartJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmFunnelChart();
		return chart;
	}-*/;

	public AmFunnelChartJSO getJso()
	{
		return ( AmFunnelChartJSO ) super.getJso();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getBaseWidth()
	 */
	@Override
	public String getBaseWidth()
	{
		return getJso().getBaseWidth();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setBaseWidth(java.lang.String)
	 */
	@Override
	public void setBaseWidth( String baseWidth )
	{
		this.getJso().setBaseWidth( baseWidth );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setFunnelAlpha(java.lang.String)
	 */
	@Override
	public void setFunnelAlpha( double funnelAlpha )
	{
		this.getJso().setFunnelAlpha( funnelAlpha );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getFunnelAlpha()
	 */
	@Override
	public double getFunnelAlpha()
	{
		return getJso().getFunnelAlpha();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getLabelPosition()
	 */
	@Override
	public String getLabelPosition()
	{
		return getJso().getLabelPosition();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setLabelPosition(java.lang.String)
	 */
	@Override
	public void setLabelPosition( String labelPosition )
	{
		this.getJso().setLabelPosition( labelPosition );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckHeight()
	 */
	@Override
	public String getNeckHeight()
	{
		return getJso().getNeckHeight();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckHeight(java.lang.String)
	 */
	@Override
	public void setNeckHeight( String neckHeight )
	{
		this.getJso().setNeckHeight( neckHeight );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckWidth()
	 */
	@Override
	public String getNeckWidth()
	{
		return getJso().getNeckWidth();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckWidth(java.lang.String)
	 */
	@Override
	public void setNeckWidth( String neckWidth )
	{
		this.getJso().setNeckWidth( neckWidth );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getPullDistance()
	 */
	@Override
	public String getPullDistance()
	{
		return getJso().getPullDistance();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setPullDistance(java.lang.String)
	 */
	@Override
	public void setPullDistance( String pullDistance )
	{
		this.getJso().setPullDistance( pullDistance );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#isRotate()
	 */
	@Override
	public boolean isRotate()
	{
		return getJso().isRotate();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setRotate(boolean)
	 */
	@Override
	public void setRotate( boolean rotate )
	{
		this.getJso().setRotate( rotate );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartX()
	 */
	@Override
	public double getStartX()
	{
		return getJso().getStartX();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartX(double)
	 */
	@Override
	public void setStartX( double startX )
	{
		this.getJso().setStartX( startX );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartY()
	 */
	@Override
	public double getStartY()
	{
		return getJso().getStartY();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartY(double)
	 */
	@Override
	public void setStartY( double startY )
	{
		this.getJso().setStartY( startY );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getValueRepresents()
	 */
	@Override
	public String getValueRepresents()
	{
		return getJso().getValueRepresents();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setValueRepresents(java.lang.String)
	 */
	@Override
	public void setValueRepresents( String valueRepresents )
	{
		this.getJso().setValueRepresents( valueRepresents );
	}

	public native void hide()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.hide();
	}-*/;

	public native void setBounds( double left, double top, double right, double bottom )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.setBounds(left, top, right, bottom);
	}-*/;

	public native void setPosition( double x, double y )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.setPosition(x, y);
	}-*/;

	public native void show( String value )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.show(value);
	}-*/;

}