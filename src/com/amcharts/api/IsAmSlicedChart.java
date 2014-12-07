package com.amcharts.api;

import java.util.List;

public interface IsAmSlicedChart extends IsAmChart
{
	Double getAngle();

	void setAngle( Double angle );

	String getBalloonText();

	void setBalloonText( String balloonText );

	Double getDepth3D();

	void setDepth3D( Double depth3d );
	
	Double getAlpha();

	void setAlpha( Double alpha );

	String getAlphaField();

	void setAlphaField( String alphaField );

	String getBaseColor();

	void setBaseColor( String baseColor );

	Double getBrightnessStep();

	void setBrightnessStep( Double brightnessStep );

	List<IsSlice> getChartData();

	String getColorField();

	void setColorField( String colorField );

	List<String> getColors();

	void setColors( List<String> colors );

	String getDescriptionField();

	void setDescriptionField( String descriptionField );

	List<Double> getGradientRatio();

	void setGradientRatio( List<Double> gradientRatio );

	Double getGroupedAlpha();

	void setGroupedAlpha( Double groupedAlpha );

	String getGroupedColor();

	void setGroupedColor( String groupedColor );

	String getGroupedDescription();

	void setGroupedDescription( String groupedDescription );

	Boolean getGroupedPulled();

	void setGroupedPulled( Boolean groupedPulled );

	String getGroupedTitle();

	void setGroupedTitle( String groupedTitle );

	Double getGroupPercent();

	void setGroupPercent( Double groupPercent );

	Double getHideLabelsPercent();

	void setHideLabelsPercent( Double hideLabelsPercent );

	Double getHoverAlpha();

	void setHoverAlpha( Double hoverAlpha );

	IsFunction getLabelFunction();

	void setLabelFunction( IsFunction labelFunction );

	Boolean getLabelsEnabled();

	void setLabelsEnabled( Boolean labelsEnabled );

	Double getLabelTickAlpha();

	void setLabelTickAlpha( Double labelTickAlpha );

	String getLabelTickColor();

	void setLabelTickColor( String labelTickColor );

	Double getMarginBottom();

	void setMarginBottom( Double marginBottom );

	Double getMarginLeft();

	void setMarginLeft( Double marginLeft );

	Double getMarginRight();

	void setMarginRight( Double marginRight );

	Double getMarginTop();

	void setMarginTop( Double marginTop );

	Double getMaxLabelWidth();

	void setMaxLabelWidth( Double maxLabelWidth );

	Double getOutlineAlpha();

	void setOutlineAlpha( Double outlineAlpha );

	String getOutlineColor();

	void setOutlineColor( String outlineColor );

	Double getOutlineThickness();

	void setOutlineThickness( Double outlineThickness );

	String getPatternField();

	void setPatternField( String patternField );

	String getPulledField();

	void setPulledField( String pulledField );

	Double getPullOutDuration();

	void setPullOutDuration( Double pullOutDuration );

	String getPullOutEffect();

	void setPullOutEffect( String pullOutEffect );

	Boolean getPullOutOnlyOne();

	void setPullOutOnlyOne( Boolean pullOutOnlyOne );

	Boolean getSequencedAnimation();

	void setSequencedAnimation( Boolean sequencedAnimation );

	Double getStartAlpha();

	void setStartAlpha( Double startAlpha );

	Double getStartDuration();

	void setStartDuration( Double startDuration );

	String getStartEffect();

	void setStartEffect( String startEffect );

	String getTitleField();

	void setTitleField( String titleField );

	String getUrlField();

	void setUrlField( String urlField );

	String getUrlTarget();

	void setUrlTarget( String urlTarget );

	String getValueField();

	void setValueField( String valueField );

	String getVisibleInLegendField();

	void setVisibleInLegendField( String visibleInLegendField );
}