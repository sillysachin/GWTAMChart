package com.amcharts.impl.util;

import java.util.List;
import java.util.Map;

import com.amcharts.impl.AmChart;
import com.amcharts.impl.AmCoordinateChart;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.AmRectangularChart;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.AmSlicedChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Guide;
import com.amcharts.impl.Legend;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.MenuItems;
import com.amcharts.impl.TrendLine;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.event.DataItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Class with various methods that involve wrapping and unwrapping of JavaScript objects
 * 
 */
public class WrapperUtils
{

	/**
	 * Performs wrapping on given JavaScriptObject. Wrapper is chosen and instantiated based on the constructor of the passed object. For passed null returns null. For unknown objects it will raise a runtime exception.
	 * 
	 * @param jso
	 *            object that will be wrapped
	 * @return initialized wrapper
	 */
	public static IJavaScriptWrapper wrap( JavaScriptObject jso )
	{

		if ( jso == null )
		{
			return null;
		}

		String className = getJavaScriptClassName( jso );
		String jsoClassName = getJSOClassName( jso );
		IJavaScriptWrapper wrapper = null;
		if ( "Object".equals( className ) )
		{
			wrapper = createWrapperByJSOClassName( jsoClassName );
		}
		else
		{
			wrapper = createWrapper( className );
		}

		if ( wrapper == null )
		{
			throw new RuntimeException( "Unsupported class : " + className );
		}

		wrapper.setJso( jso );

		return wrapper;
	}

	private static IJavaScriptWrapper createWrapperByJSOClassName( String className )
	{
		IJavaScriptWrapper wrapper = null;
		GWT.log( className );
		// GWT compiler cannot dynamically create the class with GWT.create(classLiteral) method. Hence the if-else.

		return wrapper;
	}

	private static IJavaScriptWrapper createWrapper( String className )
	{
		IJavaScriptWrapper wrapper = null;
		GWT.log( className );
		// GWT compiler cannot dynamically create the class with GWT.create(classLiteral) method. Hence the if-else.
		if ( className.equals( getSimpleName( AmChart.class ) ) )
		{
			wrapper = GWT.create( AmChart.class );
		}
		else if ( className.equals( getSimpleName( AmSerialChart.class ) ) )
		{
			wrapper = GWT.create( AmSerialChart.class );
		}
		else if ( className.equals( getSimpleName( AmCoordinateChart.class ) ) )
		{
			wrapper = GWT.create( AmCoordinateChart.class );
		}
		else if ( className.equals( getSimpleName( AmRectangularChart.class ) ) )
		{
			wrapper = GWT.create( AmRectangularChart.class );
		}
		else if ( className.equals( getSimpleName( AmGraph.class ) ) )
		{
			wrapper = GWT.create( AmGraph.class );
		}
		else if ( className.equals( getSimpleName( ValueAxis.class ) ) )
		{
			wrapper = GWT.create( ValueAxis.class );
		}
		else if ( className.equals( getSimpleName( CategoryAxis.class ) ) )
		{
			wrapper = GWT.create( CategoryAxis.class );
		}
		else if ( className.equals( getSimpleName( ChartCursor.class ) ) )
		{
			wrapper = GWT.create( ChartCursor.class );
		}
		else if ( className.equals( getSimpleName( ChartScrollbar.class ) ) )
		{
			wrapper = GWT.create( ChartScrollbar.class );
		}
		else if ( className.equals( getSimpleName( Guide.class ) ) )
		{
			wrapper = GWT.create( Guide.class );
		}
		else if ( className.equals( getSimpleName( TrendLine.class ) ) )
		{
			wrapper = GWT.create( TrendLine.class );
		}
		else if ( className.equals( getSimpleName( AmPieChart.class ) ) )
		{
			wrapper = GWT.create( AmPieChart.class );
		}
		else if ( className.equals( getSimpleName( AmSlicedChart.class ) ) )
		{
			wrapper = GWT.create( AmSlicedChart.class );
		}
		else if ( className.equals( getSimpleName( ExportConfig.class ) ) )
		{
			wrapper = GWT.create( ExportConfig.class );
		}
		else if ( className.equals( getSimpleName( MenuItems.class ) ) )
		{
			wrapper = GWT.create( MenuItems.class );
		}
		else if ( className.equals( getSimpleName( MenuItem.class ) ) )
		{
			wrapper = GWT.create( MenuItem.class );
		}
		else if ( className.equals( getSimpleName( Legend.class ) ) )
		{
			wrapper = GWT.create( Legend.class );
		}
		else if ( className.equals( getSimpleName( DataItem.class ) ) )
		{
			wrapper = GWT.create( DataItem.class );
		}
		else if ( className.equals( getSimpleName( DataContext.class ) ) )
		{
			wrapper = GWT.create( DataContext.class );
		}

		return wrapper;
	}

	private static native String getJSOClassName( JavaScriptObject jso ) /*-{
		return jso.className;
	}-*/;

	private static native String getJavaScriptClassName( JavaScriptObject jso ) /*-{
		return jso.constructor.name ? jso.constructor.name : jso.constructor
				.toString().match(/function ([a-zA-z0-9]*)/)[1];
	}-*/;

	/**
	 * Does the same thing as {@link Class#getSimpleName()} which isn't currently supported by GWT.
	 * 
	 * @param klass
	 *            class for which to return the name
	 * @return name of the class stripped of it's package name
	 */
	public static String getSimpleName( Class< ? > klass )
	{
		String simpleName = klass.getName().substring( klass.getName().lastIndexOf( "." ) + 1 );
		simpleName = simpleName.contains( "$" ) ? simpleName.substring( simpleName.lastIndexOf( '$' ) + 1 ) : simpleName;
		return simpleName;
	}

	/**
	 * Wraps JavaScript list into Java list. Also wraps the objects inside the list.
	 * 
	 * @param list
	 *            JavaScript list for conversion
	 * @return new instance of Java list
	 */
	public static native <C extends IJavaScriptWrapper> List<C> wrapList( JavaScriptObject list ) /*-{

		var javaList = null;

		if (list != null) {
			javaList = @java.util.ArrayList::new(I)(list.length);

			for (var i = 0; i < list.length; i++) {
				//create an instance of wrapper
				var instance = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(list[i]);
				//and add it to the list
				javaList.@java.util.ArrayList::add(Ljava/lang/Object;)(instance);
			}
		}

		return javaList;
	}-*/;

	public static native <C extends JavaScriptObject> List<C> getList( JavaScriptObject list ) /*-{

		var javaList = null;

		if (list != null) {
			javaList = @java.util.ArrayList::new(I)(list.length);

			for (var i = 0; i < list.length; i++) {
				//create an instance of wrapper
				var instance = list[i];
				//and add it to the list
				javaList.@java.util.ArrayList::add(Ljava/lang/Object;)(instance);
			}
		}

		return javaList;
	}-*/;

	/**
	 * Converts Java list into JavaScript list and unwraps the objects contained in it by exposing the underlying JavaScriptObjectS.
	 * 
	 * @param list
	 *            list for conversion
	 * @return JavaScript list
	 */
	public static native JavaScriptObject unwrapList( List< ? extends IJavaScriptWrapper> list ) /*-{
		var jsList = null;

		if (list != null) {
			jsList = [];
			var iterator = list.@java.util.List::iterator()();

			for (var i = 0; i < list.@java.util.List::size()(); i++) {
				var elem = list.@java.util.List::get(I)(i);
				jsList[i] = elem.@com.google.gwt.core.client.IJavaScriptWrapper::getJso()();
			}
		}

		return jsList;
	}-*/;

	/**
	 * Converts a Java map into a JavaScript map. Also unwraps the objects inside.
	 * 
	 * @param map
	 * @return
	 */
	public static native <K extends Object, V extends IJavaScriptWrapper> JavaScriptObject unwrapMap( Map<K, V> map ) /*-{

		if (map == null) {
			return null;
		}

		var mapJS = {}, key = null, jso = null;
		var keySetIterator = map.@java.util.Map::keySet()().@java.util.Set::iterator()();

		while (keySetIterator.@java.util.Iterator::hasNext()()) {
			key = keySetIterator.@java.util.Iterator::next()();
			//this gets the wrapping object and then the wrapped object from it
			jso = map.@java.util.Map::get(Ljava/lang/Object;)(key).@com.google.gwt.core.client.IJavaScriptWrapper::getJso()();
			mapJS[key] = jso;
		}

		return mapJS;

	}-*/;

	public static JavaScriptObject unwrap( IJavaScriptWrapper wrapper )
	{
		if ( wrapper == null )
		{
			return null;
		}
		else
		{
			return wrapper.getJso();
		}
	}

	/**
	 * Converts a JavaScript map into a Java map. Also wraps the objects inside.
	 * 
	 * @param map
	 *            JavaScript map for conversion
	 * @return Java map containing wrapper objects or null if passed object is not a JavaScript map
	 */
	public static native <K extends Object, V extends IJavaScriptWrapper> Map<K, V> wrapMap( JavaScriptObject map ) /*-{
		var mapJ = @java.util.HashMap::new()();

		if (typeof map != typeof {}) {
			return null;
		}

		for ( var key in map) {
			//workaround for issue 4486 http://code.google.com/p/google-web-toolkit/issues/detail?id=4486
			if (key == "__gwt_ObjectId") {
				continue;
			}
			//create an instance of wrapper
			var instanceJ = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(map[key]);
			//add it to the map
			mapJ.@java.util.Map::put(Ljava/lang/Object;Ljava/lang/Object;)(key, instanceJ);
		}

		return mapJ;

	}-*/;
}