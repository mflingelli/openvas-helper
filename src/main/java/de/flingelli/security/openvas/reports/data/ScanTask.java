package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScanTask {
    @XmlElement
    private Slave slave;
    @XmlElementWrapper
    @XmlElement(name = "preference")
    private List<Preference> preferences;

    public Slave getSlave() {
        return slave;
    }

    public List<Preference> getPreferences() {
        return preferences;
    }
}
