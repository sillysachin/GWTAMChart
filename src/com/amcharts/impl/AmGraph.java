package com.amcharts.impl;

import com.amcharts.api.IsAmGraph;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;
import com.amcharts.jso.AmGraphJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class AmGraph implements IsAmGraph, IJavaScriptWrapper<AmGraphJSO>
{
	private AmGraphJSO jso;

	protected AmGraph()
	{
		jso = createJso();
	}

	public AmGraphJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmGraphJSO jso )
	{
		this.jso = jso;
	}

	public native AmGraphJSO createJso()
	/*-{
		var graph = new $wnd.AmCharts.AmGraph();
		return graph;
	}-*/;

	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public final native String getAlphaField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.alphaField;
	}-*/;

	/**
	 * Name of the alpha field in your dataProvider.
	 */
	public final native void setAlphaField( String alphaField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.alphaField = alphaField;
	}-*/;

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public final native String getBalloonColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.balloonColor;
	}-*/;

	/**
	 * Value balloon color. Will use graph or data item color if not set.
	 */
	public final native void setBalloonColor( String balloonColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.balloonColor = balloonColor;
	}-*/;

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public final native IsFunction getBalloonFunction() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.balloonFunction;
	}-*/;

	/**
	 * "If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function should return a string which will be displayed in a balloon."
	 */
	public final native void setBalloonFunction( IsFunction balloonFunction ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.balloonFunction = balloonFunction;
	}-*/;

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public final native String getBalloonText() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.balloonText;
	}-*/;

	/**
	 * "Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] or any other field name from your data provider. HTML tags can also be used."
	 */
	public final native void setBalloonText( String balloonText ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.balloonText = balloonText;
	}-*/;

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public final native boolean isBehindColumns() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.behindColumns;
	}-*/;

	/**
	 * Specifies if the line graph should be placed behind column graphs
	 */
	public final native void setBehindColumns( boolean behindColumns ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.behindColumns = behindColumns;
	}-*/;

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public final native String getBullet() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bullet;
	}-*/;

	/**
	 * "Type of the bullets. Possible values are: 'none', 'round', 'square', 'triangleUp', 'triangleDown', 'triangleLeft', 'triangleRight', 'bubble', 'diamond', 'xError', 'yError' and 'custom'."
	 */
	public final native void setBullet( String bullet ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bullet = bullet;
	}-*/;

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public final native double getBulletAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletAlpha;
	}-*/;

	/**
	 * Opacity of bullets. Value range is 0 - 1.
	 */
	public final native void setBulletAlpha( double bulletAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletAlpha = bulletAlpha;
	}-*/;

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public final native IsValueAxis getBulletAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletAxis;
	}-*/;

	/**
	 * "bulletAxis value is used when you are building error chart. Error chart is a regular serial or XY chart with bullet type set to 'xError' or 'yError'. The graph should know which axis should be used to determine the size of this bullet - that's when bulletAxis should be set. Besides that, you should also set graph.errorField. You can also use other bullet types with this feature too. For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart."
	 */
	public final native void setBulletAxis( IsValueAxis bulletAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletAxis = bulletAxis;
	}-*/;

	/**
	 * Bullet border opacity.
	 */
	public final native double getBulletBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletBorderAlpha;
	}-*/;

	/**
	 * Bullet border opacity.
	 */
	public final native void setBulletBorderAlpha( double bulletBorderAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletBorderAlpha = bulletBorderAlpha;
	}-*/;

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public final native String getBulletBorderColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletBorderColor;
	}-*/;

	/**
	 * Bullet border color. Will use lineColor if not set.
	 */
	public final native void setBulletBorderColor( String bulletBorderColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletBorderColor = bulletBorderColor;
	}-*/;

	/**
	 * Bullet border thickness.
	 */
	public final native double getBulletBorderThickness() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletBorderThickness;
	}-*/;

	/**
	 * Bullet border thickness.
	 */
	public final native void setBulletBorderThickness( double bulletBorderThickness ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletBorderThickness = bulletBorderThickness;
	}-*/;

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public final native String getBulletColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletColor;
	}-*/;

	/**
	 * Bullet color. Will use lineColor if not set.
	 */
	public final native void setBulletColor( String bulletColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletColor = bulletColor;
	}-*/;

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public final native String getBulletField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletField;
	}-*/;

	/**
	 * Name of the bullet field in your dataProvider.
	 */
	public final native void setBulletField( String bulletField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletField = bulletField;
	}-*/;

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public final native double getBulletOffset() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletOffset;
	}-*/;

	/**
	 * Bullet offset. Distance from the actual data point to the bullet. Can be used to place custom bullets above the columns.
	 */
	public final native void setBulletOffset( double bulletOffset ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletOffset = bulletOffset;
	}-*/;

	/**
	 * Bullet size.
	 */
	public final native double getBulletSize() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletSize;
	}-*/;

	/**
	 * Bullet size.
	 */
	public final native void setBulletSize( double bulletSize ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletSize = bulletSize;
	}-*/;

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public final native String getBulletSizeField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.bulletSizeField;
	}-*/;

	/**
	 * Name of the bullet size field in your dataProvider.
	 */
	public final native void setBulletSizeField( String bulletSizeField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.bulletSizeField = bulletSizeField;
	}-*/;

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native String getCloseField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.closeField;
	}-*/;

	/**
	 * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native void setCloseField( String closeField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.closeField = closeField;
	}-*/;

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public final native boolean isClustered() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.clustered;
	}-*/;

	/**
	 * "In case you want to place this graph's columns in front of other columns, set this to false. In case 'true', the columns will be clustered next to each other."
	 */
	public final native void setClustered( boolean clustered ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.clustered = clustered;
	}-*/;

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.color;
	}-*/;

	/**
	 * Color of value labels. Will use chart's color if not set.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.color = color;
	}-*/;

	/**
	 * Name of the color field in your dataProvider.
	 */
	public final native String getColorField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.colorField;
	}-*/;

	/**
	 * Name of the color field in your dataProvider.
	 */
	public final native void setColorField( String colorField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.colorField = colorField;
	}-*/;

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public final native double getColumnWidth() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.columnWidth;
	}-*/;

	/**
	 * "You can specify custom column width for each graph individually. Value range is 0 - 1 (we set relative width, not pixel width here)."
	 */
	public final native void setColumnWidth( double columnWidth ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.columnWidth = columnWidth;
	}-*/;

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public final native boolean isConnect() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.connect;
	}-*/;

	/**
	 * Specifies whether to connect data points if data is missing. The default value is true.
	 */
	public final native void setConnect( boolean connect ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.connect = connect;
	}-*/;

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. The chart's depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop will be applied for all corners of the column, JavaScript charts do not have a possibility to set separate corner radius for top and bottom. As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public final native double getCornerRadiusTop() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.cornerRadiusTop;
	}-*/;

	/**
	 * "Corner radius of column. It can be set both in pixels or in percents. The chart's depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop will be applied for all corners of the column, JavaScript charts do not have a possibility to set separate corner radius for top and bottom. As we want all the property names to be the same both on JS and Flex, we didn't change this too."
	 */
	public final native void setCornerRadiusTop( double cornerRadiusTop ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.cornerRadiusTop = cornerRadiusTop;
	}-*/;

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public final native double getCursorBulletAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.cursorBulletAlpha;
	}-*/;

	/**
	 * "If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor. You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph, set opacity to 0."
	 */
	public final native void setCursorBulletAlpha( double cursorBulletAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.cursorBulletAlpha = cursorBulletAlpha;
	}-*/;

	/**
	 * Path to the image of custom bullet.
	 */
	public final native String getCustomBullet() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.customBullet;
	}-*/;

	/**
	 * Path to the image of custom bullet.
	 */
	public final native void setCustomBullet( String customBullet ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.customBullet = customBullet;
	}-*/;

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public final native String getCustomBulletField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.customBulletField;
	}-*/;

	/**
	 * Name of the custom bullet field in your dataProvider.
	 */
	public final native void setCustomBulletField( String customBulletField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.customBulletField = customBulletField;
	}-*/;

	/**
	 * Path to the image for legend marker.
	 */
	public final native String getCustomMarker() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.customMarker;
	}-*/;

	/**
	 * Path to the image for legend marker.
	 */
	public final native void setCustomMarker( String customMarker ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.customMarker = customMarker;
	}-*/;

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public final native double getDashLength() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.dashLength;
	}-*/;

	/**
	 * "Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed."
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.dashLength = dashLength;
	}-*/;

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public final native String getDashLengthField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.dashLengthField;
	}-*/;

	/**
	 * Name of the dash length field in your dataProvider. This property adds a possibility to change graphs line from solid to dashed on any data point. You can also make columns border dashed using this setting.
	 */
	public final native void setDashLengthField( String dashLengthField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.dashLengthField = dashLengthField;
	}-*/;

	/**
	 * Name of the description field in your dataProvider.
	 */
	public final native String getDescriptionField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.descriptionField;
	}-*/;

	/**
	 * Name of the description field in your dataProvider.
	 */
	public final native void setDescriptionField( String descriptionField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.descriptionField = descriptionField;
	}-*/;

	/**
	 * Name of error value field in your data provider.
	 */
	public final native String getErrorField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.errorField;
	}-*/;

	/**
	 * Name of error value field in your data provider.
	 */
	public final native void setErrorField( String errorField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.errorField = errorField;
	}-*/;

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final native double getFillAlphas() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fillAlphas;
	}-*/;

	/**
	 * "Opacity of fill. Plural form is used to keep the same property names as our Flex charts'. Flex charts can accept array of numbers to generate gradients. Although you can set array here, only first value of this array will be used."
	 */
	public final native void setFillAlphas( double fillAlphas ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fillAlphas = fillAlphas;
	}-*/;

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public final native String getFillColors() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fillColors;
	}-*/;

	/**
	 * Fill color. Will use lineColor if not set. You can also set array of colors here.
	 */
	public final native void setFillColors( String fillColors ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fillColors = fillColors;
	}-*/;

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public final native String getFillColorsField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fillColorsField;
	}-*/;

	/**
	 * Name of the fill colors field in your dataProvider. This property adds a possibility to change line graphs fill color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public final native void setFillColorsField( String fillColorsField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fillColorsField = fillColorsField;
	}-*/;

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public final native IsValueAxis getFillToAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fillToAxis;
	}-*/;

	/**
	 * "XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0, the area between graph and axis will be filled with color, like in this demo."
	 */
	public final native void setFillToAxis( IsValueAxis fillToAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fillToAxis = fillToAxis;
	}-*/;

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public final native IsAmGraph getFillToGraph() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fillToGraph;
	}-*/;

	/**
	 * "You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled (instead of filling the area to the X axis)."
	 */
	public final native void setFillToGraph( IsAmGraph fillToGraph ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fillToGraph = fillToGraph;
	}-*/;

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public final native double getFixedColumnWidth() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fixedColumnWidth;
	}-*/;

	/**
	 * "Column width in pixels. If you set this property, columns will be of a fixed width and won't adjust to the available space."
	 */
	public final native void setFixedColumnWidth( double fixedColumnWidth ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fixedColumnWidth = fixedColumnWidth;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native double getFontSize() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.fontSize;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.fontSize = fontSize;
	}-*/;

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public final native String getGradientOrientation() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.gradientOrientation;
	}-*/;

	/**
	 * Orientation of the gradient fills (only for 'column' graph type). Possible values are 'vertical' and 'horizontal'.
	 */
	public final native void setGradientOrientation( String gradientOrientation ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.gradientOrientation = gradientOrientation;
	}-*/;

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public final native boolean isHidden() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.hidden;
	}-*/;

	/**
	 * "Specifies whether the graph is hidden. Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead."
	 */
	public final native void setHidden( boolean hidden ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.hidden = hidden;
	}-*/;

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public final native double getHideBulletsCount() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.hideBulletsCount;
	}-*/;

	/**
	 * "If there are more data points than hideBulletsCount, the bullets will not be shown. 0 means the bullets will always be visible."
	 */
	public final native void setHideBulletsCount( double hideBulletsCount ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.hideBulletsCount = hideBulletsCount;
	}-*/;

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native String getHighField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.highField;
	}-*/;

	/**
	 * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native void setHighField( String highField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.highField = highField;
	}-*/;

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.id;
	}-*/;

	/**
	 * "Unique id of a graph. It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need to indicate which graph should be used."
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.id = id;
	}-*/;

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public final native boolean isIncludeInMinMax() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.includeInMinMax;
	}-*/;

	/**
	 * Whether to include this graph when calculating min and max value of the axis.
	 */
	public final native void setIncludeInMinMax( boolean includeInMinMax ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.includeInMinMax = includeInMinMax;
	}-*/;

	/**
	 * Data label text anchor.
	 */
	public final native String getLabelAnchor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelAnchor;
	}-*/;

	/**
	 * Data label text anchor.
	 */
	public final native void setLabelAnchor( String labelAnchor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelAnchor = labelAnchor;
	}-*/;

	/**
	 * Name of label color field in data provider.
	 */
	public final native String getLabelColorField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelColorField;
	}-*/;

	/**
	 * Name of label color field in data provider.
	 */
	public final native void setLabelColorField( String labelColorField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelColorField = labelColorField;
	}-*/;

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public final native IsFunction getLabelFunction() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelFunction;
	}-*/;

	/**
	 * You can use it to format labels of data items in any way you want. Graph will call this function and pass reference to GraphDataItem and formatted text as attributes. This function should return string which will be displayed as label.
	 */
	public final native void setLabelFunction( IsFunction labelFunction ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelFunction = labelFunction;
	}-*/;

	/**
	 * Offset of data label.
	 */
	public final native double getLabelOffset() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelOffset;
	}-*/;

	/**
	 * Offset of data label.
	 */
	public final native void setLabelOffset( double labelOffset ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelOffset = labelOffset;
	}-*/;

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public final native String getLabelPosition() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelPosition;
	}-*/;

	/**
	 * "Position of value label. Possible values are: 'bottom', 'top', 'right', 'left', 'inside', 'middle'. Sometimes position is changed by the chart, depending on a graph type, rotation, etc."
	 */
	public final native void setLabelPosition( String labelPosition ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelPosition = labelPosition;
	}-*/;

	/**
	 * Rotation of a data label.
	 */
	public final native double getLabelRotation() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelRotation;
	}-*/;

	/**
	 * Rotation of a data label.
	 */
	public final native void setLabelRotation( double labelRotation ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelRotation = labelRotation;
	}-*/;

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public final native String getLabelText() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.labelText;
	}-*/;

	/**
	 * "Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]."
	 */
	public final native void setLabelText( String labelText ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.labelText = labelText;
	}-*/;

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public final native double getLegendAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.legendAlpha;
	}-*/;

	/**
	 * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
	 */
	public final native void setLegendAlpha( double legendAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.legendAlpha = legendAlpha;
	}-*/;

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public final native String getLegendColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.legendColor;
	}-*/;

	/**
	 * Legend marker color. Will use lineColor if not set.
	 */
	public final native void setLegendColor( String legendColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.legendColor = legendColor;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native String getLegendPeriodValueText() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.legendPeriodValueText;
	}-*/;

	/**
	 * The text which will be displayed in the value portion of the legend when user is not hovering above any data point. The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the selected period will be displayed.
	 */
	public final native void setLegendPeriodValueText( String legendPeriodValueText ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.legendPeriodValueText = legendPeriodValueText;
	}-*/;

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public final native String getLegendValueText() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.legendValueText;
	}-*/;

	/**
	 * "Legend value text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]] You can also use custom fields from your dataProvider. If not set, uses Legend's valueText."
	 */
	public final native void setLegendValueText( String legendValueText ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.legendValueText = legendValueText;
	}-*/;

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public final native double getLineAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.lineAlpha;
	}-*/;

	/**
	 * Opacity of the line (or column border). Value range is 0 - 1.
	 */
	public final native void setLineAlpha( double lineAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.lineAlpha = lineAlpha;
	}-*/;

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public final native String getLineColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.lineColor;
	}-*/;

	/**
	 * "Color of the line (or column border). If you do not set any, the color fromAmCoordinateChart.colors array will be used for each subsequent graph."
	 */
	public final native void setLineColor( String lineColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.lineColor = lineColor;
	}-*/;

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public final native String getLineColorField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.lineColorField;
	}-*/;

	/**
	 * Name of the line color field in your dataProvider. This property adds a possibility to change graphs line color on any data point to create highlighted sections of the graph. Works only withAmSerialChart.
	 */
	public final native void setLineColorField( String lineColorField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.lineColorField = lineColorField;
	}-*/;

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public final native double getLineThickness() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.lineThickness;
	}-*/;

	/**
	 * Specifies thickness of the graph line (or column border).
	 */
	public final native void setLineThickness( double lineThickness ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.lineThickness = lineThickness;
	}-*/;

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native String getLowField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.lowField;
	}-*/;

	/**
	 * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
	 */
	public final native void setLowField( String lowField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.lowField = lowField;
	}-*/;

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native String getMarkerType() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.markerType;
	}-*/;

	/**
	 * "Legend marker type. You can set legend marker (key) type for individual graphs. Possible values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none."
	 */
	public final native void setMarkerType( String markerType ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.markerType = markerType;
	}-*/;

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public final native double getMaxBulletSize() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.maxBulletSize;
	}-*/;

	/**
	 * Specifies size of the bullet which value is the biggest (XY chart).
	 */
	public final native void setMaxBulletSize( double maxBulletSize ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.maxBulletSize = maxBulletSize;
	}-*/;

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public final native double getMinBulletSize() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.minBulletSize;
	}-*/;

	/**
	 * Specifies minimum size of the bullet (XY chart).
	 */
	public final native void setMinBulletSize( double minBulletSize ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.minBulletSize = minBulletSize;
	}-*/;

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public final native double getMinDistance() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.minDistance;
	}-*/;

	/**
	 * "It is useful if you have really lots of data points. Based on this property the graph will omit some of the lines (if the distance between points is less that minDistance, in pixels). This will not affect the bullets or indicator in anyway, so the user will not see any difference (unless you set minValue to a bigger value, let say 5), but will increase performance as less lines will be drawn. By setting value to a bigger number you can also make your lines look less jagged."
	 */
	public final native void setMinDistance( double minDistance ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.minDistance = minDistance;
	}-*/;

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public final native double getNegativeBase() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.negativeBase;
	}-*/;

	/**
	 * "If you use different colors for your negative values, a graph below zero line is filled with negativeColor. With this property you can define a different base value at which colors should be changed to negative colors."
	 */
	public final native void setNegativeBase( double negativeBase ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.negativeBase = negativeBase;
	}-*/;

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public final native double getNegativeFillAlphas() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.negativeFillAlphas;
	}-*/;

	/**
	 * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
	 */
	public final native void setNegativeFillAlphas( double negativeFillAlphas ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.negativeFillAlphas = negativeFillAlphas;
	}-*/;

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public final native String getNegativeFillColors() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.negativeFillColors;
	}-*/;

	/**
	 * Fill color of negative part of the graph. Will use fillColors if not set.
	 */
	public final native void setNegativeFillColors( String negativeFillColors ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.negativeFillColors = negativeFillColors;
	}-*/;

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public final native double getNegativeLineAlpha() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.negativeLineAlpha;
	}-*/;

	/**
	 * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
	 */
	public final native void setNegativeLineAlpha( double negativeLineAlpha ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.negativeLineAlpha = negativeLineAlpha;
	}-*/;

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public final native String getNegativeLineColor() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.negativeLineColor;
	}-*/;

	/**
	 * "Color of the line (or column) when the values are negative. In case the graph type is candlestick or ohlc, negativeLineColor is used when close value is less then open value."
	 */
	public final native void setNegativeLineColor( String negativeLineColor ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.negativeLineColor = negativeLineColor;
	}-*/;

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public final native boolean isNewStack() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.newStack;
	}-*/;

	/**
	 * "If you set it to true, column chart will begin new stack. This allows having Clustered and Stacked column/bar chart."
	 */
	public final native void setNewStack( boolean newStack ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.newStack = newStack;
	}-*/;

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public final native boolean isNoStepRisers() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.noStepRisers;
	}-*/;

	/**
	 * "In case you want to have a step line graph without risers, you should set this to true."
	 */
	public final native void setNoStepRisers( boolean noStepRisers ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.noStepRisers = noStepRisers;
	}-*/;

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public final native String getOpenField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.openField;
	}-*/;

	/**
	 * "Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider."
	 */
	public final native void setOpenField( String openField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.openField = openField;
	}-*/;

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public final native Object getPattern() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.pattern;
	}-*/;

	/**
	 * "Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. If you want to have individual patterns for each column, define patterns in data provider and set graph.patternField property. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public final native void setPattern( Object pattern ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.pattern = pattern;
	}-*/;

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public final native String getPatternField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.patternField;
	}-*/;

	/**
	 * "Field name in your data provider which holds pattern information. Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX and randomY values. For example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}. Check amcharts/patterns folder for some patterns. You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns."
	 */
	public final native void setPatternField( String patternField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.patternField = patternField;
	}-*/;

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public final native double getPeriodSpan() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.periodSpan;
	}-*/;

	/**
	 * This property can be used by step graphs - you can set how many periods one horizontal line should span.
	 */
	public final native void setPeriodSpan( double periodSpan ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.periodSpan = periodSpan;
	}-*/;

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public final native String getPointPosition() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.pointPosition;
	}-*/;

	/**
	 * "Specifies where data points should be placed - on the beginning of the period (day, hour, etc) or in the middle (only when parseDates property of categoryAxis is set to true). This setting affects Serial chart only. Possible values are 'start', 'middle' and 'end'"
	 */
	public final native void setPointPosition( String pointPosition ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.pointPosition = pointPosition;
	}-*/;

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public final native double getPrecision() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.precision;
	}-*/;

	/**
	 * Precision of values. Will use chart's precision if not set any.
	 */
	public final native void setPrecision( double precision ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.precision = precision;
	}-*/;

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public final native boolean isProCandlesticks() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.proCandlesticks;
	}-*/;

	/**
	 * "If this is set to true, candlesticks will be colored in a different manner - if current close is less than current open, the candlestick will be empty, otherwise - filled with color. If previous close is less than current close, the candlestick will use positive color, otherwise - negative color."
	 */
	public final native void setProCandlesticks( boolean proCandlesticks ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.proCandlesticks = proCandlesticks;
	}-*/;

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public final native boolean isShowAllValueLabels() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showAllValueLabels;
	}-*/;

	/**
	 * "If graph's type is column and labelText is set, graph hides labels which do not fit into the column's space. If you don't want these labels to be hidden, set this to true."
	 */
	public final native void setShowAllValueLabels( boolean showAllValueLabels ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showAllValueLabels = showAllValueLabels;
	}-*/;

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public final native boolean isShowBalloon() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showBalloon;
	}-*/;

	/**
	 * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's indicator is over some series.
	 */
	public final native void setShowBalloon( boolean showBalloon ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showBalloon = showBalloon;
	}-*/;

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public final native String getShowBalloonAt() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showBalloonAt;
	}-*/;

	/**
	 * "Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts, also if column chart has 'open' value. Possible values are: 'open', 'close', 'high', 'low'."
	 */
	public final native void setShowBalloonAt( String showBalloonAt ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showBalloonAt = showBalloonAt;
	}-*/;

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public final native String getShowBulletsAt() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showBulletsAt;
	}-*/;

	/**
	 * "Works with candlestick graph type, you can set it to open, close, high, low. If you set it to high, the events will be shown at the tip of the high line."
	 */
	public final native void setShowBulletsAt( String showBulletsAt ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showBulletsAt = showBulletsAt;
	}-*/;

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public final native boolean isShowHandOnHover() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showHandOnHover;
	}-*/;

	/**
	 * "If you want mouse pointer to change to hand when hovering the graph, set this property to true."
	 */
	public final native void setShowHandOnHover( boolean showHandOnHover ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showHandOnHover = showHandOnHover;
	}-*/;

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public final native boolean isShowOnAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.showOnAxis;
	}-*/;

	/**
	 * "It can only be used together with topRadius (when columns look like cylinders). If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be right on category axis."
	 */
	public final native void setShowOnAxis( boolean showOnAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.showOnAxis = showOnAxis;
	}-*/;

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100 You can exclude this graph from stacking."
	 */
	public final native boolean isStackable() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.stackable;
	}-*/;

	/**
	 * "If the value axis of this graph has stack types like 'regular' or 100 You can exclude this graph from stacking."
	 */
	public final native void setStackable( boolean stackable ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.stackable = stackable;
	}-*/;

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public final native String getStepDirection() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.stepDirection;
	}-*/;

	/**
	 * Step graph only. Specifies to which direction step should be drawn.
	 */
	public final native void setStepDirection( String stepDirection ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.stepDirection = stepDirection;
	}-*/;

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public final native boolean isSwitchable() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.switchable;
	}-*/;

	/**
	 * "If you set it to false, the graph will not be hidden when user clicks on legend entry."
	 */
	public final native void setSwitchable( boolean switchable ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.switchable = switchable;
	}-*/;

	/**
	 * Graph title.
	 */
	public final native String getTitle() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.title;
	}-*/;

	/**
	 * Graph title.
	 */
	public final native void setTitle( String title ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.title = title;
	}-*/;

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public final native double getTopRadius() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.topRadius;
	}-*/;

	/**
	 * "If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0 values in order this to be visible). you can make columns look like cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0 in order this to look good."
	 */
	public final native void setTopRadius( double topRadius ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.topRadius = topRadius;
	}-*/;

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public final native String getType() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.type;
	}-*/;

	/**
	 * "Type of the graph. Possible values are: 'line', 'column', 'step', 'smoothedLine', 'candlestick', 'ohlc'. XY and Radar charts can only display 'line' type graphs."
	 */
	public final native void setType( String type ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.type = type;
	}-*/;

	/**
	 * Name of the url field in your dataProvider.
	 */
	public final native String getUrlField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.urlField;
	}-*/;

	/**
	 * Name of the url field in your dataProvider.
	 */
	public final native void setUrlField( String urlField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.urlField = urlField;
	}-*/;

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public final native String getUrlTarget() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.urlTarget;
	}-*/;

	/**
	 * "Target to open URLs in, i.e. _blank, _top, etc."
	 */
	public final native void setUrlTarget( String urlTarget ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.urlTarget = urlTarget;
	}-*/;

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public final native boolean isUseNegativeColorIfDown() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.useNegativeColorIfDown;
	}-*/;

	/**
	 * "If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true (default is false), the line, step and column graphs will use these colors for lines, bullets or columns if previous value is bigger than current value. In case you set openField for the graph, the graph will compare current value with openField value instead of comparing to previous value. Here is a demo."
	 */
	public final native void setUseNegativeColorIfDown( boolean useNegativeColorIfDown ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.useNegativeColorIfDown = useNegativeColorIfDown;
	}-*/;

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public final native IsValueAxis getValueAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.valueAxis;
	}-*/;

	/**
	 * Specifies which value axis the graph will use. Will use the first value axis if not set. You can use reference to the real ValueAxis object or set value axis id.
	 */
	public final native void setValueAxis( IsValueAxis valueAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.valueAxis = valueAxis;
	}-*/;

	/**
	 * Name of the value field in your dataProvider.
	 */
	public final native String getValueField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.valueField;
	}-*/;

	/**
	 * Name of the value field in your dataProvider.
	 */
	public final native void setValueField( String valueField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.valueField = valueField;
	}-*/;

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public final native boolean isVisibleInLegend() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.visibleInLegend;
	}-*/;

	/**
	 * Specifies whether this graph should be shown in the Legend.
	 */
	public final native void setVisibleInLegend( boolean visibleInLegend ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.visibleInLegend = visibleInLegend;
	}-*/;

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public final native IsValueAxis getXAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.xAxis;
	}-*/;

	/**
	 * XY chart only. A horizontal value axis object to attach graph to.
	 */
	public final native void setXAxis( IsValueAxis xAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.xAxis = xAxis;
	}-*/;

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public final native String getXField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.xField;
	}-*/;

	/**
	 * XY chart only. Name of the x field in your dataProvider.
	 */
	public final native void setXField( String xField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.xField = xField;
	}-*/;

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public final native IsValueAxis getYAxis() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.yAxis;
	}-*/;

	/**
	 * XY chart only. A vertical value axis object to attach graph to.
	 */
	public final native void setYAxis( IsValueAxis yAxis ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.yAxis = yAxis;
	}-*/;

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public final native String getYField() /*-{
		return this.@com.amcharts.impl.AmGraph::jso.yField;
	}-*/;

	/**
	 * XY chart only. Name of the y field in your dataProvider.
	 */
	public final native void setYField( String yField ) /*-{
		this.@com.amcharts.impl.AmGraph::jso.yField = yField;
	}-*/;

	/**
	 * Hides graph's bullets.
	 */
	public native void hideBullets()
	/*-{
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		graph.hideBullets();
	}-*/;

	/**
	 * Shows graph's bullets.
	 */
	public native void showBullets()
	/*-{
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		graph.showBullets();
	}-*/;

	public void setUseLineColorForBulletBorder( boolean useLineColorForBulletBorder )
	{
		getJso().setUseLineColorForBulletBorder( useLineColorForBulletBorder );
	}
}