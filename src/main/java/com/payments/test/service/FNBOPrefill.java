package com.payments.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FNBOPrefill {
    private static final Logger log = LoggerFactory.getLogger(FNBOPrefill.class);

    public static PrefillledAppUrlRequest mapPrefillledAppUrlRequest() {
        log.info("Mapper : Start of mapPrefillledAppUrlRequest {}: {}: {}");
        PrefillledAppUrlRequest request = new PrefillledAppUrlRequest();

        request.setState("CA");
        request.setCity("Pleasanton");
        request.setFirstName("George");
        request.setLastName("Cloony");
        request.setEmailAddress("george.cloony@yopmail.com");
        request.setZipCode("94588");
        request.setStreetName("3928 Empire Ct");
        request.setPartnerMarketingCode("50STCRA");
        request.setPrimaryPhoneNumber("8765544562");
        request.setSubAgent("000");//Mandatory
        request.setShortCode("XVDZ9LM7P2WPL");//Mandatory
        request.setReturnRelativePath("https://pd-payment-enclosing-page-uw-as-d.azurewebsites.net/");// "/"
        request.setRewardsNumber("102745240");

        log.info("Mapper : End of mapFnboRequestToWalletRequest method :: Response : {}", request);
        return request;
    }
}
