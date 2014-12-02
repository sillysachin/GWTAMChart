package com.amcharts.json;

import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsPattern;
import com.amcharts.api.IsValueAxis;

public final class AmGraph implements IsAmGraph
{
	private String alphaField;

	private String balloonColor;

	private IsFunction balloonFunction;

	private String balloonText;

	private Boolean behindColumns;

	private String bullet;

	private double bulletAlpha;

	private IsValueAxis bulletAxis;

	private double bulletBorderAlpha;

	private String bulletBorderColor;

	private double bulletBorderThickness;

	private String bulletColor;

	private String bulletField;

	private double bulletOffset;

	private double bulletSize;

	private String bulletSizeField;

	private String closeField;

	private Boolean clustered;

	private String color;

	private String colorField;

	private double columnWidth;

	private Boolean connect;

	private double cornerRadiusTop;

	private double cursorBulletAlpha;

	private String customBullet;

	private String customBulletField;

	private String customMarker;

	private double dashLength;

	private String dashLengthField;

	private String descriptionField;

	private String errorField;

	private double fillAlphas;

	private String fillColors;

	private String fillColorsField;

	private IsValueAxis fillToAxis;

	private IsAmGraph fillToGraph;

	private double fixedColumnWidth;

	private double fontSize;

	private String gradientOrientation;

	private Boolean hidden;

	private double hideBulletsCount;

	private String highField;

	private String id;

	private Boolean includeInMinMax;

	private String labelAnchor;

	private String labelColorField;

	private IsFunction labelFunction;

	private double labelOffset;

	private String labelPosition;

	private double labelRotation;

	private String labelText;

	private double legendAlpha;

	private String legendColor;

	private String legendPeriodValueText;

	private String legendValueText;

	private double lineAlpha;

	private String lineColor;

	private String lineColorField;

	private double lineThickness;

	private String lowField;

	private String markerType;

	private double maxBulletSize;

	private double minBulletSize;

	private double minDistance;

	private double negativeBase;

	private double negativeFillAlphas;

	private String negativeFillColors;

	private double negativeLineAlpha;

	private String negativeLineColor;

	private Boolean newStack;

	private Boolean noStepRisers;

	private String openField;

	private IsPattern pattern;

	private String patternField;

	private double periodSpan;

	private String pointPosition;

	private double precision;

	private Boolean proCandlesticks;

	private Boolean showAllValueLabels;

	private Boolean showBalloon;

	private String showBalloonAt;

	private String showBulletsAt;

	private Boolean showHandOnHover;

	private Boolean showOnAxis;

	private Boolean stackable;

	private String stepDirection;

	private Boolean switchable;

	private String title;

	private double topRadius;

	private String type;

	private String urlField;

	private String urlTarget;

	private Boolean useNegativeColorIfDown;

	private IsValueAxis valueAxis;

	private String valueField;

	private Boolean visibleInLegend;

	private IsValueAxis xAxis;

	private String xField;

	private IsValueAxis yAxis;

	private String yField;

	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public String getAlphaField()
	{
		return alphaField;
	}

	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public void setAlphaField( String alphaField )
	{
		this.alphaField = alphaField;
	}

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public String getBalloonColor()
	{
		return balloonColor;
	}

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public void setBalloonColor( String balloonColor )
	{
		this.balloonColor = balloonColor;
	}

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public IsFunction getBalloonFunction()
	{
		return balloonFunction;
	}

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public void setBalloonFunction( IsFunction balloonFunction )
	{
		this.balloonFunction = balloonFunction;
	}

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public String getBalloonText()
	{
		return balloonText;
	}

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public void setBalloonText( String balloonText )
	{
		this.balloonText = balloonText;
	}

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public Boolean isBehindColumns()
	{
		return behindColumns;
	}

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public void setBehindColumns( Boolean behindColumns )
	{
		this.behindColumns = behindColumns;
	}

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public String getBullet()
	{
		return bullet;
	}

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public void setBullet( String bullet )
	{
		this.bullet = bullet;
	}

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public double getBulletAlpha()
	{
		return bulletAlpha;
	}

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public void setBulletAlpha( double bulletAlpha )
	{
		this.bulletAlpha = bulletAlpha;
	}

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public IsValueAxis getBulletAxis()
	{
		return bulletAxis;
	}

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public void setBulletAxis( IsValueAxis bulletAxis )
	{
		this.bulletAxis = bulletAxis;
	}

	/**
	 * Bullet border opacity.
	 */
	public double getBulletBorderAlpha()
	{
		return bulletBorderAlpha;
	}

	/**
	 * Bullet border opacity.
	 */
	public void setBulletBorderAlpha( double bulletBorderAlpha )
	{
		this.bulletBorderAlpha = bulletBorderAlpha;
	}

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public String getBulletBorderColor()
	{
		return bulletBorderColor;
	}

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public void setBulletBorderColor( String bulletBorderColor )
	{
		this.bulletBorderColor = bulletBorderColor;
	}

	/**
	 * Bullet border thickness.
	 */
	public double getBulletBorderThickness()
	{
		return bulletBorderThickness;
	}

	/**
	 * Bullet border thickness.
	 */
	public void setBulletBorderThickness( double bulletBorderThickness )
	{
		this.bulletBorderThickness = bulletBorderThickness;
	}

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public String getBulletColor()
	{
		return bulletColor;
	}

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public void setBulletColor( String bulletColor )
	{
		this.bulletColor = bulletColor;
	}

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public String getBulletField()
	{
		return bulletField;
	}

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public void setBulletField( String bulletField )
	{
		this.bulletField = bulletField;
	}

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public double getBulletOffset()
	{
		return bulletOffset;
	}

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public void setBulletOffset( double bulletOffset )
	{
		this.bulletOffset = bulletOffset;
	}

	/**
	 * Bullet size.
	 */
	public double getBulletSize()
	{
		return bulletSize;
	}

	/**
	 * Bullet size.
	 */
	public void setBulletSize( double bulletSize )
	{
		this.bulletSize = bulletSize;
	}

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public String getBulletSizeField()
	{
		return bulletSizeField;
	}

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public void setBulletSizeField( String bulletSizeField )
	{
		this.bulletSizeField = bulletSizeField;
	}

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getCloseField()
	{
		return closeField;
	}

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setCloseField( String closeField )
	{
		this.closeField = closeField;
	}

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public Boolean isClustered()
	{
		return clustered;
	}

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public void setClustered( Boolean clustered )
	{
		this.clustered = clustered;
	}

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Name of the color field in your dataProvider.
	 */
	public String getColorField()
	{
		return colorField;
	}

	/**
	 * Name of the color field in your dataProvider.
	 */
	public void setColorField( String colorField )
	{
		this.colorField = colorField;
	}

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public double getColumnWidth()
	{
		return columnWidth;
	}

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public void setColumnWidth( double columnWidth )
	{
		this.columnWidth = columnWidth;
	}

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public Boolean isConnect()
	{
		return connect;
	}

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public void setConnect( Boolean connect )
	{
		this.connect = connect;
	}

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. The chart's depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop will be applied for all corners of the column, JavaScript charts do not have a possibility to set separate corner radius for top and bottom. As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public double getCornerRadiusTop()
	{
		return cornerRadiusTop;
	}

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. The chart's depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop will be applied for all corners of the column, JavaScript charts do not have a possibility to set separate corner radius for top and bottom. As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public void setCornerRadiusTop( double cornerRadiusTop )
	{
		this.cornerRadiusTop = cornerRadiusTop;
	}

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public double getCursorBulletAlpha()
	{
		return cursorBulletAlpha;
	}

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public void setCursorBulletAlpha( double cursorBulletAlpha )
	{
		this.cursorBulletAlpha = cursorBulletAlpha;
	}

	/**
	 * Path to the image of custom bullet.
	 */
	public String getCustomBullet()
	{
		return customBullet;
	}

	/**
	 * Path to the image of custom bullet.
	 */
	public void setCustomBullet( String customBullet )
	{
		this.customBullet = customBullet;
	}

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public String getCustomBulletField()
	{
		return customBulletField;
	}

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public void setCustomBulletField( String customBulletField )
	{
		this.customBulletField = customBulletField;
	}

	/**
	 * Path to the image for legend marker.
	 */
	public String getCustomMarker()
	{
		return customMarker;
	}

	/**
	 * Path to the image for legend marker.
	 */
	public void setCustomMarker( String customMarker )
	{
		this.customMarker = customMarker;
	}

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public double getDashLength()
	{
		return dashLength;
	}

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public void setDashLength( double dashLength )
	{
		this.dashLength = dashLength;
	}

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public String getDashLengthField()
	{
		return dashLengthField;
	}

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public void setDashLengthField( String dashLengthField )
	{
		this.dashLengthField = dashLengthField;
	}

	/**
	 * Name of the description field in your dataProvider.
	 */
	public String getDescriptionField()
	{
		return descriptionField;
	}

	/**
	 * Name of the description field in your dataProvider.
	 */
	public void setDescriptionField( String descriptionField )
	{
		this.descriptionField = descriptionField;
	}

	/**
	 * Name of error value field in your data provider.
	 */
	public String getErrorField()
	{
		return errorField;
	}

	/**
	 * Name of error value field in your data provider.
	 */
	public void setErrorField( String errorField )
	{
		this.errorField = errorField;
	}

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public double getFillAlphas()
	{
		return fillAlphas;
	}

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public void setFillAlphas( double fillAlphas )
	{
		this.fillAlphas = fillAlphas;
	}

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public String getFillColors()
	{
		return fillColors;
	}

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public void setFillColors( String fillColors )
	{
		this.fillColors = fillColors;
	}

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public String getFillColorsField()
	{
		return fillColorsField;
	}

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public void setFillColorsField( String fillColorsField )
	{
		this.fillColorsField = fillColorsField;
	}

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public IsValueAxis getFillToAxis()
	{
		return fillToAxis;
	}

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public void setFillToAxis( IsValueAxis fillToAxis )
	{
		this.fillToAxis = fillToAxis;
	}

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public IsAmGraph getFillToGraph()
	{
		return fillToGraph;
	}

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public void setFillToGraph( IsAmGraph fillToGraph )
	{
		this.fillToGraph = fillToGraph;
	}

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public double getFixedColumnWidth()
	{
		return fixedColumnWidth;
	}

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public void setFixedColumnWidth( double fixedColumnWidth )
	{
		this.fixedColumnWidth = fixedColumnWidth;
	}

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public double getFontSize()
	{
		return fontSize;
	}

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public String getGradientOrientation()
	{
		return gradientOrientation;
	}

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public void setGradientOrientation( String gradientOrientation )
	{
		this.gradientOrientation = gradientOrientation;
	}

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public Boolean isHidden()
	{
		return hidden;
	}

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public void setHidden( Boolean hidden )
	{
		this.hidden = hidden;
	}

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public double getHideBulletsCount()
	{
		return hideBulletsCount;
	}

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public void setHideBulletsCount( double hideBulletsCount )
	{
		this.hideBulletsCount = hideBulletsCount;
	}

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getHighField()
	{
		return highField;
	}

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setHighField( String highField )
	{
		this.highField = highField;
	}

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public Boolean isIncludeInMinMax()
	{
		return includeInMinMax;
	}

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public void setIncludeInMinMax( Boolean includeInMinMax )
	{
		this.includeInMinMax = includeInMinMax;
	}

	/**
	 * Data label text anchor.
	 */
	public String getLabelAnchor()
	{
		return labelAnchor;
	}

	/**
	 * Data label text anchor.
	 */
	public void setLabelAnchor( String labelAnchor )
	{
		this.labelAnchor = labelAnchor;
	}

	/**
	 * Name of label color field in data provider.
	 */
	public String getLabelColorField()
	{
		return labelColorField;
	}

	/**
	 * Name of label color field in data provider.
	 */
	public void setLabelColorField( String labelColorField )
	{
		this.labelColorField = labelColorField;
	}

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public IsFunction getLabelFunction()
	{
		return labelFunction;
	}

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public void setLabelFunction( IsFunction labelFunction )
	{
		this.labelFunction = labelFunction;
	}

	/**
	 * Offset of data label.
	 */
	public double getLabelOffset()
	{
		return labelOffset;
	}

	/**
	 * Offset of data label.
	 */
	public void setLabelOffset( double labelOffset )
	{
		this.labelOffset = labelOffset;
	}

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public String getLabelPosition()
	{
		return labelPosition;
	}

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public void setLabelPosition( String labelPosition )
	{
		this.labelPosition = labelPosition;
	}

	/**
	 * Rotation of a data label.
	 */
	public double getLabelRotation()
	{
		return labelRotation;
	}

	/**
	 * Rotation of a data label.
	 */
	public void setLabelRotation( double labelRotation )
	{
		this.labelRotation = labelRotation;
	}

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public String getLabelText()
	{
		return labelText;
	}

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public void setLabelText( String labelText )
	{
		this.labelText = labelText;
	}

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public double getLegendAlpha()
	{
		return legendAlpha;
	}

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public void setLegendAlpha( double legendAlpha )
	{
		this.legendAlpha = legendAlpha;
	}

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public String getLegendColor()
	{
		return legendColor;
	}

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public void setLegendColor( String legendColor )
	{
		this.legendColor = legendColor;
	}

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public String getLegendPeriodValueText()
	{
		return legendPeriodValueText;
	}

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public void setLegendPeriodValueText( String legendPeriodValueText )
	{
		this.legendPeriodValueText = legendPeriodValueText;
	}

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public String getLegendValueText()
	{
		return legendValueText;
	}

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public void setLegendValueText( String legendValueText )
	{
		this.legendValueText = legendValueText;
	}

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public double getLineAlpha()
	{
		return lineAlpha;
	}

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public void setLineAlpha( double lineAlpha )
	{
		this.lineAlpha = lineAlpha;
	}

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public String getLineColor()
	{
		return lineColor;
	}

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public void setLineColor( String lineColor )
	{
		this.lineColor = lineColor;
	}

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public String getLineColorField()
	{
		return lineColorField;
	}

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public void setLineColorField( String lineColorField )
	{
		this.lineColorField = lineColorField;
	}

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public double getLineThickness()
	{
		return lineThickness;
	}

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public void setLineThickness( double lineThickness )
	{
		this.lineThickness = lineThickness;
	}

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public String getLowField()
	{
		return lowField;
	}

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public void setLowField( String lowField )
	{
		this.lowField = lowField;
	}

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public String getMarkerType()
	{
		return markerType;
	}

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public void setMarkerType( String markerType )
	{
		this.markerType = markerType;
	}

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public double getMaxBulletSize()
	{
		return maxBulletSize;
	}

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public void setMaxBulletSize( double maxBulletSize )
	{
		this.maxBulletSize = maxBulletSize;
	}

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public double getMinBulletSize()
	{
		return minBulletSize;
	}

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public void setMinBulletSize( double minBulletSize )
	{
		this.minBulletSize = minBulletSize;
	}

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public double getMinDistance()
	{
		return minDistance;
	}

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public void setMinDistance( double minDistance )
	{
		this.minDistance = minDistance;
	}

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public double getNegativeBase()
	{
		return negativeBase;
	}

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public void setNegativeBase( double negativeBase )
	{
		this.negativeBase = negativeBase;
	}

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public double getNegativeFillAlphas()
	{
		return negativeFillAlphas;
	}

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public void setNegativeFillAlphas( double negativeFillAlphas )
	{
		this.negativeFillAlphas = negativeFillAlphas;
	}

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public String getNegativeFillColors()
	{
		return negativeFillColors;
	}

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public void setNegativeFillColors( String negativeFillColors )
	{
		this.negativeFillColors = negativeFillColors;
	}

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public double getNegativeLineAlpha()
	{
		return negativeLineAlpha;
	}

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public void setNegativeLineAlpha( double negativeLineAlpha )
	{
		this.negativeLineAlpha = negativeLineAlpha;
	}

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public String getNegativeLineColor()
	{
		return negativeLineColor;
	}

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public void setNegativeLineColor( String negativeLineColor )
	{
		this.negativeLineColor = negativeLineColor;
	}

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public Boolean isNewStack()
	{
		return newStack;
	}

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public void setNewStack( Boolean newStack )
	{
		this.newStack = newStack;
	}

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public Boolean isNoStepRisers()
	{
		return noStepRisers;
	}

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public void setNoStepRisers( Boolean noStepRisers )
	{
		this.noStepRisers = noStepRisers;
	}

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public String getOpenField()
	{
		return openField;
	}

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public void setOpenField( String openField )
	{
		this.openField = openField;
	}

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public IsPattern getPattern()
	{
		return pattern;
	}

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public void setPattern( IsPattern pattern )
	{
		this.pattern = pattern;
	}

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public String getPatternField()
	{
		return patternField;
	}

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public void setPatternField( String patternField )
	{
		this.patternField = patternField;
	}

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public double getPeriodSpan()
	{
		return periodSpan;
	}

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public void setPeriodSpan( double periodSpan )
	{
		this.periodSpan = periodSpan;
	}

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public String getPointPosition()
	{
		return pointPosition;
	}

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public void setPointPosition( String pointPosition )
	{
		this.pointPosition = pointPosition;
	}

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public double getPrecision()
	{
		return precision;
	}

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public void setPrecision( double precision )
	{
		this.precision = precision;
	}

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public Boolean isProCandlesticks()
	{
		return proCandlesticks;
	}

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public void setProCandlesticks( Boolean proCandlesticks )
	{
		this.proCandlesticks = proCandlesticks;
	}

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public Boolean isShowAllValueLabels()
	{
		return showAllValueLabels;
	}

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public void setShowAllValueLabels( Boolean showAllValueLabels )
	{
		this.showAllValueLabels = showAllValueLabels;
	}

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public Boolean isShowBalloon()
	{
		return showBalloon;
	}

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public void setShowBalloon( Boolean showBalloon )
	{
		this.showBalloon = showBalloon;
	}

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public String getShowBalloonAt()
	{
		return showBalloonAt;
	}

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public void setShowBalloonAt( String showBalloonAt )
	{
		this.showBalloonAt = showBalloonAt;
	}

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public String getShowBulletsAt()
	{
		return showBulletsAt;
	}

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public void setShowBulletsAt( String showBulletsAt )
	{
		this.showBulletsAt = showBulletsAt;
	}

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public Boolean isShowHandOnHover()
	{
		return showHandOnHover;
	}

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public void setShowHandOnHover( Boolean showHandOnHover )
	{
		this.showHandOnHover = showHandOnHover;
	}

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public Boolean isShowOnAxis()
	{
		return showOnAxis;
	}

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public void setShowOnAxis( Boolean showOnAxis )
	{
		this.showOnAxis = showOnAxis;
	}

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100 You can exclude this graph from stacking."
	 */
	public Boolean isStackable()
	{
		return stackable;
	}

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100 You can exclude this graph from stacking."
	 */
	public void setStackable( Boolean stackable )
	{
		this.stackable = stackable;
	}

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public String getStepDirection()
	{
		return stepDirection;
	}

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public void setStepDirection( String stepDirection )
	{
		this.stepDirection = stepDirection;
	}

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public Boolean isSwitchable()
	{
		return switchable;
	}

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public void setSwitchable( Boolean switchable )
	{
		this.switchable = switchable;
	}

	/**
	 * Graph title.
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Graph title.
	 */
	public void setTitle( String title )
	{
		this.title = title;
	}

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public double getTopRadius()
	{
		return topRadius;
	}

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public void setTopRadius( double topRadius )
	{
		this.topRadius = topRadius;
	}

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public void setType( String type )
	{
		this.type = type;
	}

	/**
	 * Name of the url field in your dataProvider.
	 */
	public String getUrlField()
	{
		return urlField;
	}

	/**
	 * Name of the url field in your dataProvider.
	 */
	public void setUrlField( String urlField )
	{
		this.urlField = urlField;
	}

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public String getUrlTarget()
	{
		return urlTarget;
	}

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public void setUrlTarget( String urlTarget )
	{
		this.urlTarget = urlTarget;
	}

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public Boolean isUseNegativeColorIfDown()
	{
		return useNegativeColorIfDown;
	}

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public void setUseNegativeColorIfDown( Boolean useNegativeColorIfDown )
	{
		this.useNegativeColorIfDown = useNegativeColorIfDown;
	}

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public IsValueAxis getValueAxis()
	{
		return valueAxis;
	}

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public void setValueAxis( IsValueAxis valueAxis )
	{
		this.valueAxis = valueAxis;
	}

	/**
	 * Name of the value field in your dataProvider.
	 */
	public String getValueField()
	{
		return valueField;
	}

	/**
	 * Name of the value field in your dataProvider.
	 */
	public void setValueField( String valueField )
	{
		this.valueField = valueField;
	}

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public Boolean isVisibleInLegend()
	{
		return visibleInLegend;
	}

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public void setVisibleInLegend( Boolean visibleInLegend )
	{
		this.visibleInLegend = visibleInLegend;
	}

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public IsValueAxis getXAxis()
	{
		return xAxis;
	}

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public void setXAxis( IsValueAxis xAxis )
	{
		this.xAxis = xAxis;
	}

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public String getXField()
	{
		return xField;
	}

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public void setXField( String xField )
	{
		this.xField = xField;
	}

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public IsValueAxis getYAxis()
	{
		return yAxis;
	}

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public void setYAxis( IsValueAxis yAxis )
	{
		this.yAxis = yAxis;
	}

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public String getYField()
	{
		return yField;
	}

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public void setYField( String yField )
	{
		this.yField = yField;
	}
}