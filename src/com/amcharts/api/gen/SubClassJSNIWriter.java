package com.amcharts.api.gen;

import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.NATIVE;
import static javax.lang.model.element.Modifier.PRIVATE;
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

public class SubClassJSNIWriter
{
	static List<String> inputs = Arrays
			.asList( new String[]
			{ "AmXYChart", "AmAngularGauge", "ValueAxis", "CategoryAxis", "AmRectangularChart", "AmSerialChart" } );

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
		FileWriter fileWriter = new FileWriter( new File( input + ".java" ) );
		GWTJSNIJavaWriter jsoWriter = null;
		String fieldName = null;

		try
		{
			jsoWriter = new GWTJSNIJavaWriter( fileWriter );
			jsoWriter.setCompressingTypes( true );
			jsoWriter
					.emitPackage( "com.amcharts.impl" )
					.emitImports( "com.amcharts.api.*" )
					.emitImports( "com.amcharts.jso.*" )
					.emitImports( "com.google.gwt.core.client" )
					.beginType( input, "class", EnumSet.of( PUBLIC, FINAL ), null, "IJavaScriptWrapper<" + input + "JSO" + ">" )
					.emitField( input + "JSO", "jso", EnumSet.of( PRIVATE ) )
					.beginConstructor( EnumSet.of( PROTECTED ) )
					.emitStatement( "jso=createJso()" ).endConstructor();
			jsoWriter
					.beginMethod( input + "JSO", "getJso", EnumSet.of( PUBLIC ) )
					.emitStatement( "return this.jso" ).endMethod();
			jsoWriter
					.beginMethod( "void", "setJso", EnumSet.of( PUBLIC ), input + "JSO", "jso" )
					.emitStatement( "this.jso=jso" ).endMethod();
			jsoWriter
					.beginJSNIMethod( input + "JSO", "createJso", EnumSet.of( PUBLIC, NATIVE ) )
					.emitStatement( "return this.jso" ).endJSNIMethod();

			for ( JavaClassAttribute jca : jcaItems )
			{
				fieldName = jca.getFieldName();
				if ( jca.getJavaType().equals( "boolean" ) )
				{
					jsoWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginMethod( jca.getJavaType(), "is" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC, FINAL ) )
							.emitStatement( "return getJso()." + "is" + StringUtils.capitalize( jca
									.getFieldName() ) + "()" ).endMethod();
				}
				else
				{
					jsoWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginMethod( jca.getJavaType(), "get" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC, FINAL ) )
							.emitStatement( "return getJso()." + "get" + StringUtils.capitalize( jca
									.getFieldName() ) + "()" ).endMethod();
				}
				jsoWriter
						.emitJavadoc( jca.getJavadocComment() )
						.beginMethod( "void", "set" + StringUtils.capitalize( jca
								.getFieldName() ), EnumSet.of( PUBLIC, FINAL ), jca
								.getJavaType(), jca.getFieldName() )
						.emitStatement( "getJso()." + "set" + StringUtils.capitalize( jca
								.getFieldName() ) + "(" + jca.getFieldName() + ")" )
						.endMethod();
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