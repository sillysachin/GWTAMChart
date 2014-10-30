package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmBalloon;
import com.amcharts.api.IsAmChart;
import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsLegend;
import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsLabel;
import com.amcharts.api.IsTitle;
import com.amcharts.jso.AmChartJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AmChart extends Composite implements IsAmChart, IJavaScriptWrapper<AmChartJSO>
{
	protected AmChartJSO jso;

	String id;

	private LayoutPanel divWrapper = new LayoutPanel();

	protected AmChart()
	{
		init();
	}

	private void init()
	{
		String id = Document.get().createUniqueId();
		setId( id );
		initWidget( divWrapper );
	}

	private void init( JavaScriptObject configJSO )
	{
		init();
		jso = makeChart( getId(), configJSO );
	}

	public void setId( String id )
	{
		this.id = id;
		divWrapper.getElement().setId( id );
		// TODO: need to verify how this impacts the chart which uses the id for finding the parent container.
	}

	public String getId()
	{
		return id;
	}

	public native AmChartJSO makeChart( String containerId, JavaScriptObject configJSO )
	/*-{
		this.@com.amcharts.impl.AmChart::setId(Ljava/lang/String;)(containerId);
		return $wnd.AmCharts.makeChart(containerId, configJSO);
	}-*/;

	public native JavaScriptObject makeChart( JavaScriptObject configJSO )
	/*-{
		var containerId = this.@com.amcharts.impl.AmChart::getId();
		return $wnd.AmCharts.makeChart(containerId, configJSO);
	}-*/;

	@Override
	public AmChartJSO getJso()
	{
		return jso;
	}

	@Override
	public void setJso( AmChartJSO jso )
	{
		this.jso = jso;
	}

	@Override
	protected void onLoad()
	{
		String id = getId();
		write( id );
	}

	public native void write( String containerId )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.write(containerId);
	}-*/;

	public native void addGraph( AmGraph amGraph )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amGraph)
		chart.addGraph(graph);
	}-*/;

	public native void addValueAxis( ValueAxis valueAxis )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(valueAxis)
		chart.addValueAxis(valueAxis);
	}-*/;

	public native void addChartCursor( ChartCursor chartCursor )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var chartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartCursor)
		chart.addChartCursor(chartCursor);
	}-*/;

	public native void addChartScrollbar( ChartScrollbar chartScrollbar )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var chartScrollbar = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartScrollbar)
		chart.addChartScrollbar(chartScrollbar);
	}-*/;

	public native void addTrendLine( TrendLine trendLine )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var trendLine = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(trendLine)
		chart.addTrendLine(trendLine);
	}-*/;

	// TODO:Need to provide a better alternative than JavaScriptObject dataProvider.
	public native void setDataProvider( JavaScriptObject dataProvider )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.dataProvider = dataProvider;
	}-*/;

	public native void setCategoryField( String categoryField )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.categoryField = categoryField;
	}-*/;

	public native void setType( String type )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.type = type;
	}-*/;

	public native String getType()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.type;
	}-*/;

	public native void setTitleField( String titleField )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.titleField = titleField;
	}-*/;

	public native String getTitleField()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.titleField;
	}-*/;

	public native void setValueField( String valueField )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.valueField = valueField;
	}-*/;

	public native String getValueField()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.valueField;
	}-*/;

	public native String getDataDateFormat()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.dataDateFormat;
	}-*/;

	public native void setDataDateFormat( String dataDateFormat )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.dataDateFormat = dataDateFormat;
	}-*/;

	public native String getPathToImages()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.pathToImages;
	}-*/;

	public native void setPathToImages( String pathToImages )
	/*-{
		this.@com.amcharts.impl.AmChart::jso.pathToImages = pathToImages;
	}-*/;

	public native JavaScriptObject getCategoryAxisJSO()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var categoryAxis = chart.categoryAxis;
		return categoryAxis;
	}-*/;

	@Override
	public native List<IsLabel> getAllLabels() /*-{
		return this.@com.amcharts.impl.AmChart::jso.allLabels;
	}-*/;

	@Override
	public native void setAllLabels( List<IsLabel> allLabels ) /*-{
		this.@com.amcharts.impl.AmChart::jso.allLabels = allLabels;
	}-*/;

	@Override
	public native IsAmExport getAmExport() /*-{
		return this.@com.amcharts.impl.AmChart::jso.amExport;
	}-*/;

	@Override
	public native void setAmExport( IsAmExport amExport ) /*-{
		this.@com.amcharts.impl.AmChart::jso.amExport = amExport;
	}-*/;

	@Override
	public native double getBackgroundAlpha() /*-{
		return this.@com.amcharts.impl.AmChart::jso.backgroundAlpha;
	}-*/;

	@Override
	public native void setBackgroundAlpha( double backgroundAlpha ) /*-{
		this.@com.amcharts.impl.AmChart::jso.backgroundAlpha = backgroundAlpha;
	}-*/;

	@Override
	public native String getBackgroundColor() /*-{
		return this.@com.amcharts.impl.AmChart::jso.backgroundColor;
	}-*/;

	@Override
	public native void setBackgroundColor( String backgroundColor ) /*-{
		this.@com.amcharts.impl.AmChart::jso.backgroundColor = backgroundColor;
	}-*/;

	@Override
	public native IsAmBalloon getBalloon() /*-{
		return this.@com.amcharts.impl.AmChart::jso.balloon;
	}-*/;

	@Override
	public native void setBalloon( IsAmBalloon balloon ) /*-{
		this.@com.amcharts.impl.AmChart::jso.balloon = balloon;
	}-*/;

	@Override
	public native double getBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmChart::jso.borderAlpha;
	}-*/;

	@Override
	public native void setBorderAlpha( double borderAlpha ) /*-{
		this.@com.amcharts.impl.AmChart::jso.borderAlpha = borderAlpha;
	}-*/;

	@Override
	public native String getBorderColor() /*-{
		return this.@com.amcharts.impl.AmChart::jso.borderColor;
	}-*/;

	@Override
	public native void setBorderColor( String borderColor ) /*-{
		this.@com.amcharts.impl.AmChart::jso.borderColor = borderColor;
	}-*/;

	@Override
	public native String getColor() /*-{
		return this.@com.amcharts.impl.AmChart::jso.color;
	}-*/;

	@Override
	public native void setColor( String color ) /*-{
		this.@com.amcharts.impl.AmChart::jso.color = color;
	}-*/;

	@Override
	public native String getCreditsPosition() /*-{
		return this.@com.amcharts.impl.AmChart::jso.creditsPosition;
	}-*/;

	@Override
	public native void setCreditsPosition( String creditsPosition ) /*-{
		this.@com.amcharts.impl.AmChart::jso.creditsPosition = creditsPosition;
	}-*/;

	@Override
	public native List< ? extends Object> getDataProvider() /*-{
		return this.@com.amcharts.impl.AmChart::jso.dataProvider;
	}-*/;

	@Override
	public native void setDataProvider( List< ? extends Object> dataProvider ) /*-{
		this.@com.amcharts.impl.AmChart::jso.dataProvider = dataProvider;
	}-*/;

	@Override
	public native String getDecimalSeparator() /*-{
		return this.@com.amcharts.impl.AmChart::jso.decimalSeparator;
	}-*/;

	@Override
	public native void setDecimalSeparator( String decimalSeparator ) /*-{
		this.@com.amcharts.impl.AmChart::jso.decimalSeparator = decimalSeparator;
	}-*/;

	@Override
	public native IsExportConfig getExportConfig() /*-{
		var exportConfig = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.exportConfig)
		return exportConfig;
	}-*/;

	@Override
	public native void setExportConfig( IsExportConfig exportConfig ) /*-{
		var varExportConfig = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(exportConfig)
		this.@com.amcharts.impl.AmChart::jso.exportConfig = varExportConfig;
	}-*/;

	@Override
	public native String getFontFamily() /*-{
		return this.@com.amcharts.impl.AmChart::jso.fontFamily;
	}-*/;

	@Override
	public native void setFontFamily( String fontFamily ) /*-{
		this.@com.amcharts.impl.AmChart::jso.fontFamily = fontFamily;
	}-*/;

	@Override
	public native double getFontSize() /*-{
		return this.@com.amcharts.impl.AmChart::jso.fontSize;
	}-*/;

	@Override
	public native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.AmChart::jso.fontSize = fontSize;
	}-*/;

	@Override
	public native Boolean getHandDrawn() /*-{
		return this.@com.amcharts.impl.AmChart::jso.handDrawn;
	}-*/;

	@Override
	public native void setHandDrawn( Boolean handDrawn ) /*-{
		this.@com.amcharts.impl.AmChart::jso.handDrawn = handDrawn;
	}-*/;

	@Override
	public native double getHandDrawScatter() /*-{
		return this.@com.amcharts.impl.AmChart::jso.handDrawScatter;
	}-*/;

	@Override
	public native void setHandDrawScatter( double handDrawScatter ) /*-{
		this.@com.amcharts.impl.AmChart::jso.handDrawScatter = handDrawScatter;
	}-*/;

	@Override
	public native double getHandDrawThickness() /*-{
		return this.@com.amcharts.impl.AmChart::jso.handDrawThickness;
	}-*/;

	@Override
	public native void setHandDrawThickness( double handDrawThickness ) /*-{
		this.@com.amcharts.impl.AmChart::jso.handDrawThickness = handDrawThickness;
	}-*/;

	@Override
	public native Integer getHideBalloonTime() /*-{
		return this.@com.amcharts.impl.AmChart::jso.hideBalloonTime;
	}-*/;

	@Override
	public native void setHideBalloonTime( Integer hideBalloonTime ) /*-{
		this.@com.amcharts.impl.AmChart::jso.hideBalloonTime = hideBalloonTime;
	}-*/;

	@Override
	public native String getLanguage() /*-{
		return this.@com.amcharts.impl.AmChart::jso.language;
	}-*/;

	@Override
	public native void setLanguage( String language ) /*-{
		this.@com.amcharts.impl.AmChart::jso.language = language;
	}-*/;

	@Override
	public native IsLegend getLegend() /*-{
		var legend = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.legend)
		return legend;
	}-*/;

	@Override
	public native void setLegend( IsLegend legend ) /*-{
		var varLegend = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(legend)
		this.@com.amcharts.impl.AmChart::jso.legend = varLegend;
	}-*/;

	@Override
	public native String getLegendDiv() /*-{
		return this.@com.amcharts.impl.AmChart::jso.legendDiv;
	}-*/;

	@Override
	public native void setLegendDiv( String legendDiv ) /*-{
		this.@com.amcharts.impl.AmChart::jso.legendDiv = legendDiv;
	}-*/;

	@Override
	public native Boolean getPanEventsEnabled() /*-{
		return this.@com.amcharts.impl.AmChart::jso.panEventsEnabled;
	}-*/;

	@Override
	public native void setPanEventsEnabled( Boolean panEventsEnabled ) /*-{
		this.@com.amcharts.impl.AmChart::jso.panEventsEnabled = panEventsEnabled;
	}-*/;

	@Override
	public native double getPercentPrecision() /*-{
		return this.@com.amcharts.impl.AmChart::jso.percentPrecision;
	}-*/;

	@Override
	public native void setPercentPrecision( double percentPrecision ) /*-{
		this.@com.amcharts.impl.AmChart::jso.percentPrecision = percentPrecision;
	}-*/;

	@Override
	public native double getPrecision() /*-{
		return this.@com.amcharts.impl.AmChart::jso.precision;
	}-*/;

	@Override
	public native void setPrecision( double precision ) /*-{
		this.@com.amcharts.impl.AmChart::jso.precision = precision;
	}-*/;

	@Override
	public native List<Object> getPrefixesOfBigNumbers() /*-{
		return this.@com.amcharts.impl.AmChart::jso.prefixesOfBigNumbers;
	}-*/;

	@Override
	public native void setPrefixesOfBigNumbers( List<Object> prefixesOfBigNumbers ) /*-{
		this.@com.amcharts.impl.AmChart::jso.prefixesOfBigNumbers = prefixesOfBigNumbers;
	}-*/;

	@Override
	public native List<Object> getPrefixesOfSmallNumbers() /*-{
		return this.@com.amcharts.impl.AmChart::jso.prefixesOfSmallNumbers;
	}-*/;

	@Override
	public native void setPrefixesOfSmallNumbers( List<Object> prefixesOfSmallNumbers ) /*-{
		this.@com.amcharts.impl.AmChart::jso.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
	}-*/;

	@Override
	public native String getTheme() /*-{
		return this.@com.amcharts.impl.AmChart::jso.theme;
	}-*/;

	@Override
	public native void setTheme( String theme ) /*-{
		this.@com.amcharts.impl.AmChart::jso.theme = theme;

	}-*/;

	@Override
	public native String getThousandsSeparator() /*-{
		return this.@com.amcharts.impl.AmChart::jso.thousandsSeparator;
	}-*/;

	@Override
	public native void setThousandsSeparator( String thousandsSeparator ) /*-{
		this.@com.amcharts.impl.AmChart::jso.thousandsSeparator = thousandsSeparator;
	}-*/;

	@Override
	public native List<IsTitle> getTitles() /*-{
		return this.@com.amcharts.impl.AmChart::jso.titles;
	}-*/;

	@Override
	public native void setTitles( List<IsTitle> titles ) /*-{
		this.@com.amcharts.impl.AmChart::jso.titles = titles;
	}-*/;

	@Override
	public native Boolean getUsePrefixes() /*-{
		this.@com.amcharts.impl.AmChart::jso.usePrefixes = usePrefixes;
	}-*/;

	@Override
	public native void setUsePrefixes( Boolean usePrefixes ) /*-{
		return this.@com.amcharts.impl.AmChart::jso.usePrefixes;
	}-*/;

	@Override
	public native String getVersion() /*-{
		this.@com.amcharts.impl.AmChart::jso.version = version;
	}-*/;

	@Override
	public native void setVersion( String version ) /*-{
		return this.@com.amcharts.impl.AmChart::jso.version;
	}-*/;
}