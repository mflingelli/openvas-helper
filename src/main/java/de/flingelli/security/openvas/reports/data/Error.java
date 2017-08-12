package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Error {
    @XmlElement
    private Host host;
    @XmlElement
    private String port;
    @XmlElement
    private String description;
    @XmlElement
    private Nvt nvt;
    @XmlElement(name = "scan_nvt_version")
    private String scanNvtVersion;
    @XmlElement
    private double severity;

    public Host getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getDescription() {
        return description;
    }

    public Nvt getNvt() {
        return nvt;
    }

    public String getScanNvtVersion() {
        return scanNvtVersion;
    }

    public double getSeverity() {
        return severity;
    }
}
