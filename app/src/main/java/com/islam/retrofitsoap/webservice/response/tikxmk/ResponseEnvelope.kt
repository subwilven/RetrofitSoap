package com.islam.retrofitsoap.webservice.response.tikxmk

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml


@Xml(name = "soap:Envelope",
    writeNamespaces = ["soap=http://schemas.xmlsoap.org/soap/envelope/",
        "xsi=http://www.w3.org/2001/XMLSchema-instance",
        "xsd=http://www.w3.org/2001/XMLSchema"])
class ResponseEnvelope {
    @Element(name = "soap:Body")
    var body: WeatherResponseBody? = null
}