package org.springframework.social.partnercenter;

import org.springframework.social.partnercenter.api.admin.customer.AdminCustomerOperations;

public interface PartnerCenterAdmin extends PartnerCenter {
	String PROVIDER_ID = "partner-center-admin";

	AdminCustomerOperations getAdminCustomerOperations();
}
