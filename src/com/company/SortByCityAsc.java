package com.company;

import java.util.Comparator;

public class SortByCityAsc implements Comparator<City2> {
    public int compare(City2 a, City2 b)
    {
        return a.capital.compareTo(b.capital);
    }
}
