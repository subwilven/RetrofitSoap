package com.islam.retrofitsoap.webservice.request.tikxml

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml

@Xml(
    name = "soapenv:Envelope",
    writeNamespaces = ["xsi=http://www.w3.org/2001/XMLSchema-instance", "xsd=http://www.w3.org/2001/XMLSchema", "soapenv=http://schemas.xmlsoap.org/soap/envelope/"]
)
class RequestEnvelope {
    @JvmField
    @Element(name = "soapenv:Body")
    var body: RequestBody? = null
}