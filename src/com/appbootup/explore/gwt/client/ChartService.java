package com.appbootup.explore.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath( "chart" )
public interface ChartService extends RemoteService
{
	String getData( String name ) throws IllegalArgumentException;
}
