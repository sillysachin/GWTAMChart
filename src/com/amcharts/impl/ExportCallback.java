package com.amcharts.impl;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class ExportCallback
{
	public static final void execute( ExportCallback callback, JavaScriptObject blob )
	{
		callback.onExecute( blob );
	}

	public abstract void onExecute( JavaScriptObject blob );
}