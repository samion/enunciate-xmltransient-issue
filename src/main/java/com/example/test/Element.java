package com.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Element {

    @XmlAttribute
    private int e;

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
}
