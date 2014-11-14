package com.amcharts.api;

import java.util.List;

public interface IsAmChart<T extends AmChartDataObject>
{

	List<IsLabel> getAllLabels();

	void setAllLabels( List<IsLabel> allLabels );

	IsAmExport getAmExport();

	void setAmExport( IsAmExport amExport );

	double getBackgroundAlpha();

	void setBackgroundAlpha( double backgroundAlpha );

	String getBackgroundColor();

	void setBackgroundColor( String backgroundColor );

	IsAmBalloon getBalloon();

	void setBalloon( IsAmBalloon balloon );

	double getBorderAlpha();

	void setBorderAlpha( double borderAlpha );

	String getBorderColor();

	void setBorderColor( String borderColor );

	String getColor();

	void setColor( String color );

	String getCreditsPosition();

	void setCreditsPosition( String creditsPosition );

	List<T> getDataProvider();

	void setDataProvider( List<T> dataProvider );

	String getDecimalSeparator();

	void setDecimalSeparator( String decimalSeparator );

	IsExportConfig getExportConfig();

	void setExportConfig( IsExportConfig exportConfig );

	String getFontFamily();

	void setFontFamily( String fontFamily );

	double getFontSize();

	void setFontSize( double fontSize );

	Boolean getHandDrawn();

	void setHandDrawn( Boolean handDrawn );

	double getHandDrawScatter();

	void setHandDrawScatter( double handDrawScatter );

	double getHandDrawThickness();

	void setHandDrawThickness( double handDrawThickness );

	double getHideBalloonTime();

	void setHideBalloonTime( double hideBalloonTime );

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

	double getPercentPrecision();

	void setPercentPrecision( double percentPrecision );

	double getPrecision();

	void setPrecision( double precision );

	List<Object> getPrefixesOfBigNumbers();

	void setPrefixesOfBigNumbers( List<Object> prefixesOfBigNumbers );

	List<Object> getPrefixesOfSmallNumbers();

	void setPrefixesOfSmallNumbers( List<Object> prefixesOfSmallNumbers );

	String getTheme();

	void setTheme( String theme );

	String getThousandsSeparator();

	void setThousandsSeparator( String thousandsSeparator );

	List<IsTitle> getTitles();

	void setTitles( List<IsTitle> titles );

	String getType();

	void setType( String type );

	Boolean getUsePrefixes();

	void setUsePrefixes( Boolean usePrefixes );

	String getVersion();

	void setVersion( String version );
}