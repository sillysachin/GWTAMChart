package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;
import com.fasterxml.jackson.annotation.JsonRawValue;

public class AmSlicedChart extends AmChart implements IsAmSlicedChart
{
	private double angle;

	private String balloonText;

	private double depth3D;

	private double alpha;

	private String alphaField;

	private String baseColor;

	private double brightnessStep;

	private List<Object> chartData;

	private String colorField;

	private List<String> colors;

	private String descriptionField;

	private List<Float> gradientRatio;

	private double groupedAlpha;

	private String groupedColor;

	private String groupedDescription;

	private Boolean groupedPulled;

	private String groupedTitle;

	private double groupPercent;

	private double hideLabelsPercent;

	private double hoverAlpha;

	@JsonRawValue
	private Object labelFunction;

	private Boolean labelsEnabled;

	private double labelTickAlpha;

	private String labelTickColor;

	private double marginBottom;

	private double marginLeft;

	private double marginRight;

	private double marginTop;

	private double maxLabelWidth;

	private double outlineAlpha;

	private String outlineColor;

	private double outlineThickness;

	private String patternField;

	private String pulledField;

	private double pullOutDuration;

	private String pullOutEffect;

	private Boolean pullOutOnlyOne;

	private Boolean sequencedAnimation;

	private double startAlpha;

	private double startDuration;

	private String startEffect;

	private String titleField;

	private String urlField;

	private String urlTarget;

	private String valueField;

	private String visibleInLegendField;

	@Override
	public double getAngle()
	{
		return angle;
	}

	@Override
	public void setAngle( double angle )
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
	public double getDepth3D()
	{
		return depth3D;
	}

	@Override
	public void setDepth3D( double depth3D )
	{
		this.depth3D = depth3D;
	}

	@Override
	public double getAlpha()
	{
		return alpha;
	}

	@Override
	public void setAlpha( double alpha )
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
	public double getBrightnessStep()
	{
		return brightnessStep;
	}

	@Override
	public void setBrightnessStep( double brightnessStep )
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
	public double getGroupedAlpha()
	{
		return groupedAlpha;
	}

	@Override
	public void setGroupedAlpha( double groupedAlpha )
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
	public double getGroupPercent()
	{
		return groupPercent;
	}

	@Override
	public void setGroupPercent( double groupPercent )
	{
		this.groupPercent = groupPercent;
	}

	@Override
	public double getHideLabelsPercent()
	{
		return hideLabelsPercent;
	}

	@Override
	public void setHideLabelsPercent( double hideLabelsPercent )
	{
		this.hideLabelsPercent = hideLabelsPercent;
	}

	@Override
	public double getHoverAlpha()
	{
		return hoverAlpha;
	}

	@Override
	public void setHoverAlpha( double hoverAlpha )
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
	public double getLabelTickAlpha()
	{
		return labelTickAlpha;
	}

	@Override
	public void setLabelTickAlpha( double labelTickAlpha )
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
	public double getMarginBottom()
	{
		return marginBottom;
	}

	@Override
	public void setMarginBottom( double marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	@Override
	public double getMarginLeft()
	{
		return marginLeft;
	}

	@Override
	public void setMarginLeft( double marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	@Override
	public double getMarginRight()
	{
		return marginRight;
	}

	@Override
	public void setMarginRight( double marginRight )
	{
		this.marginRight = marginRight;
	}

	@Override
	public double getMarginTop()
	{
		return marginTop;
	}

	@Override
	public void setMarginTop( double marginTop )
	{
		this.marginTop = marginTop;
	}

	@Override
	public double getMaxLabelWidth()
	{
		return maxLabelWidth;
	}

	@Override
	public void setMaxLabelWidth( double maxLabelWidth )
	{
		this.maxLabelWidth = maxLabelWidth;
	}

	@Override
	public double getOutlineAlpha()
	{
		return outlineAlpha;
	}

	@Override
	public void setOutlineAlpha( double outlineAlpha )
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
	public double getOutlineThickness()
	{
		return outlineThickness;
	}

	@Override
	public void setOutlineThickness( double outlineThickness )
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
	public double getPullOutDuration()
	{
		return pullOutDuration;
	}

	@Override
	public void setPullOutDuration( double pullOutDuration )
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
	public double getStartAlpha()
	{
		return startAlpha;
	}

	@Override
	public void setStartAlpha( double startAlpha )
	{
		this.startAlpha = startAlpha;
	}

	@Override
	public double getStartDuration()
	{
		return startDuration;
	}

	@Override
	public void setStartDuration( double startDuration )
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