package com.amcharts.impl;

public abstract class ExportCallback
{
	public static final void execute( ExportCallback callback )
	{
		callback.onExecute();
	}

	public abstract void onExecute();
}