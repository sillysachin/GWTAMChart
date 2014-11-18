package com.amcharts.jso;

import com.amcharts.api.IsMenuItemStyle;
import com.google.gwt.core.client.JavaScriptObject;

public final class MenuItemStyleJSO extends JavaScriptObject implements IsMenuItemStyle
{
	protected MenuItemStyleJSO()
	{
	}

	public final native String getBackgroundColor() /*-{
		return backgroundColor;
	}-*/;

	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native double getOpacity() /*-{
		return opacity;
	}-*/;

	public final native void setOpacity( double opacity ) /*-{
		this.opacity = opacity;
	}-*/;

	public final native String getRollOverBackgroundColor() /*-{
		return rollOverBackgroundColor;
	}-*/;

	public final native void setRollOverBackgroundColor( String rollOverBackgroundColor ) /*-{
		this.rollOverBackgroundColor = rollOverBackgroundColor;
	}-*/;

	public final native String getColor() /*-{
		return color;
	}-*/;

	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	public final native String getRollOverColor() /*-{
		return rollOverColor;
	}-*/;

	public final native void setRollOverColor( String rollOverColor ) /*-{
		this.rollOverColor = rollOverColor;
	}-*/;

	public final native String getPaddingTop() /*-{
		return paddingTop;
	}-*/;

	public final native void setPaddingTop( String paddingTop ) /*-{
		this.paddingTop = paddingTop;
	}-*/;

	public final native String getPaddingRight() /*-{
		return paddingRight;
	}-*/;

	public final native void setPaddingRight( String paddingRight ) /*-{
		this.paddingRight = paddingRight;
	}-*/;

	public final native String getPaddingBottom() /*-{
		return paddingBottom;
	}-*/;

	public final native void setPaddingBottom( String paddingBottom ) /*-{
		this.paddingBottom = paddingBottom;
	}-*/;

	public final native String getPaddingLeft() /*-{
		return paddingLeft;
	}-*/;

	public final native void setPaddingLeft( String paddingLeft ) /*-{
		this.paddingLeft = paddingLeft;
	}-*/;

	public final native String getMarginTop() /*-{
		return marginTop;
	}-*/;

	public final native void setMarginTop( String marginTop ) /*-{
		this.marginTop = marginTop;
	}-*/;

	public final native String getMarginRight() /*-{
		return marginRight;
	}-*/;

	public final native void setMarginRight( String marginRight ) /*-{
		this.marginRight = marginRight;
	}-*/;

	public final native String getMarginBottom() /*-{
		return marginBottom;
	}-*/;

	public final native void setMarginBottom( String marginBottom ) /*-{
		this.marginBottom = marginBottom;
	}-*/;

	public final native String getMarginLeft() /*-{
		return marginLeft;
	}-*/;

	public final native void setMarginLeft( String marginLeft ) /*-{
		this.marginLeft = marginLeft;
	}-*/;

	public final native String getTextAlign() /*-{
		return textAlign;
	}-*/;

	public final native void setTextAlign( String textAlign ) /*-{
		this.textAlign = textAlign;
	}-*/;

	public final native String getTextDecoration() /*-{
		return textDecoration;
	}-*/;

	public final native void setTextDecoration( String textDecoration ) /*-{
		this.textDecoration = textDecoration;
	}-*/;

	public final native String getFontFamily() /*-{
		return fontFamily;
	}-*/;

	public final native void setFontFamily( String fontFamily ) /*-{
		this.fontFamily = fontFamily;
	}-*/;

	public final native String getFontSize() /*-{
		return fontSize;
	}-*/;

	public final native void setFontSize( String fontSize ) /*-{
		this.fontSize = fontSize;
	}-*/;
}
