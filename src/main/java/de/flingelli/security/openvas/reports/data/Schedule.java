package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Schedule {
    @XmlAttribute
    private String id;
    @XmlElement
    private String name;
    @XmlElement(name = "next_time")
    private String nextTime;
    @XmlElement
    private int trash;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNextTime() {
        return nextTime;
    }

    public int getTrash() {
        return trash;
    }
}
