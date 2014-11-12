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
		int counter = 0;
		try
		{
			InputStream inputStream = AttributeReader.class.getClassLoader()
					.getResourceAsStream( inputFile );
			reader = new BufferedReader( new InputStreamReader( inputStream ) );
			String header = reader.readLine();
			System.out.println( "header -> " + header );
			while ( ( line = reader.readLine() ) != null )
			{
				counter++;
				String[] variableTokens = line.split( cvsSplitBy );
				JavaClassAttribute jca = new JavaClassAttribute();
				fieldName = variableTokens[0];
				String jsType = variableTokens[1];
				String defaultValue = variableTokens[2];
				String javaType = variableTokens[3];
				jca.setFieldName( fieldName );
				jca.setJavaType( javaType );
				jca.setJsType( jsType );
				jca.setDefaultValue( defaultValue );
				if ( variableTokens.length > 4 )
				{
					String javadocComment = variableTokens[4];
					jca.setJavadocComment( javadocComment );
				}else{
					jca.setJavadocComment( "" );
				}
				javaClassAttributes.add( jca );
			}

		}
		catch ( Exception e )
		{
			System.out
					.println( "Failed reading line " + counter + "with" + fieldName + " in " + input );
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