package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Target {
    @XmlAttribute
    private String id;
    @XmlElement
    private int trash;

    public String getId() {
        return id;
    }

    public int getTrash() {
        return trash;
    }
}
