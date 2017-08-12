package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Result {
    @XmlAttribute
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private Owner owner;
    @XmlElement
    private String comment;
    @XmlElement(name = "creation_time")
    private Date creationTime;
    @XmlElement(name = "modification_time")
    private Date modificationTime;
    @XmlElement(name = "user_tags")
    private UserTags userTags;
    @XmlElement
    private String description;
    @XmlElement
    private String port;
    @XmlElement
    private Nvt nvt;
    @XmlElement(name = "scan_nvt_version")
    private String scanNvtVersion;
    @XmlElement
    private String threat;
    @XmlElement
    private double severity;
    @XmlElement(name = "original_threat")
    private String originalThreat;
    @XmlElement(name = "original_severity")
    private double originalSeverity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public UserTags getUserTags() {
        return userTags;
    }

    public String getScanNvtVersion() {
        return scanNvtVersion;
    }

    public String getComment() {
        return comment;
    }

    public String getDescription() {
        return description;
    }

    public Nvt getNvt() {
        return nvt;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public String getPort() {
        return port;
    }

    public String getThreat() {
        return threat;
    }

    public double getSeverity() {
        return severity;
    }

    public String getOriginalThreat() {
        return originalThreat;
    }

    public double getOriginalSeverity() {
        return originalSeverity;
    }
}
