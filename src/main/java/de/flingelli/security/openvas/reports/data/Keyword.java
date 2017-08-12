package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Keyword {
    @XmlElement
    private String column;
    @XmlElement
    private String relation;
    @XmlElement
    private String value;

    public String getColumn() {
        return column;
    }

    public String getRelation() {
        return relation;
    }

    public String getValue() {
        return value;
    }
}
