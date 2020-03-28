//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+ .LAb: Design Principals Lab                                         +
//+ .LANGUAGE: Java                                                     +
//+ .AUTHOR: Neil Morrison                                              +
//+ .COLLEGE: Galway-Mayo institute of Technology                       +
//+ .DATE: 25/03/20202                                                  +
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package ie.gmit.single;

public class UserStorage {
    private Store store = new Store();

    public void saveUser (User user)
    {
        store.store(user);
    }
}
