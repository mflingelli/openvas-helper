package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {
    @XmlElement
    private String name;
    @XmlElement
    private String value;
    @XmlElement
    private Source source;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Source getSource() {
        return source;
    }

}
