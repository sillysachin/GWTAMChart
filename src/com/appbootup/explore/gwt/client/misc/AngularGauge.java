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
		gaugeAxis.setBottomText( "0 km/h" );
		gaugeAxis.setBottomTextYOffset( -20 );
		gaugeAxis.setEndValue( 220 );
		amAngularGauge.addAxis( gaugeAxis );

		final GaugeArrow gaugeArrow = AmCharts.GaugeArrow();
		amAngularGauge.addArrow( gaugeArrow );
		amAngularGauge.setSize( "1240px", "500px" );
		LogUtils.log( amAngularGauge );
		LogUtils.log( amAngularGauge.getJso() );

		Timer timer = new Timer()
		{
			@Override
			public void run()
			{
				randomValue( gaugeArrow, gaugeAxis );
			}
		};
		timer.scheduleRepeating( 2000 );
		RootLayoutPanel.get().add( amAngularGauge );
		timer.run();

		//List<IsGaugeAxis> axes = amAngularGauge.getAxes();
		//GWT.log( "" + axes.size() );
		//List<IsGaugeArrow> arrows = amAngularGauge.getArrows();
		//GWT.log( "" + arrows.size() );
	}

	private void randomValue( final GaugeArrow gaugeArrow, final GaugeAxis gaugeAxis )
	{
		long value = Math.round( Math.random() * 200 );
		gaugeArrow.setValue( value );
		gaugeAxis.setBottomText( value + " km/h" );
	}
}
