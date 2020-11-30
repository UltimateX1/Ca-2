package com.dkit.oop;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name: Emmanuel Francis
 * <p>
 * Your GitHub link: https://github.com/UltimateX1/Ca-2
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());

        Property p2 = new Property(2, "Emmanuel", "A91AB43", 0, 130);
        System.out.println("Property p2 details:");

        p2.addFacility("Mains water");
        p2.addFacility("electricity");
        System.out.println(p2);

        System.out.println(p2.getFacilities());

        //p2.removeFacility("Mains water");
        System.out.println("New list " + p2.getFacilities());

        System.out.println(p2.calculateTax(130));

        System.out.println("Q2 - tests");
        Property p3 = new Property(3, "Emmanuel", "A91AB43", 0, 130);
        Property p4 = new Property(4, "Emma", "A9132", 0, 45);
        Property p5 = new Property(5, "Tom", "A91A346", 0, 13);

        ArrayList <Property> properties = new ArrayList<Property>();
        properties.add(p3);
        properties.add(p4);
        properties.add(p5);

        System.out.println();

        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

