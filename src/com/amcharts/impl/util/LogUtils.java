package com.amcharts.impl.util;

public class LogUtils
{
	public static native void log( Object obj )
	/*-{
		console.log(obj);
		//JSON.stringify(obj, null, 4)
	}-*/;
}
