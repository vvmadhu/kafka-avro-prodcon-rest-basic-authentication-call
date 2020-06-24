package com.hcl.uob.poc.model;

public class CustomerModel {
    public CustomerModel() {
        super();
    }

    public CustomerModel(int card, String custId, String transactionAmount, String firstName, String middleName,
                         String lastName, String dob, String gender, String nationality, String maritalStatus,
                         String occupation, String avgFamilySize, String incomeLevel, String location, String emailId) {
        super();
        this.card = card;
        this.custId = custId;
        this.transactionAmount = transactionAmount;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.occupation = occupation;
        this.avgFamilySize = avgFamilySize;
        this.incomeLevel = incomeLevel;
        this.location = location;
        this.emailId = emailId;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAvgFamilySize() {
        return avgFamilySize;
    }

    public void setAvgFamilySize(String avgFamilySize) {
        this.avgFamilySize = avgFamilySize;
    }

    public String getIncomeLevel() {
        return incomeLevel;
    }

    public void setIncomeLevel(String incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "card='" + card + '\'' +
                ", custId='" + custId + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", occupation='" + occupation + '\'' +
                ", avgFamilySize='" + avgFamilySize + '\'' +
                ", incomeLevel='" + incomeLevel + '\'' +
                ", location='" + location + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    int card;
    String custId;
    String transactionAmount;
    String firstName;
    String middleName;
    String lastName;
    String dob;
    String gender;
    String nationality;
    String maritalStatus;
    String occupation;
    String avgFamilySize;
    String incomeLevel;
    String location;
    String emailId;
}