package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;

public class AmSlicedChartJSO extends AmChartJSO implements IsAmSlicedChart
{
	protected AmSlicedChartJSO()
	{

	}

	@Override
	public final native double getAngle()
	/*-{
		return this.angle;
	}-*/;

	@Override
	public final native void setAngle( double angle )
	/*-{
		this.angle = angle;
	}-*/;

	@Override
	public final native String getBalloonText()
	/*-{
		return this.balloonText;
	}-*/;

	@Override
	public final native void setBalloonText( String balloonText )
	/*-{
		this.balloonText = balloonText;
	}-*/;

	@Override
	public final native double getDepth3D()
	/*-{
		return this.depth3D;
	}-*/;

	@Override
	public final native void setDepth3D( double depth3D )
	/*-{
		this.depth3D = depth3D;
	}-*/;
	
	@Override
	public final native double getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	@Override
	public final native void setAlpha( double alpha )
	/*-{
		this.alpha = alpha;
	}-*/;

	@Override
	public final native String getAlphaField()
	/*-{
		return this.alphaField;
	}-*/;

	@Override
	public final native void setAlphaField( String alphaField )
	/*-{
		this.alphaField = alphaField;
	}-*/;

	@Override
	public final native String getBaseColor()
	/*-{
		return this.baseColor;
	}-*/;

	@Override
	public final native void setBaseColor( String baseColor )
	/*-{
		this.baseColor = baseColor;
	}-*/;

	@Override
	public final native double getBrightnessStep()
	/*-{
		return this.brightnessStep;
	}-*/;

	@Override
	public final native void setBrightnessStep( double brightnessStep )
	/*-{
		this.brightnessStep = brightnessStep;
	}-*/;

	@Override
	public final native List<Object> getChartData()
	/*-{
		return this.chartData;
	}-*/;

	@Override
	public final native void setChartData( List<Object> chartData )
	/*-{
		this.chartData = chartData;
	}-*/;

	@Override
	public final native String getColorField()
	/*-{
		return this.colorField;
	}-*/;

	@Override
	public final native void setColorField( String colorField )
	/*-{
		this.colorField = colorField;
	}-*/;

	@Override
	public final native List<String> getColors()
	/*-{
		return this.colors;
	}-*/;

	@Override
	public final native void setColors( List<String> colors )
	/*-{
		this.colors = colors;
	}-*/;

	@Override
	public final native String getDescriptionField()
	/*-{
		return this.descriptionField;
	}-*/;

	@Override
	public final native void setDescriptionField( String descriptionField )
	/*-{
		this.descriptionField = descriptionField;
	}-*/;

	@Override
	public final native List<Float> getGradientRatio()
	/*-{
		return this.gradientRatio;
	}-*/;

	@Override
	public final native void setGradientRatio( List<Float> gradientRatio )
	/*-{
		this.gradientRatio = gradientRatio;
	}-*/;

	@Override
	public final native double getGroupedAlpha()
	/*-{
		return this.groupedAlpha;
	}-*/;

	@Override
	public final native void setGroupedAlpha( double groupedAlpha )
	/*-{
		this.groupedAlpha = groupedAlpha;
	}-*/;

	@Override
	public final native String getGroupedColor()
	/*-{
		return this.groupedColor;
	}-*/;

	@Override
	public final native void setGroupedColor( String groupedColor )
	/*-{
		this.groupedColor = groupedColor;
	}-*/;

	@Override
	public final native String getGroupedDescription()
	/*-{
		return this.groupedDescription;
	}-*/;

	@Override
	public final native void setGroupedDescription( String groupedDescription )
	/*-{
		this.groupedDescription = groupedDescription;
	}-*/;

	@Override
	public final native Boolean getGroupedPulled()
	/*-{
		return this.groupedPulled;
	}-*/;

	@Override
	public final native void setGroupedPulled( Boolean groupedPulled )
	/*-{
		this.groupedPulled = groupedPulled;
	}-*/;

	@Override
	public final native String getGroupedTitle()
	/*-{
		return this.groupedTitle;
	}-*/;

	@Override
	public final native void setGroupedTitle( String groupedTitle )
	/*-{
		this.groupedTitle = groupedTitle;
	}-*/;

	@Override
	public final native double getGroupPercent()
	/*-{
		return this.groupPercent;
	}-*/;

	@Override
	public final native void setGroupPercent( double groupPercent )
	/*-{
		this.groupPercent = groupPercent;
	}-*/;

	@Override
	public final native double getHideLabelsPercent()
	/*-{
		return this.hideLabelsPercent;
	}-*/;

	@Override
	public final native void setHideLabelsPercent( double hideLabelsPercent )
	/*-{
		this.hideLabelsPercent = hideLabelsPercent;
	}-*/;

	@Override
	public final native double getHoverAlpha()
	/*-{
		return this.hoverAlpha;
	}-*/;

	@Override
	public final native void setHoverAlpha( double hoverAlpha )
	/*-{
		this.hoverAlpha = hoverAlpha;
	}-*/;

	@Override
	public final native Object getLabelFunction()
	/*-{
		return this.labelFunction;
	}-*/;

	@Override
	public final native void setLabelFunction( Object labelFunction )
	/*-{
		this.labelFunction = labelFunction;
	}-*/;

	@Override
	public final native Boolean getLabelsEnabled()
	/*-{
		return this.labelsEnabled;
	}-*/;

	@Override
	public final native void setLabelsEnabled( Boolean labelsEnabled )
	/*-{
		this.labelsEnabled = labelsEnabled;
	}-*/;

	@Override
	public final native double getLabelTickAlpha()
	/*-{
		return this.labelTickAlpha;
	}-*/;

	@Override
	public final native void setLabelTickAlpha( double labelTickAlpha )
	/*-{
		this.labelTickAlpha = labelTickAlpha;
	}-*/;

	@Override
	public final native String getLabelTickColor()
	/*-{
		return this.labelTickColor;
	}-*/;

	@Override
	public final native void setLabelTickColor( String labelTickColor )
	/*-{
		this.labelTickColor = labelTickColor;
	}-*/;

	@Override
	public final native double getMarginBottom()
	/*-{
		return this.marginBottom;
	}-*/;

	@Override
	public final native void setMarginBottom( double marginBottom )
	/*-{
		this.marginBottom = marginBottom;
	}-*/;

	@Override
	public final native double getMarginLeft()
	/*-{
		return this.marginLeft;
	}-*/;

	@Override
	public final native void setMarginLeft( double marginLeft )
	/*-{
		this.marginLeft = marginLeft;
	}-*/;

	@Override
	public final native double getMarginRight()
	/*-{
		return this.marginRight;
	}-*/;

	@Override
	public final native void setMarginRight( double marginRight )
	/*-{
		this.marginRight = marginRight;
	}-*/;

	@Override
	public final native double getMarginTop()
	/*-{
		return this.marginTop;
	}-*/;

	@Override
	public final native void setMarginTop( double marginTop )
	/*-{
		this.marginTop = marginTop;
	}-*/;

	@Override
	public final native double getMaxLabelWidth()
	/*-{
		return this.maxLabelWidth;
	}-*/;

	@Override
	public final native void setMaxLabelWidth( double maxLabelWidth )
	/*-{
		this.maxLabelWidth = maxLabelWidth;
	}-*/;

	@Override
	public final native double getOutlineAlpha()
	/*-{
		return this.outlineAlpha;
	}-*/;

	@Override
	public final native void setOutlineAlpha( double outlineAlpha )
	/*-{
		this.outlineAlpha = 0.4;
	}-*/;

	@Override
	public final native String getOutlineColor()
	/*-{
		return this.outlineColor;
	}-*/;

	@Override
	public final native void setOutlineColor( String outlineColor )
	/*-{
		this.outlineColor = outlineColor;
	}-*/;

	@Override
	public final native double getOutlineThickness()
	/*-{
		return this.outlineThickness;
	}-*/;

	@Override
	public final native void setOutlineThickness( double outlineThickness )
	/*-{
		this.outlineThickness = outlineThickness;
	}-*/;

	@Override
	public final native String getPatternField()
	/*-{
		return this.patternField;
	}-*/;

	@Override
	public final native void setPatternField( String patternField )
	/*-{
		this.patternField = patternField;
	}-*/;

	@Override
	public final native String getPulledField()
	/*-{
		return this.pulledField;
	}-*/;

	@Override
	public final native void setPulledField( String pulledField )
	/*-{
		this.pulledField = pulledField;
	}-*/;

	@Override
	public final native Integer getPullOutDuration()
	/*-{
		return this.pullOutDuration;
	}-*/;

	@Override
	public final native void setPullOutDuration( Integer pullOutDuration )
	/*-{
		this.pullOutDuration = pullOutDuration;
	}-*/;

	@Override
	public final native String getPullOutEffect()
	/*-{
		return this.pullOutEffect;
	}-*/;

	@Override
	public final native void setPullOutEffect( String pullOutEffect )
	/*-{
		this.pullOutEffect = pullOutEffect;
	}-*/;

	@Override
	public final native Boolean getPullOutOnlyOne()
	/*-{
		return this.pullOutOnlyOne;
	}-*/;

	@Override
	public final native void setPullOutOnlyOne( Boolean pullOutOnlyOne )
	/*-{
		this.pullOutOnlyOne = pullOutOnlyOne;
	}-*/;

	@Override
	public final native Boolean getSequencedAnimation()
	/*-{
		return this.sequencedAnimation;
	}-*/;

	@Override
	public final native void setSequencedAnimation( Boolean sequencedAnimation )
	/*-{
		this.sequencedAnimation = sequencedAnimation;
	}-*/;

	@Override
	public final native double getStartAlpha()
	/*-{
		return this.startAlpha;
	}-*/;

	@Override
	public final native void setStartAlpha( double startAlpha )
	/*-{
		this.startAlpha = startAlpha;
	}-*/;

	@Override
	public final native Integer getStartDuration()
	/*-{
		return this.startDuration;
	}-*/;

	@Override
	public final native void setStartDuration( Integer startDuration )
	/*-{
		this.startDuration = startDuration;
	}-*/;

	@Override
	public final native String getStartEffect()
	/*-{
		return this.startEffect;
	}-*/;

	@Override
	public final native void setStartEffect( String startEffect )
	/*-{
		this.startEffect = startEffect;
	}-*/;

	@Override
	public final native String getTitleField()
	/*-{
		return this.titleField;
	}-*/;

	@Override
	public final native void setTitleField( String titleField )
	/*-{
		this.titleField = titleField;
	}-*/;

	@Override
	public final native String getUrlField()
	/*-{
		return this.urlField;
	}-*/;

	@Override
	public final native void setUrlField( String urlField )
	/*-{
		this.urlField = urlField;
	}-*/;

	@Override
	public final native String getUrlTarget()
	/*-{
		return this.urlTarget;
	}-*/;

	@Override
	public final native void setUrlTarget( String urlTarget )
	/*-{
		this.urlTarget = urlTarget;
	}-*/;

	@Override
	public final native String getValueField()
	/*-{
		return this.valueField;
	}-*/;

	@Override
	public final native void setValueField( String valueField )
	/*-{
		this.valueField = valueField;
	}-*/;

	@Override
	public final native String getVisibleInLegendField()
	/*-{
		return this.visibleInLegendField;
	}-*/;

	@Override
	public final native void setVisibleInLegendField( String visibleInLegendField )
	/*-{
		this.visibleInLegendField = visibleInLegendField;
	}-*/;
}