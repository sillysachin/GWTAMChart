package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmSlicedChart;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsSlice;

public class AmSlicedChartJSO extends AmChartJSO implements IsAmSlicedChart
{
	protected AmSlicedChartJSO()
	{

	}

	@Override
	public final native Double getAngle()
	/*-{
		return this.angle;
	}-*/;

	@Override
	public final native void setAngle( Double angle )
	/*-{
		this.angle = angle.@java.lang.Double::doubleValue()();
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
	public final native Double getDepth3D()
	/*-{
		return this.depth3D;
	}-*/;

	@Override
	public final native void setDepth3D( Double depth3D )
	/*-{
		this.depth3D = depth3D.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getAlpha()
	/*-{
		return this.alpha;
	}-*/;

	@Override
	public final native void setAlpha( Double alpha )
	/*-{
		this.alpha = alpha.@java.lang.Double::doubleValue()();
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
	public final native Double getBrightnessStep()
	/*-{
		return this.brightnessStep;
	}-*/;

	@Override
	public final native void setBrightnessStep( Double brightnessStep )
	/*-{
		this.brightnessStep = brightnessStep.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native List<IsSlice> getChartData()
	/*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.chartData);
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
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.colors);
	}-*/;

	@Override
	public final native void setColors( List<String> colors )
	/*-{
		this.colors = @com.amcharts.impl.util.WrapperUtils::getJSOArray(Ljava/util/List;)(colors);
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
	public final native List<Double> getGradientRatio()
	/*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.gradientRatio);
	}-*/;

	@Override
	public final native void setGradientRatio( List<Double> gradientRatio )
	/*-{
		this.gradientRatio = @com.amcharts.impl.util.WrapperUtils::getJSOArray(Ljava/util/List;)(gradientRatio);
	}-*/;

	@Override
	public final native Double getGroupedAlpha()
	/*-{
		return this.groupedAlpha;
	}-*/;

	@Override
	public final native void setGroupedAlpha( Double groupedAlpha )
	/*-{
		this.groupedAlpha = groupedAlpha.@java.lang.Double::doubleValue()();
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
	public final native Double getGroupPercent()
	/*-{
		return this.groupPercent;
	}-*/;

	@Override
	public final native void setGroupPercent( Double groupPercent )
	/*-{
		this.groupPercent = groupPercent.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getHideLabelsPercent()
	/*-{
		return this.hideLabelsPercent;
	}-*/;

	@Override
	public final native void setHideLabelsPercent( Double hideLabelsPercent )
	/*-{
		this.hideLabelsPercent = hideLabelsPercent.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getHoverAlpha()
	/*-{
		return this.hoverAlpha;
	}-*/;

	@Override
	public final native void setHoverAlpha( Double hoverAlpha )
	/*-{
		this.hoverAlpha = hoverAlpha.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native IsFunction getLabelFunction()
	/*-{
		return @com.amcharts.impl.JsFunction::getInstance(Lcom/google/gwt/core/client/JavaScriptObject;)(this.labelFunction);
	}-*/;

	@Override
	public final native void setLabelFunction( IsFunction labelFunction )
	/*-{
		this.labelFunction = @com.amcharts.impl.JsFunction::getJSInstance(Lcom/amcharts/impl/JsFunction;)(labelFunction);
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
	public final native Double getLabelTickAlpha()
	/*-{
		return this.labelTickAlpha;
	}-*/;

	@Override
	public final native void setLabelTickAlpha( Double labelTickAlpha )
	/*-{
		this.labelTickAlpha = labelTickAlpha.@java.lang.Double::doubleValue()();
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
	public final native Double getMarginBottom()
	/*-{
		return this.marginBottom;
	}-*/;

	@Override
	public final native void setMarginBottom( Double marginBottom )
	/*-{
		this.marginBottom = marginBottom.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getMarginLeft()
	/*-{
		return this.marginLeft;
	}-*/;

	@Override
	public final native void setMarginLeft( Double marginLeft )
	/*-{
		this.marginLeft = marginLeft.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getMarginRight()
	/*-{
		return this.marginRight;
	}-*/;

	@Override
	public final native void setMarginRight( Double marginRight )
	/*-{
		this.marginRight = marginRight.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getMarginTop()
	/*-{
		return this.marginTop;
	}-*/;

	@Override
	public final native void setMarginTop( Double marginTop )
	/*-{
		this.marginTop = marginTop.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getMaxLabelWidth()
	/*-{
		return this.maxLabelWidth;
	}-*/;

	@Override
	public final native void setMaxLabelWidth( Double maxLabelWidth )
	/*-{
		this.maxLabelWidth = maxLabelWidth.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getOutlineAlpha()
	/*-{
		return this.outlineAlpha;
	}-*/;

	@Override
	public final native void setOutlineAlpha( Double outlineAlpha )
	/*-{
		this.outlineAlpha = outlineAlpha.@java.lang.Double::doubleValue()();
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
	public final native Double getOutlineThickness()
	/*-{
		return this.outlineThickness;
	}-*/;

	@Override
	public final native void setOutlineThickness( Double outlineThickness )
	/*-{
		this.outlineThickness = outlineThickness.@java.lang.Double::doubleValue()();
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
	public final native Double getPullOutDuration()
	/*-{
		return this.pullOutDuration;
	}-*/;

	@Override
	public final native void setPullOutDuration( Double pullOutDuration )
	/*-{
		this.pullOutDuration = pullOutDuration.@java.lang.Double::doubleValue()();
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
	public final native Double getStartAlpha()
	/*-{
		return this.startAlpha;
	}-*/;

	@Override
	public final native void setStartAlpha( Double startAlpha )
	/*-{
		this.startAlpha = startAlpha.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getStartDuration()
	/*-{
		return this.startDuration;
	}-*/;

	@Override
	public final native void setStartDuration( Double startDuration )
	/*-{
		this.startDuration = startDuration.@java.lang.Double::doubleValue()();
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