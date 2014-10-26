package com.amcharts.impl;

public class AxisBase {
	public native void addGuide(Guide guide) /*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var guide = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(guide)
		axisBase.addGuide(guide);
	}-*/;

	public native void removeGuide(Guide guide) /*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var guide = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(guide)
		axisBase.removeGuide(guide);
	}-*/;
}
