package com.amcharts.jso;

import com.amcharts.api.IsDurationUnits;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;

public final class ValueAxisJSO extends AxisBaseJSO implements IsValueAxis
{
	protected ValueAxisJSO()
	{
	}

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public final native double getAxisTitleOffset()
	/*-{
		return this.axisTitleOffset;
	}-*/;

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public final native void setAxisTitleOffset( double axisTitleOffset ) /*-{
		this.axisTitleOffset = axisTitleOffset;
	}-*/;

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public final native double getBaseCoord() /*-{
		return this.baseCoord;
	}-*/;

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public final native void setBaseCoord( double baseCoord ) /*-{
		this.baseCoord = baseCoord;
	}-*/;

	/**
	 * Specifies base value of the axis.
	 */
	public final native double getBaseValue() /*-{
		return this.baseValue;
	}-*/;

	/**
	 * Specifies base value of the axis.
	 */
	public final native void setBaseValue( double baseValue ) /*-{
		this.baseValue = baseValue;
	}-*/;

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public final native String getDuration() /*-{
		return this.duration;
	}-*/;

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public final native void setDuration( String duration ) /*-{
		this.duration = duration;
	}-*/;

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public final native IsDurationUnits getDurationUnits() /*-{
		return this.durationUnits;
	}-*/;

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public final native void setDurationUnits( IsDurationUnits durationUnits ) /*-{
		this.durationUnits = durationUnits;
	}-*/;

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public final native String getGridType() /*-{
		return this.gridType;
	}-*/;

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public final native void setGridType( String gridType ) /*-{
		this.gridType = gridType;
	}-*/;

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public final native String getId() /*-{
		return this.id;
	}-*/;

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public final native Boolean isIncludeGuidesInMinMax() /*-{
		return this.includeGuidesInMinMax;
	}-*/;

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public final native void setIncludeGuidesInMinMax( Boolean includeGuidesInMinMax ) /*-{
		this.includeGuidesInMinMax = includeGuidesInMinMax;
	}-*/;

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public final native Boolean isIncludeHidden() /*-{
		return this.includeHidden;
	}-*/;

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public final native void setIncludeHidden( Boolean includeHidden ) /*-{
		this.includeHidden = includeHidden;
	}-*/;

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public final native Boolean isdoublesOnly() /*-{
		return this.integersOnly;
	}-*/;

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public final native void setdoublesOnly( Boolean integersOnly ) /*-{
		this.integersOnly = integersOnly;
	}-*/;

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return this.string."
	 */
	public final native IsFunction getLabelFunction() /*-{
		return @com.amcharts.impl.JsFunction::getInstance(Lcom/google/gwt/core/client/JavaScriptObject;)(this.labelFunction);
	}-*/;

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return this.string."
	 */
	public final native void setLabelFunction( IsFunction labelFunction ) /*-{
		this.labelFunction = @com.amcharts.impl.JsFunction::getJSInstance(Lcom/amcharts/impl/JsFunction;)(labelFunction);
	}-*/;

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public final native Boolean isLogarithmic() /*-{
		return this.logarithmic;
	}-*/;

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public final native void setLogarithmic( Boolean logarithmic ) /*-{
		this.logarithmic = logarithmic;
	}-*/;

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public final native double getMax() /*-{
		return this.max;
	}-*/;

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public final native void setMax( double max ) /*-{
		this.max = max;
	}-*/;

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final native double getMaximum() /*-{
		return this.maximum;
	}-*/;

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final native void setMaximum( double maximum ) /*-{
		this.maximum = maximum;
	}-*/;

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public final native double getMin() /*-{
		return this.min;
	}-*/;

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public final native void setMin( double min ) /*-{
		this.min = min;
	}-*/;

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final native double getMinimum() /*-{
		return this.minimum;
	}-*/;

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public final native void setMinimum( double minimum ) /*-{
		this.minimum = minimum;
	}-*/;

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public final native double getMinMaxMultiplier() /*-{
		return this.minMaxMultiplier;
	}-*/;

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public final native void setMinMaxMultiplier( double minMaxMultiplier ) /*-{
		this.minMaxMultiplier = minMaxMultiplier;
	}-*/;

	/**
	 * Precision (number of decimals) of values.
	 */
	public final native double getPrecision() /*-{
		return this.precision;
	}-*/;

	/**
	 * Precision (number of decimals) of values.
	 */
	public final native void setPrecision( double precision ) /*-{
		this.precision = precision;
	}-*/;

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public final native Boolean isRadarCategoriesEnabled() /*-{
		return this.radarCategoriesEnabled;
	}-*/;

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public final native void setRadarCategoriesEnabled( Boolean radarCategoriesEnabled ) /*-{
		this.radarCategoriesEnabled = radarCategoriesEnabled;
	}-*/;

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public final native Boolean isRecalculateToPercents() /*-{
		return this.recalculateToPercents;
	}-*/;

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public final native void setRecalculateToPercents( Boolean recalculateToPercents ) /*-{
		this.recalculateToPercents = recalculateToPercents;
	}-*/;

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public final native Boolean isReversed() /*-{
		return this.reversed;
	}-*/;

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public final native void setReversed( Boolean reversed ) /*-{
		this.reversed = reversed;
	}-*/;

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public final native String getStackType() /*-{
		return this.stackType;
	}-*/;

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public final native void setStackType( String stackType ) /*-{
		this.stackType = stackType;
	}-*/;

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public final native double getStep() /*-{
		return this.step;
	}-*/;

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public final native void setStep( double step ) /*-{
		this.step = step;
	}-*/;

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public final native double getSynchronizationMultiplier() /*-{
		return this.synchronizationMultiplier;
	}-*/;

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public final native void setSynchronizationMultiplier( double synchronizationMultiplier ) /*-{
		this.synchronizationMultiplier = synchronizationMultiplier;
	}-*/;

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public final native IsValueAxis getSynchronizeWith() /*-{
		return this.synchronizeWith;
	}-*/;

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public final native void setSynchronizeWith( IsValueAxis synchronizeWith ) /*-{
		this.synchronizeWith = synchronizeWith;
	}-*/;

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public final native String getTotalText() /*-{
		return this.totalText;
	}-*/;

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public final native void setTotalText( String totalText ) /*-{
		this.totalText = totalText;
	}-*/;

	/**
	 * Color of total text.
	 */
	public final native String getTotalTextColor() /*-{
		return this.totalTextColor;
	}-*/;

	/**
	 * Color of total text.
	 */
	public final native void setTotalTextColor( String totalTextColor ) /*-{
		this.totalTextColor = totalTextColor;
	}-*/;

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public final native double getTreatZeroAs() /*-{
		return this.treatZeroAs;
	}-*/;

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public final native void setTreatZeroAs( double treatZeroAs ) /*-{
		this.treatZeroAs = treatZeroAs;
	}-*/;

	/**
	 * Unit which will be added to the value label.
	 */
	public final native String getUnit() /*-{
		return this.unit;
	}-*/;

	/**
	 * Unit which will be added to the value label.
	 */
	public final native void setUnit( String unit ) /*-{
		this.unit = unit;
	}-*/;

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public final native String getUnitPosition() /*-{
		return this.unitPosition;
	}-*/;

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public final native void setUnitPosition( String unitPosition ) /*-{
		this.unitPosition = unitPosition;
	}-*/;

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public final native Boolean isUsePrefixes() /*-{
		return this.usePrefixes;
	}-*/;

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public final native void setUsePrefixes( Boolean usePrefixes ) /*-{
		this.usePrefixes = usePrefixes;
	}-*/;

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public final native Boolean isUseScientificNotation() /*-{
		return this.useScientificNotation;
	}-*/;

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public final native void setUseScientificNotation( Boolean useScientificNotation ) /*-{
		this.useScientificNotation = useScientificNotation;
	}-*/;

	@Override
	public final native Boolean isDoublesOnly()
	/*-{
		return this.doublesOnly;
	}-*/;

	@Override
	public final native void setDoublesOnly( Boolean integersOnly )
	/*-{
		this.doublesOnly = integersOnly;
	}-*/;
}