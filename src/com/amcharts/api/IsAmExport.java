package com.amcharts.api;

public interface IsAmExport
{

	public abstract boolean isExportJPG();

	public abstract void setExportJPG( boolean exportJPG );

	public abstract boolean isExportPDF();

	public abstract void setExportPDF( boolean exportPDF );

	public abstract boolean isExportPNG();

	public abstract void setExportPNG( boolean exportPNG );

	public abstract boolean isExportSVG();

	public abstract void setExportSVG( boolean exportSVG );

}