package com.islam.retrofitsoap.webservice.request.tikxml

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml
class RequestModel {
    @Attribute(name = "xmlns")
    var cityNameAttribute: String? = null
    @PropertyElement(name = "theCityName")
    var theCityName: String? = null
}