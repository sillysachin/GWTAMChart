package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;

public class AmSlicedChart extends AmChart implements IsAmSlicedChart
{

	@Override
	public native Float getAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().alpha;
	}-*/;

	@Override
	public native void setAlpha( Float alpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().alpha = alpha;
	}-*/;

	@Override
	public native String getAlphaField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().alphaField;
	}-*/;

	@Override
	public native void setAlphaField( String alphaField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().alphaField = alphaField;
	}-*/;

	@Override
	public native String getBaseColor() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().baseColor;
	}-*/;

	@Override
	public native void setBaseColor( String baseColor ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().baseColor = baseColor;
	}-*/;

	@Override
	public native Float getBrightnessStep() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().brightnessStep;
	}-*/;

	@Override
	public native void setBrightnessStep( Float brightnessStep ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().brightnessStep = brightnessStep;
	}-*/;

	@Override
	public native List<Object> getChartData() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().chartData;
	}-*/;

	@Override
	public native void setChartData( List<Object> chartData ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().chartData = chartData;
	}-*/;

	@Override
	public native String getColorField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().colorField;
	}-*/;

	@Override
	public native void setColorField( String colorField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().colorField = colorField;
	}-*/;

	@Override
	public native List<String> getColors() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().colors;
	}-*/;

	@Override
	public native void setColors( List<String> colors ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().colors = colors;
	}-*/;

	@Override
	public native String getDescriptionField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().descriptionField;
	}-*/;

	@Override
	public native void setDescriptionField( String descriptionField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().descriptionField = descriptionField;

	}-*/;

	@Override
	public native List<Float> getGradientRatio() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().gradientRatio;
	}-*/;

	@Override
	public native void setGradientRatio( List<Float> gradientRatio ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().gradientRatio = gradientRatio;

	}-*/;

	@Override
	public native Float getGroupedAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupedAlpha;
	}-*/;

	@Override
	public native void setGroupedAlpha( Float groupedAlpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupedAlpha = groupedAlpha;
	}-*/;

	@Override
	public native String getGroupedColor() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupedColor;
	}-*/;

	@Override
	public native void setGroupedColor( String groupedColor ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupedColor = groupedColor;
	}-*/;

	@Override
	public native String getGroupedDescription() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupedDescription;
	}-*/;

	@Override
	public native void setGroupedDescription( String groupedDescription ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupedDescription = groupedDescription;
	}-*/;

	@Override
	public native Boolean getGroupedPulled() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupedPulled;
	}-*/;

	@Override
	public native void setGroupedPulled( Boolean groupedPulled ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupedPulled = groupedPulled;
	}-*/;

	@Override
	public native String getGroupedTitle() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupedTitle;
	}-*/;

	@Override
	public native void setGroupedTitle( String groupedTitle ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupedTitle = groupedTitle;
	}-*/;

	@Override
	public native Float getGroupPercent() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().groupPercent;
	}-*/;

	@Override
	public native void setGroupPercent( Float groupPercent ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().groupPercent = groupPercent;
	}-*/;

	@Override
	public native Float getHideLabelsPercent() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().hideLabelsPercent;
	}-*/;

	@Override
	public native void setHideLabelsPercent( Float hideLabelsPercent ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().hideLabelsPercent = hideLabelsPercent;
	}-*/;

	@Override
	public native Float getHoverAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().hoverAlpha;
	}-*/;

	@Override
	public native void setHoverAlpha( Float hoverAlpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().hoverAlpha = hoverAlpha;
	}-*/;

	@Override
	public native Object getLabelFunction() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().labelFunction;
	}-*/;

	@Override
	public native void setLabelFunction( Object labelFunction ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().labelFunction = labelFunction;
	}-*/;

	@Override
	public native Boolean getLabelsEnabled() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().labelsEnabled;
	}-*/;

	@Override
	public native void setLabelsEnabled( Boolean labelsEnabled ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().labelsEnabled = labelsEnabled;
	}-*/;

	@Override
	public native Float getLabelTickAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().labelTickAlpha;
	}-*/;

	@Override
	public native void setLabelTickAlpha( Float labelTickAlpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().labelTickAlpha = labelTickAlpha;
	}-*/;

	@Override
	public native String getLabelTickColor() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().labelTickColor;
	}-*/;

	@Override
	public native void setLabelTickColor( String labelTickColor ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().labelTickColor = labelTickColor;
	}-*/;

	@Override
	public native Float getMarginBottom() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().marginBottom;
	}-*/;

	@Override
	public native void setMarginBottom( Float marginBottom ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().marginBottom = marginBottom;
	}-*/;

	@Override
	public native Float getMarginLeft() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().marginLeft;
	}-*/;

	@Override
	public native void setMarginLeft( Float marginLeft ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().marginLeft = marginLeft;
	}-*/;

	@Override
	public native Float getMarginRight() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().marginRight;
	}-*/;

	@Override
	public native void setMarginRight( Float marginRight ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().marginRight = marginRight;
	}-*/;

	@Override
	public native Float getMarginTop() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().marginTop;
	}-*/;

	@Override
	public native void setMarginTop( Float marginTop ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().marginTop = marginTop;
	}-*/;

	@Override
	public native Float getMaxLabelWidth() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().maxLabelWidth;
	}-*/;

	@Override
	public native void setMaxLabelWidth( Float maxLabelWidth ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().maxLabelWidth = maxLabelWidth;
	}-*/;

	@Override
	public native Float getOutlineAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().outlineAlpha;
	}-*/;

	@Override
	public native void setOutlineAlpha( Float outlineAlpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().outlineAlpha = outlineAlpha;
	}-*/;

	@Override
	public native String getOutlineColor() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().outlineColor;
	}-*/;

	@Override
	public native void setOutlineColor( String outlineColor ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().outlineColor = outlineColor;
	}-*/;

	@Override
	public native Float getOutlineThickness() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().outlineThickness;
	}-*/;

	@Override
	public native void setOutlineThickness( Float outlineThickness ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().outlineThickness = outlineThickness;
	}-*/;

	@Override
	public native String getPatternField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().patternField;
	}-*/;

	@Override
	public native void setPatternField( String patternField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().patternField = patternField;
	}-*/;

	@Override
	public native String getPulledField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().pulledField;
	}-*/;

	@Override
	public native void setPulledField( String pulledField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().pulledField = pulledField;
	}-*/;

	@Override
	public native Integer getPullOutDuration() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutDuration;
	}-*/;

	@Override
	public native void setPullOutDuration( Integer pullOutDuration ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutDuration = pullOutDuration;
	}-*/;

	@Override
	public native String getPullOutEffect() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutEffect;
	}-*/;

	@Override
	public native void setPullOutEffect( String pullOutEffect ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutEffect = pullOutEffect;
	}-*/;

	@Override
	public native Boolean getPullOutOnlyOne() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutOnlyOne;
	}-*/;

	@Override
	public native void setPullOutOnlyOne( Boolean pullOutOnlyOne ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().pullOutOnlyOne = pullOutOnlyOne;
	}-*/;

	@Override
	public native Boolean getSequencedAnimation() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().sequencedAnimation;

	}-*/;

	@Override
	public native void setSequencedAnimation( Boolean sequencedAnimation ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().sequencedAnimation = sequencedAnimation;
	}-*/;

	@Override
	public native Float getStartAlpha() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().startAlpha;
	}-*/;

	@Override
	public native void setStartAlpha( Float startAlpha ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().startAlpha = startAlpha;
	}-*/;

	@Override
	public native Integer getStartDuration() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().startDuration;
	}-*/;

	@Override
	public native void setStartDuration( Integer startDuration ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().startDuration = startDuration;
	}-*/;

	@Override
	public native String getStartEffect() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().startEffect;
	}-*/;

	@Override
	public native void setStartEffect( String startEffect ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().startEffect = startEffect;
	}-*/;

	@Override
	public native String getUrlField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().urlField;
	}-*/;

	@Override
	public native void setUrlField( String urlField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().urlField = urlField;
	}-*/;

	@Override
	public native String getUrlTarget() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().urlTarget;
	}-*/;

	@Override
	public native void setUrlTarget( String urlTarget ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().urlTarget = urlTarget;

	}-*/;

	@Override
	public native String getVisibleInLegendField() /*-{
		return this.@com.amcharts.impl.AmSlicedChart::getJso().visibleInLegendField;
	}-*/;

	@Override
	public native void setVisibleInLegendField( String visibleInLegendField ) /*-{
		this.@com.amcharts.impl.AmSlicedChart::getJso().visibleInLegendField = visibleInLegendField;
	}-*/;
}