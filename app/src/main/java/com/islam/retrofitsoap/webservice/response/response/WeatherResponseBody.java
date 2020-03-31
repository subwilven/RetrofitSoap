package com.islam.retrofitsoap.webservice.response.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Body")
public class WeatherResponseBody {
    @Element(name = "getWeatherbyCityNameResponse", required = false)
    public WeatherResponseModel getWeatherbyCityNameResponse;
}
