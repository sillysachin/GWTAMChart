package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;

public class AmSlicedChart extends AmChart implements IsAmSlicedChart
{
	private Float alpha;

	private String alphaField;

	private String baseColor;

	private Float brightnessStep;

	private List<Object> chartData;

	private String colorField;

	private List<String> colors;

	private String descriptionField;

	private List<Float> gradientRatio;

	private Float groupedAlpha;

	private String groupedColor;

	private String groupedDescription;

	private Boolean groupedPulled;

	private String groupedTitle;

	private Double groupPercent;

	private Float hideLabelsPercent;

	private Float hoverAlpha;

	private Object labelFunction;

	private Boolean labelsEnabled;

	private Float labelTickAlpha;

	private String labelTickColor;

	private Float marginBottom;

	private Float marginLeft;

	private Float marginRight;

	private Float marginTop;

	private Float maxLabelWidth;

	private Float outlineAlpha;

	private String outlineColor;

	private Float outlineThickness;

	private String patternField;

	private String pulledField;

	private Integer pullOutDuration;

	private String pullOutEffect;

	private Boolean pullOutOnlyOne;

	private Boolean sequencedAnimation;

	private Float startAlpha;

	private Integer startDuration;

	private String startEffect;

	private String titleField;

	private String urlField;

	private String urlTarget;

	private String valueField;

	private String visibleInLegendField;

	@Override
	public Float getAlpha()
	{
		return alpha;
	}

	@Override
	public void setAlpha( Float alpha )
	{
		this.alpha = alpha;
	}

	@Override
	public String getAlphaField()
	{
		return alphaField;
	}

	@Override
	public void setAlphaField( String alphaField )
	{
		this.alphaField = alphaField;
	}

	@Override
	public String getBaseColor()
	{
		return baseColor;
	}

	@Override
	public void setBaseColor( String baseColor )
	{
		this.baseColor = baseColor;
	}

	@Override
	public Float getBrightnessStep()
	{
		return brightnessStep;
	}

	@Override
	public void setBrightnessStep( Float brightnessStep )
	{
		this.brightnessStep = brightnessStep;
	}

	@Override
	public List<Object> getChartData()
	{
		return chartData;
	}

	@Override
	public void setChartData( List<Object> chartData )
	{
		this.chartData = chartData;
	}

	@Override
	public String getColorField()
	{
		return colorField;
	}

	@Override
	public void setColorField( String colorField )
	{
		this.colorField = colorField;
	}

	@Override
	public List<String> getColors()
	{
		return colors;
	}

	@Override
	public void setColors( List<String> colors )
	{
		this.colors = colors;
	}

	@Override
	public String getDescriptionField()
	{
		return descriptionField;
	}

	@Override
	public void setDescriptionField( String descriptionField )
	{
		this.descriptionField = descriptionField;
	}

	@Override
	public List<Float> getGradientRatio()
	{
		return gradientRatio;
	}

	@Override
	public void setGradientRatio( List<Float> gradientRatio )
	{
		this.gradientRatio = gradientRatio;
	}

	@Override
	public Float getGroupedAlpha()
	{
		return groupedAlpha;
	}

	@Override
	public void setGroupedAlpha( Float groupedAlpha )
	{
		this.groupedAlpha = groupedAlpha;
	}

	@Override
	public String getGroupedColor()
	{
		return groupedColor;
	}

	@Override
	public void setGroupedColor( String groupedColor )
	{
		this.groupedColor = groupedColor;
	}

	@Override
	public String getGroupedDescription()
	{
		return groupedDescription;
	}

	@Override
	public void setGroupedDescription( String groupedDescription )
	{
		this.groupedDescription = groupedDescription;
	}

	@Override
	public Boolean getGroupedPulled()
	{
		return groupedPulled;
	}

	@Override
	public void setGroupedPulled( Boolean groupedPulled )
	{
		this.groupedPulled = groupedPulled;
	}

	@Override
	public String getGroupedTitle()
	{
		return groupedTitle;
	}

	@Override
	public void setGroupedTitle( String groupedTitle )
	{
		this.groupedTitle = groupedTitle;
	}

	@Override
	public Double getGroupPercent()
	{
		return groupPercent;
	}

	@Override
	public void setGroupPercent( Double groupPercent )
	{
		this.groupPercent = groupPercent;
	}

	@Override
	public Float getHideLabelsPercent()
	{
		return hideLabelsPercent;
	}

	@Override
	public void setHideLabelsPercent( Float hideLabelsPercent )
	{
		this.hideLabelsPercent = hideLabelsPercent;
	}

	@Override
	public Float getHoverAlpha()
	{
		return hoverAlpha;
	}

	@Override
	public void setHoverAlpha( Float hoverAlpha )
	{
		this.hoverAlpha = hoverAlpha;
	}

	@Override
	public Object getLabelFunction()
	{
		return labelFunction;
	}

	@Override
	public void setLabelFunction( Object labelFunction )
	{
		this.labelFunction = labelFunction;
	}

	@Override
	public Boolean getLabelsEnabled()
	{
		return labelsEnabled;
	}

	@Override
	public void setLabelsEnabled( Boolean labelsEnabled )
	{
		this.labelsEnabled = labelsEnabled;
	}

	@Override
	public Float getLabelTickAlpha()
	{
		return labelTickAlpha;
	}

	@Override
	public void setLabelTickAlpha( Float labelTickAlpha )
	{
		this.labelTickAlpha = labelTickAlpha;
	}

	@Override
	public String getLabelTickColor()
	{
		return labelTickColor;
	}

	@Override
	public void setLabelTickColor( String labelTickColor )
	{
		this.labelTickColor = labelTickColor;
	}

	@Override
	public Float getMarginBottom()
	{
		return marginBottom;
	}

	@Override
	public void setMarginBottom( Float marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	@Override
	public Float getMarginLeft()
	{
		return marginLeft;
	}

	@Override
	public void setMarginLeft( Float marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	@Override
	public Float getMarginRight()
	{
		return marginRight;
	}

	@Override
	public void setMarginRight( Float marginRight )
	{
		this.marginRight = marginRight;
	}

	@Override
	public Float getMarginTop()
	{
		return marginTop;
	}

	@Override
	public void setMarginTop( Float marginTop )
	{
		this.marginTop = marginTop;
	}

	@Override
	public Float getMaxLabelWidth()
	{
		return maxLabelWidth;
	}

	@Override
	public void setMaxLabelWidth( Float maxLabelWidth )
	{
		this.maxLabelWidth = maxLabelWidth;
	}

	@Override
	public Float getOutlineAlpha()
	{
		return outlineAlpha;
	}

	@Override
	public void setOutlineAlpha( Float outlineAlpha )
	{
		this.outlineAlpha = outlineAlpha;
	}

	@Override
	public String getOutlineColor()
	{
		return outlineColor;
	}

	@Override
	public void setOutlineColor( String outlineColor )
	{
		this.outlineColor = outlineColor;
	}

	@Override
	public Float getOutlineThickness()
	{
		return outlineThickness;
	}

	@Override
	public void setOutlineThickness( Float outlineThickness )
	{
		this.outlineThickness = outlineThickness;
	}

	@Override
	public String getPatternField()
	{
		return patternField;
	}

	@Override
	public void setPatternField( String patternField )
	{
		this.patternField = patternField;
	}

	@Override
	public String getPulledField()
	{
		return pulledField;
	}

	@Override
	public void setPulledField( String pulledField )
	{
		this.pulledField = pulledField;
	}

	@Override
	public Integer getPullOutDuration()
	{
		return pullOutDuration;
	}

	@Override
	public void setPullOutDuration( Integer pullOutDuration )
	{
		this.pullOutDuration = pullOutDuration;
	}

	@Override
	public String getPullOutEffect()
	{
		return pullOutEffect;
	}

	@Override
	public void setPullOutEffect( String pullOutEffect )
	{
		this.pullOutEffect = pullOutEffect;
	}

	@Override
	public Boolean getPullOutOnlyOne()
	{
		return pullOutOnlyOne;
	}

	@Override
	public void setPullOutOnlyOne( Boolean pullOutOnlyOne )
	{
		this.pullOutOnlyOne = pullOutOnlyOne;
	}

	@Override
	public Boolean getSequencedAnimation()
	{
		return sequencedAnimation;
	}

	@Override
	public void setSequencedAnimation( Boolean sequencedAnimation )
	{
		this.sequencedAnimation = sequencedAnimation;
	}

	@Override
	public Float getStartAlpha()
	{
		return startAlpha;
	}

	@Override
	public void setStartAlpha( Float startAlpha )
	{
		this.startAlpha = startAlpha;
	}

	@Override
	public Integer getStartDuration()
	{
		return startDuration;
	}

	@Override
	public void setStartDuration( Integer startDuration )
	{
		this.startDuration = startDuration;
	}

	@Override
	public String getStartEffect()
	{
		return startEffect;
	}

	@Override
	public void setStartEffect( String startEffect )
	{
		this.startEffect = startEffect;
	}

	@Override
	public String getTitleField()
	{
		return titleField;
	}

	@Override
	public void setTitleField( String titleField )
	{
		this.titleField = titleField;
	}

	@Override
	public String getUrlField()
	{
		return urlField;
	}

	@Override
	public void setUrlField( String urlField )
	{
		this.urlField = urlField;
	}

	@Override
	public String getUrlTarget()
	{
		return urlTarget;
	}

	@Override
	public void setUrlTarget( String urlTarget )
	{
		this.urlTarget = urlTarget;
	}

	@Override
	public String getValueField()
	{
		return valueField;
	}

	@Override
	public void setValueField( String valueField )
	{
		this.valueField = valueField;
	}

	@Override
	public String getVisibleInLegendField()
	{
		return visibleInLegendField;
	}

	@Override
	public void setVisibleInLegendField( String visibleInLegendField )
	{
		this.visibleInLegendField = visibleInLegendField;
	}
}