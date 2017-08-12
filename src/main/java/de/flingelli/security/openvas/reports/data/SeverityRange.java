package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "severity_range")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeverityRange {
    @XmlElement
    private String name;
    @XmlElement
    private double min;
    @XmlElement
    private double max;

    public String getName() {
        return name;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
