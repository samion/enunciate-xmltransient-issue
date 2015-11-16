package com.example.test;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

public abstract class ParentC {

    private int a;

    private String b;

    @XmlTransient
    @XmlAttribute
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @XmlTransient
    @XmlAttribute
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
