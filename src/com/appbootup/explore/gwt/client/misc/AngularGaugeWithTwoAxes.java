package com.appbootup.explore.gwt.client.misc;

import com.amcharts.impl.AmAngularGauge;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.GaugeArrow;
import com.amcharts.impl.GaugeAxis;
import com.amcharts.impl.util.LogUtils;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class AngularGaugeWithTwoAxes
{
	public AngularGaugeWithTwoAxes()
	{
		GWTAMChart.chartService
				.getData( "/data/angularGaugeWithTwoAxes.json", new AsyncCallback<String>()
				{
					@Override
					public void onSuccess( String chartData )
					{
						JsArray<JavaScriptObject> dataProvider = JsonUtils
								.unsafeEval( chartData );
						drawChart( dataProvider );
					}

					@Override
					public void onFailure( Throwable caught )
					{
						GWT.log( "This Sucks", caught );
					}
				} );
	}

	protected void drawChart( JsArray<JavaScriptObject> chartData )
	{
		AmAngularGauge amAngularGauge = AmCharts.AmAngularGauge();
		amAngularGauge.setTheme( "none" );
		GaugeAxis gaugeAxis1 = AmCharts.GaugeAxis();
		gaugeAxis1.setAxisColor( "#67b7dc" );
		gaugeAxis1.setAxisThickness( 3 );
		gaugeAxis1.setEndValue( 240 );
		gaugeAxis1.setGridInside( false );
		gaugeAxis1.setInside( false );
		gaugeAxis1.setRadius( "100%" );
		gaugeAxis1.setValueInterval( 20 );
		gaugeAxis1.setTickColor( "#67b7dc" );
		amAngularGauge.addAxis( gaugeAxis1 );
		GaugeAxis gaugeAxis2 = AmCharts.GaugeAxis();
		gaugeAxis2.setAxisColor( "#fdd400" );
		gaugeAxis2.setAxisThickness( 3 );
		gaugeAxis2.setEndValue( 160 );
		gaugeAxis2.setRadius( "80%" );
		gaugeAxis2.setValueInterval( 20 );
		gaugeAxis2.setTickColor( "#fdd400" );
		amAngularGauge.addAxis( gaugeAxis2 );

		final GaugeArrow gaugeArrow = AmCharts.GaugeArrow();
		gaugeArrow.setColor( "#67b7dc" );
		gaugeArrow.setInnerRadius( "20%" );
		gaugeArrow.setNailRadius( 0 );
		gaugeArrow.setRadius( "85%" );
		amAngularGauge.addArrow( gaugeArrow );
		amAngularGauge.setSize( "1240px", "500px" );
		amAngularGauge.setFaceColor( "#000000" );
		Timer timer = new Timer()
		{
			@Override
			public void run()
			{
				randomValue( gaugeArrow );
			}
		};
		timer.scheduleRepeating( 2000 );
		//TODO: The clock swings mechanically with no animation.
		timer.run();
		RootLayoutPanel.get().add( amAngularGauge );

		//List<IsGaugeAxis> axes = amAngularGauge.getAxes();
		//List<IsGaugeArrow> arrows = amAngularGauge.getArrows();
	}

	private void randomValue( final GaugeArrow gaugeArrow )
	{
		long value = Math.round( Math.random() * 240 );
		gaugeArrow.setValue( value );
		// TODO: getArrows() will throw exception. Spike on JsArrayUtils and JsArray.
		//amAngularGauge.getArrows().get( 0 ).setValue( value );
	}
}
