package com.prudhviraj.Prototype_v3;

public class PremiumUser extends User implements Prototype<User> {
    String userType;
    String subscriptionData;
    int noOfMonths;

    public PremiumUser() {
        super();
    }

    public PremiumUser(PremiumUser premiumUser) {
        super(premiumUser);
        this.userType = premiumUser.userType;
        this.subscriptionData = premiumUser.subscriptionData;
        this.noOfMonths = premiumUser.noOfMonths;
    }



    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSubscriptionData() {
        return subscriptionData;
    }

    public void setSubscriptionData(String subscriptionData) {
        this.subscriptionData = subscriptionData;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    @Override
    public String toString () {
        return "PremiumUser{" +
                "userType='" + userType + '\'' +
                ", subscriptionData='" + subscriptionData + '\'' +
                ", noOfMonths=" + noOfMonths +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
    @Override
    public PremiumUser clone() {
        return new PremiumUser(this);
    }
}


