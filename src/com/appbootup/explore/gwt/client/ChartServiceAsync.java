package com.appbootup.explore.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface ChartServiceAsync
{
	void getData( String input, AsyncCallback<String> callback ) throws IllegalArgumentException;
}
