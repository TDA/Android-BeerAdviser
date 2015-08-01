package com.tda.saipc.beeradviser.beeradviser;

import java.util.ArrayList;

/**
 * Created by schandramouli on 7/31/15.
 */
public class BeerExpert {
    public static ArrayList<String> getBeers(String s) {
        ArrayList<String> a = new ArrayList<String>();
        if (s.equals("red")) {
            a.add(s + " wine beer");
            a.add(s + " rose beer");
        } else {
            a.add(s + " root beer");
            a.add(s + " ginger beer");
        }

        return a;
    }
}
