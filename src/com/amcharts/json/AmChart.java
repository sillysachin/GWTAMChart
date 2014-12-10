package com.amcharts.json;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.AmChartData;
import com.amcharts.api.IsAmBalloon;
import com.amcharts.api.IsAmChart;
import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsAmLegend;
import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsLabel;
import com.amcharts.api.IsNumberPrefix;
import com.amcharts.api.IsTitle;

public class AmChart implements IsAmChart
{
	private List<IsLabel> allLabels;

	private IsAmExport amExport;

	private Double backgroundAlpha;

	private String backgroundColor;

	private IsAmBalloon balloon;

	private Double borderAlpha;

	private String borderColor;

	private String color;

	private String creditsPosition;

	private List<? extends AmChartData> dataProvider;

	private String decimalSeparator;

	private IsExportConfig exportConfig;

	private String fontFamily;

	private Double fontSize;

	private Boolean handDrawn;

	private Double handDrawScatter;

	private Double handDrawThickness;

	private Double hideBalloonTime;

	private String language;

	private IsAmLegend legend;

	private String legendDiv;

	private Boolean panEventsEnabled;

	private String pathToImages;

	private Double percentPrecision;

	private Double precision;

	private List<IsNumberPrefix> prefixesOfBigNumbers;

	private List<IsNumberPrefix> prefixesOfSmallNumbers;

	private String theme;

	private String thousandsSeparator;

	private List<? extends IsTitle> titles;

	private String type;

	private Boolean usePrefixes;

	private String version;

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
	public Double getBackgroundAlpha()
	{
		return backgroundAlpha;
	}

	@Override
	public void setBackgroundAlpha( Double backgroundAlpha )
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
	public Double getBorderAlpha()
	{
		return borderAlpha;
	}

	@Override
	public void setBorderAlpha( Double borderAlpha )
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
	public List<? extends AmChartData> getDataProvider()
	{
		return dataProvider;
	}

	@Override
	public void setDataProvider( List<? extends AmChartData> dataProvider )
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
	public Double getFontSize()
	{
		return fontSize;
	}

	@Override
	public void setFontSize( Double fontSize )
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
	public Double getHandDrawScatter()
	{
		return handDrawScatter;
	}

	@Override
	public void setHandDrawScatter( Double handDrawScatter )
	{
		this.handDrawScatter = handDrawScatter;
	}

	@Override
	public Double getHandDrawThickness()
	{
		return handDrawThickness;
	}

	@Override
	public void setHandDrawThickness( Double handDrawThickness )
	{
		this.handDrawThickness = handDrawThickness;
	}

	@Override
	public Double getHideBalloonTime()
	{
		return hideBalloonTime;
	}

	@Override
	public void setHideBalloonTime( Double hideBalloonTime )
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
	public Double getPercentPrecision()
	{
		return percentPrecision;
	}

	@Override
	public void setPercentPrecision( Double percentPrecision )
	{
		this.percentPrecision = percentPrecision;
	}

	@Override
	public Double getPrecision()
	{
		return precision;
	}

	@Override
	public void setPrecision( Double precision )
	{
		this.precision = precision;
	}

	@Override
	public List<IsNumberPrefix> getPrefixesOfBigNumbers()
	{
		return prefixesOfBigNumbers;
	}

	@Override
	public void setPrefixesOfBigNumbers( List<IsNumberPrefix> prefixesOfBigNumbers )
	{
		this.prefixesOfBigNumbers = prefixesOfBigNumbers;
	}

	@Override
	public List<IsNumberPrefix> getPrefixesOfSmallNumbers()
	{
		return prefixesOfSmallNumbers;
	}

	@Override
	public void setPrefixesOfSmallNumbers( List<IsNumberPrefix> prefixesOfSmallNumbers )
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
	public List<? extends IsTitle> getTitles()
	{
		if ( titles == null )
		{
			titles = new ArrayList<IsTitle>();
		}
		return titles;
	}

	@Override
	public void setTitles( List<? extends IsTitle> titles )
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