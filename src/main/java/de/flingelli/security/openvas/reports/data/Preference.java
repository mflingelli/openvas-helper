package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Preference {
    @XmlElement
    private String name;
    @XmlElement(name = "scanner_name")
    private String scannerName;
    @XmlElement
    private int value;

    public String getName() {
        return name;
    }

    public String getScannerName() {
        return scannerName;
    }

    public int getValue() {
        return value;
    }
}
