package com.amcharts.jso;

import com.amcharts.api.IsAmFunnelChart;

public class AmFunnelChartJSO extends AmSlicedChartJSO implements IsAmFunnelChart
{
	protected AmFunnelChartJSO()
	{
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getBaseWidth()
	 */
	@Override
	public native final String getBaseWidth()
	/*-{
		return this.baseWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setBaseWidth(java.lang.String)
	 */
	@Override
	public native final void setBaseWidth( String baseWidth )
	/*-{
		this.baseWidth = baseWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setFunnelAlpha(java.lang.String)
	 */
	@Override
	public native final void setFunnelAlpha( double funnelAlpha )
	/*-{
		this.funnelAlpha = funnelAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getFunnelAlpha()
	 */
	@Override
	public native final double getFunnelAlpha()
	/*-{
		return this.funnelAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getLabelPosition()
	 */
	@Override
	public native final String getLabelPosition()
	/*-{
		return this.labelPosition;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setLabelPosition(java.lang.String)
	 */
	@Override
	public native final void setLabelPosition( String labelPosition )
	/*-{
		this.labelPosition = labelPosition;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckHeight()
	 */
	@Override
	public native final String getNeckHeight()
	/*-{
		return this.neckHeight;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckHeight(java.lang.String)
	 */
	@Override
	public native final void setNeckHeight( String neckHeight )
	/*-{
		this.neckHeight = neckHeight;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getNeckWidth()
	 */
	@Override
	public native final String getNeckWidth()
	/*-{
		return this.neckWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setNeckWidth(java.lang.String)
	 */
	@Override
	public native final void setNeckWidth( String neckWidth )
	/*-{
		this.neckWidth = neckWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getPullDistance()
	 */
	@Override
	public native final String getPullDistance()
	/*-{
		return this.pullDistance;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setPullDistance(java.lang.String)
	 */
	@Override
	public native final void setPullDistance( String pullDistance )
	/*-{
		this.pullDistance = pullDistance;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#isRotate()
	 */
	@Override
	public native final Boolean isRotate()
	/*-{
		return this.rotate;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setRotate(Boolean)
	 */
	@Override
	public native final void setRotate( Boolean rotate )
	/*-{
		this.rotate = rotate;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartX()
	 */
	@Override
	public native final double getStartX()
	/*-{
		return this.startX;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartX(double)
	 */
	@Override
	public native final void setStartX( double startX )
	/*-{
		this.startX = startX;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getStartY()
	 */
	@Override
	public native final double getStartY()
	/*-{
		return this.startY;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setStartY(double)
	 */
	@Override
	public native final void setStartY( double startY )
	/*-{
		this.startY = startY;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#getValueRepresents()
	 */
	@Override
	public native final String getValueRepresents()
	/*-{
		return this.valueRepresents;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmFunnelChart#setValueRepresents(java.lang.String)
	 */
	@Override
	public native final void setValueRepresents( String valueRepresents )
	/*-{
		this.valueRepresents = valueRepresents;
	}-*/;
}