package com.islam.retrofitsoap.webservice.response.tikxmk

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml


@Xml(name = "soap:Body")
class WeatherResponseBody {
    @Element(name = "getWeatherbyCityNameResponse")
    var getWeatherbyCityNameResponse: WeatherResponseModel? =
        null
}