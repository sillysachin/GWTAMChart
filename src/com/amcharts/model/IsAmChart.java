package com.amcharts.model;

import java.util.List;

import com.amcharts.json.CategoryAxis;
import com.amcharts.json.Title;
import com.amcharts.json.ValueAxis;

public interface IsAmChart
{

	public abstract List<IsLabel> getAllLabels();

	public abstract void setAllLabels( List<IsLabel> allLabels );

	public abstract IsAmExport getAmExport();

	public abstract void setAmExport( IsAmExport amExport );

	public abstract Float getBackgroundAlpha();

	public abstract void setBackgroundAlpha( Float backgroundAlpha );

	public abstract String getBackgroundColor();

	public abstract void setBackgroundColor( String backgroundColor );

	public abstract IsAmBalloon getBalloon();

	public abstract void setBalloon( IsAmBalloon balloon );

	public abstract Float getBorderAlpha();

	public abstract void setBorderAlpha( Float borderAlpha );

	public abstract String getBorderColor();

	public abstract void setBorderColor( String borderColor );

	public abstract String getColor();

	public abstract void setColor( String color );

	public abstract String getCreditsPosition();

	public abstract void setCreditsPosition( String creditsPosition );

	public abstract List< ? extends Object> getDataProvider();

	public abstract void setDataProvider( List< ? extends Object> dataProvider );

	public abstract String getDecimalSeparator();

	public abstract void setDecimalSeparator( String decimalSeparator );

	public abstract Object getExportConfig();

	public abstract void setExportConfig( Object exportConfig );

	public abstract String getFontFamily();

	public abstract void setFontFamily( String fontFamily );

	public abstract Float getFontSize();

	public abstract void setFontSize( Float fontSize );

	public abstract Boolean getHandDrawn();

	public abstract void setHandDrawn( Boolean handDrawn );

	public abstract Float getHandDrawScatter();

	public abstract void setHandDrawScatter( Float handDrawScatter );

	public abstract Float getHandDrawThickness();

	public abstract void setHandDrawThickness( Float handDrawThickness );

	public abstract Integer getHideBalloonTime();

	public abstract void setHideBalloonTime( Integer hideBalloonTime );

	public abstract String getLanguage();

	public abstract void setLanguage( String language );

	public abstract IsAmLegend getLegend();

	public abstract void setLegend( IsAmLegend legend );

	public abstract String getLegendDiv();

	public abstract void setLegendDiv( String legendDiv );

	public abstract Boolean getPanEventsEnabled();

	public abstract void setPanEventsEnabled( Boolean panEventsEnabled );

	public abstract String getPathToImages();

	public abstract void setPathToImages( String pathToImages );

	public abstract Float getPercentPrecision();

	public abstract void setPercentPrecision( Float percentPrecision );

	public abstract Float getPrecision();

	public abstract void setPrecision( Float precision );

	public abstract List<Object> getPrefixesOfBigNumbers();

	public abstract void setPrefixesOfBigNumbers( List<Object> prefixesOfBigNumbers );

	public abstract List<Object> getPrefixesOfSmallNumbers();

	public abstract void setPrefixesOfSmallNumbers( List<Object> prefixesOfSmallNumbers );

	public abstract String getTheme();

	public abstract void setTheme( String theme );

	public abstract String getThousandsSeparator();

	public abstract void setThousandsSeparator( String thousandsSeparator );

	public abstract List<IsTitle> getTitles();

	public abstract void setTitles( List<IsTitle> titles );

	public abstract void addTitle( IsTitle title );

	public abstract String getType();

	public abstract void setType( String type );

	public abstract Boolean getUsePrefixes();

	public abstract void setUsePrefixes( Boolean usePrefixes );

	public abstract String getVersion();

	public abstract void setVersion( String version );

	public abstract List<IsValueAxis> getValueAxes();

	public abstract void addValueAxe( IsValueAxis valueAxes );

	public abstract List<IsCategoryAxis> getCategoryAxis();

	public abstract void addCategoryAxis( IsCategoryAxis categoryAxis );

}