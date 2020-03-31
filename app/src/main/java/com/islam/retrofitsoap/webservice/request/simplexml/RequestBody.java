package com.islam.retrofitsoap.webservice.request.simplexml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Body", strict = false)
public class RequestBody {

    @Element(name = "getWeatherbyCityName", required = false)
    public RequestModel getWeatherbyCityName;
}
