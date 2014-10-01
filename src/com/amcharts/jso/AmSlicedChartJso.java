package com.amcharts.jso;

import java.util.List;

import com.amcharts.model.IsAmSlicedChart;

public class AmSlicedChartJso extends AmChartJso implements IsAmSlicedChart
{
	protected AmSlicedChartJso()
	{

	}
	@Override
	public final native Float getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	@Override
	public final native void setAlpha( Float alpha )
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
	public final native Float getBrightnessStep()
	/*-{
		return this.brightnessStep;
	}-*/;

	@Override
	public final native void setBrightnessStep( Float brightnessStep )
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
	public final native Float getGroupedAlpha()
	/*-{
		return this.groupedAlpha;
	}-*/;

	@Override
	public final native void setGroupedAlpha( Float groupedAlpha )
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
	public final native Float getGroupPercent()
	/*-{
		return this.groupPercent;
	}-*/;

	@Override
	public final native void setGroupPercent( Float groupPercent )
	/*-{
		this.groupPercent = groupPercent;
	}-*/;

	@Override
	public final native Float getHideLabelsPercent()
	/*-{
		return this.hideLabelsPercent;
	}-*/;

	@Override
	public final native void setHideLabelsPercent( Float hideLabelsPercent )
	/*-{
		this.hideLabelsPercent = hideLabelsPercent;
	}-*/;

	@Override
	public final native Float getHoverAlpha()
	/*-{
		return this.hoverAlpha;
	}-*/;

	@Override
	public final native void setHoverAlpha( Float hoverAlpha )
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
	public final native Float getLabelTickAlpha()
	/*-{
		return this.labelTickAlpha;
	}-*/;

	@Override
	public final native void setLabelTickAlpha( Float labelTickAlpha )
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
	public final native Float getMarginBottom()
	/*-{
		return this.marginBottom;
	}-*/;

	@Override
	public final native void setMarginBottom( Float marginBottom )
	/*-{
		this.marginBottom = marginBottom;
	}-*/;

	@Override
	public final native Float getMarginLeft()
	/*-{
		return this.marginLeft;
	}-*/;

	@Override
	public final native void setMarginLeft( Float marginLeft )
	/*-{
		this.marginLeft = marginLeft;
	}-*/;

	@Override
	public final native Float getMarginRight()
	/*-{
		return this.marginRight;
	}-*/;

	@Override
	public final native void setMarginRight( Float marginRight )
	/*-{
		this.marginRight = marginRight;
	}-*/;

	@Override
	public final native Float getMarginTop()
	/*-{
		return this.marginTop;
	}-*/;

	@Override
	public final native void setMarginTop( Float marginTop )
	/*-{
		this.marginTop = marginTop;
	}-*/;

	@Override
	public final native Float getMaxLabelWidth()
	/*-{
		return this.maxLabelWidth;
	}-*/;

	@Override
	public final native void setMaxLabelWidth( Float maxLabelWidth )
	/*-{
		this.maxLabelWidth = maxLabelWidth;
	}-*/;

	@Override
	public final native Float getOutlineAlpha()
	/*-{
		return this.outlineAlpha;
	}-*/;

	@Override
	public final native void setOutlineAlpha( Float outlineAlpha )
	/*-{
		this.outlineAlpha = outlineAlpha;
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
	public final native Float getOutlineThickness()
	/*-{
		return this.outlineThickness;
	}-*/;

	@Override
	public final native void setOutlineThickness( Float outlineThickness )
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
	public final native Float getStartAlpha()
	/*-{
		return this.startAlpha;
	}-*/;

	@Override
	public final native void setStartAlpha( Float startAlpha )
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