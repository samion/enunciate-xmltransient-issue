package com.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class CharsetEncoding {

    @XmlAttribute
    private int ä;

    @XmlAttribute
    private int ö;

    public int getÄ() {
        return ä;
    }

    public void setÄ(int ä) {
        this.ä = ä;
    }

    public int getÖ() {
        return ö;
    }

    public void setÖ(int ö) {
        this.ö = ö;
    }
}
