package com.islam.retrofitsoap.webservice.request.tikxml

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "soapenv:Body")
class RequestBody {
    @Element(name = "getWeatherbyCityName")
    var getWeatherbyCityName: RequestModel? = null
}