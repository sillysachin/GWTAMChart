package com.amcharts.api;

import java.util.List;

public interface IsAmSlicedChart extends IsAmChart
{
	double getAngle();

	void setAngle( double angle );

	String getBalloonText();

	void setBalloonText( String balloonText );

	double getDepth3D();

	void setDepth3D( double depth3d );
	
	double getAlpha();

	void setAlpha( double alpha );

	String getAlphaField();

	void setAlphaField( String alphaField );

	String getBaseColor();

	void setBaseColor( String baseColor );

	double getBrightnessStep();

	void setBrightnessStep( double brightnessStep );

	List<Object> getChartData();

	void setChartData( List<Object> chartData );

	String getColorField();

	void setColorField( String colorField );

	List<String> getColors();

	void setColors( List<String> colors );

	String getDescriptionField();

	void setDescriptionField( String descriptionField );

	List<Float> getGradientRatio();

	void setGradientRatio( List<Float> gradientRatio );

	double getGroupedAlpha();

	void setGroupedAlpha( double groupedAlpha );

	String getGroupedColor();

	void setGroupedColor( String groupedColor );

	String getGroupedDescription();

	void setGroupedDescription( String groupedDescription );

	Boolean getGroupedPulled();

	void setGroupedPulled( Boolean groupedPulled );

	String getGroupedTitle();

	void setGroupedTitle( String groupedTitle );

	double getGroupPercent();

	void setGroupPercent( double groupPercent );

	double getHideLabelsPercent();

	void setHideLabelsPercent( double hideLabelsPercent );

	double getHoverAlpha();

	void setHoverAlpha( double hoverAlpha );

	Object getLabelFunction();

	void setLabelFunction( Object labelFunction );

	Boolean getLabelsEnabled();

	void setLabelsEnabled( Boolean labelsEnabled );

	double getLabelTickAlpha();

	void setLabelTickAlpha( double labelTickAlpha );

	String getLabelTickColor();

	void setLabelTickColor( String labelTickColor );

	double getMarginBottom();

	void setMarginBottom( double marginBottom );

	double getMarginLeft();

	void setMarginLeft( double marginLeft );

	double getMarginRight();

	void setMarginRight( double marginRight );

	double getMarginTop();

	void setMarginTop( double marginTop );

	double getMaxLabelWidth();

	void setMaxLabelWidth( double maxLabelWidth );

	double getOutlineAlpha();

	void setOutlineAlpha( double outlineAlpha );

	String getOutlineColor();

	void setOutlineColor( String outlineColor );

	double getOutlineThickness();

	void setOutlineThickness( double outlineThickness );

	String getPatternField();

	void setPatternField( String patternField );

	String getPulledField();

	void setPulledField( String pulledField );

	Integer getPullOutDuration();

	void setPullOutDuration( Integer pullOutDuration );

	String getPullOutEffect();

	void setPullOutEffect( String pullOutEffect );

	Boolean getPullOutOnlyOne();

	void setPullOutOnlyOne( Boolean pullOutOnlyOne );

	Boolean getSequencedAnimation();

	void setSequencedAnimation( Boolean sequencedAnimation );

	double getStartAlpha();

	void setStartAlpha( double startAlpha );

	Integer getStartDuration();

	void setStartDuration( Integer startDuration );

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