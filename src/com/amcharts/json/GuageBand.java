package com.amcharts.json;

public final class GuageBand {
  private double alpha;
  private String balloonText;
  private String color;
  private double endValue;
  private String id;
  private String innerRadius;
  private String radius;
  private double startValue;
  /**
   * Opacity of band fill. Will use axis.bandAlpha if not set any.
   */
  public double getAlpha() {
    return alpha;
  }
  /**
   * Opacity of band fill. Will use axis.bandAlpha if not set any.
   */
  public void setAlpha(double alpha) {
    this.alpha=alpha;
  }
  /**
   * "When rolled-over, band will display balloon if you set some text for this property."
   */
  public String getBalloonText() {
    return balloonText;
  }
  /**
   * "When rolled-over, band will display balloon if you set some text for this property."
   */
  public void setBalloonText(String balloonText) {
    this.balloonText=balloonText;
  }
  /**
   * Color of a band.
   */
  public String getColor() {
    return color;
  }
  /**
   * Color of a band.
   */
  public void setColor(String color) {
    this.color=color;
  }
  /**
   * End value of a fill.
   */
  public double getEndValue() {
    return endValue;
  }
  /**
   * End value of a fill.
   */
  public void setEndValue(double endValue) {
    this.endValue=endValue;
  }
  /**
   * Unique id of a band.
   */
  public String getId() {
    return id;
  }
  /**
   * Unique id of a band.
   */
  public void setId(String id) {
    this.id=id;
  }
  /**
   * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
   */
  public String getInnerRadius() {
    return innerRadius;
  }
  /**
   * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
   */
  public void setInnerRadius(String innerRadius) {
    this.innerRadius=innerRadius;
  }
  /**
   * "Band radius. If not set any, the band will start with the axis outline."
   */
  public String getRadius() {
    return radius;
  }
  /**
   * "Band radius. If not set any, the band will start with the axis outline."
   */
  public void setRadius(String radius) {
    this.radius=radius;
  }
  /**
   * Start value of a fill.
   */
  public double getStartValue() {
    return startValue;
  }
  /**
   * Start value of a fill.
   */
  public void setStartValue(double startValue) {
    this.startValue=startValue;
  }
}
