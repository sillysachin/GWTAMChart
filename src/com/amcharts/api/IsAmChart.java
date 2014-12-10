package com.amcharts.api;

import java.util.List;

public interface IsAmChart
{
	List<IsLabel> getAllLabels();

	void setAllLabels( List<IsLabel> allLabels );

	IsAmExport getAmExport();

	void setAmExport( IsAmExport amExport );

	Double getBackgroundAlpha();

	void setBackgroundAlpha( Double backgroundAlpha );

	String getBackgroundColor();

	void setBackgroundColor( String backgroundColor );

	IsAmBalloon getBalloon();

	void setBalloon( IsAmBalloon balloon );

	Double getBorderAlpha();

	void setBorderAlpha( Double borderAlpha );

	String getBorderColor();

	void setBorderColor( String borderColor );

	String getColor();

	void setColor( String color );

	String getCreditsPosition();

	void setCreditsPosition( String creditsPosition );

	List<? extends AmChartData> getDataProvider();

	void setDataProvider( List<? extends AmChartData> dataProvider );

	String getDecimalSeparator();

	void setDecimalSeparator( String decimalSeparator );

	IsExportConfig getExportConfig();

	void setExportConfig( IsExportConfig exportConfig );

	String getFontFamily();

	void setFontFamily( String fontFamily );

	Double getFontSize();

	void setFontSize( Double fontSize );

	Boolean getHandDrawn();

	void setHandDrawn( Boolean handDrawn );

	Double getHandDrawScatter();

	void setHandDrawScatter( Double handDrawScatter );

	Double getHandDrawThickness();

	void setHandDrawThickness( Double handDrawThickness );

	Double getHideBalloonTime();

	void setHideBalloonTime( Double hideBalloonTime );

	String getLanguage();

	void setLanguage( String language );

	IsAmLegend getLegend();

	void setLegend( IsAmLegend legend );

	String getLegendDiv();

	void setLegendDiv( String legendDiv );

	Boolean getPanEventsEnabled();

	void setPanEventsEnabled( Boolean panEventsEnabled );

	String getPathToImages();

	void setPathToImages( String pathToImages );

	Double getPercentPrecision();

	void setPercentPrecision( Double percentPrecision );

	Double getPrecision();

	void setPrecision( Double precision );

	List<IsNumberPrefix> getPrefixesOfBigNumbers();

	void setPrefixesOfBigNumbers( List<IsNumberPrefix> prefixesOfBigNumbers );

	List<IsNumberPrefix> getPrefixesOfSmallNumbers();

	void setPrefixesOfSmallNumbers( List<IsNumberPrefix> prefixesOfSmallNumbers );

	String getTheme();

	void setTheme( String theme );

	String getThousandsSeparator();

	void setThousandsSeparator( String thousandsSeparator );

	List<? extends IsTitle> getTitles();

	void setTitles( List<? extends IsTitle> titles );

	String getType();

	void setType( String type );

	Boolean getUsePrefixes();

	void setUsePrefixes( Boolean usePrefixes );

	String getVersion();

	void setVersion( String version );
}