package com.company;

import java.util.Comparator;

public class SortByCityDesc implements Comparator<City2> {
    public int compare(City2 a, City2 b)
    {
        return b.capital.compareTo(a.capital);
    }
}
