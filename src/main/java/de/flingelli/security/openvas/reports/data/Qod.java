package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Qod {
    @XmlElement
    private int value;
    @XmlElement
    private String type;

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
