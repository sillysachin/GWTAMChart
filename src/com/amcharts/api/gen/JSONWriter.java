package com.amcharts.api.gen;

import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;

import com.squareup.javawriter.JavaWriter;

public class JSOWriter
{
	private static StringWriter stringWriter;

	private static FileWriter fileWriter;

	static JavaWriter hellowriter;

	static JavaWriter jsoWriter;

	public static void main( String args[] ) throws IOException
	{
		stringWriter = new StringWriter();
		fileWriter = new FileWriter( new File( "ChartCursorJSO.java" ) );

		try
		{
			hellowriter = new JavaWriter( stringWriter );
			jsoWriter = new JavaWriter( fileWriter );
			jsoWriter
					.emitPackage( "com.amcharts.jso." )
					.beginType( "com.amcharts.jso.ChartCursorJSO", "class", EnumSet
							.of( PUBLIC, FINAL ) )
					.emitField( "double", "adjustment", EnumSet.of( PRIVATE ) )
					.emitJavadoc( "Returns the chart cursor's adjustment." )
					.beginMethod( "double", "getAdjustment", EnumSet.of( PUBLIC ) )
					.emitStatement( "return adjustment" )
					.endMethod().endType();
		}
		finally
		{
			hellowriter.close();
			fileWriter.close();
		}
	}
}