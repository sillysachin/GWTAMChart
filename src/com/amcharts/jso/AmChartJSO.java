package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmBalloon;
import com.amcharts.api.IsAmChart;
import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsLegend;
import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsLabel;
import com.amcharts.api.IsTitle;
import com.google.gwt.core.client.JavaScriptObject;

public class AmChartJSO extends JavaScriptObject implements IsAmChart
{
	protected AmChartJSO()
	{
	}

	@Override
	public final native List<IsLabel> getAllLabels()
	/*-{
		return this.allLabels;
	}-*/;

	@Override
	public final native void setAllLabels( List<IsLabel> allLabels )
	/*-{
		this.allLabels = allLabels;
	}-*/;

	@Override
	public final native IsAmExport getAmExport()
	/*-{
		return this.amExport;
	}-*/;

	@Override
	public final native void setAmExport( IsAmExport amExport )
	/*-{
		this.amExport = amExport;
	}-*/;

	@Override
	public final native double getBackgroundAlpha()
	/*-{
		return this.backgroundAlpha;
	}-*/;

	@Override
	public final native void setBackgroundAlpha( double backgroundAlpha )
	/*-{
		this.backgroundAlpha = backgroundAlpha;
	}-*/;

	@Override
	public final native String getBackgroundColor()
	/*-{
		return this.backgroundColor;
	}-*/;

	@Override
	public final native void setBackgroundColor( String backgroundColor )
	/*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	@Override
	public final native IsAmBalloon getBalloon()
	/*-{
		return this.balloon;
	}-*/;

	@Override
	public final native void setBalloon( IsAmBalloon balloon )
	/*-{
		this.balloon = balloon;
	}-*/;

	@Override
	public final native double getBorderAlpha()
	/*-{
		return this.borderAlpha;
	}-*/;

	@Override
	public final native void setBorderAlpha( double borderAlpha )
	/*-{
		this.borderAlpha = borderAlpha;
	}-*/;

	@Override
	public final native String getBorderColor()
	/*-{
		return this.borderColor;
	}-*/;

	@Override
	public final native void setBorderColor( String borderColor )
	/*-{
		this.borderColor = borderColor;
	}-*/;

	@Override
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	@Override
	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	@Override
	public final native String getCreditsPosition()
	/*-{
		return this.creditsPosition;
	}-*/;

	@Override
	public final native void setCreditsPosition( String creditsPosition )
	/*-{
		this.creditsPosition = creditsPosition;
	}-*/;

	@Override
	public final native List< ? extends Object> getDataProvider()
	/*-{
		return this.dataProvider;
	}-*/;

	@Override
	public final native void setDataProvider( List< ? extends Object> dataProvider )
	/*-{
		this.dataProvider = dataProvider;
	}-*/;

	@Override
	public final native String getDecimalSeparator()
	/*-{
		return this.decimalSeparator;
	}-*/;

	@Override
	public final native void setDecimalSeparator( String decimalSeparator )
	/*-{
		this.decimalSeparator = decimalSeparator;
	}-*/;

	@Override
	public final native IsExportConfig getExportConfig()
	/*-{
		return this.exportConfig;
	}-*/;

	@Override
	public final native void setExportConfig( IsExportConfig exportConfig )
	/*-{
		this.exportConfig = exportConfig;
	}-*/;

	@Override
	public final native String getFontFamily()
	/*-{
		return this.fontFamily;
	}-*/;

	@Override
	public final native void setFontFamily( String fontFamily )
	/*-{
		this.fontFamily = fontFamily;
	}-*/;

	@Override
	public final native double getFontSize()
	/*-{
		return this.fontSize;
	}-*/;

	@Override
	public final native void setFontSize( double fontSize )
	/*-{
		this.fontSize = fontSize;
	}-*/;

	@Override
	public final native Boolean getHandDrawn()
	/*-{
		return this.handDrawn;
	}-*/;

	@Override
	public final native void setHandDrawn( Boolean handDrawn )
	/*-{
		this.handDrawn = handDrawn;
	}-*/;

	@Override
	public final native double getHandDrawScatter()
	/*-{
		return this.handDrawScatter;
	}-*/;

	@Override
	public final native void setHandDrawScatter( double handDrawScatter )
	/*-{
		this.handDrawScatter = handDrawScatter;
	}-*/;

	@Override
	public final native double getHandDrawThickness()
	/*-{
		return this.handDrawThickness;
	}-*/;

	@Override
	public final native void setHandDrawThickness( double handDrawThickness )
	/*-{
		this.handDrawThickness = handDrawThickness;
	}-*/;

	@Override
	public final native Integer getHideBalloonTime()
	/*-{
		return this.hideBalloonTime;
	}-*/;

	@Override
	public final native void setHideBalloonTime( Integer hideBalloonTime )
	/*-{
		this.hideBalloonTime = hideBalloonTime;
	}-*/;

	@Override
	public final native String getLanguage()
	/*-{
		return this.language;
	}-*/;

	@Override
	public final native void setLanguage( String language )
	/*-{
		this.language = language;
	}-*/;

	@Override
	public final native IsLegend getLegend()
	/*-{
		return this.legend;
	}-*/;

	@Override
	public final native void setLegend( IsLegend legend )
	/*-{
		this.legend = legend;
	}-*/;

	@Override
	public final native String getLegendDiv()
	/*-{
		return this.legendDiv;
	}-*/;

	@Override
	public final native void setLegendDiv( String legendDiv )
	/*-{
		this.legendDiv = legendDiv;
	}-*/;

	@Override
	public final native Boolean getPanEventsEnabled()
	/*-{
		return this.panEventsEnabled;
	}-*/;

	@Override
	public final native void setPanEventsEnabled( Boolean panEventsEnabled )
	/*-{
		this.panEventsEnabled = panEventsEnabled;
	}-*/;

	@Override
	public final native String getPathToImages()
	/*-{
		return this.pathToImages;
	}-*/;

	@Override
	public final native void setPathToImages( String pathToImages )
	/*-{
		this.pathToImages = pathToImages;
	}-*/;

	@Override
	public final native double getPercentPrecision()
	/*-{
		return this.percentPrecision;
	}-*/;

	@Override
	public final native void setPercentPrecision( double percentPrecision )
	/*-{
		this.percentPrecision = percentPrecision;
	}-*/;

	@Override
	public final native double getPrecision()
	/*-{
		return this.precision;
	}-*/;

	@Override
	public final native void setPrecision( double precision )
	/*-{
		this.precision = precision;
	}-*/;

	@Override
	public final native List<Object> getPrefixesOfBigNumbers()
	/*-{
		return this.prefixesOfBigNumbers;
	}-*/;

	@Override
	public final native void setPrefixesOfBigNumbers( List<Object> prefixesOfBigNumbers )
	/*-{
		this.prefixesOfBigNumbers = prefixesOfBigNumbers;
	}-*/;

	@Override
	public final native List<Object> getPrefixesOfSmallNumbers()
	/*-{
		return this.prefixesOfSmallNumbers;
	}-*/;

	@Override
	public final native void setPrefixesOfSmallNumbers( List<Object> prefixesOfSmallNumbers )
	/*-{
		this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
	}-*/;

	@Override
	public final native String getTheme()
	/*-{
		return this.theme;
	}-*/;

	@Override
	public final native void setTheme( String theme )
	/*-{
		this.theme = theme;
	}-*/;

	@Override
	public final native String getThousandsSeparator()
	/*-{
		return this.thousandsSeparator;
	}-*/;

	@Override
	public final native void setThousandsSeparator( String thousandsSeparator )
	/*-{
		this.thousandsSeparator = thousandsSeparator;
	}-*/;

	@Override
	public final native List<IsTitle> getTitles()
	/*-{
		if (this.titles == null) {
			this.titles = [];
		}
		return this.titles;
	}-*/;

	@Override
	public final native void setTitles( List<IsTitle> titles )
	/*-{
		this.titles = titles;
	}-*/;

	@Override
	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	@Override
	public final native void setType( String type )
	/*-{
		this.type = type;
	}-*/;

	@Override
	public final native Boolean getUsePrefixes()
	/*-{
		return this.usePrefixes;
	}-*/;

	@Override
	public final native void setUsePrefixes( Boolean usePrefixes )
	/*-{
		this.usePrefixes = usePrefixes;
	}-*/;

	@Override
	public final native String getVersion()
	/*-{
		return this.version;
	}-*/;

	@Override
	public final native void setVersion( String version )
	/*-{
		this.version = version;
	}-*/;
}