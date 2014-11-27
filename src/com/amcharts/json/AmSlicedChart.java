package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;
import com.amcharts.api.IsFunction;

public class AmSlicedChart extends AmChart implements IsAmSlicedChart
{
	private Double angle;

	private String balloonText;

	private Double depth3D;

	private Double alpha;

	private String alphaField;

	private String baseColor;

	private Double brightnessStep;

	private List<Object> chartData;

	private String colorField;

	private List<String> colors;

	private String descriptionField;

	private List<Double> gradientRatio;

	private Double groupedAlpha;

	private String groupedColor;

	private String groupedDescription;

	private Boolean groupedPulled;

	private String groupedTitle;

	private Double groupPercent;

	private Double hideLabelsPercent;

	private Double hoverAlpha;

	private IsFunction labelFunction;

	private Boolean labelsEnabled;

	private Double labelTickAlpha;

	private String labelTickColor;

	private Double marginBottom;

	private Double marginLeft;

	private Double marginRight;

	private Double marginTop;

	private Double maxLabelWidth;

	private Double outlineAlpha;

	private String outlineColor;

	private Double outlineThickness;

	private String patternField;

	private String pulledField;

	private Double pullOutDuration;

	private String pullOutEffect;

	private Boolean pullOutOnlyOne;

	private Boolean sequencedAnimation;

	private Double startAlpha;

	private Double startDuration;

	private String startEffect;

	private String titleField;

	private String urlField;

	private String urlTarget;

	private String valueField;

	private String visibleInLegendField;

	@Override
	public Double getAngle()
	{
		return angle;
	}

	@Override
	public void setAngle( Double angle )
	{
		this.angle = angle;
	}

	@Override
	public String getBalloonText()
	{
		return balloonText;
	}

	@Override
	public void setBalloonText( String balloonText )
	{
		this.balloonText = balloonText;
	}

	@Override
	public Double getDepth3D()
	{
		return depth3D;
	}

	@Override
	public void setDepth3D( Double depth3D )
	{
		this.depth3D = depth3D;
	}

	@Override
	public Double getAlpha()
	{
		return alpha;
	}

	@Override
	public void setAlpha( Double alpha )
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
	public Double getBrightnessStep()
	{
		return brightnessStep;
	}

	@Override
	public void setBrightnessStep( Double brightnessStep )
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
	public List<Double> getGradientRatio()
	{
		return gradientRatio;
	}

	@Override
	public void setGradientRatio( List<Double> gradientRatio )
	{
		this.gradientRatio = gradientRatio;
	}

	@Override
	public Double getGroupedAlpha()
	{
		return groupedAlpha;
	}

	@Override
	public void setGroupedAlpha( Double groupedAlpha )
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
	public Double getHideLabelsPercent()
	{
		return hideLabelsPercent;
	}

	@Override
	public void setHideLabelsPercent( Double hideLabelsPercent )
	{
		this.hideLabelsPercent = hideLabelsPercent;
	}

	@Override
	public Double getHoverAlpha()
	{
		return hoverAlpha;
	}

	@Override
	public void setHoverAlpha( Double hoverAlpha )
	{
		this.hoverAlpha = hoverAlpha;
	}

	@Override
	public IsFunction getLabelFunction()
	{
		return labelFunction;
	}

	@Override
	public void setLabelFunction( IsFunction labelFunction )
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
	public Double getLabelTickAlpha()
	{
		return labelTickAlpha;
	}

	@Override
	public void setLabelTickAlpha( Double labelTickAlpha )
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
	public Double getMarginBottom()
	{
		return marginBottom;
	}

	@Override
	public void setMarginBottom( Double marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	@Override
	public Double getMarginLeft()
	{
		return marginLeft;
	}

	@Override
	public void setMarginLeft( Double marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	@Override
	public Double getMarginRight()
	{
		return marginRight;
	}

	@Override
	public void setMarginRight( Double marginRight )
	{
		this.marginRight = marginRight;
	}

	@Override
	public Double getMarginTop()
	{
		return marginTop;
	}

	@Override
	public void setMarginTop( Double marginTop )
	{
		this.marginTop = marginTop;
	}

	@Override
	public Double getMaxLabelWidth()
	{
		return maxLabelWidth;
	}

	@Override
	public void setMaxLabelWidth( Double maxLabelWidth )
	{
		this.maxLabelWidth = maxLabelWidth;
	}

	@Override
	public Double getOutlineAlpha()
	{
		return outlineAlpha;
	}

	@Override
	public void setOutlineAlpha( Double outlineAlpha )
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
	public Double getOutlineThickness()
	{
		return outlineThickness;
	}

	@Override
	public void setOutlineThickness( Double outlineThickness )
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
	public Double getPullOutDuration()
	{
		return pullOutDuration;
	}

	@Override
	public void setPullOutDuration( Double pullOutDuration )
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
	public Double getStartAlpha()
	{
		return startAlpha;
	}

	@Override
	public void setStartAlpha( Double startAlpha )
	{
		this.startAlpha = startAlpha;
	}

	@Override
	public Double getStartDuration()
	{
		return startDuration;
	}

	@Override
	public void setStartDuration( Double startDuration )
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