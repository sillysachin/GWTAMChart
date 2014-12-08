package com.amcharts.impl;

import com.amcharts.api.IsAxisAuto;
import com.amcharts.api.IsGraphDataItem;
import com.google.gwt.core.client.JavaScriptObject;

public class AxisAuto extends JavaScriptObject implements IsAxisAuto
{
	protected AxisAuto()
	{
	}

	/* (non-Javadoc)
	 * @see com.amcharts.api.IsAxisAuto#getGraph(java.lang.String)
	 */
	@Override
	public final native IsGraphDataItem getGraph( String graphId )/*-{
		return this.graphs[graphId];
	}-*/;
}
