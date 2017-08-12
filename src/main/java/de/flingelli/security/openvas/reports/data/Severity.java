package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Severity {
    @XmlElement
    private double full;
    @XmlElement
    private double filtered;

    public double getFull() {
        return full;
    }

    public double getFiltered() {
        return filtered;
    }
}
