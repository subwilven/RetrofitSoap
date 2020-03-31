package com.islam.retrofitsoap.webservice.response.tikxmk

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.TextContent
import com.tickaroo.tikxml.annotation.Xml


@Xml(name = "getWeatherbyCityNameResult")
class WeatherResponseModel {
    @Element(name = "getWeatherbyCityNameResult")
    var result: List<StringWorkaround>? = null
}

@Xml(name = "string")
class StringWorkaround {
    @TextContent
    var string: String? = null
}