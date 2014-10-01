package com.amcharts.json;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.model.IsAmBalloon;
import com.amcharts.model.IsAmChart;
import com.amcharts.model.IsAmExport;
import com.amcharts.model.IsAmLegend;
import com.amcharts.model.IsCategoryAxis;
import com.amcharts.model.IsLabel;
import com.amcharts.model.IsTitle;
import com.amcharts.model.IsValueAxis;

public class AmChart implements IsAmChart
{
	private List<IsLabel> allLabels;

	private IsAmExport amExport;

	private Float backgroundAlpha;

	private String backgroundColor;

	private IsAmBalloon balloon;

	private Float borderAlpha;

	private String borderColor;

	private String color;

	private String creditsPosition;

	private List< ? extends Object> dataProvider;

	private String decimalSeparator;

	private Object exportConfig;

	private String fontFamily;

	private Float fontSize;

	private Boolean handDrawn;

	private Float handDrawScatter;

	private Float handDrawThickness;

	private Integer hideBalloonTime;

	private String language;

	private IsAmLegend legend;

	private String legendDiv;

	private Boolean panEventsEnabled;

	private String pathToImages;

	private Float percentPrecision;

	private Float precision;

	private List<Object> prefixesOfBigNumbers;

	private List<Object> prefixesOfSmallNumbers;

	private String theme;

	private String thousandsSeparator;

	private List<IsTitle> titles;

	private String type;

	private Boolean usePrefixes;

	private String version;

	private List<IsValueAxis> valueAxes;

	private List<IsCategoryAxis> categoryAxis;

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
	public Float getBackgroundAlpha()
	{
		return backgroundAlpha;
	}

	@Override
	public void setBackgroundAlpha( Float backgroundAlpha )
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
	public Float getBorderAlpha()
	{
		return borderAlpha;
	}

	@Override
	public void setBorderAlpha( Float borderAlpha )
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
	public Object getExportConfig()
	{
		return exportConfig;
	}

	@Override
	public void setExportConfig( Object exportConfig )
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
	public Float getFontSize()
	{
		return fontSize;
	}

	@Override
	public void setFontSize( Float fontSize )
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
	public Float getHandDrawScatter()
	{
		return handDrawScatter;
	}

	@Override
	public void setHandDrawScatter( Float handDrawScatter )
	{
		this.handDrawScatter = handDrawScatter;
	}

	@Override
	public Float getHandDrawThickness()
	{
		return handDrawThickness;
	}

	@Override
	public void setHandDrawThickness( Float handDrawThickness )
	{
		this.handDrawThickness = handDrawThickness;
	}

	@Override
	public Integer getHideBalloonTime()
	{
		return hideBalloonTime;
	}

	@Override
	public void setHideBalloonTime( Integer hideBalloonTime )
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
	public Float getPercentPrecision()
	{
		return percentPrecision;
	}

	@Override
	public void setPercentPrecision( Float percentPrecision )
	{
		this.percentPrecision = percentPrecision;
	}

	@Override
	public Float getPrecision()
	{
		return precision;
	}

	@Override
	public void setPrecision( Float precision )
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
	public void addTitle( IsTitle title )
	{
		getTitles().add( title );
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

	@Override
	public List<IsValueAxis> getValueAxes()
	{
		if ( valueAxes == null )
		{
			valueAxes = new ArrayList<IsValueAxis>();
		}
		return valueAxes;
	}

	@Override
	public void addValueAxe( IsValueAxis valueAxes )
	{
		getValueAxes().add( valueAxes );
	}

	@Override
	public List<IsCategoryAxis> getCategoryAxis()
	{
		if ( categoryAxis == null )
		{
			categoryAxis = new ArrayList<IsCategoryAxis>();
		}
		return categoryAxis;
	}

	@Override
	public void addCategoryAxis( IsCategoryAxis categoryAxis )
	{
		getCategoryAxis().add( categoryAxis );
	}
}
