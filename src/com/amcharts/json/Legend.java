package com.amcharts.json;

import com.amcharts.api.IsLegend;

public class Legend implements IsLegend
{
	String markerType;

	String position;

	int marginRight;

	private boolean autoMargins;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getMarkerType()
	 */
	@Override
	public String getMarkerType()
	{
		return this.markerType;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setMarkerType(java.lang.String)
	 */
	@Override
	public void setMarkerType( String markerType )
	{
		this.markerType = markerType;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getPosition()
	 */
	@Override
	public String getPosition()
	{
		return this.position;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setPosition(java.lang.String)
	 */
	@Override
	public void setPosition( String position )
	{
		this.position = position;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getMarginRight()
	 */
	@Override
	public int getMarginRight()
	{
		return this.marginRight;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setMarginRight(int)
	 */
	@Override
	public void setMarginRight( int marginRight )
	{
		this.marginRight = marginRight;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#isAutoMargins()
	 */
	@Override
	public boolean isAutoMargins()
	{
		return this.autoMargins;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setAutoMargins(boolean)
	 */
	@Override
	public void setAutoMargins( boolean autoMargins )
	{
		this.autoMargins = autoMargins;
	}
}