package com.amcharts.impl;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsTitle;
import com.amcharts.api.IsValueAxis;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class ValueAxis extends AxisBase implements IsValueAxis, IJavaScriptWrapper<JavaScriptObject>
{
	JavaScriptObject jso;

	public ValueAxis()
	{
		jso = createJso();
	}

	public JavaScriptObject getJso()
	{
		return jso;
	}

	public void setJso( JavaScriptObject jso )
	{
		this.jso = jso;
	}

	public native JavaScriptObject createJso()
	/*-{
		var valueAxis = new $wnd.AmCharts.ValueAxis();
		return valueAxis;
	}-*/;

	@Override
	public native IsTitle getTitle() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.title;
	}-*/;

	@Override
	public native void setTitle( IsTitle title ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.title = title;
	}-*/;

	@Override
	public native AxisPosition getPosition() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.position;
	}-*/;

	@Override
	public native void setPosition( AxisPosition position ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.position = position;
	}-*/;

	public native int getTickLength() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.tickLength;
	}-*/;

	public native void setTickLength( int tickLength ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.tickLength = tickLength;
	}-*/;

	public native double getAxisAlpha() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.axisAlpha;
	}-*/;

	public native void setAxisAlpha( double axisAlpha ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.axisAlpha = axisAlpha;
	}-*/;

	public native boolean isShowFirstLabel() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.showFirstLabel;
	}-*/;

	public native void setShowFirstLabel( boolean showFirstLabel ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.showFirstLabel = showFirstLabel;
	}-*/;

	public native boolean isShowLastLabel() /*-{
		return this.@com.amcharts.impl.ValueAxis::jso.showLastLabel;
	}-*/;

	public native void setShowLastLabel( boolean showLastLabel ) /*-{
		this.@com.amcharts.impl.ValueAxis::jso.showLastLabel = showLastLabel;
	}-*/;
}