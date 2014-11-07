package com.amcharts.impl;

import com.amcharts.api.IsAmExport;
import com.amcharts.jso.AmExportJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class AmExport implements IsAmExport, IJavaScriptWrapper<AmExportJSO>
{

	private AmExportJSO jso;

	public AmExport()
	{
		setJso( ( AmExportJSO ) JavaScriptObject.createObject() );
	}

	@Override
	public AmExportJSO getJso()
	{
		return this.jso;
	}

	@Override
	public void setJso( AmExportJSO jso )
	{
		this.jso = jso;
	}

	@Override
	public boolean isExportJPG()
	{
		return getJso().isExportJPG();
	}

	@Override
	public void setExportJPG( boolean exportJPG )
	{
		getJso().setExportJPG( exportJPG );
	}

	@Override
	public boolean isExportPDF()
	{
		return getJso().isExportPDF();
	}

	@Override
	public void setExportPDF( boolean exportPDF )
	{
		getJso().setExportPDF( exportPDF );
	}

	@Override
	public boolean isExportPNG()
	{
		return getJso().isExportPNG();
	}

	@Override
	public void setExportPNG( boolean exportPNG )
	{
		getJso().setExportPNG( exportPNG );
	}

	@Override
	public boolean isExportSVG()
	{
		return getJso().isExportSVG();
	}

	@Override
	public void setExportSVG( boolean exportSVG )
	{
		getJso().setExportPNG( exportSVG );
	}
}