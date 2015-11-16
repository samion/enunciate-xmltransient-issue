package com.example.test;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

public abstract class ParentC {

    @XmlAttribute
    private int a;

    @XmlAttribute
    private String b;

    @XmlTransient
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @XmlTransient
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
