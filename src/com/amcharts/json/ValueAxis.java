package com.amcharts.json;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;
import com.google.gwt.core.client.JavaScriptObject;

public final class ValueAxis extends AxisBase implements IsValueAxis
{
	private double axisTitleOffset;

	private double baseCoord;

	private double baseValue;

	private String duration;

	private JavaScriptObject durationUnits;

	private String gridType;

	private String id;

	private boolean includeGuidesInMinMax;

	private boolean includeHidden;

	private boolean integersOnly;

	private IsFunction labelFunction;

	private boolean logarithmic;

	private double max;

	private double maximum;

	private double min;

	private double minimum;

	private double minMaxMultiplier;

	private String position;

	private double precision;

	private boolean radarCategoriesEnabled;

	private boolean recalculateToPercents;

	private boolean reversed;

	private String stackType;

	private double step;

	private double synchronizationMultiplier;

	private IsValueAxis synchronizeWith;

	private String totalText;

	private String totalTextColor;

	private double treatZeroAs;

	private String unit;

	private String unitPosition;

	private boolean usePrefixes;

	private boolean useScientificNotation;

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public double getAxisTitleOffset()
	{
		return axisTitleOffset;
	}

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public void setAxisTitleOffset( double axisTitleOffset )
	{
		this.axisTitleOffset = axisTitleOffset;
	}

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public double getBaseCoord()
	{
		return baseCoord;
	}

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public void setBaseCoord( double baseCoord )
	{
		this.baseCoord = baseCoord;
	}

	/**
	 * Specifies base value of the axis.
	 */
	public double getBaseValue()
	{
		return baseValue;
	}

	/**
	 * Specifies base value of the axis.
	 */
	public void setBaseValue( double baseValue )
	{
		this.baseValue = baseValue;
	}

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public String getDuration()
	{
		return duration;
	}

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public void setDuration( String duration )
	{
		this.duration = duration;
	}

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public JavaScriptObject getDurationUnits()
	{
		return durationUnits;
	}

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public void setDurationUnits( JavaScriptObject durationUnits )
	{
		this.durationUnits = durationUnits;
	}

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public String getGridType()
	{
		return gridType;
	}

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public void setGridType( String gridType )
	{
		this.gridType = gridType;
	}

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public boolean isIncludeGuidesInMinMax()
	{
		return includeGuidesInMinMax;
	}

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public void setIncludeGuidesInMinMax( boolean includeGuidesInMinMax )
	{
		this.includeGuidesInMinMax = includeGuidesInMinMax;
	}

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public boolean isIncludeHidden()
	{
		return includeHidden;
	}

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public void setIncludeHidden( boolean includeHidden )
	{
		this.includeHidden = includeHidden;
	}

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public boolean isdoublesOnly()
	{
		return integersOnly;
	}

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public void setdoublesOnly( boolean integersOnly )
	{
		this.integersOnly = integersOnly;
	}

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public IsFunction getLabelFunction()
	{
		return labelFunction;
	}

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public void setLabelFunction( IsFunction labelFunction )
	{
		this.labelFunction = labelFunction;
	}

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public boolean isLogarithmic()
	{
		return logarithmic;
	}

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public void setLogarithmic( boolean logarithmic )
	{
		this.logarithmic = logarithmic;
	}

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public double getMax()
	{
		return max;
	}

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public void setMax( double max )
	{
		this.max = max;
	}

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public double getMaximum()
	{
		return maximum;
	}

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public void setMaximum( double maximum )
	{
		this.maximum = maximum;
	}

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public double getMin()
	{
		return min;
	}

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public void setMin( double min )
	{
		this.min = min;
	}

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public double getMinimum()
	{
		return minimum;
	}

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public void setMinimum( double minimum )
	{
		this.minimum = minimum;
	}

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public double getMinMaxMultiplier()
	{
		return minMaxMultiplier;
	}

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public void setMinMaxMultiplier( double minMaxMultiplier )
	{
		this.minMaxMultiplier = minMaxMultiplier;
	}

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public void setPosition( String position )
	{
		this.position = position;
	}

	/**
	 * Precision (number of decimals) of values.
	 */
	public double getPrecision()
	{
		return precision;
	}

	/**
	 * Precision (number of decimals) of values.
	 */
	public void setPrecision( double precision )
	{
		this.precision = precision;
	}

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public boolean isRadarCategoriesEnabled()
	{
		return radarCategoriesEnabled;
	}

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public void setRadarCategoriesEnabled( boolean radarCategoriesEnabled )
	{
		this.radarCategoriesEnabled = radarCategoriesEnabled;
	}

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public boolean isRecalculateToPercents()
	{
		return recalculateToPercents;
	}

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public void setRecalculateToPercents( boolean recalculateToPercents )
	{
		this.recalculateToPercents = recalculateToPercents;
	}

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public boolean isReversed()
	{
		return reversed;
	}

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public void setReversed( boolean reversed )
	{
		this.reversed = reversed;
	}

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public String getStackType()
	{
		return stackType;
	}

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public void setStackType( String stackType )
	{
		this.stackType = stackType;
	}

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public double getStep()
	{
		return step;
	}

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public void setStep( double step )
	{
		this.step = step;
	}

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public double getSynchronizationMultiplier()
	{
		return synchronizationMultiplier;
	}

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public void setSynchronizationMultiplier( double synchronizationMultiplier )
	{
		this.synchronizationMultiplier = synchronizationMultiplier;
	}

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public IsValueAxis getSynchronizeWith()
	{
		return synchronizeWith;
	}

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public void setSynchronizeWith( IsValueAxis synchronizeWith )
	{
		this.synchronizeWith = synchronizeWith;
	}

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public String getTotalText()
	{
		return totalText;
	}

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public void setTotalText( String totalText )
	{
		this.totalText = totalText;
	}

	/**
	 * Color of total text.
	 */
	public String getTotalTextColor()
	{
		return totalTextColor;
	}

	/**
	 * Color of total text.
	 */
	public void setTotalTextColor( String totalTextColor )
	{
		this.totalTextColor = totalTextColor;
	}

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public double getTreatZeroAs()
	{
		return treatZeroAs;
	}

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public void setTreatZeroAs( double treatZeroAs )
	{
		this.treatZeroAs = treatZeroAs;
	}

	/**
	 * Unit which will be added to the value label.
	 */
	public String getUnit()
	{
		return unit;
	}

	/**
	 * Unit which will be added to the value label.
	 */
	public void setUnit( String unit )
	{
		this.unit = unit;
	}

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public String getUnitPosition()
	{
		return unitPosition;
	}

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public void setUnitPosition( String unitPosition )
	{
		this.unitPosition = unitPosition;
	}

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public boolean isUsePrefixes()
	{
		return usePrefixes;
	}

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public void setUsePrefixes( boolean usePrefixes )
	{
		this.usePrefixes = usePrefixes;
	}

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public boolean isUseScientificNotation()
	{
		return useScientificNotation;
	}

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public void setUseScientificNotation( boolean useScientificNotation )
	{
		this.useScientificNotation = useScientificNotation;
	}
}
