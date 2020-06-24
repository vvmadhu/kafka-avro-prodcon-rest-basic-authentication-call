package com.hcl.uob.poc.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email",
        "location",
        "income_level",
        "avg_family_size",
        "occupation",
        "marital_status",
        "nationality",
        "gender",
        "dob",
        "last_name",
        "middle_name",
        "_first_name",
        "transaction_amount",
        "custid",
        "card"
})
public class Ctx {

    @JsonProperty("email")
    private String email;
    @JsonProperty("location")
    private String location;
    @JsonProperty("income_level")
    private String incomeLevel;
    @JsonProperty("avg_family_size")
    private String avgFamilySize;
    @JsonProperty("occupation")
    private String occupation;
    @JsonProperty("marital_status")
    private String maritalStatus;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("_first_name")
    private String firstName;
    @JsonProperty("transaction_amount")
    private String transactionAmount;
    @JsonProperty("custid")
    private String custid;
    @JsonProperty("card")
    private int card;

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("income_level")
    public String getIncomeLevel() {
        return incomeLevel;
    }

    @JsonProperty("income_level")
    public void setIncomeLevel(String incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    @JsonProperty("avg_family_size")
    public String getAvgFamilySize() {
        return avgFamilySize;
    }

    @JsonProperty("avg_family_size")
    public void setAvgFamilySize(String avgFamilySize) {
        this.avgFamilySize = avgFamilySize;
    }

    @JsonProperty("occupation")
    public String getOccupation() {
        return occupation;
    }

    @JsonProperty("occupation")
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @JsonProperty("marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("marital_status")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("_first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("_first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("transaction_amount")
    public String getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty("transaction_amount")
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @JsonProperty("custid")
    public String getCustid() {
        return custid;
    }

    @JsonProperty("custid")
    public void setCustid(String custid) {
        this.custid = custid;
    }

    @JsonProperty("card")
    public int getCard() {
        return card;
    }

    @JsonProperty("card")
    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "ctx{" +
                "email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", incomeLevel='" + incomeLevel + '\'' +
                ", avgFamilySize='" + avgFamilySize + '\'' +
                ", occupation='" + occupation + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", custid='" + custid + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}