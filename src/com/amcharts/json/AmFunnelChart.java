package com.amcharts.json;

import com.amcharts.api.IsAmFunnelChart;

public class AmFunnelChart extends AmSlicedChart implements IsAmFunnelChart
{
	private String baseWidth;

	private double funnelAlpha;

	private String labelPosition;

	private String neckHeight;

	private String neckWidth;

	private String pullDistance;

	private boolean rotate;

	private double startX;

	private double startY;

	private String valueRepresents;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getBaseWidth()
	 */
	@Override
	public String getBaseWidth()
	{
		return baseWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setBaseWidth(java.lang.String)
	 */
	@Override
	public void setBaseWidth( String baseWidth )
	{
		this.baseWidth = baseWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setFunnelAlpha(java.lang.String)
	 */
	@Override
	public void setFunnelAlpha( double funnelAlpha )
	{
		this.funnelAlpha = funnelAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getFunnelAlpha()
	 */
	@Override
	public double getFunnelAlpha()
	{
		return this.funnelAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getLabelPosition()
	 */
	@Override
	public String getLabelPosition()
	{
		return labelPosition;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setLabelPosition(java.lang.String)
	 */
	@Override
	public void setLabelPosition( String labelPosition )
	{
		this.labelPosition = labelPosition;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckHeight()
	 */
	@Override
	public String getNeckHeight()
	{
		return neckHeight;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckHeight(java.lang.String)
	 */
	@Override
	public void setNeckHeight( String neckHeight )
	{
		this.neckHeight = neckHeight;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckWidth()
	 */
	@Override
	public String getNeckWidth()
	{
		return neckWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckWidth(java.lang.String)
	 */
	@Override
	public void setNeckWidth( String neckWidth )
	{
		this.neckWidth = neckWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getPullDistance()
	 */
	@Override
	public String getPullDistance()
	{
		return pullDistance;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setPullDistance(java.lang.String)
	 */
	@Override
	public void setPullDistance( String pullDistance )
	{
		this.pullDistance = pullDistance;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#isRotate()
	 */
	@Override
	public boolean isRotate()
	{
		return rotate;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setRotate(boolean)
	 */
	@Override
	public void setRotate( boolean rotate )
	{
		this.rotate = rotate;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartX()
	 */
	@Override
	public double getStartX()
	{
		return startX;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartX(double)
	 */
	@Override
	public void setStartX( double startX )
	{
		this.startX = startX;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartY()
	 */
	@Override
	public double getStartY()
	{
		return startY;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartY(double)
	 */
	@Override
	public void setStartY( double startY )
	{
		this.startY = startY;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getValueRepresents()
	 */
	@Override
	public String getValueRepresents()
	{
		return valueRepresents;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setValueRepresents(java.lang.String)
	 */
	@Override
	public void setValueRepresents( String valueRepresents )
	{
		this.valueRepresents = valueRepresents;
	}
}