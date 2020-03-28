//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+ .LAb: Design Principals Lab                                         +
//+ .LANGUAGE: Java                                                     +
//+ .AUTHOR: Neil Morrison                                              +
//+ .COLLEGE: Galway-Mayo institute of Technology                       +
//+ .DATE: 25/03/20202                                                  +
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package ie.gmit.open;

public abstract class Subscriber {

    public Long subscriberId;

    private String address;

    private Long phoneNumber;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public abstract double calculateBill();
}
