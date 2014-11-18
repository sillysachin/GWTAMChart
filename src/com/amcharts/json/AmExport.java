package com.amcharts.json;

import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsExportConfig;

public final class AmExport implements IsAmExport
{
	private String bottom;

	private double buttonAlpha;

	private String buttonIcon;

	private String buttonRollOverColor;

	private String buttonTitle;

	private boolean exportJPG;

	private boolean exportPDF;

	private boolean exportPNG;

	private boolean exportSVG;

	private String imageBackgroundColor;

	private String imageFileName;

	private String left;

	private String right;

	private String textRollOverColor;

	private String top;

	private IsExportConfig userCFG;

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public String getBottom()
	{
		return bottom;
	}

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public void setBottom( String bottom )
	{
		this.bottom = bottom;
	}

	/**
	 * Opacity of a button.
	 */
	public double getButtonAlpha()
	{
		return buttonAlpha;
	}

	/**
	 * Opacity of a button.
	 */
	public void setButtonAlpha( double buttonAlpha )
	{
		this.buttonAlpha = buttonAlpha;
	}

	/**
	 * Name of export button image.
	 */
	public String getButtonIcon()
	{
		return buttonIcon;
	}

	/**
	 * Name of export button image.
	 */
	public void setButtonIcon( String buttonIcon )
	{
		this.buttonIcon = buttonIcon;
	}

	/**
	 * Roll-over color of button background.
	 */
	public String getButtonRollOverColor()
	{
		return buttonRollOverColor;
	}

	/**
	 * Roll-over color of button background.
	 */
	public void setButtonRollOverColor( String buttonRollOverColor )
	{
		this.buttonRollOverColor = buttonRollOverColor;
	}

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public String getButtonTitle()
	{
		return buttonTitle;
	}

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public void setButtonTitle( String buttonTitle )
	{
		this.buttonTitle = buttonTitle;
	}

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public boolean isExportJPG()
	{
		return exportJPG;
	}

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public void setExportJPG( boolean exportJPG )
	{
		this.exportJPG = exportJPG;
	}

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public boolean isExportPDF()
	{
		return exportPDF;
	}

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public void setExportPDF( boolean exportPDF )
	{
		this.exportPDF = exportPDF;
	}

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public boolean isExportPNG()
	{
		return exportPNG;
	}

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public void setExportPNG( boolean exportPNG )
	{
		this.exportPNG = exportPNG;
	}

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public boolean isExportSVG()
	{
		return exportSVG;
	}

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public void setExportSVG( boolean exportSVG )
	{
		this.exportSVG = exportSVG;
	}

	/**
	 * Background color of a saved image
	 */
	public String getImageBackgroundColor()
	{
		return imageBackgroundColor;
	}

	/**
	 * Background color of a saved image
	 */
	public void setImageBackgroundColor( String imageBackgroundColor )
	{
		this.imageBackgroundColor = imageBackgroundColor;
	}

	/**
	 * File name of a saved image.
	 */
	public String getImageFileName()
	{
		return imageFileName;
	}

	/**
	 * File name of a saved image.
	 */
	public void setImageFileName( String imageFileName )
	{
		this.imageFileName = imageFileName;
	}

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public String getLeft()
	{
		return left;
	}

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public void setLeft( String left )
	{
		this.left = left;
	}

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public String getRight()
	{
		return right;
	}

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public void setRight( String right )
	{
		this.right = right;
	}

	/**
	 * Text roll-over color.
	 */
	public String getTextRollOverColor()
	{
		return textRollOverColor;
	}

	/**
	 * Text roll-over color.
	 */
	public void setTextRollOverColor( String textRollOverColor )
	{
		this.textRollOverColor = textRollOverColor;
	}

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public String getTop()
	{
		return top;
	}

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public void setTop( String top )
	{
		this.top = top;
	}

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public IsExportConfig getUserCFG()
	{
		return userCFG;
	}

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public void setUserCFG( IsExportConfig userCFG )
	{
		this.userCFG = userCFG;
	}
}
