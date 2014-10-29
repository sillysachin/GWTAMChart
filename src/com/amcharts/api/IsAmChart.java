package com.amcharts.api;

import java.util.List;

public interface IsAmChart
{

	List<IsLabel> getAllLabels();

	void setAllLabels( List<IsLabel> allLabels );

	IsAmExport getAmExport();

	void setAmExport( IsAmExport amExport );

	Float getBackgroundAlpha();

	void setBackgroundAlpha( Float backgroundAlpha );

	String getBackgroundColor();

	void setBackgroundColor( String backgroundColor );

	IsAmBalloon getBalloon();

	void setBalloon( IsAmBalloon balloon );

	Float getBorderAlpha();

	void setBorderAlpha( Float borderAlpha );

	String getBorderColor();

	void setBorderColor( String borderColor );

	String getColor();

	void setColor( String color );

	String getCreditsPosition();

	void setCreditsPosition( String creditsPosition );

	List< ? extends Object> getDataProvider();

	void setDataProvider( List< ? extends Object> dataProvider );

	String getDecimalSeparator();

	void setDecimalSeparator( String decimalSeparator );

	IsExportConfig getExportConfig();

	void setExportConfig( IsExportConfig exportConfig );

	String getFontFamily();

	void setFontFamily( String fontFamily );

	Float getFontSize();

	void setFontSize( Float fontSize );

	Boolean getHandDrawn();

	void setHandDrawn( Boolean handDrawn );

	Float getHandDrawScatter();

	void setHandDrawScatter( Float handDrawScatter );

	Float getHandDrawThickness();

	void setHandDrawThickness( Float handDrawThickness );

	Integer getHideBalloonTime();

	void setHideBalloonTime( Integer hideBalloonTime );

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

	Float getPercentPrecision();

	void setPercentPrecision( Float percentPrecision );

	Float getPrecision();

	void setPrecision( Float precision );

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