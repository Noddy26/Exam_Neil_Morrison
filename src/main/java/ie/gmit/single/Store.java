//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+ .LAb: Design Principals Lab                                         +
//+ .LANGUAGE: Java                                                     +
//+ .AUTHOR: Neil Morrison                                              +
//+ .COLLEGE: Galway-Mayo institute of Technology                       +
//+ .DATE: 25/03/20202                                                  +
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package ie.gmit.single;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}