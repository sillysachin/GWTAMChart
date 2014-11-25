package com.amcharts.api;

import java.util.List;

public interface IsAmChart<T extends AmChartDataObject>
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

	List<T> getDataProvider();

	void setDataProvider( List<T> dataProvider );

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