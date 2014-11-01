package com.appbootup.explore.gwt.client;

import com.amcharts.api.IsLegend;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Legend;
import com.amcharts.impl.MenuItem;
import com.amcharts.jso.AmPieChartJSO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class PieChartWithLegend
{
	public PieChartWithLegend()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/pieChartWithLegend.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( chartData );
				simplePieChart( pieDataProvider );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	protected void simplePieChart( JavaScriptObject chartData )
	{
		AmPieChart amPieChart = new AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		Legend legend = new Legend();
		legend.setMarkerType( "circle" );
		legend.setPosition( "right" );
		legend.setMarginRight( 80 );
		legend.setAutoMargins( false );
		amPieChart.setLegend( ( IsLegend ) legend );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setSize( "1024px", "500px" );
		amPieChart.setBalloonText( "[[title]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>" );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		exportConfig.setMenuTop( "0px" );
		amPieChart.setExportConfig( exportConfig );
		AmPieChartJSO jso = amPieChart.getJso();
		log( jso );
		RootLayoutPanel.get().add( amPieChart );
	}

	private native void log( JavaScriptObject jso )
	/*-{
		//console.log(jso);
		//JSON.stringify(jso, null, 4)
	}-*/;
}