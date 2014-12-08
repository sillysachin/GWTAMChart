package com.amcharts.impl;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.AmChartDataObject;
import com.amcharts.api.IsAmBalloon;
import com.amcharts.api.IsAmChart;
import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsLabel;
import com.amcharts.api.IsNumberPrefix;
import com.amcharts.api.IsTitle;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartEventUtils;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.chart.DataUpdatedEvent;
import com.amcharts.impl.event.chart.DataUpdatedHandler;
import com.amcharts.impl.event.chart.DrawEvent;
import com.amcharts.impl.event.chart.DrawHandler;
import com.amcharts.impl.event.chart.HasDataUpdatedHandlers;
import com.amcharts.impl.event.chart.HasDrawHandlers;
import com.amcharts.impl.event.chart.HasInitHandlers;
import com.amcharts.impl.event.chart.HasRenderedHandlers;
import com.amcharts.impl.event.chart.InitEvent;
import com.amcharts.impl.event.chart.InitHandler;
import com.amcharts.impl.event.chart.RenderedEvent;
import com.amcharts.impl.event.chart.RenderedHandler;
import com.amcharts.jso.AmChartJSO;
import com.amcharts.jso.LabelJSO;
import com.amcharts.jso.TitleJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class AmChart<T extends AmChartDataObject> extends ResizeComposite implements IsAmChart<T>, IJavaScriptWrapper<AmChartJSO<T>>, HasDataUpdatedHandlers, HasDrawHandlers, HasInitHandlers, HasRenderedHandlers
{
	protected AmChartJSO<T> jso;

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
	}

	public String getId()
	{
		return id;
	}

	@Override
	public AmChartJSO<T> getJso()
	{
		return jso;
	}

	@Override
	public void setJso( AmChartJSO<T> jso )
	{
		this.jso = jso;
	}

	@Override
	protected void onLoad()
	{
		String id = getId();
		write( id );
	}

	public void addContent( IsWidget widget )
	{
		divWrapper.add( widget );
	}

	// TODO: Need to provide a better alternative than JsArray<JavaScriptObject> dataProvider.
	public native void setDataProvider( JsArray<JavaScriptObject> dataProvider )
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

	public native IsCategoryAxis getCategoryAxisJSO()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var categoryAxis = chart.categoryAxis;
		return categoryAxis;
	}-*/;

	@Override
	public List<IsLabel> getAllLabels()
	{
		List<IsLabel> allJSOLabels = new ArrayList<IsLabel>();
		for ( IsLabel labelJSO : getJso().getAllLabels() )
		{
			Label label = new Label();
			label.setJso( ( LabelJSO ) labelJSO );
			allJSOLabels.add( label );
		}
		return allJSOLabels;
	}

	@Override
	public void setAllLabels( List<IsLabel> allLabels )
	{
		getJso().setAllLabels( allLabels );
	}

	@Override
	public native IsAmExport getAmExport() /*-{
		var amExport = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.amExport)
		return amExport;
	}-*/;

	@Override
	public native void setAmExport( IsAmExport amExport ) /*-{
		var varAmExport = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amExport)
		this.@com.amcharts.impl.AmChart::jso.amExport = varAmExport;
	}-*/;

	@Override
	public native Double getBackgroundAlpha() /*-{
		return this.@com.amcharts.impl.AmChart::jso.backgroundAlpha;
	}-*/;

	@Override
	public native void setBackgroundAlpha( Double backgroundAlpha ) /*-{
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
		var balloon = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.balloon)
		return balloon;
	}-*/;

	@Override
	public native void setBalloon( IsAmBalloon balloon ) /*-{
		var varBalloon = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(balloon)
		this.@com.amcharts.impl.AmChart::jso.balloon = varBalloon;
	}-*/;

	@Override
	public native Double getBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmChart::jso.borderAlpha;
	}-*/;

	@Override
	public native void setBorderAlpha( Double borderAlpha ) /*-{
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
	public native List<T> getDataProvider() /*-{
		return this.@com.amcharts.impl.AmChart::jso.dataProvider;
	}-*/;

	@Override
	public native void setDataProvider( List<T> dataProvider ) /*-{
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
	public native Double getFontSize() /*-{
		return this.@com.amcharts.impl.AmChart::jso.fontSize;
	}-*/;

	@Override
	public native void setFontSize( Double fontSize ) /*-{
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
	public native Double getHandDrawScatter() /*-{
		return this.@com.amcharts.impl.AmChart::jso.handDrawScatter;
	}-*/;

	@Override
	public native void setHandDrawScatter( Double handDrawScatter ) /*-{
		this.@com.amcharts.impl.AmChart::jso.handDrawScatter = handDrawScatter;
	}-*/;

	@Override
	public native Double getHandDrawThickness() /*-{
		return this.@com.amcharts.impl.AmChart::jso.handDrawThickness;
	}-*/;

	@Override
	public native void setHandDrawThickness( Double handDrawThickness ) /*-{
		this.@com.amcharts.impl.AmChart::jso.handDrawThickness = handDrawThickness;
	}-*/;

	@Override
	public native Double getHideBalloonTime() /*-{
		return this.@com.amcharts.impl.AmChart::jso.hideBalloonTime;
	}-*/;

	@Override
	public native void setHideBalloonTime( Double hideBalloonTime ) /*-{
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
	public native IsAmLegend getLegend() /*-{
		var legend = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.legend)
		return legend;
	}-*/;

	@Override
	public native void setLegend( IsAmLegend legend ) /*-{
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
	public native Double getPercentPrecision() /*-{
		return this.@com.amcharts.impl.AmChart::jso.percentPrecision;
	}-*/;

	@Override
	public native void setPercentPrecision( Double percentPrecision ) /*-{
		this.@com.amcharts.impl.AmChart::jso.percentPrecision = percentPrecision;
	}-*/;

	@Override
	public native Double getPrecision() /*-{
		return this.@com.amcharts.impl.AmChart::jso.precision;
	}-*/;

	@Override
	public native void setPrecision( Double precision ) /*-{
		this.@com.amcharts.impl.AmChart::jso.precision = precision;
	}-*/;

	@Override
	public List<IsNumberPrefix> getPrefixesOfBigNumbers()
	{
		return getJso().getPrefixesOfBigNumbers();
	}

	@Override
	public void setPrefixesOfBigNumbers( List<IsNumberPrefix> prefixesOfBigNumbers )
	{
		getJso().setPrefixesOfBigNumbers( prefixesOfBigNumbers );
	}

	@Override
	public List<IsNumberPrefix> getPrefixesOfSmallNumbers()
	{
		return getJso().getPrefixesOfSmallNumbers();
	}

	@Override
	public void setPrefixesOfSmallNumbers( List<IsNumberPrefix> prefixesOfSmallNumbers )
	{
		getJso().setPrefixesOfSmallNumbers( prefixesOfSmallNumbers );
	}

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
	public List<IsTitle> getTitles()
	{
		List<IsTitle> titles = new ArrayList<IsTitle>();
		for ( IsTitle titleJSO : getJso().getTitles() )
		{
			Title title = new Title();
			title.setJso( ( TitleJSO ) titleJSO );
			titles.add( title );
		}
		return titles;
	}

	@Override
	public void setTitles( List<IsTitle> titles )
	{
		getJso().setTitles( titles );
	}

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

	public native void addLabel( String x, String y, String text, String align, Double size, String color, Double rotation, Double alpha, Boolean bold, String url )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.addLabel(x, y, text, align, size, color, rotation, alpha, bold,
				url);
	}-*/;

	public native void addLegend( IsAmLegend legend, String legendDivID )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var varAmLegend = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(legend)
		chart.addLegend(varAmLegend, legendDivID);
	}-*/;

	public native void addTitle( String title )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.addTitle(title);
	}-*/;

	public native void clear()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.clear();
	}-*/;

	public native void clearLabels()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.clearLabels();
	}-*/;

	public native void invalidateSize()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.invalidateSize();
	}-*/;

	public native void makeChart( String container, JavaScriptObject config, Double delay )
	/*-{
		this.@com.amcharts.impl.AmChart::setId(Ljava/lang/String;)(container);
		return $wnd.AmCharts.makeChart(container, configJSO, delay);
	}-*/;

	public native AmChartJSO<T> makeChart( String container, JavaScriptObject configJSO )
	/*-{
		this.@com.amcharts.impl.AmChart::setId(Ljava/lang/String;)(container);
		return $wnd.AmCharts.makeChart(container, configJSO);
	}-*/;

	public native JavaScriptObject makeChart( JavaScriptObject configJSO )
	/*-{
		var container = this.@com.amcharts.impl.AmChart::getId();
		return $wnd.AmCharts.makeChart(container, configJSO);
	}-*/;

	public native void removeLegend()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.removeLegend();
	}-*/;

	//TODO: Need to provide better api than this.
	public native void removeListener( JavaScriptObject chartJSO, String type, JavaScriptObject handler )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.removeListener(chartJSO, type, handler);
	}-*/;

	public native void validateData()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.validateData();
	}-*/;

	public native void validateNow()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		chart.validateNow();
	}-*/;

	public native void write( String container )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.write(container);
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

	public native void addListener( String eventName, AmChartListener amChartListener )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amChartThis = this;
		chart
				.addListener(
						eventName,
						function(event) {
							amChartThis.@com.amcharts.impl.AmChart::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(amChartListener,event);
						});
	}-*/;

	public void handleListener( AmChartListener amChartListener, AmChartEventJSO event )
	{
		amChartListener.function( event );
	}

	protected native void initListener( String eventName )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amChartThis = this;
		if (chart[eventName + 'Fl'] == undefined) {
			chart[eventName + 'Fl'] = true;
			chart
					.addListener(
							eventName,
							function(event) {
								amChartThis.@com.amcharts.impl.AmChart::fireEvent(Lcom/amcharts/impl/event/AmChartEventJSO;)(event);
							});
		}
	}-*/;

	protected void fireEvent( AmChartEventJSO event )
	{
		AmCharts.EVENT_BUS.fireEvent( AmChartEventUtils.createEvent( event ) );
	}

	@Override
	public HandlerRegistration addRenderedHandler( RenderedHandler handler )
	{
		initListener( RenderedEvent.getName() );
		return RenderedEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}

	@Override
	public HandlerRegistration addInitHandler( InitHandler handler )
	{
		initListener( InitEvent.getName() );
		return InitEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}

	@Override
	public HandlerRegistration addDrawHandler( DrawHandler handler )
	{
		initListener( DrawEvent.getName() );
		return DrawEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}

	@Override
	public HandlerRegistration addDataUpdatedHandler( DataUpdatedHandler handler )
	{
		initListener( DataUpdatedEvent.getName() );
		return DataUpdatedEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}
}