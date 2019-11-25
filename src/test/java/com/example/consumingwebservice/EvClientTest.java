package com.example.consumingwebservice;

import com.example.consumingwebservice.wsdl.RealEstateInfoResponse;
import org.junit.Ignore;
import org.junit.Test;

public class EvClientTest {

    @Test
    @Ignore
    public void testEvClient() throws Exception {

        EvClient evClient = new EvClient();

        RealEstateInfoResponse response = evClient.getRealEstateInfo("0283");
    }
}
