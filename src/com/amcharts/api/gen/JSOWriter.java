package com.amcharts.api.gen;

import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.NATIVE;
import static javax.lang.model.element.Modifier.PROTECTED;
import static javax.lang.model.element.Modifier.PUBLIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.squareup.javawriter.GWTJSNIJavaWriter;

public class JSOWriter
{
	static List<String> inputs = Arrays
			.asList( new String[]
			{ "ChartCursor", "AmGraph", "AxisBase", "ValueAxis", "CategoryAxis", "AmRectangularChart" } );

	public static void main( String args[] ) throws IOException
	{
		for ( String input : inputs )
		{
			jsonWriter( input );
		}
	}

	private static void jsonWriter( String input ) throws IOException
	{
		List<JavaClassAttribute> jcaItems = AttributeReader.run( input );
		FileWriter fileWriter = new FileWriter( new File( input + "JSO" + ".java" ) );
		GWTJSNIJavaWriter jsoWriter = null;
		String fieldName = null;
		try
		{
			jsoWriter = new GWTJSNIJavaWriter( fileWriter );
			jsoWriter.setCompressingTypes( true );
			jsoWriter
					.emitPackage( "com.amcharts.jso" )
					.emitImports( "com.amcharts.api.*" )
					.emitImports( "com.google.gwt.core.client" )
					.beginType( input + "JSO", "class", EnumSet.of( PUBLIC, FINAL ), "JavaScriptObject" )
					.beginConstructor( EnumSet.of( PROTECTED ) )
					.endConstructor();

			for ( JavaClassAttribute jca : jcaItems )
			{
				fieldName = jca.getFieldName();
				if ( jca.getJavaType().equals( "boolean" ) )
				{
					jsoWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginJSNIMethod( jca.getJavaType(), "is" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC, FINAL, NATIVE ) )
							.emitStatement( "return " + jca.getFieldName() )
							.endJSNIMethod();
				}
				else
				{
					jsoWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginJSNIMethod( jca.getJavaType(), "get" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC, FINAL, NATIVE ) )
							.emitStatement( "return " + jca.getFieldName() )
							.endJSNIMethod();
				}
				jsoWriter
						.emitJavadoc( jca.getJavadocComment() )
						.beginJSNIMethod( "void", "set" + StringUtils.capitalize( jca
								.getFieldName() ), EnumSet.of( PUBLIC, FINAL, NATIVE ), jca
								.getJavaType(), jca.getFieldName() )
						.emitStatement( "this." + jca.getFieldName() + "=" + jca.getFieldName() )
						.endJSNIMethod();
			}
			jsoWriter.endType();
		}
		catch ( Exception exception )
		{
			System.out.println( "Failed at " + fieldName + " for " + input );
		}
		finally
		{
			jsoWriter.close();
			fileWriter.close();
		}
	}
}