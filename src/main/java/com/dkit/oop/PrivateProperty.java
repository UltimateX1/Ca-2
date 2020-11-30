package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class PrivateProperty extends Property
{
private int numBeds;
private String propertyType;

    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, int numBeds, String propertyType) {
        super(propertyID, owner, postcode, sellingPrice, area);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "PrivateProperty{" +
                "numBeds=" + numBeds +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }

    //q3
}
