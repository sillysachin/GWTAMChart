package com.amcharts.impl;

import com.amcharts.api.IsAmExport;
import com.amcharts.api.IsExportConfig;
import com.amcharts.jso.AmExportJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class AmExport implements IJavaScriptWrapper<AmExportJSO>, IsAmExport
{
	private AmExportJSO jso;

	protected AmExport()
	{
		jso = createJso();
	}

	public AmExportJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmExportJSO jso )
	{
		this.jso = jso;
	}

	public native AmExportJSO createJso() /*-{
		return {};
	}-*/;

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public final native String getBottom() /*-{
		return this.@com.amcharts.impl.AmExport::jso.bottom;
	}-*/;

	/**
	 * Bottom position of export button. You might need to set top to undefined for this to work.
	 */
	public final native void setBottom( String bottom ) /*-{
		this.@com.amcharts.impl.AmExport::jso.bottom = bottom;
	}-*/;

	/**
	 * Opacity of a button.
	 */
	public final native double getButtonAlpha() /*-{
		return this.@com.amcharts.impl.AmExport::jso.buttonAlpha;
	}-*/;

	/**
	 * Opacity of a button.
	 */
	public final native void setButtonAlpha( double buttonAlpha ) /*-{
		this.@com.amcharts.impl.AmExport::jso.buttonAlpha = buttonAlpha;
	}-*/;

	/**
	 * Name of export button image.
	 */
	public final native String getButtonIcon() /*-{
		return this.@com.amcharts.impl.AmExport::jso.buttonIcon;
	}-*/;

	/**
	 * Name of export button image.
	 */
	public final native void setButtonIcon( String buttonIcon ) /*-{
		this.@com.amcharts.impl.AmExport::jso.buttonIcon = buttonIcon;
	}-*/;

	/**
	 * Roll-over color of button background.
	 */
	public final native String getButtonRollOverColor() /*-{
		return this.@com.amcharts.impl.AmExport::jso.buttonRollOverColor;
	}-*/;

	/**
	 * Roll-over color of button background.
	 */
	public final native void setButtonRollOverColor( String buttonRollOverColor ) /*-{
		this.@com.amcharts.impl.AmExport::jso.buttonRollOverColor = buttonRollOverColor;
	}-*/;

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public final native String getButtonTitle() /*-{
		return this.@com.amcharts.impl.AmExport::jso.buttonTitle;
	}-*/;

	/**
	 * "Text, displayed in a tool-tip."
	 */
	public final native void setButtonTitle( String buttonTitle ) /*-{
		this.@com.amcharts.impl.AmExport::jso.buttonTitle = buttonTitle;
	}-*/;

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public final native boolean isExportJPG() /*-{
		return this.@com.amcharts.impl.AmExport::jso.exportJPG;
	}-*/;

	/**
	 * Specifies if export of JPG should be enabled.
	 */
	public final native void setExportJPG( boolean exportJPG ) /*-{
		this.@com.amcharts.impl.AmExport::jso.exportJPG = exportJPG;
	}-*/;

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public final native boolean isExportPDF() /*-{
		return this.@com.amcharts.impl.AmExport::jso.exportPDF;
	}-*/;

	/**
	 * Specifies if export of PDF should be enabled.
	 */
	public final native void setExportPDF( boolean exportPDF ) /*-{
		this.@com.amcharts.impl.AmExport::jso.exportPDF = exportPDF;
	}-*/;

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public final native boolean isExportPNG() /*-{
		return this.@com.amcharts.impl.AmExport::jso.exportPNG;
	}-*/;

	/**
	 * Specifies if export of PNG should be enabled.
	 */
	public final native void setExportPNG( boolean exportPNG ) /*-{
		this.@com.amcharts.impl.AmExport::jso.exportPNG = exportPNG;
	}-*/;

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public final native boolean isExportSVG() /*-{
		return this.@com.amcharts.impl.AmExport::jso.exportSVG;
	}-*/;

	/**
	 * Specifies if export of SVG should be enabled.
	 */
	public final native void setExportSVG( boolean exportSVG ) /*-{
		this.@com.amcharts.impl.AmExport::jso.exportSVG = exportSVG;
	}-*/;

	/**
	 * Background color of a saved image
	 */
	public final native String getImageBackgroundColor() /*-{
		return this.@com.amcharts.impl.AmExport::jso.imageBackgroundColor;
	}-*/;

	/**
	 * Background color of a saved image
	 */
	public final native void setImageBackgroundColor( String imageBackgroundColor ) /*-{
		this.@com.amcharts.impl.AmExport::jso.imageBackgroundColor = imageBackgroundColor;
	}-*/;

	/**
	 * File name of a saved image.
	 */
	public final native String getImageFileName() /*-{
		return this.@com.amcharts.impl.AmExport::jso.imageFileName;
	}-*/;

	/**
	 * File name of a saved image.
	 */
	public final native void setImageFileName( String imageFileName ) /*-{
		this.@com.amcharts.impl.AmExport::jso.imageFileName = imageFileName;
	}-*/;

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public final native String getLeft() /*-{
		return this.@com.amcharts.impl.AmExport::jso.left;
	}-*/;

	/**
	 * Left position of export button. You might need to set right to undefined for this to work.
	 */
	public final native void setLeft( String left ) /*-{
		this.@com.amcharts.impl.AmExport::jso.left = left;
	}-*/;

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public final native String getRight() /*-{
		return this.@com.amcharts.impl.AmExport::jso.right;
	}-*/;

	/**
	 * Right position of export button. You might need to set left to undefined for this to work.
	 */
	public final native void setRight( String right ) /*-{
		this.@com.amcharts.impl.AmExport::jso.right = right;
	}-*/;

	/**
	 * Text roll-over color.
	 */
	public final native String getTextRollOverColor() /*-{
		return this.@com.amcharts.impl.AmExport::jso.textRollOverColor;
	}-*/;

	/**
	 * Text roll-over color.
	 */
	public final native void setTextRollOverColor( String textRollOverColor ) /*-{
		this.@com.amcharts.impl.AmExport::jso.textRollOverColor = textRollOverColor;
	}-*/;

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public final native String getTop() /*-{
		return this.@com.amcharts.impl.AmExport::jso.top;
	}-*/;

	/**
	 * Top position of export button. You might need to set bottom to undefined for this to work.
	 */
	public final native void setTop( String top ) /*-{
		this.@com.amcharts.impl.AmExport::jso.top = top;
	}-*/;

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public final native IsExportConfig getUserCFG() /*-{
		return this.@com.amcharts.impl.AmExport::jso.userCFG;
	}-*/;

	/**
	 * advanced configration object AmChart.exportConfig
	 */
	public final native void setUserCFG( IsExportConfig userCFG ) /*-{
		this.@com.amcharts.impl.AmExport::jso.userCFG = userCFG;
	}-*/;

	/**
	 * setup for the ouput; callback - function to handle the output converts the chart to the given format
	 * Example: chart.AmExport.output({ format: 'png', output: 'datastring' }, function(blob) {};
	 */
	public final native void output( ExportConfig exportConfig, ExportCallback callback ) /*-{
		var amExport = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var varExportConfig = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(exportConfig)
		var functionCallback = function(blob) {
			@com.amcharts.impl.ExportCallback::execute(Lcom/amcharts/impl/ExportCallback;)(callback);
		};
		return amExport.output(varExportConfig, functionCallback);
	}-*/;

}