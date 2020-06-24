package com.hcl.uob.poc.transformer;

import com.hcl.uob.poc.model.AdobeModel;
import com.hcl.uob.poc.model.Ctx;
import com.hcl.uob.poc.model.CustomerDetails;
import com.hcl.uob.poc.model.CustomerModel;
import org.springframework.stereotype.Component;

@Component
public class CustomerTransformer {

    public CustomerDetails transform(CustomerModel customerModel) {
        return CustomerDetails.newBuilder().setCard(customerModel.getCard())
                .setCustId(customerModel.getCustId()).setTransactionAmount(customerModel.getTransactionAmount())
                .setFirstName(customerModel.getFirstName()).setMiddleName(customerModel.getMiddleName())
                .setLastName(customerModel.getLastName()).setDob(customerModel.getDob()).setGender(customerModel.getGender())
                .setNationality(customerModel.getNationality()).setMaritalStatus(customerModel.getMaritalStatus())
                .setOccupation(customerModel.getOccupation()).setAvgFamilySize(customerModel.getAvgFamilySize())
                .setIncomeLevel(customerModel.getIncomeLevel()).setLocation(customerModel.getLocation())
                .setEmailId(customerModel.getEmailId()).build();
    }

    public CustomerModel transform(CustomerDetails customerDetails) {
        return new CustomerModel(customerDetails.getCard(), customerDetails.getCustId().toString(),
                customerDetails.getTransactionAmount().toString(), customerDetails.getFirstName().toString(),
                customerDetails.getMiddleName().toString(), customerDetails.getLastName().toString(),
                customerDetails.getDob().toString(), customerDetails.getGender().toString(),
                customerDetails.getNationality().toString(), customerDetails.getMaritalStatus().toString(),
                customerDetails.getOccupation().toString(), customerDetails.getAvgFamilySize().toString(),
                customerDetails.getIncomeLevel().toString(), customerDetails.getLocation().toString(),
                customerDetails.getEmailId().toString());
    }

    public AdobeModel transformToAdobeModel(CustomerDetails customerDetails) {
        AdobeModel adobeModel = new AdobeModel();
        adobeModel.setEmail(customerDetails.getEmailId().toString());
        Ctx ctx = new Ctx();
        ctx.setEmail(customerDetails.getEmailId().toString());
        ctx.setLocation(customerDetails.getLocation().toString());
        ctx.setIncomeLevel(customerDetails.getIncomeLevel().toString());
        ctx.setAvgFamilySize(customerDetails.getAvgFamilySize().toString());
        ctx.setOccupation(customerDetails.getOccupation().toString());
        ctx.setMaritalStatus(customerDetails.getMaritalStatus().toString());
        ctx.setNationality(customerDetails.getNationality().toString());
        ctx.setGender(customerDetails.getGender().toString());
        ctx.setDob(customerDetails.getDob().toString());
        ctx.setLastName(customerDetails.getLastName().toString());
        ctx.setMiddleName(customerDetails.getMiddleName().toString());
        ctx.setFirstName(customerDetails.getFirstName().toString());
        ctx.setTransactionAmount(customerDetails.getTransactionAmount().toString());
        ctx.setCustid(customerDetails.getCustId().toString());
        ctx.setCard(customerDetails.getCard());
        adobeModel.setCtx(ctx);

        return adobeModel;
    }
}
