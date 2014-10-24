package com.amcharts.json;

import com.amcharts.api.IsAmExport;

public class AmExport implements IsAmExport
{
	private boolean exportJPG;

	private boolean exportPDF;

	private boolean exportPNG;

	private boolean exportSVG;

	@Override
	public boolean isExportJPG()
	{
		return exportJPG;
	}

	@Override
	public void setExportJPG( boolean exportJPG )
	{
		this.exportJPG = exportJPG;
	}

	@Override
	public boolean isExportPDF()
	{
		return exportPDF;
	}

	@Override
	public void setExportPDF( boolean exportPDF )
	{
		this.exportPDF = exportPDF;
	}

	@Override
	public boolean isExportPNG()
	{
		return exportPNG;
	}

	@Override
	public void setExportPNG( boolean exportPNG )
	{
		this.exportPNG = exportPNG;
	}

	@Override
	public boolean isExportSVG()
	{
		return exportSVG;
	}

	@Override
	public void setExportSVG( boolean exportSVG )
	{
		this.exportSVG = exportSVG;
	}
}
