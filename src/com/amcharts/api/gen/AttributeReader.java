package com.amcharts.api.gen;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AttributeReader
{
	public static List<JavaClassAttribute> run( String input )
	{
		String inputFile = input + ".txt";
		BufferedReader reader = null;
		String line = "";
		String cvsSplitBy = "	";
		List<JavaClassAttribute> javaClassAttributes = new ArrayList<JavaClassAttribute>();
		String fieldName = null;
		try
		{
			InputStream inputStream = AttributeReader.class.getClassLoader()
					.getResourceAsStream( inputFile );
			reader = new BufferedReader( new InputStreamReader( inputStream ) );
			String header = reader.readLine();
			System.out.println( "header -> " + header );
			while ( ( line = reader.readLine() ) != null )
			{
				String[] variableTokens = line.split( cvsSplitBy );
				JavaClassAttribute jca = new JavaClassAttribute();
				for ( int i = 0; i < variableTokens.length; i++ )
				{
					String javaType = variableTokens[3];
					String jsType = variableTokens[1];
					fieldName = variableTokens[0];
					String defaultValue = variableTokens[2];
					jca.setFieldName( fieldName );
					jca.setJavaType( javaType );
					jca.setJsType( jsType );
					jca.setDefaultValue( defaultValue );
					jca.setJavadocComment( variableTokens[4] );
				}
				javaClassAttributes.add( jca );
			}

		}
		catch ( Exception e )
		{
			System.out.println( "Failed reading " + fieldName + " in " + input );
			e.printStackTrace();
		}
		finally
		{
			if ( reader != null )
			{
				try
				{
					reader.close();
				}
				catch ( Exception e )
				{
					System.out.println( "Failed for " + input );
					e.printStackTrace();
				}
			}
		}
		return javaClassAttributes;
	}
}