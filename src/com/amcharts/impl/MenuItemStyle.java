package com.amcharts.impl;

import com.amcharts.api.IsMenuItemStyle;
import com.amcharts.jso.MenuItemStyleJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class MenuItemStyle implements IJavaScriptWrapper<MenuItemStyleJSO>, IsMenuItemStyle
{
	private MenuItemStyleJSO jso;

	protected MenuItemStyle()
	{
		jso = createJso();
	}

	public MenuItemStyleJSO getJso()
	{
		return this.jso;
	}

	public void setJso( MenuItemStyleJSO jso )
	{
		this.jso = jso;
	}

	public native MenuItemStyleJSO createJso() /*-{
		return {};
	}-*/;

	public final native String getBackgroundColor() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.backgroundColor;
	}-*/;

	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.backgroundColor = backgroundColor;
	}-*/;

	public final native double getOpacity() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.opacity;
	}-*/;

	public final native void setOpacity( double opacity ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.opacity = opacity;
	}-*/;

	public final native String getRollOverBackgroundColor() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.rollOverBackgroundColor;
	}-*/;

	public final native void setRollOverBackgroundColor( String rollOverBackgroundColor ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.rollOverBackgroundColor = rollOverBackgroundColor;
	}-*/;

	public final native String getColor() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.color;
	}-*/;

	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.color = color;
	}-*/;

	public final native String getRollOverColor() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.rollOverColor;
	}-*/;

	public final native void setRollOverColor( String rollOverColor ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.rollOverColor = rollOverColor;
	}-*/;

	public final native String getPaddingTop() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.paddingTop;
	}-*/;

	public final native void setPaddingTop( String paddingTop ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.paddingTop = paddingTop;
	}-*/;

	public final native String getPaddingRight() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.paddingRight;
	}-*/;

	public final native void setPaddingRight( String paddingRight ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.paddingRight = paddingRight;
	}-*/;

	public final native String getPaddingBottom() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.paddingBottom;
	}-*/;

	public final native void setPaddingBottom( String paddingBottom ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.paddingBottom = paddingBottom;
	}-*/;

	public final native String getPaddingLeft() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.paddingLeft;
	}-*/;

	public final native void setPaddingLeft( String paddingLeft ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.paddingLeft = paddingLeft;
	}-*/;

	public final native String getMarginTop() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.marginTop;
	}-*/;

	public final native void setMarginTop( String marginTop ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.marginTop = marginTop;
	}-*/;

	public final native String getMarginRight() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.marginRight;
	}-*/;

	public final native void setMarginRight( String marginRight ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.marginRight = marginRight;
	}-*/;

	public final native String getMarginBottom() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.marginBottom;
	}-*/;

	public final native void setMarginBottom( String marginBottom ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.marginBottom = marginBottom;
	}-*/;

	public final native String getMarginLeft() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.marginLeft;
	}-*/;

	public final native void setMarginLeft( String marginLeft ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.marginLeft = marginLeft;
	}-*/;

	public final native String getTextAlign() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.textAlign;
	}-*/;

	public final native void setTextAlign( String textAlign ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.textAlign = textAlign;
	}-*/;

	public final native String getTextDecoration() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.textDecoration;
	}-*/;

	public final native void setTextDecoration( String textDecoration ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.textDecoration = textDecoration;
	}-*/;

	public final native String getFontFamily() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.fontFamily;
	}-*/;

	public final native void setFontFamily( String fontFamily ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.fontFamily = fontFamily;
	}-*/;

	public final native String getFontSize() /*-{
		return this.@com.amcharts.impl.MenuItemStyle::jso.fontSize;
	}-*/;

	public final native void setFontSize( String fontSize ) /*-{
		this.@com.amcharts.impl.MenuItemStyle::jso.fontSize = fontSize;
	}-*/;
}