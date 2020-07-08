package com.company;

import java.util.Comparator;

public class SortByCitizensAsc implements Comparator<City2> {
    public int compare(City2 a, City2 b)
    {
        return a.citizens - b.citizens;
    }
}
