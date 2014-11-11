package com.amcharts.json;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.IsAmBalloon;
import com.amcharts.api.IsAmChart;
import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsLabel;
import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsTitle;
import com.amcharts.api.IsValueAxis;

public class AmChart implements IsAmChart
{
	private List<IsLabel> allLabels;

	private IsAmExport amExport;

	private double backgroundAlpha;

	private String backgroundColor;

	private IsAmBalloon balloon;

	private double borderAlpha;

	private String borderColor;

	private String color;

	private String creditsPosition;

	private List< ? extends Object> dataProvider;

	private String decimalSeparator;

	private IsExportConfig exportConfig;

	private String fontFamily;

	private double fontSize;

	private Boolean handDrawn;

	private double handDrawScatter;

	private double handDrawThickness;

	private double hideBalloonTime;

	private String language;

	private IsAmLegend legend;

	private String legendDiv;

	private Boolean panEventsEnabled;

	private String pathToImages;

	private double percentPrecision;

	private double precision;

	private List<Object> prefixesOfBigNumbers;

	private List<Object> prefixesOfSmallNumbers;

	private String theme;

	private String thousandsSeparator;

	private List<IsTitle> titles;

	private String type;

	private Boolean usePrefixes;

	private String version;

	private List<IsValueAxis> valueAxes;

	private IsCategoryAxis categoryAxis;

	@Override
	public List<IsLabel> getAllLabels()
	{
		return allLabels;
	}

	public void setAllLabels( List<IsLabel> allLabels )
	{
		this.allLabels = allLabels;
	}

	@Override
	public IsAmExport getAmExport()
	{
		return amExport;
	}

	@Override
	public void setAmExport( IsAmExport amExport )
	{
		this.amExport = amExport;
	}

	@Override
	public double getBackgroundAlpha()
	{
		return backgroundAlpha;
	}

	@Override
	public void setBackgroundAlpha( double backgroundAlpha )
	{
		this.backgroundAlpha = backgroundAlpha;
	}

	@Override
	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	@Override
	public void setBackgroundColor( String backgroundColor )
	{
		this.backgroundColor = backgroundColor;
	}

	@Override
	public IsAmBalloon getBalloon()
	{
		return balloon;
	}

	@Override
	public void setBalloon( IsAmBalloon balloon )
	{
		this.balloon = balloon;
	}

	@Override
	public double getBorderAlpha()
	{
		return borderAlpha;
	}

	@Override
	public void setBorderAlpha( double borderAlpha )
	{
		this.borderAlpha = borderAlpha;
	}

	@Override
	public String getBorderColor()
	{
		return borderColor;
	}

	@Override
	public void setBorderColor( String borderColor )
	{
		this.borderColor = borderColor;
	}

	@Override
	public String getColor()
	{
		return color;
	}

	@Override
	public void setColor( String color )
	{
		this.color = color;
	}

	@Override
	public String getCreditsPosition()
	{
		return creditsPosition;
	}

	@Override
	public void setCreditsPosition( String creditsPosition )
	{
		this.creditsPosition = creditsPosition;
	}

	@Override
	public List< ? extends Object> getDataProvider()
	{
		return dataProvider;
	}

	@Override
	public void setDataProvider( List< ? extends Object> dataProvider )
	{
		this.dataProvider = dataProvider;
	}

	@Override
	public String getDecimalSeparator()
	{
		return decimalSeparator;
	}

	@Override
	public void setDecimalSeparator( String decimalSeparator )
	{
		this.decimalSeparator = decimalSeparator;
	}

	@Override
	public IsExportConfig getExportConfig()
	{
		return exportConfig;
	}

	@Override
	public void setExportConfig( IsExportConfig exportConfig )
	{
		this.exportConfig = exportConfig;
	}

	@Override
	public String getFontFamily()
	{
		return fontFamily;
	}

	@Override
	public void setFontFamily( String fontFamily )
	{
		this.fontFamily = fontFamily;
	}

	@Override
	public double getFontSize()
	{
		return fontSize;
	}

	@Override
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	@Override
	public Boolean getHandDrawn()
	{
		return handDrawn;
	}

	@Override
	public void setHandDrawn( Boolean handDrawn )
	{
		this.handDrawn = handDrawn;
	}

	@Override
	public double getHandDrawScatter()
	{
		return handDrawScatter;
	}

	@Override
	public void setHandDrawScatter( double handDrawScatter )
	{
		this.handDrawScatter = handDrawScatter;
	}

	@Override
	public double getHandDrawThickness()
	{
		return handDrawThickness;
	}

	@Override
	public void setHandDrawThickness( double handDrawThickness )
	{
		this.handDrawThickness = handDrawThickness;
	}

	@Override
	public double getHideBalloonTime()
	{
		return hideBalloonTime;
	}

	@Override
	public void setHideBalloonTime( double hideBalloonTime )
	{
		this.hideBalloonTime = hideBalloonTime;
	}

	@Override
	public String getLanguage()
	{
		return language;
	}

	@Override
	public void setLanguage( String language )
	{
		this.language = language;
	}

	@Override
	public IsAmLegend getLegend()
	{
		return legend;
	}

	@Override
	public void setLegend( IsAmLegend legend )
	{
		this.legend = legend;
	}

	@Override
	public String getLegendDiv()
	{
		return legendDiv;
	}

	@Override
	public void setLegendDiv( String legendDiv )
	{
		this.legendDiv = legendDiv;
	}

	@Override
	public Boolean getPanEventsEnabled()
	{
		return panEventsEnabled;
	}

	@Override
	public void setPanEventsEnabled( Boolean panEventsEnabled )
	{
		this.panEventsEnabled = panEventsEnabled;
	}

	@Override
	public String getPathToImages()
	{
		return pathToImages;
	}

	@Override
	public void setPathToImages( String pathToImages )
	{
		this.pathToImages = pathToImages;
	}

	@Override
	public double getPercentPrecision()
	{
		return percentPrecision;
	}

	@Override
	public void setPercentPrecision( double percentPrecision )
	{
		this.percentPrecision = percentPrecision;
	}

	@Override
	public double getPrecision()
	{
		return precision;
	}

	@Override
	public void setPrecision( double precision )
	{
		this.precision = precision;
	}

	@Override
	public List<Object> getPrefixesOfBigNumbers()
	{
		return prefixesOfBigNumbers;
	}

	@Override
	public void setPrefixesOfBigNumbers( List<Object> prefixesOfBigNumbers )
	{
		this.prefixesOfBigNumbers = prefixesOfBigNumbers;
	}

	@Override
	public List<Object> getPrefixesOfSmallNumbers()
	{
		return prefixesOfSmallNumbers;
	}

	@Override
	public void setPrefixesOfSmallNumbers( List<Object> prefixesOfSmallNumbers )
	{
		this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
	}

	@Override
	public String getTheme()
	{
		return theme;
	}

	@Override
	public void setTheme( String theme )
	{
		this.theme = theme;
	}

	@Override
	public String getThousandsSeparator()
	{
		return thousandsSeparator;
	}

	@Override
	public void setThousandsSeparator( String thousandsSeparator )
	{
		this.thousandsSeparator = thousandsSeparator;
	}

	@Override
	public List<IsTitle> getTitles()
	{
		if ( titles == null )
		{
			titles = new ArrayList<IsTitle>();
		}
		return titles;
	}

	@Override
	public void setTitles( List<IsTitle> titles )
	{
		this.titles = titles;
	}

	@Override
	public String getType()
	{
		return type;
	}

	@Override
	public void setType( String type )
	{
		this.type = type;
	}

	@Override
	public Boolean getUsePrefixes()
	{
		return usePrefixes;
	}

	@Override
	public void setUsePrefixes( Boolean usePrefixes )
	{
		this.usePrefixes = usePrefixes;
	}

	@Override
	public String getVersion()
	{
		return version;
	}

	@Override
	public void setVersion( String version )
	{
		this.version = version;
	}
}