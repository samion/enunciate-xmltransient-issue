package com.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class ChildA extends ParentA {

    @XmlAttribute
    private int c;

    @XmlElement
    private Element d;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Element getD() {
        return d;
    }

    public void setD(Element d) {
        this.d = d;
    }
}
