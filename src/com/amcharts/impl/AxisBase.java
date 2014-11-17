package com.amcharts.impl;

import java.util.List;

import com.amcharts.api.IsAxisBase;
import com.amcharts.api.IsGuide;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.mouse.columnchart.AxisBaseChartEventUtils;
import com.amcharts.impl.event.mouse.columnchart.ClickItemEvent;
import com.amcharts.impl.event.mouse.columnchart.ClickItemHandler;
import com.amcharts.impl.event.mouse.columnchart.HasClickItemHandlers;
import com.amcharts.impl.event.mouse.columnchart.HasRollOutItemHandlers;
import com.amcharts.impl.event.mouse.columnchart.HasRollOverItemHandlers;
import com.amcharts.impl.event.mouse.columnchart.RollOutItemEvent;
import com.amcharts.impl.event.mouse.columnchart.RollOutItemHandler;
import com.amcharts.impl.event.mouse.columnchart.RollOverItemEvent;
import com.amcharts.impl.event.mouse.columnchart.RollOverItemHandler;
import com.amcharts.jso.AxisBaseJSO;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

public class AxisBase implements IsAxisBase, HasClickItemHandlers, HasRollOutItemHandlers, HasRollOverItemHandlers
{
	protected AxisBaseJSO jso;

	private HandlerManager handlerManager;

	/**
	 * 'Specifies whether number of gridCount is specified automatically, according to the axis size.'
	 */
	public final native boolean isAutoGridCount() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.autoGridCount;
	}-*/;

	/**
	 * 'Specifies whether number of gridCount is specified automatically, according to the axis size.'
	 */
	public final native void setAutoGridCount( boolean autoGridCount ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.autoGridCount = autoGridCount;
	}-*/;

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public final native double getAxisAlpha() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.axisAlpha;
	}-*/;

	/**
	 * Axis opacity. Value range is 0 - 1.
	 */
	public final native void setAxisAlpha( double axisAlpha ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.axisAlpha = axisAlpha;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native String getAxisColor() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.axisColor;
	}-*/;

	/**
	 * Axis color.
	 */
	public final native void setAxisColor( String axisColor ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.axisColor = axisColor;
	}-*/;

	/**
	 * Thickness of the axis.
	 */
	public final native double getAxisThickness() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.axisThickness;
	}-*/;

	/**
	 * Thickness of the axis.
	 */
	public final native void setAxisThickness( double axisThickness ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.axisThickness = axisThickness;
	}-*/;

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public final native double getAxisX() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.axisX;
	}-*/;

	/**
	 * Read-only. Returns x coordinate of the axis.
	 */
	public final native void setAxisX( double axisX ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.axisX = axisX;
	}-*/;

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public final native double getAxisY() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.axisY;
	}-*/;

	/**
	 * Read-only. Returns y coordinate of the axis.
	 */
	public final native void setAxisY( double axisY ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.axisY = axisY;
	}-*/;

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public final native boolean isBoldLabels() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.boldLabels;
	}-*/;

	/**
	 * Specifies if axis labels should be bold or not.
	 */
	public final native void setBoldLabels( boolean boldLabels ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.boldLabels = boldLabels;
	}-*/;

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.color;
	}-*/;

	/**
	 * Color of axis value labels. Will use chart's color if not set.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.color = color;
	}-*/;

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public final native double getDashLength() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.dashLength;
	}-*/;

	/**
	 * Length of a dash. 0 means line is not dashed.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.dashLength = dashLength;
	}-*/;

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native double getFillAlpha() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.fillAlpha;
	}-*/;

	/**
	 * Fill opacity. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native String getFillColor() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.fillColor;
	}-*/;

	/**
	 * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than 0 to see the fills.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.fillColor = fillColor;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native double getFontSize() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.fontSize;
	}-*/;

	/**
	 * Size of value labels text. Will use chart's fontSize if not set.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.fontSize = fontSize;
	}-*/;

	/**
	 * Opacity of grid lines.
	 */
	public final native double getGridAlpha() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.gridAlpha;
	}-*/;

	/**
	 * Opacity of grid lines.
	 */
	public final native void setGridAlpha( double gridAlpha ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.gridAlpha = gridAlpha;
	}-*/;

	/**
	 * Color of grid lines.
	 */
	public final native String getGridColor() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.gridColor;
	}-*/;

	/**
	 * Color of grid lines.
	 */
	public final native void setGridColor( String gridColor ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.gridColor = gridColor;
	}-*/;

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public final native double getGridCount() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.gridCount;
	}-*/;

	/**
	 * 'Number of grid lines. In case this is value axis, or your categoryAxis parses dates, the number is approximate. The default value is 5. If you set autoGridCount to true, this property is ignored.'
	 */
	public final native void setGridCount( double gridCount ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.gridCount = gridCount;
	}-*/;

	/**
	 * Thickness of grid lines.
	 */
	public final native double getGridThickness() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.gridThickness;
	}-*/;

	/**
	 * Thickness of grid lines.
	 */
	public final native void setGridThickness( double gridThickness ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.gridThickness = gridThickness;
	}-*/;

	/**
	 * The array of guides belonging to this axis.
	 */
	public final native List<IsGuide> getGuides() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.guides;
	}-*/;

	/**
	 * The array of guides belonging to this axis.
	 */
	public final native void setGuides( List<IsGuide> guides ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.guides = guides;
	}-*/;

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public final native boolean isIgnoreAxisWidth() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.ignoreAxisWidth;
	}-*/;

	/**
	 * 'If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin, set ignoreAxisWidth to true.'
	 */
	public final native void setIgnoreAxisWidth( boolean ignoreAxisWidth ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.ignoreAxisWidth = ignoreAxisWidth;
	}-*/;

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public final native boolean isInside() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.inside;
	}-*/;

	/**
	 * Specifies whether values should be placed inside or outside plot area.
	 */
	public final native void setInside( boolean inside ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.inside = inside;
	}-*/;

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public final native double getLabelFrequency() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.labelFrequency;
	}-*/;

	/**
	 * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
	 */
	public final native void setLabelFrequency( double labelFrequency ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.labelFrequency = labelFrequency;
	}-*/;

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public final native double getLabelOffset() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.labelOffset;
	}-*/;

	/**
	 * You can use it to adjust position of axes labels. Works both with CategoryAxis and ValueAxis.
	 */
	public final native void setLabelOffset( double labelOffset ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.labelOffset = labelOffset;
	}-*/;

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public final native double getLabelRotation() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.labelRotation;
	}-*/;

	/**
	 * 'Rotation angle of a label. Only horizontal axis' values can be rotated. If you set this for vertical axis, the setting will be ignored. Possible values from -90 to 90.'
	 */
	public final native void setLabelRotation( double labelRotation ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.labelRotation = labelRotation;
	}-*/;

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public final native boolean isLabelsEnabled() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.labelsEnabled;
	}-*/;

	/**
	 * Specifies whether axis displays category axis' labels and value axis' values.
	 */
	public final native void setLabelsEnabled( boolean labelsEnabled ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.labelsEnabled = labelsEnabled;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public final native double getMinHorizontalGap() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.minHorizontalGap;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell width required for one span between grid lines.
	 */
	public final native void setMinHorizontalGap( double minHorizontalGap ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.minHorizontalGap = minHorizontalGap;
	}-*/;

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public final native double getMinorGridAlpha() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.minorGridAlpha;
	}-*/;

	/**
	 * 'Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.'
	 */
	public final native void setMinorGridAlpha( double minorGridAlpha ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.minorGridAlpha = minorGridAlpha;
	}-*/;

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public final native boolean isMinorGridEnabled() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.minorGridEnabled;
	}-*/;

	/**
	 * Specifies if minor grid should be displayed.
	 */
	public final native void setMinorGridEnabled( boolean minorGridEnabled ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.minorGridEnabled = minorGridEnabled;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public final native double getMinVerticalGap() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.minVerticalGap;
	}-*/;

	/**
	 * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height required for one span between grid lines.
	 */
	public final native void setMinVerticalGap( double minVerticalGap ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.minVerticalGap = minVerticalGap;
	}-*/;

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public final native double getOffset() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.offset;
	}-*/;

	/**
	 * 'The distance of the axis to the plot area, in pixels. Negative values can also be used.'
	 */
	public final native void setOffset( double offset ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.offset = offset;
	}-*/;

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public final native String getPosition() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.position;
	}-*/;

	/**
	 * 'Possible values are: ''top'', ''bottom'', ''left'', ''right''. If axis is vertical, default position is ''left''. If axis is horizontal, default position is ''bottom''.'
	 */
	public final native void setPosition( String position ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.position = position;
	}-*/;

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public final native boolean isShowFirstLabel() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.showFirstLabel;
	}-*/;

	/**
	 * 'Whether to show first axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide first label.'
	 */
	public final native void setShowFirstLabel( boolean showFirstLabel ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.showFirstLabel = showFirstLabel;
	}-*/;

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public final native boolean isShowLastLabel() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.showLastLabel;
	}-*/;

	/**
	 * 'Whether to show last axis label or not. This works properly only on ValueAxis. With CategoryAxis it wont work 100 percent, it depends on the period, zooming, etc. There is no guaranteed way to force category axis to show or hide last label.'
	 */
	public final native void setShowLastLabel( boolean showLastLabel ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.showLastLabel = showLastLabel;
	}-*/;

	/**
	 * Length of the tick marks.
	 */
	public final native double getTickLength() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.tickLength;
	}-*/;

	/**
	 * Length of the tick marks.
	 */
	public final native void setTickLength( double tickLength ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.tickLength = tickLength;
	}-*/;

	/**
	 * Title of the axis.
	 */
	public final native String getTitle() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.title;
	}-*/;

	/**
	 * Title of the axis.
	 */
	public final native void setTitle( String title ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.title = title;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native boolean isTitleBold() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.titleBold;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native void setTitleBold( boolean titleBold ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.titleBold = titleBold;
	}-*/;

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public final native String getTitleColor() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.titleColor;
	}-*/;

	/**
	 * Color of axis title. Will use text color of chart if not set any.
	 */
	public final native void setTitleColor( String titleColor ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.titleColor = titleColor;
	}-*/;

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public final native double getTitleFontSize() /*-{
		return this.@com.amcharts.impl.AxisBase::jso.titleFontSize;
	}-*/;

	/**
	 * Font size of axis title. Will use font size of chart plus two pixels if not set any.
	 */
	public final native void setTitleFontSize( double titleFontSize ) /*-{
		this.@com.amcharts.impl.AxisBase::jso.titleFontSize = titleFontSize;
	}-*/;

	public native void addGuide( Guide guide ) /*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var guide = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(guide)
		axisBase.addGuide(guide);
	}-*/;

	public native void removeGuide( Guide guide ) /*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var guide = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(guide)
		axisBase.removeGuide(guide);
	}-*/;

	/**
	 * Adds event listener to the object.
	 * type - string like 'axisChanged' (should be listed in 'events' section of this class or classes which extend this class). 
	 * handler - function which is called when event happens.
	 */
	public native void addListener( String eventName, AmChartListener amChartListener )
	/*-{
		var axisBase = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var axisBaseThis = this;
		console.log('addListener - > ' + eventName);
		axisBase
				.addListener(
						eventName,
						function(event) {
							axisBaseThis.@com.amcharts.impl.AxisBase::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(amChartListener,event);
							if (event.event == undefined) {
								console.log('Non Dom Event - > ' + event.type);
							} else {
								console.log('Dom Event - > ' + event.type);
							}
						});
	}-*/;

	public void handleListener( AmChartListener amChartListener, AmChartEventJSO event )
	{
		amChartListener.function( event );
	}

	protected native void initListener( String eventName )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var amChartThis = this;
		if (chart[eventName + 'Fl'] == undefined) {
			chart[eventName + 'Fl'] = true;
			chart
					.addListener(
							eventName,
							function(event) {
								console.log('AxisBaseEvents fireEvent -> ');
								console.log(event);
								amChartThis.@com.amcharts.impl.AxisBase::fireEvent(Lcom/amcharts/impl/event/AmChartEventJSO;)(event);
							});
			console.log('initialized -> ' + eventName + ' : '
					+ chart[eventName + 'Fl']);
		} else {
			console.log('skip initialized -> ' + eventName + ' : '
					+ chart[eventName + 'Fl']);
		}
	}-*/;

	public final <H extends EventHandler> HandlerRegistration addHandler( final H handler, GwtEvent.Type<H> type )
	{
		return ensureHandlers().addHandler( type, handler );
	}

	HandlerManager ensureHandlers()
	{
		return handlerManager == null ? handlerManager = createHandlerManager() : handlerManager;
	}

	protected HandlerManager createHandlerManager()
	{
		return new HandlerManager( this );
	}

	protected void fireEvent( AmChartEventJSO event )
	{
		GwtEvent< ? > createEvent = AxisBaseChartEventUtils.createEvent( event );
		if ( createEvent == null )
		{
			//TODO: When the event is not in AxisBaseChartEventUtils list then look where?
			GWT.log( "AxisBase cannot process -> " + event.getEvent().getType() );
		}
		else
		{
			if ( handlerManager != null )
			{
				handlerManager.fireEvent( createEvent );
			}
		}
	}

	@Override
	public void fireEvent( GwtEvent< ? > event )
	{
		if ( handlerManager != null )
		{
			handlerManager.fireEvent( event );
		}
	}

	@Override
	public HandlerRegistration addRollOverItemHandler( RollOverItemHandler handler )
	{
		initListener( RollOverItemEvent.getName() );
		return addHandler( handler, RollOverItemEvent.TYPE );
	}

	@Override
	public HandlerRegistration addRollOutItemHandler( RollOutItemHandler handler )
	{
		initListener( RollOutItemEvent.getName() );
		return addHandler( handler, RollOutItemEvent.TYPE );
	}

	@Override
	public HandlerRegistration addClickItemHandler( ClickItemHandler handler )
	{
		initListener( ClickItemEvent.getName() );
		return addHandler( handler, ClickItemEvent.TYPE );
	}
}