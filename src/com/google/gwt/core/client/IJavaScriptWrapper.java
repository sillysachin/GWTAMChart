package com.google.gwt.core.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * All classes that intend to expose the JavaScriptObject via wrapping should implement this interface.
 * 
 * @author JGraph
 * @param <J>
 *
 */
public interface IJavaScriptWrapper<J extends JavaScriptObject>
{

	/**
	 * Gets the wrapped object from this wrapper.
	 * 
	 * @return wrapped JavaScriptObject
	 */
	J getJso();

	/**
	 * Sets the wrapped object to this wrapper.
	 * 
	 * @param jso
	 *            JavaScriptObject that will get wrapped.
	 */
	void setJso( J jso );
}