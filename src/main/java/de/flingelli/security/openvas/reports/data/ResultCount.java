package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResultCount {
    @XmlElement
    private int debug;
    @XmlElement
    private int hole;
    @XmlElement
    private int info;
    @XmlElement
    private int log;
    @XmlElement
    private int warning;
    @XmlElement(name = "false_positive")
    private int falsePositive;

    public int getDebug() {
        return debug;
    }

    public int getHole() {
        return hole;
    }

    public int getInfo() {
        return info;
    }

    public int getLog() {
        return log;
    }

    public int getWarning() {
        return warning;
    }

    public int getFalsePositive() {
        return falsePositive;
    }
}
