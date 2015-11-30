package com.example.niklas.myapplication2;

/**
 * Created by Niklas on 2015-11-30.
 */
public class UnitConverter {
    public static double celsius2Farenheit(double c){
        return 32+c*9/5;
    }

    public static double farenheit2Celsius(double f){
        return (f-32)*5/9;
    }
}
