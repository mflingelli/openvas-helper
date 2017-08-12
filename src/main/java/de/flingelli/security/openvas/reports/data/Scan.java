package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Scan {
    @XmlElement
    private ScanTask task;

    public ScanTask getTask() {
        return task;
    }
}
