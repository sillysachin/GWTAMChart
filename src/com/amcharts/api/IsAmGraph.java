package com.amcharts.api;

public interface IsAmGraph
{
	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public String getAlphaField();

	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public void setAlphaField( String alphaField );

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public String getBalloonColor();

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public void setBalloonColor( String balloonColor );

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public IsFunction getBalloonFunction();

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public void setBalloonFunction( IsFunction balloonFunction );

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public String getBalloonText();

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public void setBalloonText( String balloonText );

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public Boolean isBehindColumns();

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public void setBehindColumns( Boolean behindColumns );

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public String getBullet();

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public void setBullet( String bullet );

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public double getBulletAlpha();

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public void setBulletAlpha( double bulletAlpha );

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public IsValueAxis getBulletAxis();

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public void setBulletAxis( IsValueAxis bulletAxis );

	/**
	 * Bullet border opacity.
	 */
	public double getBulletBorderAlpha();

	/**
	 * Bullet border opacity.
	 */
	public void setBulletBorderAlpha( double bulletBorderAlpha );

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public String getBulletBorderColor();

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public void setBulletBorderColor( String bulletBorderColor );

	/**
	 * Bullet border thickness.
	 */
	public double getBulletBorderThickness();

	/**
	 * Bullet border thickness.
	 */
	public void setBulletBorderThickness( double bulletBorderThickness );

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public String getBulletColor();

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public void setBulletColor( String bulletColor );

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public String getBulletField();

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public void setBulletField( String bulletField );

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public double getBulletOffset();

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public void setBulletOffset( double bulletOffset );

	/**
	 * Bullet size.
	 */
	public double getBulletSize();

	/**
	 * Bullet size.
	 */
	public void setBulletSize( double bulletSize );

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public String getBulletSizeField();

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public void setBulletSizeField( String bulletSizeField );

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getCloseField();

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setCloseField( String closeField );

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public Boolean isClustered();

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public void setClustered( Boolean clustered );

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public String getColor();

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public void setColor( String color );

	/**
	 * Name of the color field in your dataProvider.
	 */
	public String getColorField();

	/**
	 * Name of the color field in your dataProvider.
	 */
	public void setColorField( String colorField );

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public double getColumnWidth();

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public void setColumnWidth( double columnWidth );

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public Boolean isConnect();

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public void setConnect( Boolean connect );

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. 
	 * The chart's depth and angle styles must be set to 0. The default value is 0. 
	 * Note, cornerRadiusTop will be applied for all corners of the column, 
	 * JavaScript charts do not have a possibility to set separate corner radius for top and bottom. 
	 * As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public double getCornerRadiusTop();

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. 
	 * The chart's depth and angle styles must be set to 0. The default value is 0. 
	 * Note, cornerRadiusTop will be applied for all corners of the column, 
	 * JavaScript charts do not have a possibility to set separate corner radius for top and bottom. 
	 * As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public void setCornerRadiusTop( double cornerRadiusTop );

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public double getCursorBulletAlpha();

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public void setCursorBulletAlpha( double cursorBulletAlpha );

	/**
	 * Path to the image of custom bullet.
	 */
	public String getCustomBullet();

	/**
	 * Path to the image of custom bullet.
	 */
	public void setCustomBullet( String customBullet );

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public String getCustomBulletField();

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public void setCustomBulletField( String customBulletField );

	/**
	 * Path to the image for legend marker.
	 */
	public String getCustomMarker();

	/**
	 * Path to the image for legend marker.
	 */
	public void setCustomMarker( String customMarker );

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public double getDashLength();

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public void setDashLength( double dashLength );

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public String getDashLengthField();

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public void setDashLengthField( String dashLengthField );

	/**
	 * Name of the description field in your dataProvider.
	 */
	public String getDescriptionField();

	/**
	 * Name of the description field in your dataProvider.
	 */
	public void setDescriptionField( String descriptionField );

	/**
	 * Name of error value field in your data provider.
	 */
	public String getErrorField();

	/**
	 * Name of error value field in your data provider.
	 */
	public void setErrorField( String errorField );

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public double getFillAlphas();

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public void setFillAlphas( double fillAlphas );

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public String getFillColors();

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public void setFillColors( String fillColors );

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public String getFillColorsField();

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public void setFillColorsField( String fillColorsField );

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public IsValueAxis getFillToAxis();

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public void setFillToAxis( IsValueAxis fillToAxis );

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public IsAmGraph getFillToGraph();

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public void setFillToGraph( IsAmGraph fillToGraph );

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public double getFixedColumnWidth();

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public void setFixedColumnWidth( double fixedColumnWidth );

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public double getFontSize();

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public void setFontSize( double fontSize );

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public String getGradientOrientation();

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public void setGradientOrientation( String gradientOrientation );

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public Boolean isHidden();

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public void setHidden( Boolean hidden );

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public double getHideBulletsCount();

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public void setHideBulletsCount( double hideBulletsCount );

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getHighField();

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setHighField( String highField );

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public String getId();

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public void setId( String id );

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public Boolean isIncludeInMinMax();

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public void setIncludeInMinMax( Boolean includeInMinMax );

	/**
	 * Data label text anchor.
	 */
	public String getLabelAnchor();

	/**
	 * Data label text anchor.
	 */
	public void setLabelAnchor( String labelAnchor );

	/**
	 * Name of label color field in data provider.
	 */
	public String getLabelColorField();

	/**
	 * Name of label color field in data provider.
	 */
	public void setLabelColorField( String labelColorField );

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public IsFunction getLabelFunction();

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public void setLabelFunction( IsFunction labelFunction );

	/**
	 * Offset of data label.
	 */
	public double getLabelOffset();

	/**
	 * Offset of data label.
	 */
	public void setLabelOffset( double labelOffset );

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public String getLabelPosition();

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public void setLabelPosition( String labelPosition );

	/**
	 * Rotation of a data label.
	 */
	public double getLabelRotation();

	/**
	 * Rotation of a data label.
	 */
	public void setLabelRotation( double labelRotation );

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public String getLabelText();

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public void setLabelText( String labelText );

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public double getLegendAlpha();

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public void setLegendAlpha( double legendAlpha );

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public String getLegendColor();

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public void setLegendColor( String legendColor );

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public String getLegendPeriodValueText();

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public void setLegendPeriodValueText( String legendPeriodValueText );

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public String getLegendValueText();

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public void setLegendValueText( String legendValueText );

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public double getLineAlpha();

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public void setLineAlpha( double lineAlpha );

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public String getLineColor();

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public void setLineColor( String lineColor );

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public String getLineColorField();

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public void setLineColorField( String lineColorField );

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public double getLineThickness();

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public void setLineThickness( double lineThickness );

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getLowField();

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setLowField( String lowField );

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public String getMarkerType();

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public void setMarkerType( String markerType );

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public double getMaxBulletSize();

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public void setMaxBulletSize( double maxBulletSize );

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public double getMinBulletSize();

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public void setMinBulletSize( double minBulletSize );

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public double getMinDistance();

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public void setMinDistance( double minDistance );

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public double getNegativeBase();

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public void setNegativeBase( double negativeBase );

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public double getNegativeFillAlphas();

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public void setNegativeFillAlphas( double negativeFillAlphas );

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public String getNegativeFillColors();

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public void setNegativeFillColors( String negativeFillColors );

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public double getNegativeLineAlpha();

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public void setNegativeLineAlpha( double negativeLineAlpha );

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public String getNegativeLineColor();

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public void setNegativeLineColor( String negativeLineColor );

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public Boolean isNewStack();

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public void setNewStack( Boolean newStack );

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public Boolean isNoStepRisers();

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public void setNoStepRisers( Boolean noStepRisers );

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public String getOpenField();

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public void setOpenField( String openField );

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public IsPattern getPattern();

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public void setPattern( IsPattern pattern );

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public String getPatternField();

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public void setPatternField( String patternField );

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public double getPeriodSpan();

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public void setPeriodSpan( double periodSpan );

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public String getPointPosition();

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public void setPointPosition( String pointPosition );

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public double getPrecision();

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public void setPrecision( double precision );

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public Boolean isProCandlesticks();

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public void setProCandlesticks( Boolean proCandlesticks );

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public Boolean isShowAllValueLabels();

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public void setShowAllValueLabels( Boolean showAllValueLabels );

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public Boolean isShowBalloon();

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public void setShowBalloon( Boolean showBalloon );

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public String getShowBalloonAt();

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public void setShowBalloonAt( String showBalloonAt );

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public String getShowBulletsAt();

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public void setShowBulletsAt( String showBulletsAt );

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public Boolean isShowHandOnHover();

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public void setShowHandOnHover( Boolean showHandOnHover );

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public Boolean isShowOnAxis();

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public void setShowOnAxis( Boolean showOnAxis );

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100% You can exclude this graph from stacking."
	 */
	public Boolean isStackable();

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100% You can exclude this graph from stacking."
	 */
	public void setStackable( Boolean stackable );

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public String getStepDirection();

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public void setStepDirection( String stepDirection );

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public Boolean isSwitchable();

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public void setSwitchable( Boolean switchable );

	/**
	 * Graph title.
	 */
	public String getTitle();

	/**
	 * Graph title.
	 */
	public void setTitle( String title );

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public double getTopRadius();

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public void setTopRadius( double topRadius );

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public String getType();

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public void setType( String type );

	/**
	 * Name of the url field in your dataProvider.
	 */
	public String getUrlField();

	/**
	 * Name of the url field in your dataProvider.
	 */
	public void setUrlField( String urlField );

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public String getUrlTarget();

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public void setUrlTarget( String urlTarget );

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public Boolean isUseNegativeColorIfDown();

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public void setUseNegativeColorIfDown( Boolean useNegativeColorIfDown );

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public IsValueAxis getValueAxis();

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public void setValueAxis( IsValueAxis valueAxis );

	/**
	 * Name of the value field in your dataProvider.
	 */
	public String getValueField();

	/**
	 * Name of the value field in your dataProvider.
	 */
	public void setValueField( String valueField );

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public Boolean isVisibleInLegend();

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public void setVisibleInLegend( Boolean visibleInLegend );

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public IsValueAxis getXAxis();

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public void setXAxis( IsValueAxis xAxis );

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public String getXField();

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public void setXField( String xField );

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public IsValueAxis getYAxis();

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public void setYAxis( IsValueAxis yAxis );

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public String getYField();

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public void setYField( String yField );
}
