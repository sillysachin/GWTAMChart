package com.amcharts.api;

import java.util.List;

public interface IsAmSlicedChart extends IsAmChart
{

	public abstract Float getAlpha();

	public abstract void setAlpha( Float alpha );

	public abstract String getAlphaField();

	public abstract void setAlphaField( String alphaField );

	public abstract String getBaseColor();

	public abstract void setBaseColor( String baseColor );

	public abstract Float getBrightnessStep();

	public abstract void setBrightnessStep( Float brightnessStep );

	public abstract List<Object> getChartData();

	public abstract void setChartData( List<Object> chartData );

	public abstract String getColorField();

	public abstract void setColorField( String colorField );

	public abstract List<String> getColors();

	public abstract void setColors( List<String> colors );

	public abstract String getDescriptionField();

	public abstract void setDescriptionField( String descriptionField );

	public abstract List<Float> getGradientRatio();

	public abstract void setGradientRatio( List<Float> gradientRatio );

	public abstract Float getGroupedAlpha();

	public abstract void setGroupedAlpha( Float groupedAlpha );

	public abstract String getGroupedColor();

	public abstract void setGroupedColor( String groupedColor );

	public abstract String getGroupedDescription();

	public abstract void setGroupedDescription( String groupedDescription );

	public abstract Boolean getGroupedPulled();

	public abstract void setGroupedPulled( Boolean groupedPulled );

	public abstract String getGroupedTitle();

	public abstract void setGroupedTitle( String groupedTitle );

	public abstract Float getGroupPercent();

	public abstract void setGroupPercent( Float groupPercent );

	public abstract Float getHideLabelsPercent();

	public abstract void setHideLabelsPercent( Float hideLabelsPercent );

	public abstract Float getHoverAlpha();

	public abstract void setHoverAlpha( Float hoverAlpha );

	public abstract Object getLabelFunction();

	public abstract void setLabelFunction( Object labelFunction );

	public abstract Boolean getLabelsEnabled();

	public abstract void setLabelsEnabled( Boolean labelsEnabled );

	public abstract Float getLabelTickAlpha();

	public abstract void setLabelTickAlpha( Float labelTickAlpha );

	public abstract String getLabelTickColor();

	public abstract void setLabelTickColor( String labelTickColor );

	public abstract Float getMarginBottom();

	public abstract void setMarginBottom( Float marginBottom );

	public abstract Float getMarginLeft();

	public abstract void setMarginLeft( Float marginLeft );

	public abstract Float getMarginRight();

	public abstract void setMarginRight( Float marginRight );

	public abstract Float getMarginTop();

	public abstract void setMarginTop( Float marginTop );

	public abstract Float getMaxLabelWidth();

	public abstract void setMaxLabelWidth( Float maxLabelWidth );

	public abstract Float getOutlineAlpha();

	public abstract void setOutlineAlpha( Float outlineAlpha );

	public abstract String getOutlineColor();

	public abstract void setOutlineColor( String outlineColor );

	public abstract Float getOutlineThickness();

	public abstract void setOutlineThickness( Float outlineThickness );

	public abstract String getPatternField();

	public abstract void setPatternField( String patternField );

	public abstract String getPulledField();

	public abstract void setPulledField( String pulledField );

	public abstract Integer getPullOutDuration();

	public abstract void setPullOutDuration( Integer pullOutDuration );

	public abstract String getPullOutEffect();

	public abstract void setPullOutEffect( String pullOutEffect );

	public abstract Boolean getPullOutOnlyOne();

	public abstract void setPullOutOnlyOne( Boolean pullOutOnlyOne );

	public abstract Boolean getSequencedAnimation();

	public abstract void setSequencedAnimation( Boolean sequencedAnimation );

	public abstract Float getStartAlpha();

	public abstract void setStartAlpha( Float startAlpha );

	public abstract Integer getStartDuration();

	public abstract void setStartDuration( Integer startDuration );

	public abstract String getStartEffect();

	public abstract void setStartEffect( String startEffect );

	public abstract String getTitleField();

	public abstract void setTitleField( String titleField );

	public abstract String getUrlField();

	public abstract void setUrlField( String urlField );

	public abstract String getUrlTarget();

	public abstract void setUrlTarget( String urlTarget );

	public abstract String getValueField();

	public abstract void setValueField( String valueField );

	public abstract String getVisibleInLegendField();

	public abstract void setVisibleInLegendField( String visibleInLegendField );
}