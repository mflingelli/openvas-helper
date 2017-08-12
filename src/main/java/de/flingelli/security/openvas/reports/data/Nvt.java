package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Nvt {
    @XmlAttribute
    private String oid;
    @XmlElement
    private String type;
    @XmlElement
    private String family;
    @XmlElement
    private String name;
    @XmlElement
    private String xref;
    @XmlElement
    private String tags;

    public String getOid() {
        return oid;
    }

    public String getType() {
        return type;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getXref() {
        return xref;
    }

    public String getTags() {
        return tags;
    }
}
