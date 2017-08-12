package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "user_tags")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserTags {
    @XmlElement
    private int count;

    public int getCount() {
        return count;
    }
}
