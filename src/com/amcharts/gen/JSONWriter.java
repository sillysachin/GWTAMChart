package com.amcharts.gen;

import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.squareup.javawriter.JavaWriter;

public class JSONWriter
{
	static List<String> inputs = Arrays
			.asList( new String[]
			{ "AmCharts", "AmCoordinateChart", "MenuItemOutput", "MenuItemStyle", "AmExport", "AmBalloon", "AmRadarChart", "GaugeArrow", "AmXYChart", "AmAngularGauge", "GaugeAxis", "GaugeBand", "GraphDataItem", "SerialDataItem", "ChartCursor", "AmGraph", "AxisBase", "ValueAxis", "CategoryAxis", "AmRectangularChart", "AmLegend", "AmSerialChart", "ChartScrollbar", "Label", "Guide", "Title", "TrendLine" } );

	public static void main( String args[] ) throws IOException
	{
		for ( String input : inputs )
		{
			jsonWriter( input );
		}
	}

}