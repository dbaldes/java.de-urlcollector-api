package de.throughput.urlcollector.api;

import java.io.Serializable;

/**
 * URL message.
 * 
 * @author db
 */
public class UrlMessage implements Serializable {
  
  public static final String TOPIC_EXCHANGE_NAME = "url-exchange";
  public static final String ROUTING_KEY = "routing.urls";

  private static final long serialVersionUID = 1L;
  
  private String url;
  private String source;
  private String information;

  public UrlMessage() {
  }
  
  public UrlMessage(String url, String source, String information) {
    this.url = url;
    this.source = source;
    this.information = information;
  }

  public String getUrl() {
    return url;
  }

  public String getSource() {
    return source;
  }

  public String getInformation() {
    return information;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void setInformation(String information) {
    this.information = information;
  }

  @Override
  public String toString() {
    return "UrlMessage [url=" + url + ", source=" + source + ", information='" + information + "']";
  }
}
