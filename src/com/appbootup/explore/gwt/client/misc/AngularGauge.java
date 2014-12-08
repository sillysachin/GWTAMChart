package com.appbootup.explore.gwt.client.misc;

import com.amcharts.impl.AmAngularGauge;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.GaugeArrow;
import com.amcharts.impl.GaugeAxis;
import com.amcharts.impl.GaugeBand;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class AngularGauge
{
	public AngularGauge()
	{
		GWTAMChart.chartService
				.getData( "/data/angularGauge.json", new AsyncCallback<String>()
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
		final GaugeAxis gaugeAxis = AmCharts.GaugeAxis();
		gaugeAxis.setAxisThickness( 1 );
		gaugeAxis.setAxisAlpha( 0.2 );
		gaugeAxis.setTickAlpha( 0.2 );
		gaugeAxis.setValueInterval( 20 );
		GaugeBand band1 = AmCharts.GaugeBand();
		band1.setColor( "#84b761" );
		band1.setEndValue( 90 );
		band1.setStartValue( 0 );
		gaugeAxis.addBand( band1 );
		GaugeBand band2 = AmCharts.GaugeBand();
		band2.setColor( "#fdd400" );
		band2.setEndValue( 130 );
		band2.setStartValue( 90 );
		gaugeAxis.addBand( band2 );
		GaugeBand band3 = AmCharts.GaugeBand();
		band3.setColor( "#cc4748" );
		band3.setEndValue( 220 );
		band3.setStartValue( 130 );
		band3.setInnerRadius( "95%" );
		gaugeAxis.addBand( band3 );
		gaugeAxis.setBottomText( "0 km/h" );
		gaugeAxis.setBottomTextYOffset( -20 );
		gaugeAxis.setEndValue( 220 );
		amAngularGauge.addAxis( gaugeAxis );

		final GaugeArrow gaugeArrow = AmCharts.GaugeArrow();
		gaugeArrow.setColor( "#67b7dc" );
		amAngularGauge.addArrow( gaugeArrow );
		amAngularGauge.setSize( "1240px", "500px" );

		Timer timer = new Timer()
		{
			@Override
			public void run()
			{
				randomValue( gaugeArrow, gaugeAxis );
			}
		};
		timer.scheduleRepeating( 2000 );
		//TODO: The clock swings mechanically with no animation.
		timer.run();
		RootLayoutPanel.get().add( amAngularGauge );

		randomValue( amAngularGauge );

		//TODO: List<IsGaugeAxis> axes = amAngularGauge.getAxes();
		//TODO: List<IsGaugeArrow> arrows = amAngularGauge.getArrows();
	}

	private void randomValue( final GaugeArrow gaugeArrow, final GaugeAxis gaugeAxis )
	{
		double value = Math.round( Math.random() * 200 );
		gaugeArrow.setValue( value );
		gaugeAxis.setBottomText( value + " km/h" );
	}

	private native void randomValue( final AmAngularGauge amAngularGauge )
	/*-{
		var gaugeChart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amAngularGauge);

		// setInterval(randomValue, 2000);

		function randomValue() {
			var value = Math.round(Math.random() * 200);
			if (gaugeChart) {
				if (gaugeChart.arrows) {
					if (gaugeChart.arrows[0]) {
						if (gaugeChart.arrows[0].setValue) {
							gaugeChart.arrows[0].setValue(value);
							gaugeChart.axes[0].setBottomText(value + " km/h");
						}
					}
				}
			}
		}
	}-*/;
}
