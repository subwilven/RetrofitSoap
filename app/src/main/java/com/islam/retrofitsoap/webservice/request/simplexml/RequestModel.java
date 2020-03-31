package com.islam.retrofitsoap.webservice.request.simplexml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;


public class RequestModel {
    @Attribute(name = "xmlns")
    public String cityNameAttribute;

    @Element(name = "theCityName", required = false)
    public String theCityName;

}
