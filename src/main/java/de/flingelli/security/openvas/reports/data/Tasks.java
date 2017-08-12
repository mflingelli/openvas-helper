package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tasks {
    @XmlAttribute
    private int max;
    @XmlAttribute
    private int start;

    public int getMax() {
        return max;
    }

    public int getStart() {
        return start;
    }
}
