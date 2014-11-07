package com.amcharts.api.gen;

import static javax.lang.model.element.Modifier.PUBLIC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.squareup.javawriter.JavaWriter;

public class APIWriter
{
	static List<String> inputs = Arrays.asList( new String[]
	{ "ChartCursor" } );

	public static void main( String args[] ) throws IOException
	{
		for ( String input : inputs )
		{
			apiWriter( input );
		}
	}

	private static void apiWriter( String input ) throws IOException
	{
		List<JavaClassAttribute> jcaItems = AttributeReader.run( input );
		FileWriter fileWriter = new FileWriter( new File( "Is" + input + ".java" ) );
		JavaWriter apiWriter = null;
		try
		{
			apiWriter = new JavaWriter( fileWriter );
			apiWriter
					.emitPackage( "com.amcharts.api" )
					.beginType( "Is" + input, "interface", EnumSet.of( PUBLIC ) );

			for ( JavaClassAttribute jca : jcaItems )
			{
				if ( jca.getJavaType().equals( "boolean" ) )
				{
					apiWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginMethod( jca.getJavaType(), "is" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC ) )
							.endMethod();
				}
				else
				{
					apiWriter
							.emitJavadoc( jca.getJavadocComment() )
							.beginMethod( jca.getJavaType(), "get" + StringUtils.capitalize( jca
									.getFieldName() ), EnumSet.of( PUBLIC ) )
							.endMethod();
				}
				apiWriter
						.emitJavadoc( jca.getJavadocComment() )
						.beginMethod( "void", "set" + StringUtils.capitalize( jca
								.getFieldName() ), EnumSet.of( PUBLIC ), jca.getJavaType(), jca
								.getFieldName() ).endMethod();
			}
			apiWriter.endType();
		}
		finally
		{
			apiWriter.close();
			fileWriter.close();
		}
	}
}