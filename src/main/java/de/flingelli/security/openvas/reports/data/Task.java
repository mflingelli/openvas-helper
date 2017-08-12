package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Task {
    @XmlAttribute
    private String id;
    @XmlElement
    private Owner owner;
    @XmlElement
    private String name;
    @XmlElement
    private String comment;
    @XmlElement(name = "creation_time")
    private Date creationTime;
    @XmlElement(name = "modification_time")
    private Date modificationTime;
    @XmlElement
    private int writable;
    @XmlElement(name = "in_use")
    private int inUse;
    @XmlElementWrapper
    @XmlElement(name = "permission")
    private List<Permission> permissions;
    @XmlElement(name = "user_tags")
    private UserTags userTags;
    @XmlElement
    private int alterable;
    @XmlElement
    private Config config;
    @XmlElement
    private Target target;
    @XmlElement(name = "hosts_ordering")
    private String hostOrdering;
    @XmlElement
    private Scanner scanner;
    @XmlElement
    private String status;
    @XmlElement
    private int progress;
    @XmlElement
    private String trend;
    @XmlElement
    private Schedule schedule;
    @XmlElement(name = "schedule_periods")
    private int shedulePeriods;
    @XmlElement(name = "first_report")
    private ReportInTask firstReport;
    @XmlElement(name = "last_report")
    private ReportInTask lastReport;
    @XmlElement(name = "second_last_report")
    private ReportInTask secondLastReport;
    @XmlElement(name = "average_duration")
    private int averageDuration;
    @XmlElement(name = "result_count")
    private int resultCount;
    @XmlElementWrapper
    @XmlElement(name = "preference")
    private List<Preference> preferences;

    public String getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public int getWritable() {
        return writable;
    }

    public int getInUse() {
        return inUse;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public int getAlterable() {
        return alterable;
    }

    public Config getConfig() {
        return config;
    }

    public Target getTarget() {
        return target;
    }

    public String getHostOrdering() {
        return hostOrdering;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public UserTags getUserTags() {
        return userTags;
    }

    public String getTrend() {
        return trend;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public int getShedulePeriods() {
        return shedulePeriods;
    }

    public ReportInTask getFirstReport() {
        return firstReport;
    }

    public ReportInTask getLastReport() {
        return lastReport;
    }

    public ReportInTask getSecondLastReport() {
        return secondLastReport;
    }

    public int getAverageDuration() {
        return averageDuration;
    }

    public int getResultCount() {
        return resultCount;
    }

    public List<Preference> getPreferences() {
        return preferences;
    }
}
