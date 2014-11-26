package com.amcharts.api;

public interface IsAmExport
{
	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public String getBottom();

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public void setBottom( String bottom );

	/**
	 * Opacity of a button.
	 */
	public double getButtonAlpha();

	/**
	 * Opacity of a button.
	 */
	public void setButtonAlpha( double buttonAlpha );

	/**
	 * Name of export button image.
	 */
	public String getButtonIcon();

	/**
	 * Name of export button image.
	 */
	public void setButtonIcon( String buttonIcon );

	/**
	 * Roll-over color of button background.
	 */
	public String getButtonRollOverColor();

	/**
	 * Roll-over color of button background.
	 */
	public void setButtonRollOverColor( String buttonRollOverColor );

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public String getButtonTitle();

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public void setButtonTitle( String buttonTitle );

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public Boolean isExportJPG();

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public void setExportJPG( Boolean exportJPG );

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public Boolean isExportPDF();

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public void setExportPDF( Boolean exportPDF );

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public Boolean isExportPNG();

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public void setExportPNG( Boolean exportPNG );

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public Boolean isExportSVG();

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public void setExportSVG( Boolean exportSVG );

	/**
	 * Background color of a saved image
	 */
	public String getImageBackgroundColor();

	/**
	 * Background color of a saved image
	 */
	public void setImageBackgroundColor( String imageBackgroundColor );

	/**
	 * File name of a saved image.
	 */
	public String getImageFileName();

	/**
	 * File name of a saved image.
	 */
	public void setImageFileName( String imageFileName );

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public String getLeft();

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public void setLeft( String left );

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public String getRight();

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public void setRight( String right );

	/**
	 * Text roll-over color.
	 */
	public String getTextRollOverColor();

	/**
	 * Text roll-over color.
	 */
	public void setTextRollOverColor( String textRollOverColor );

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public String getTop();

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public void setTop( String top );

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public IsExportConfig getUserCFG();

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public void setUserCFG( IsExportConfig userCFG );
}
