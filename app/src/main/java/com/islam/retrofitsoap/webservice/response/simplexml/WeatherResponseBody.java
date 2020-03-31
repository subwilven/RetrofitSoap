package com.islam.retrofitsoap.webservice.response.simplexml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Body")
public class WeatherResponseBody {
    @Element(name = "getWeatherbyCityNameResponse")
    public WeatherResponseModel getWeatherbyCityNameResponse;
}
