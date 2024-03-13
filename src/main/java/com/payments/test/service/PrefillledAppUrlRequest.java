/**
 * Author      : Ulaganathan
 * Description :  Model for PrefillledAppUrlRequest
 * Created Date  : 09/10/2023
 * Modified By   : 
 * Modified Date : 
 * ****/
package com.payments.test.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrefillledAppUrlRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private String state;
	private String city;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String zipCode;
	private String subAgent;
	private String shortCode;
	private String streetName;
	private String rewardsNumber;
	private String returnRelativePath;
	private String thirdPartyCustomerId;
	private String partnerMarketingCode;
	private String primaryPhoneNumber;
}
