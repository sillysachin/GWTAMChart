package com.amcharts.api;

public interface IsValueAxis extends IsAxisBase
{
	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public double getAxisTitleOffset();

	/**
	 * Radar chart only. Specifies distance from axis to the axis title (category)
	 */
	public void setAxisTitleOffset( double axisTitleOffset );

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public double getBaseCoord();

	/**
	 * Read-only. Coordinate of the base value.
	 */
	public void setBaseCoord( double baseCoord );

	/**
	 * Specifies base value of the axis.
	 */
	public double getBaseValue();

	/**
	 * Specifies base value of the axis.
	 */
	public void setBaseValue( double baseValue );

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public String getDuration();

	/**
	 * "If your values represents time units, and you want value axis labels to be formatted as duration, you have to set the duration unit. Possible values are: 'ss', 'mm', 'hh' and 'DD'."
	 */
	public void setDuration( String duration );

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public IsDurationUnits getDurationUnits();

	/**
	 * "If duration property is set, you can specify what string should be displayed next to day, hour, minute and second."
	 */
	public void setDurationUnits( IsDurationUnits durationUnits );

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public String getGridType();

	/**
	 * Radar chart only. Possible values are: 'polygons' and 'circles'. Set 'circles' for polar charts.
	 */
	public void setGridType( String gridType );

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public String getId();

	/**
	 * "Unique id of value axis. It is not required to set it, unless you need to tell the graph which exact value axis it should use."
	 */
	public void setId( String id );

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public boolean isIncludeGuidesInMinMax();

	/**
	 * Specifies whether guide values should be included when calculating min and max of the axis.
	 */
	public void setIncludeGuidesInMinMax( boolean includeGuidesInMinMax );

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public boolean isIncludeHidden();

	/**
	 * "If true, the axis will include hidden graphs when calculating min and max values."
	 */
	public void setIncludeHidden( boolean includeHidden );

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public boolean isDoublesOnly();

	/**
	 * Specifies whether values on axis can only be integers or both integers and doubles.
	 */
	public void setDoublesOnly( boolean integersOnly );

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public IsFunction getLabelFunction();

	/**
	 * "You can use this function to format Value axis labels. This function is called and these parameters are passed: labelFunction(value, valueText, valueAxis); Where value is numeric value, valueText is formatted string and valueAxis is a reference to valueAxis object. Your function should return string."
	 */
	public void setLabelFunction( IsFunction labelFunction );

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public boolean isLogarithmic();

	/**
	 * Specifies if this value axis' scale should be logarithmic.
	 */
	public void setLogarithmic( boolean logarithmic );

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public double getMax();

	/**
	 * Read-only. Maximum value of the axis.
	 */
	public void setMax( double max );

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public double getMaximum();

	/**
	 * "If you don't want max value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public void setMaximum( double maximum );

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public double getMin();

	/**
	 * Read-only. Minimum value of the axis.
	 */
	public void setMin( double min );

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public double getMinimum();

	/**
	 * "If you don't want min value to be calculated by the chart, set it using this property. This value might still be adjusted so that it would be possible to draw grid at rounded intervals."
	 */
	public void setMinimum( double minimum );

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public double getMinMaxMultiplier();

	/**
	 * "If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values will increase by 20 percent.
	 */
	public void setMinMaxMultiplier( double minMaxMultiplier );

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public String getPosition();

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public void setPosition( String position );

	/**
	 * Precision (number of decimals) of values.
	 */
	public double getPrecision();

	/**
	 * Precision (number of decimals) of values.
	 */
	public void setPrecision( double precision );

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public boolean isRadarCategoriesEnabled();

	/**
	 * Radar chart only. Specifies if categories (axes' titles) should be displayed near axes)
	 */
	public void setRadarCategoriesEnabled( boolean radarCategoriesEnabled );

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public boolean isRecalculateToPercents();

	/**
	 * Specifies if graphs's values should be recalculated to percents.
	 */
	public void setRecalculateToPercents( boolean recalculateToPercents );

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public boolean isReversed();

	/**
	 * Specifies if value axis should be reversed (smaller values on top).
	 */
	public void setReversed( boolean reversed );

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public String getStackType();

	/**
	 * "Stacking mode of the axis. Possible values are: 'none', 'regular', '100 percent', '3d'. Note, only graphs of one type will be stacked."
	 */
	public void setStackType( String stackType );

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public double getStep();

	/**
	 * Read-only. Value difference between two grid lines.
	 */
	public void setStep( double step );

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public double getSynchronizationMultiplier();

	/**
	 * "In case you synchronize one value axis with another, you need to set the synchronization multiplier. Use synchronizeWithAxis method to set with which axis it should be synced."
	 */
	public void setSynchronizationMultiplier( double synchronizationMultiplier );

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public IsValueAxis getSynchronizeWith();

	/**
	 * One value axis can be synchronized with another value axis. You can use both reference to your axis or id of the axis here. You should set synchronizationMultiplyer in order for this to work.
	 */
	public void setSynchronizeWith( IsValueAxis synchronizeWith );

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public String getTotalText();

	/**
	 * "If this value axis is stacked and has columns, setting valueAxis.totalText = '[[total]]' will make it to display total value above the most-top column."
	 */
	public void setTotalText( String totalText );

	/**
	 * Color of total text.
	 */
	public String getTotalTextColor();

	/**
	 * Color of total text.
	 */
	public void setTotalTextColor( String totalTextColor );

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public double getTreatZeroAs();

	/**
	 * This allows you to have logarithmic value axis and have zero values in the data. You must set it to >0 value in order to work.
	 */
	public void setTreatZeroAs( double treatZeroAs );

	/**
	 * Unit which will be added to the value label.
	 */
	public String getUnit();

	/**
	 * Unit which will be added to the value label.
	 */
	public void setUnit( String unit );

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public String getUnitPosition();

	/**
	 * Position of the unit. Possible values are 'left' and 'right'.
	 */
	public void setUnitPosition( String unitPosition );

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public boolean isUsePrefixes();

	/**
	 * "If true, prefixes will be used for big and small numbers. You can set arrays of prefixes directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers."
	 */
	public void setUsePrefixes( boolean usePrefixes );

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public boolean isUseScientificNotation();

	/**
	 * "If true, values will always be formatted using scientific notation (5e+8, 5e-8...) Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in scientific notation."
	 */
	public void setUseScientificNotation( boolean useScientificNotation );
}
