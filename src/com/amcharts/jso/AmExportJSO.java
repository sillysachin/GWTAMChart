package com.amcharts.jso;

import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsExportConfig;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmExportJSO extends JavaScriptObject implements IsAmExport
{
	protected AmExportJSO()
	{
	}

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public final native String getBottom() /*-{
		return bottom;
	}-*/;

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public final native void setBottom( String bottom ) /*-{
		this.bottom = bottom;
	}-*/;

	/**
	 * Opacity of a button.
	 */
	public final native double getButtonAlpha() /*-{
		return buttonAlpha;
	}-*/;

	/**
	 * Opacity of a button.
	 */
	public final native void setButtonAlpha( double buttonAlpha ) /*-{
		this.buttonAlpha = buttonAlpha;
	}-*/;

	/**
	 * Name of export button image.
	 */
	public final native String getButtonIcon() /*-{
		return buttonIcon;
	}-*/;

	/**
	 * Name of export button image.
	 */
	public final native void setButtonIcon( String buttonIcon ) /*-{
		this.buttonIcon = buttonIcon;
	}-*/;

	/**
	 * Roll-over color of button background.
	 */
	public final native String getButtonRollOverColor() /*-{
		return buttonRollOverColor;
	}-*/;

	/**
	 * Roll-over color of button background.
	 */
	public final native void setButtonRollOverColor( String buttonRollOverColor ) /*-{
		this.buttonRollOverColor = buttonRollOverColor;
	}-*/;

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public final native String getButtonTitle() /*-{
		return buttonTitle;
	}-*/;

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public final native void setButtonTitle( String buttonTitle ) /*-{
		this.buttonTitle = buttonTitle;
	}-*/;

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public final native Boolean isExportJPG() /*-{
		return exportJPG;
	}-*/;

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public final native void setExportJPG( Boolean exportJPG ) /*-{
		this.exportJPG = exportJPG;
	}-*/;

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public final native Boolean isExportPDF() /*-{
		return exportPDF;
	}-*/;

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public final native void setExportPDF( Boolean exportPDF ) /*-{
		this.exportPDF = exportPDF;
	}-*/;

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public final native Boolean isExportPNG() /*-{
		return exportPNG;
	}-*/;

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public final native void setExportPNG( Boolean exportPNG ) /*-{
		this.exportPNG = exportPNG;
	}-*/;

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public final native Boolean isExportSVG() /*-{
		return exportSVG;
	}-*/;

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public final native void setExportSVG( Boolean exportSVG ) /*-{
		this.exportSVG = exportSVG;
	}-*/;

	/**
	 * Background color of a saved image
	 */
	public final native String getImageBackgroundColor() /*-{
		return imageBackgroundColor;
	}-*/;

	/**
	 * Background color of a saved image
	 */
	public final native void setImageBackgroundColor( String imageBackgroundColor ) /*-{
		this.imageBackgroundColor = imageBackgroundColor;
	}-*/;

	/**
	 * File name of a saved image.
	 */
	public final native String getImageFileName() /*-{
		return imageFileName;
	}-*/;

	/**
	 * File name of a saved image.
	 */
	public final native void setImageFileName( String imageFileName ) /*-{
		this.imageFileName = imageFileName;
	}-*/;

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public final native String getLeft() /*-{
		return left;
	}-*/;

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public final native void setLeft( String left ) /*-{
		this.left = left;
	}-*/;

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public final native String getRight() /*-{
		return right;
	}-*/;

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public final native void setRight( String right ) /*-{
		this.right = right;
	}-*/;

	/**
	 * Text roll-over color.
	 */
	public final native String getTextRollOverColor() /*-{
		return textRollOverColor;
	}-*/;

	/**
	 * Text roll-over color.
	 */
	public final native void setTextRollOverColor( String textRollOverColor ) /*-{
		this.textRollOverColor = textRollOverColor;
	}-*/;

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public final native String getTop() /*-{
		return top;
	}-*/;

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public final native void setTop( String top ) /*-{
		this.top = top;
	}-*/;

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public final native IsExportConfig getUserCFG() /*-{
		return userCFG;
	}-*/;

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public final native void setUserCFG( IsExportConfig userCFG ) /*-{
		this.userCFG = userCFG;
	}-*/;
}
