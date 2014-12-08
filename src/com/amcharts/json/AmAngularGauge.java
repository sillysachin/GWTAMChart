package com.amcharts.json;

import java.util.List;

import com.amcharts.api.IsAmAngularChart;
import com.amcharts.api.IsFacePattern;
import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;

public final class AmAngularGauge implements IsAmAngularChart
{
	private Boolean adjustSize;

	private List<IsGaugeArrow> arrows;

	private List<IsGaugeAxis> axes;

	private Boolean clockWiseOnly;

	private double faceAlpha;

	private double faceBorderAlpha;

	private String faceBorderColor;

	private double faceBorderWidth;

	private String faceColor;

	private IsFacePattern facePattern;

	private double gaugeX;

	private double gaugeY;

	private double marginBottom;

	private double marginLeft;

	private double marginRight;

	private double marginTop;

	private double minRadius;

	private double startDuration;

	private String startEffect;

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	@Override
	public Boolean isAdjustSize()
	{
		return adjustSize;
	}

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	@Override
	public void setAdjustSize( Boolean adjustSize )
	{
		this.adjustSize = adjustSize;
	}

	/**
	 * Array of arrows.
	 */
	@Override
	public List<IsGaugeArrow> getArrows()
	{
		return arrows;
	}

	/**
	 * Array of arrows.
	 */
	@Override
	public void setArrows( List<IsGaugeArrow> arrows )
	{
		this.arrows = arrows;
	}

	/**
	 * Array of axes.
	 */
	@Override
	public List<IsGaugeAxis> getAxes()
	{
		return axes;
	}

	/**
	 * Array of axes.
	 */
	@Override
	public void setAxes( List<IsGaugeAxis> axes )
	{
		this.axes = axes;
	}

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	@Override
	public Boolean isClockWiseOnly()
	{
		return clockWiseOnly;
	}

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	@Override
	public void setClockWiseOnly( Boolean clockWiseOnly )
	{
		this.clockWiseOnly = clockWiseOnly;
	}

	/**
	 * Gauge face opacity.
	 */
	@Override
	public double getFaceAlpha()
	{
		return faceAlpha;
	}

	/**
	 * Gauge face opacity.
	 */
	@Override
	public void setFaceAlpha( double faceAlpha )
	{
		this.faceAlpha = faceAlpha;
	}

	/**
	 * Gauge face border opacity.
	 */
	@Override
	public double getFaceBorderAlpha()
	{
		return faceBorderAlpha;
	}

	/**
	 * Gauge face border opacity.
	 */
	@Override
	public void setFaceBorderAlpha( double faceBorderAlpha )
	{
		this.faceBorderAlpha = faceBorderAlpha;
	}

	/**
	 * Gauge face border color.
	 */
	@Override
	public String getFaceBorderColor()
	{
		return faceBorderColor;
	}

	/**
	 * Gauge face border color.
	 */
	@Override
	public void setFaceBorderColor( String faceBorderColor )
	{
		this.faceBorderColor = faceBorderColor;
	}

	/**
	 * Gauge face border width.
	 */
	@Override
	public double getFaceBorderWidth()
	{
		return faceBorderWidth;
	}

	/**
	 * Gauge face border width.
	 */
	@Override
	public void setFaceBorderWidth( double faceBorderWidth )
	{
		this.faceBorderWidth = faceBorderWidth;
	}

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	@Override
	public String getFaceColor()
	{
		return faceColor;
	}

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	@Override
	public void setFaceColor( String faceColor )
	{
		this.faceColor = faceColor;
	}

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	@Override
	public IsFacePattern getFacePattern()
	{
		return facePattern;
	}

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	@Override
	public void setFacePattern( IsFacePattern facePattern )
	{
		this.facePattern = facePattern;
	}

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	@Override
	public double getGaugeX()
	{
		return gaugeX;
	}

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	@Override
	public void setGaugeX( double gaugeX )
	{
		this.gaugeX = gaugeX;
	}

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	@Override
	public double getGaugeY()
	{
		return gaugeY;
	}

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	@Override
	public void setGaugeY( double gaugeY )
	{
		this.gaugeY = gaugeY;
	}

	/**
	 * Bottom spacing between chart and container.
	 */
	@Override
	public double getMarginBottom()
	{
		return marginBottom;
	}

	/**
	 * Bottom spacing between chart and container.
	 */
	@Override
	public void setMarginBottom( double marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	/**
	 * Left-hand spacing between chart and container.
	 */
	@Override
	public double getMarginLeft()
	{
		return marginLeft;
	}

	/**
	 * Left-hand spacing between chart and container.
	 */
	@Override
	public void setMarginLeft( double marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	/**
	 * Right-hand spacing between chart and container.
	 */
	@Override
	public double getMarginRight()
	{
		return marginRight;
	}

	/**
	 * Right-hand spacing between chart and container.
	 */
	@Override
	public void setMarginRight( double marginRight )
	{
		this.marginRight = marginRight;
	}

	/**
	 * Top spacing between chart and container.
	 */
	@Override
	public double getMarginTop()
	{
		return marginTop;
	}

	/**
	 * Top spacing between chart and container.
	 */
	@Override
	public void setMarginTop( double marginTop )
	{
		this.marginTop = marginTop;
	}

	/**
	 * Minimum radius of a gauge.
	 */
	@Override
	public double getMinRadius()
	{
		return minRadius;
	}

	/**
	 * Minimum radius of a gauge.
	 */
	@Override
	public void setMinRadius( double minRadius )
	{
		this.minRadius = minRadius;
	}

	/**
	 * Duration of arrow animation.
	 */
	@Override
	public double getStartDuration()
	{
		return startDuration;
	}

	/**
	 * Duration of arrow animation.
	 */
	@Override
	public void setStartDuration( double startDuration )
	{
		this.startDuration = startDuration;
	}

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	@Override
	public String getStartEffect()
	{
		return startEffect;
	}

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	@Override
	public void setStartEffect( String startEffect )
	{
		this.startEffect = startEffect;
	}
}
