package com.islam.retrofitsoap.webservice.response.simplexml;



import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name = "getWeatherbyCityNameResponse")
@Namespace(reference = "http://WebXml.com.cn/")
public class WeatherResponseModel {
    @ElementList(name = "getWeatherbyCityNameResult")
    public List<String> result;
}
