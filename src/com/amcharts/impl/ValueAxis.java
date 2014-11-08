package com.amcharts.impl;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartEventUtils;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.columnchart.valueaxis.AxisChangedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.AxisChangedHandler;
import com.amcharts.impl.event.columnchart.valueaxis.AxisZoomedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.AxisZoomedHandler;
import com.amcharts.impl.event.columnchart.valueaxis.HasAxisChangedHandlers;
import com.amcharts.impl.event.columnchart.valueaxis.HasAxisZoomedHandlers;
import com.amcharts.impl.event.columnchart.valueaxis.HasLogarithmicAxisFailedHandlers;
import com.amcharts.impl.event.columnchart.valueaxis.LogarithmicAxisFailedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.LogarithmicAxisFailedHandler;
import com.amcharts.jso.ValueAxisJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.web.bindery.event.shared.HandlerRegistration;

public final class ValueAxis extends AxisBase implements IJavaScriptWrapper<ValueAxisJSO>, HasAxisChangedHandlers, HasAxisZoomedHandlers, HasLogarithmicAxisFailedHandlers
{
	protected ValueAxis()
	{
		jso = createJso();
	}

	public ValueAxisJSO getJso()
	{
		return ( ValueAxisJSO ) this.jso;
	}

	public void setJso( ValueAxisJSO jso )
	{
		this.jso = jso;
	}

	public native ValueAxisJSO createJso()
	/*-{
		var valueAxis = new $wnd.AmCharts.ValueAxis();
		return valueAxis;
	}-*/;

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public final double getAxisTitleOffset()
	{
		return getJso().getAxisTitleOffset();
	}

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public final void setAxisTitleOffset( double axisTitleOffset )
	{
		getJso().setAxisTitleOffset( axisTitleOffset );
	}

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public final double getBaseCoord()
	{
		return getJso().getBaseCoord();
	}

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public final void setBaseCoord( double baseCoord )
	{
		getJso().setBaseCoord( baseCoord );
	}

	/**
	 * Specifies base value of the axis.
	 */
	public final double getBaseValue()
	{
		return getJso().getBaseValue();
	}

	/**
	 * Specifies base value of the axis.
	 */
	public final void setBaseValue( double baseValue )
	{
		getJso().setBaseValue( baseValue );
	}

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public final String getDuration()
	{
		return getJso().getDuration();
	}

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public final void setDuration( String duration )
	{
		getJso().setDuration( duration );
	}

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public final JavaScriptObject getDurationUnits()
	{
		return getJso().getDurationUnits();
	}

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public final void setDurationUnits( JavaScriptObject durationUnits )
	{
		getJso().setDurationUnits( durationUnits );
	}

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public final String getGridType()
	{
		return getJso().getGridType();
	}

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public final void setGridType( String gridType )
	{
		getJso().setGridType( gridType );
	}

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public final String getId()
	{
		return getJso().getId();
	}

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public final void setId( String id )
	{
		getJso().setId( id );
	}

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public final boolean isIncludeGuidesInMinMax()
	{
		return getJso().isIncludeGuidesInMinMax();
	}

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public final void setIncludeGuidesInMinMax( boolean includeGuidesInMinMax )
	{
		getJso().setIncludeGuidesInMinMax( includeGuidesInMinMax );
	}

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public final boolean isIncludeHidden()
	{
		return getJso().isIncludeHidden();
	}

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public final void setIncludeHidden( boolean includeHidden )
	{
		getJso().setIncludeHidden( includeHidden );
	}

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public final boolean isdoublesOnly()
	{
		return getJso().isdoublesOnly();
	}

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public final void setdoublesOnly( boolean integersOnly )
	{
		getJso().setdoublesOnly( integersOnly );
	}

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public final IsFunction getLabelFunction()
	{
		return getJso().getLabelFunction();
	}

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public final void setLabelFunction( IsFunction labelFunction )
	{
		getJso().setLabelFunction( labelFunction );
	}

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public final boolean isLogarithmic()
	{
		return getJso().isLogarithmic();
	}

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public final void setLogarithmic( boolean logarithmic )
	{
		getJso().setLogarithmic( logarithmic );
	}

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public final double getMax()
	{
		return getJso().getMax();
	}

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public final void setMax( double max )
	{
		getJso().setMax( max );
	}

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final double getMaximum()
	{
		return getJso().getMaximum();
	}

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final void setMaximum( double maximum )
	{
		getJso().setMaximum( maximum );
	}

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public final double getMin()
	{
		return getJso().getMin();
	}

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public final void setMin( double min )
	{
		getJso().setMin( min );
	}

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final double getMinimum()
	{
		return getJso().getMinimum();
	}

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final void setMinimum( double minimum )
	{
		getJso().setMinimum( minimum );
	}

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public final double getMinMaxMultiplier()
	{
		return getJso().getMinMaxMultiplier();
	}

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public final void setMinMaxMultiplier( double minMaxMultiplier )
	{
		getJso().setMinMaxMultiplier( minMaxMultiplier );
	}

	/**
	 * Precision (number of decimals) of values.
	 */
	public final double getPrecision()
	{
		return getJso().getPrecision();
	}

	/**
	 * Precision (number of decimals) of values.
	 */
	public final void setPrecision( double precision )
	{
		getJso().setPrecision( precision );
	}

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public final boolean isRadarCategoriesEnabled()
	{
		return getJso().isRadarCategoriesEnabled();
	}

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public final void setRadarCategoriesEnabled( boolean radarCategoriesEnabled )
	{
		getJso().setRadarCategoriesEnabled( radarCategoriesEnabled );
	}

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public final boolean isRecalculateToPercents()
	{
		return getJso().isRecalculateToPercents();
	}

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public final void setRecalculateToPercents( boolean recalculateToPercents )
	{
		getJso().setRecalculateToPercents( recalculateToPercents );
	}

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public final boolean isReversed()
	{
		return getJso().isReversed();
	}

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public final void setReversed( boolean reversed )
	{
		getJso().setReversed( reversed );
	}

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public final String getStackType()
	{
		return getJso().getStackType();
	}

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public final void setStackType( String stackType )
	{
		getJso().setStackType( stackType );
	}

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public final double getStep()
	{
		return getJso().getStep();
	}

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public final void setStep( double step )
	{
		getJso().setStep( step );
	}

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public final double getSynchronizationMultiplier()
	{
		return getJso().getSynchronizationMultiplier();
	}

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public final void setSynchronizationMultiplier( double synchronizationMultiplier )
	{
		getJso().setSynchronizationMultiplier( synchronizationMultiplier );
	}

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public final IsValueAxis getSynchronizeWith()
	{
		return getJso().getSynchronizeWith();
	}

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public final void setSynchronizeWith( IsValueAxis synchronizeWith )
	{
		getJso().setSynchronizeWith( synchronizeWith );
	}

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public final String getTotalText()
	{
		return getJso().getTotalText();
	}

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public final void setTotalText( String totalText )
	{
		getJso().setTotalText( totalText );
	}

	/**
	 * Color of total text.
	 */
	public final String getTotalTextColor()
	{
		return getJso().getTotalTextColor();
	}

	/**
	 * Color of total text.
	 */
	public final void setTotalTextColor( String totalTextColor )
	{
		getJso().setTotalTextColor( totalTextColor );
	}

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public final double getTreatZeroAs()
	{
		return getJso().getTreatZeroAs();
	}

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public final void setTreatZeroAs( double treatZeroAs )
	{
		getJso().setTreatZeroAs( treatZeroAs );
	}

	/**
	 * Unit which will be added to the value label.
	 */
	public final String getUnit()
	{
		return getJso().getUnit();
	}

	/**
	 * Unit which will be added to the value label.
	 */
	public final void setUnit( String unit )
	{
		getJso().setUnit( unit );
	}

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public final String getUnitPosition()
	{
		return getJso().getUnitPosition();
	}

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public final void setUnitPosition( String unitPosition )
	{
		getJso().setUnitPosition( unitPosition );
	}

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public final boolean isUsePrefixes()
	{
		return getJso().isUsePrefixes();
	}

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public final void setUsePrefixes( boolean usePrefixes )
	{
		getJso().setUsePrefixes( usePrefixes );
	}

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public final boolean isUseScientificNotation()
	{
		return getJso().isUseScientificNotation();
	}

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public final void setUseScientificNotation( boolean useScientificNotation )
	{
		getJso().setUseScientificNotation( useScientificNotation );
	}

	/**
	 * Adds event listener to the object.
	 * type - string like 'axisChanged' (should be listed in 'events' section of this class or classes which extend this class). 
	 * handler - function which is called when event happens.
	 */
	public native double addListener( String type, AmChartListener handler )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var valueAxisThis = this;
		valueAxis
				.addListener(
						eventName,
						function(event) {
							@com.amcharts.impl.util.LogUtils::log(Ljava/lang/Object;)(event);
							valueAxisThis.@com.amcharts.impl.AmChart::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(amChartListener,event);
							if (event.event != undefined) {
								console.log('Non Dom Event - > ' + event.type);
							}
						});
	}-*/;

	public void handleListener( AmChartListener amChartListener, AmChartEventJSO event )
	{
		amChartListener.function( event );
	}

	/**
	 * Returns index of the category which is most close to specified coordinate.
	 */
	public native double coordinateToValue( String coordinate )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return valueAxis.coordinateToValue(coordinate);
	}-*/;

	/**
	 * Returns coordinate of the value in pixels.
	 */
	public native double getCoordinate( double value )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return valueAxis.getCoordinate(value);
	}-*/;

	/**
	 * Removes event listener from the object
	 */
	public native void removeListener( Object obj, String type, AmChartListener handler )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return valueAxis.removeListener(obj, type, handler);
	}-*/;

	/**
	 *	One value axis can be synchronized with another value axis. You should set synchronizationMultiplyer in order for this to work.
	 */
	public native double synchronizeWithAxis( IsValueAxis valueAxis )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return valueAxis.synchronizeWithAxis(valueAxis);
	}-*/;

	/**
	 * XY Chart only. Zooms-in the axis to the provided values.
	 */
	public native double zoomToValues( double startValue, double endValue )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return valueAxis.zoomToValues(startValue, endValue);
	}-*/;

	protected native void initListener( String eventName )
	/*-{
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var valueAxisThis = this;
		if (chart[eventName + 'Fl'] == undefined) {
			console.log(chart[eventName + 'Fl']);
			chart[eventName + 'Fl'] = true;
			chart
					.addListener(
							eventName,
							function(event) {
								valueAxisThis.@com.amcharts.impl.ValueAxis::fireEvent(Lcom/amcharts/impl/event/AmChartEventJSO;)(event);
							});
		} else {
			console.log(chart[eventName + 'Fl']);
		}
	}-*/;

	protected void fireEvent( AmChartEventJSO event )
	{
		AmCharts.EVENT_BUS.fireEvent( AmChartEventUtils.createEvent( event ) );
	}

	@Override
	public HandlerRegistration addAxisZoomedHandler( AxisZoomedHandler handler )
	{
		initListener( AxisZoomedEvent.getName() );
		return AxisZoomedEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}

	@Override
	public HandlerRegistration addAxisChangedHandler( AxisChangedHandler handler )
	{
		initListener( AxisChangedEvent.getName() );
		return AxisChangedEvent.addHandler( AmCharts.EVENT_BUS, handler );
	}

	@Override
	public HandlerRegistration addLogarithmicAxisFailedHandler( LogarithmicAxisFailedHandler handler )
	{
		initListener( LogarithmicAxisFailedEvent.getName() );
		return LogarithmicAxisFailedEvent
				.addHandler( AmCharts.EVENT_BUS, handler );
	}
}