package com.example.consumingwebservice;
import com.example.consumingwebservice.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class EvClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(EvClient.class);

    public RealEstateInfoResponse getRealEstateInfo(String postCode) {

        RealEstateInfo request = new RealEstateInfo();
        log.info("Requesting realEstateInfo for " + postCode);

        try {
            RealEstateInfoResponse response = (RealEstateInfoResponse) getWebServiceTemplate()
                    .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
                            new SoapActionCallback(
                                    "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
            return response;

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
