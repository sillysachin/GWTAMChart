package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAmAngularChart;
import com.amcharts.api.IsFacePattern;
import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;
import com.amcharts.jso.AmAngularGaugeJSO;

public final class AmAngularGauge extends AmChart implements IsAmAngularChart
{
	private List<IsGaugeArrow> arrows;

	private List<IsGaugeAxis> axes;

	protected AmAngularGauge()
	{
		jso = createJso();
		setType( "gauge" );
	}

	public AmAngularGaugeJSO getJso()
	{
		return ( AmAngularGaugeJSO ) this.jso;
	}

	public void setJso( AmAngularGaugeJSO jso )
	{
		this.jso = jso;
	}

	//Learn: new $wnd.AmCharts.AmAngularGauge(); use of $wnd
	private native AmAngularGaugeJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmAngularGauge();
		return chart;
	}-*/;

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public final Boolean isAdjustSize()
	{
		return getJso().isAdjustSize();
	}

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public final void setAdjustSize( Boolean adjustSize )
	{
		getJso().setAdjustSize( adjustSize );
	}

	/**
	 * Array of arrows.
	 */
	public final List<IsGaugeArrow> getArrows()
	{
		return this.arrows;
	}

	/**
	 * Array of arrows.
	 */
	public final void setArrows( List<IsGaugeArrow> arrows )
	{
		this.arrows = arrows;
		getJso().setArrows( arrows );
	}

	/**
	 * Array of axes.
	 */
	public final List<IsGaugeAxis> getAxes()
	{
		return this.axes;
	}

	/**
	 * Array of axes.
	 */
	public final void setAxes( List<IsGaugeAxis> axes )
	{
		this.axes = axes;
		getJso().setAxes( axes );
	}

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public final Boolean isClockWiseOnly()
	{
		return getJso().isClockWiseOnly();
	}

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public final void setClockWiseOnly( Boolean clockWiseOnly )
	{
		getJso().setClockWiseOnly( clockWiseOnly );
	}

	/**
	 * Gauge face opacity.
	 */
	public final double getFaceAlpha()
	{
		return getJso().getFaceAlpha();
	}

	/**
	 * Gauge face opacity.
	 */
	public final void setFaceAlpha( double faceAlpha )
	{
		getJso().setFaceAlpha( faceAlpha );
	}

	/**
	 * Gauge face border opacity.
	 */
	public final double getFaceBorderAlpha()
	{
		return getJso().getFaceBorderAlpha();
	}

	/**
	 * Gauge face border opacity.
	 */
	public final void setFaceBorderAlpha( double faceBorderAlpha )
	{
		getJso().setFaceBorderAlpha( faceBorderAlpha );
	}

	/**
	 * Gauge face border color.
	 */
	public final String getFaceBorderColor()
	{
		return getJso().getFaceBorderColor();
	}

	/**
	 * Gauge face border color.
	 */
	public final void setFaceBorderColor( String faceBorderColor )
	{
		getJso().setFaceBorderColor( faceBorderColor );
	}

	/**
	 * Gauge face border width.
	 */
	public final double getFaceBorderWidth()
	{
		return getJso().getFaceBorderWidth();
	}

	/**
	 * Gauge face border width.
	 */
	public final void setFaceBorderWidth( double faceBorderWidth )
	{
		getJso().setFaceBorderWidth( faceBorderWidth );
	}

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public final String getFaceColor()
	{
		return getJso().getFaceColor();
	}

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public final void setFaceColor( String faceColor )
	{
		getJso().setFaceColor( faceColor );
	}

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	@Override
	public final native IsFacePattern getFacePattern()/*-{
		var facePattern = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.AmChart::jso.facePattern)
		return facePattern;
	}-*/;

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	@Override
	public final native void setFacePattern( IsFacePattern facePattern )/*-{
		var varFacePattern = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(facePattern)
		this.@com.amcharts.impl.AmChart::jso.facePattern = varFacePattern;
	}-*/;

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public final double getGaugeX()
	{
		return getJso().getGaugeX();
	}

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public final void setGaugeX( double gaugeX )
	{
		getJso().setGaugeX( gaugeX );
	}

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public final double getGaugeY()
	{
		return getJso().getGaugeY();
	}

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public final void setGaugeY( double gaugeY )
	{
		getJso().setGaugeY( gaugeY );
	}

	/**
	 * Bottom spacing between chart and container.
	 */
	public final double getMarginBottom()
	{
		return getJso().getMarginBottom();
	}

	/**
	 * Bottom spacing between chart and container.
	 */
	public final void setMarginBottom( double marginBottom )
	{
		getJso().setMarginBottom( marginBottom );
	}

	/**
	 * Left-hand spacing between chart and container.
	 */
	public final double getMarginLeft()
	{
		return getJso().getMarginLeft();
	}

	/**
	 * Left-hand spacing between chart and container.
	 */
	public final void setMarginLeft( double marginLeft )
	{
		getJso().setMarginLeft( marginLeft );
	}

	/**
	 * Right-hand spacing between chart and container.
	 */
	public final double getMarginRight()
	{
		return getJso().getMarginRight();
	}

	/**
	 * Right-hand spacing between chart and container.
	 */
	public final void setMarginRight( double marginRight )
	{
		getJso().setMarginRight( marginRight );
	}

	/**
	 * Top spacing between chart and container.
	 */
	public final double getMarginTop()
	{
		return getJso().getMarginTop();
	}

	/**
	 * Top spacing between chart and container.
	 */
	public final void setMarginTop( double marginTop )
	{
		getJso().setMarginTop( marginTop );
	}

	/**
	 * Minimum radius of a gauge.
	 */
	public final double getMinRadius()
	{
		return getJso().getMinRadius();
	}

	/**
	 * Minimum radius of a gauge.
	 */
	public final void setMinRadius( double minRadius )
	{
		getJso().setMinRadius( minRadius );
	}

	/**
	 * Duration of arrow animation.
	 */
	public final double getStartDuration()
	{
		return getJso().getStartDuration();
	}

	/**
	 * Duration of arrow animation.
	 */
	public final void setStartDuration( double startDuration )
	{
		getJso().setStartDuration( startDuration );
	}

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public final String getStartEffect()
	{
		return getJso().getStartEffect();
	}

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public final void setStartEffect( String startEffect )
	{
		getJso().setStartEffect( startEffect );
	}

	/**
	 * Adds arrow to the chart.
	 */
	public native void addArrow( IsGaugeArrow arrow )
	/*-{
		var angularGauge = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var gaugeArrow = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(arrow)
		angularGauge.addArrow(gaugeArrow);
	}-*/;

	/**
	 * Adds axis to angular gauge.
	 */
	public native void addAxis( IsGaugeAxis axis )
	/*-{
		var angularGauge = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(axis);
		angularGauge.addAxis(gaugeAxis);
	}-*/;

	/**
	 * Adds axis to angular gauge.
	 */
	public native void addAxis( GaugeAxis axis )
	/*-{
		var angularGauge = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(axis);
		angularGauge.addAxis(gaugeAxis);
	}-*/;

	/**
	 * Removes arrow from the chart.
	 */
	public native void removeArrow( IsGaugeArrow arrow )
	/*-{
		var angularGauge = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var gaugeArrow = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(arrow);
		angularGauge.removeArrow(gaugeArrow);
	}-*/;

	/**
	 * Removes axis from the chart.
	 */
	public native void removeAxis( IsGaugeAxis axis )
	/*-{
		var angularGauge = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var gaugeAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(axis);
		angularGauge.removeAxis(axis);
	}-*/;
}