package com.amcharts.impl.event;

import com.amcharts.jso.event.DataItemJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class DataItem implements IJavaScriptWrapper<DataItemJSO>
{
	private DataItemJSO jso;

	public native DataContext getDataContext() /*-{
		this.@com.amcharts.impl.event.DataItem::jso.dataContext.className = 'DataContext';
		var dataContext = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.amcharts.impl.event.DataItem::jso.dataContext)
		return dataContext;
	}-*/;

	public native void setDataContext( DataContext dataContext ) /*-{
		var varDataContext = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(dataContext)
		this.@com.amcharts.impl.AmChart::jso.dataContext = varDataContext;
	}-*/;

	@Override
	public DataItemJSO getJso()
	{
		return this.jso;
	}

	@Override
	public void setJso( DataItemJSO jso )
	{
		this.jso = jso;
	}
}