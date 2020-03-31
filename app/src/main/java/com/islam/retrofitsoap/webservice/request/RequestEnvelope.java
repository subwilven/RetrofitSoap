package com.islam.retrofitsoap.webservice.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;


@Root(name = "soapenv:Envelope")
@NamespaceList({
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema", prefix = "xsd"),
        @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "soapenv")
})
public class RequestEnvelope {
    @Element(name = "soapenv:Body", required = false)
    public RequestBody body;

}
