package com.hlcsdev.x.exchangerates;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;



@Root(name = "Rate")
public class Rate
{
    @Attribute(name = "Cur_ID")
    private int Cur_ID;

    @Attribute(name = "Date")
    private String date;

    @Attribute(name = "Cur_Abbreviation")
    private String Cur_Abbreviation;

    @Attribute(name = "Cur_Scale")
    private int Cur_Scale;

    @Attribute(name = "Cur_Name")
    private String Cur_Name;

    @Attribute(name = "Cur_OfficialRate")
    private double Cur_OfficialRate;

    public int getCur_ID() {
        return Cur_ID;
    }

    public void setCur_ID(int cur_ID) {
        Cur_ID = cur_ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        Cur_Abbreviation = cur_Abbreviation;
    }

    public int getCur_Scale() {
        return Cur_Scale;
    }

    public void setCur_Scale(int cur_Scale) {
        Cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return Cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        Cur_Name = cur_Name;
    }

    public double getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

    public void setCur_OfficialRate(double cur_OfficialRate) {
        Cur_OfficialRate = cur_OfficialRate;
    }
}
