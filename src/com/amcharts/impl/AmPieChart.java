package com.amcharts.impl;

import com.amcharts.api.IsAmPieChart;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.mouse.piechart.AmPieChartEventUtils;
import com.amcharts.impl.event.mouse.piechart.ClickSliceEvent;
import com.amcharts.impl.event.mouse.piechart.ClickSliceHandler;
import com.amcharts.impl.event.mouse.piechart.HasClickSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.HasPullInSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.HasPullOutSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.HasRightClickSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.HasRollOutSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.HasRollOverSliceHandlers;
import com.amcharts.impl.event.mouse.piechart.PullInSliceEvent;
import com.amcharts.impl.event.mouse.piechart.PullInSliceHandler;
import com.amcharts.impl.event.mouse.piechart.PullOutSliceEvent;
import com.amcharts.impl.event.mouse.piechart.PullOutSliceHandler;
import com.amcharts.impl.event.mouse.piechart.RightClickSliceEvent;
import com.amcharts.impl.event.mouse.piechart.RightClickSliceHandler;
import com.amcharts.impl.event.mouse.piechart.RollOutSliceEvent;
import com.amcharts.impl.event.mouse.piechart.RollOutSliceHandler;
import com.amcharts.impl.event.mouse.piechart.RollOverSliceEvent;
import com.amcharts.impl.event.mouse.piechart.RollOverSliceHandler;
import com.amcharts.jso.AmPieChartJSO;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Event;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart, HasClickSliceHandlers, HasRightClickSliceHandlers, HasRollOutSliceHandlers, HasRollOverSliceHandlers, HasPullInSliceHandlers, HasPullOutSliceHandlers
{
	public AmPieChart()
	{
		jso = createJso();
		setType( "pie" );
		initListener( ClickSliceEvent.getName() );
		initListener( RightClickSliceEvent.getName() );
		initListener( PullInSliceEvent.getName() );
		initListener( PullOutSliceEvent.getName() );
		initListener( RollOutSliceEvent.getName() );
		initListener( RollOverSliceEvent.getName() );
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

	public native void addListener( String eventName, AmChartListener amChartListener )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amPieChartThis = this;
		chart
				.addListener(
						eventName,
						function(event) {
							amChartListener.@com.amcharts.impl.event.AmChartListener::function(Lcom/amcharts/impl/event/AmChartEvent;)(event);
						});
	}-*/;

	private void fireEvent( Event event )
	{
		super.fireEvent( AmPieChartEventUtils.createEvent( event ) );
	}

	private native void initListener( String eventName )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amPieChartThis = this;
		chart
				.addListener(
						eventName,
						function(event) {
							amPieChartThis.@com.amcharts.impl.AmPieChart::fireEvent(Lcom/google/gwt/user/client/Event;)(event);
						});
	}-*/;

	@Override
	public HandlerRegistration addClickSliceHandler( ClickSliceHandler handler )
	{
		return addHandler( handler, ClickSliceEvent.getType() );
	}

	@Override
	public HandlerRegistration addPullOutSliceHandler( PullOutSliceHandler handler )
	{
		return addHandler( handler, PullOutSliceEvent.getType() );
	}

	@Override
	public HandlerRegistration addPullInSliceHandler( PullInSliceHandler handler )
	{
		return addHandler( handler, PullInSliceEvent.getType() );
	}

	@Override
	public HandlerRegistration addRollOverSliceHandler( RollOverSliceHandler handler )
	{
		return addHandler( handler, RollOverSliceEvent.getType() );
	}

	@Override
	public HandlerRegistration addRollOutSliceHandler( RollOutSliceHandler handler )
	{
		return addHandler( handler, RollOutSliceEvent.getType() );
	}

	@Override
	public HandlerRegistration addRightClickSliceHandler( RightClickSliceHandler handler )
	{
		return addHandler( handler, RightClickSliceEvent.getType() );
	}
}