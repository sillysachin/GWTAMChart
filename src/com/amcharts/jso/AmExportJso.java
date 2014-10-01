package com.amcharts.jso;

import com.amcharts.model.IsAmExport;
import com.google.gwt.core.client.JavaScriptObject;

public class AmExportJso extends JavaScriptObject implements IsAmExport
{
	protected AmExportJso()
	{
	}

	@Override
	public final native boolean isExportJPG()
	/*-{
		return exportJPG;
	}-*/;

	@Override
	public final native void setExportJPG( boolean exportJPG )
	/*-{
		this.exportJPG = exportJPG;
	}-*/;

	@Override
	public final native boolean isExportPDF()
	/*-{
		return exportPDF;
	}-*/;

	@Override
	public final native void setExportPDF( boolean exportPDF )
	/*-{
		this.exportPDF = exportPDF;
	}-*/;

	@Override
	public final native boolean isExportPNG()
	/*-{
		return exportPNG;
	}-*/;

	@Override
	public final native void setExportPNG( boolean exportPNG )
	/*-{
		this.exportPNG = exportPNG;
	}-*/;

	@Override
	public final native boolean isExportSVG()
	/*-{
		return exportSVG;
	}-*/;

	@Override
	public final native void setExportSVG( boolean exportSVG )
	/*-{
		this.exportSVG = exportSVG;
	}-*/;
}