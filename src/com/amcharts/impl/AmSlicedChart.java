package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;
import com.amcharts.jso.AmSlicedChartJSO;

public class AmSlicedChart extends AmChart implements IsAmSlicedChart
{
	@Override
	public AmSlicedChartJSO getJso()
	{
		AmSlicedChartJSO jso = ( AmSlicedChartJSO ) super.getJso();
		return jso;
	}

	@Override
	public double getAlpha()
	{
		return getJso().getAlpha();
	}

	@Override
	public void setAlpha( double alpha )
	{
		getJso().setAlpha( alpha );
	}

	@Override
	public String getAlphaField()
	{
		return getJso().getAlphaField();
	}

	@Override
	public void setAlphaField( String alphaField )
	{
		getJso().setAlphaField( alphaField );
	}

	@Override
	public String getBaseColor()
	{
		return getJso().getBaseColor();
	}

	@Override
	public void setBaseColor( String baseColor )
	{
		getJso().setBaseColor( baseColor );
	}

	@Override
	public double getBrightnessStep()
	{
		return getJso().getBrightnessStep();
	}

	@Override
	public void setBrightnessStep( double brightnessStep )
	{
		getJso().setBrightnessStep( brightnessStep );
	}

	@Override
	public List<Object> getChartData()
	{
		return getJso().getChartData();
	}

	@Override
	public void setChartData( List<Object> chartData )
	{
		getJso().setChartData( chartData );
	}

	@Override
	public String getColorField()
	{
		return getJso().getColorField();
	}

	@Override
	public void setColorField( String colorField )
	{
		getJso().setColorField( colorField );
	}

	@Override
	public List<String> getColors()
	{
		return getJso().getColors();
	}

	@Override
	public void setColors( List<String> colors )
	{
		getJso().setColors( colors );
	}

	@Override
	public String getDescriptionField()
	{
		return getJso().getDescriptionField();
	}

	@Override
	public void setDescriptionField( String descriptionField )
	{
		getJso().setDescriptionField( descriptionField );

	}

	@Override
	public List<Float> getGradientRatio()
	{
		return getJso().getGradientRatio();
	}

	@Override
	public void setGradientRatio( List<Float> gradientRatio )
	{
		getJso().setGradientRatio( gradientRatio );

	}

	@Override
	public double getGroupedAlpha()
	{
		return getJso().getGroupedAlpha();
	}

	@Override
	public void setGroupedAlpha( double groupedAlpha )
	{
		getJso().setGroupedAlpha( groupedAlpha );
	}

	@Override
	public String getGroupedColor()
	{
		return getJso().getGroupedColor();
	}

	@Override
	public void setGroupedColor( String groupedColor )
	{
		getJso().setGroupedColor( groupedColor );
	}

	@Override
	public String getGroupedDescription()
	{
		return getJso().getGroupedDescription();
	}

	@Override
	public void setGroupedDescription( String groupedDescription )
	{
		getJso().setGroupedDescription( groupedDescription );
	}

	@Override
	public Boolean getGroupedPulled()
	{
		return getJso().getGroupedPulled();
	}

	@Override
	public void setGroupedPulled( Boolean groupedPulled )
	{
		getJso().setGroupedPulled( groupedPulled );
	}

	@Override
	public String getGroupedTitle()
	{
		return getJso().getGroupedTitle();
	}

	@Override
	public void setGroupedTitle( String groupedTitle )
	{
		getJso().setGroupedTitle( groupedTitle );
	}

	@Override
	public double getGroupPercent()
	{
		return getJso().getGroupPercent();
	}

	@Override
	public void setGroupPercent( double groupPercent )
	{
		getJso().setGroupPercent( groupPercent );
	}

	@Override
	public double getHideLabelsPercent()
	{
		return getJso().getHideLabelsPercent();
	}

	@Override
	public void setHideLabelsPercent( double hideLabelsPercent )
	{
		getJso().setHideLabelsPercent( hideLabelsPercent );
	}

	@Override
	public double getHoverAlpha()
	{
		return getJso().getHoverAlpha();
	}

	@Override
	public void setHoverAlpha( double hoverAlpha )
	{
		getJso().setHoverAlpha( hoverAlpha );
	}

	@Override
	public Object getLabelFunction()
	{
		return getJso().getLabelFunction();
	}

	@Override
	public void setLabelFunction( Object labelFunction )
	{
		getJso().setLabelFunction( labelFunction );
	}

	@Override
	public Boolean getLabelsEnabled()
	{
		return getJso().getLabelsEnabled();
	}

	@Override
	public void setLabelsEnabled( Boolean labelsEnabled )
	{
		getJso().setLabelsEnabled( labelsEnabled );
	}

	@Override
	public double getLabelTickAlpha()
	{
		return getJso().getLabelTickAlpha();
	}

	@Override
	public void setLabelTickAlpha( double labelTickAlpha )
	{
		getJso().setLabelTickAlpha( labelTickAlpha );
	}

	@Override
	public String getLabelTickColor()
	{
		return getJso().getLabelTickColor();
	}

	@Override
	public void setLabelTickColor( String labelTickColor )
	{
		getJso().setLabelTickColor( labelTickColor );
	}

	@Override
	public double getMarginBottom()
	{
		return getJso().getMarginBottom();
	}

	@Override
	public void setMarginBottom( double marginBottom )
	{
		getJso().setMarginBottom( marginBottom );
	}

	@Override
	public double getMarginLeft()
	{
		return getJso().getMarginLeft();
	}

	@Override
	public void setMarginLeft( double marginLeft )
	{
		getJso().setMarginLeft( marginLeft );
	}

	@Override
	public double getMarginRight()
	{
		return getJso().getMarginRight();
	}

	@Override
	public void setMarginRight( double marginRight )
	{
		getJso().setMarginRight( marginRight );
	}

	@Override
	public double getMarginTop()
	{
		return getJso().getMarginTop();
	}

	@Override
	public void setMarginTop( double marginTop )
	{
		getJso().setMarginTop( marginTop );
	}

	@Override
	public double getMaxLabelWidth()
	{
		return getJso().getMaxLabelWidth();
	}

	@Override
	public void setMaxLabelWidth( double maxLabelWidth )
	{
		getJso().setMaxLabelWidth( maxLabelWidth );
	}

	@Override
	public double getOutlineAlpha()
	{
		return getJso().getOutlineAlpha();
	}

	@Override
	public void setOutlineAlpha( double outlineAlpha )
	{
		getJso().setOutlineAlpha( outlineAlpha );
	}

	@Override
	public String getOutlineColor()
	{
		return getJso().getOutlineColor();
	}

	@Override
	public void setOutlineColor( String outlineColor )
	{
		getJso().setOutlineColor( outlineColor );
	}

	@Override
	public double getOutlineThickness()
	{
		return getJso().getOutlineThickness();
	}

	@Override
	public void setOutlineThickness( double outlineThickness )
	{
		getJso().setOutlineThickness( outlineThickness );
	}

	@Override
	public String getPatternField()
	{
		return getJso().getPatternField();
	}

	@Override
	public void setPatternField( String patternField )
	{
		getJso().setPatternField( patternField );
	}

	@Override
	public String getPulledField()
	{
		return getJso().getPulledField();
	}

	@Override
	public void setPulledField( String pulledField )
	{
		getJso().setPulledField( pulledField );
	}

	@Override
	public Integer getPullOutDuration()
	{
		return getJso().getPullOutDuration();
	}

	@Override
	public void setPullOutDuration( Integer pullOutDuration )
	{
		getJso().setPullOutDuration( pullOutDuration );
	}

	@Override
	public String getPullOutEffect()
	{
		return getJso().getPullOutEffect();
	}

	@Override
	public void setPullOutEffect( String pullOutEffect )
	{
		getJso().setPullOutEffect( pullOutEffect );
	}

	@Override
	public Boolean getPullOutOnlyOne()
	{
		return getJso().getPullOutOnlyOne();
	}

	@Override
	public void setPullOutOnlyOne( Boolean pullOutOnlyOne )
	{
		getJso().setPullOutOnlyOne( pullOutOnlyOne );
	}

	@Override
	public Boolean getSequencedAnimation()
	{
		return getJso().getSequencedAnimation();

	}

	@Override
	public void setSequencedAnimation( Boolean sequencedAnimation )
	{
		getJso().setSequencedAnimation( sequencedAnimation );
	}

	@Override
	public double getStartAlpha()
	{
		return getJso().getStartAlpha();
	}

	@Override
	public void setStartAlpha( double startAlpha )
	{
		getJso().setStartAlpha( startAlpha );
	}

	@Override
	public Integer getStartDuration()
	{
		return getJso().getStartDuration();
	}

	@Override
	public void setStartDuration( Integer startDuration )
	{
		getJso().setStartDuration( startDuration );
	}

	@Override
	public String getStartEffect()
	{
		return getJso().getStartEffect();
	}

	@Override
	public void setStartEffect( String startEffect )
	{
		getJso().setStartEffect( startEffect );
	}

	@Override
	public String getUrlField()
	{
		return getJso().getUrlField();
	}

	@Override
	public void setUrlField( String urlField )
	{
		getJso().setUrlField( urlField );
	}

	@Override
	public String getUrlTarget()
	{
		return getJso().getUrlTarget();
	}

	@Override
	public void setUrlTarget( String urlTarget )
	{
		getJso().setUrlTarget( urlTarget );

	}

	@Override
	public String getVisibleInLegendField()
	{
		return getJso().getVisibleInLegendField();
	}

	@Override
	public void setVisibleInLegendField( String visibleInLegendField )
	{
		getJso().setVisibleInLegendField( visibleInLegendField );
	}
}