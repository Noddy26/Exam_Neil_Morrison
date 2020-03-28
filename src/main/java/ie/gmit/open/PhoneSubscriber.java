//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+ .LAb: Design Principals Lab                                         +
//+ .LANGUAGE: Java                                                     +
//+ .AUTHOR: Neil Morrison                                              +
//+ .COLLEGE: Galway-Mayo institute of Technology                       +
//+ .DATE: 25/03/20202                                                  +
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package ie.gmit.open;

import java.util.List;

public abstract class PhoneSubscriber  extends Subscriber{

    private int baseRate;

    public abstract double calculateBill();

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

}