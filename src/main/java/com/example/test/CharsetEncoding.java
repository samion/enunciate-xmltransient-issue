package com.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class CharsetEncoding {

    @XmlAttribute
    private int aä;

    @XmlAttribute
    private int aö;

    public int getAä() {
        return aä;
    }

    public void setAä(int aä) {
        this.aä = aä;
    }

    public int getAö() {
        return aö;
    }

    public void setAö(int aö) {
        this.aö = aö;
    }
}
