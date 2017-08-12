package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Report {
    @XmlAttribute
    private String id;
    @XmlElement
    private Omp omp;
    @XmlElement
    private Filters filters;
    @XmlElement(name = "severity_class")
    private SeverityClass severityClass;
    @XmlElement(name = "user_tags")
    private UserTags userTags;
    @XmlElement(name = "scan_run_status")
    private String scanRunStatus;
    @XmlElement(name = "result")
    @XmlElementWrapper(name = "results")
    private List<Result> results;
    @XmlElement
    private Task task;
    @XmlElement
    private Date timestamp;
    @XmlElement(name = "scan_start")
    private Date scanStart;
    @XmlElement
    private CountContainer hosts;
    @XmlElement(name = "closed_cves")
    private CountContainer closedCves;
    @XmlElement
    private CountContainer vulns;
    @XmlElement
    private CountContainer os;
    @XmlElement
    private CountContainer apps;
    @XmlElement(name = "ssl_certs")
    private CountContainer sslCerts;
    @XmlElement
    private String timezone;
    @XmlElement(name = "timezone_abbrev")
    private String timezoneAbbrev;
    @XmlElement
    private Severity severity;
    @XmlElement
    private Host host;
    @XmlElement
    private Errors errors;
    @XmlElement(name = "report_forma")
    private ReportFormat reportFormat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Omp getOmp() {
        return omp;
    }

    public Filters getFilters() {
        return filters;
    }

    public SeverityClass getSeverityClass() {
        return severityClass;
    }

    public UserTags getUserTags() {
        return userTags;
    }

    public String getScanRunStatus() {
        return scanRunStatus;
    }

    public CountContainer getHosts() {
        return hosts;
    }

    public CountContainer getClosedCves() {
        return closedCves;
    }

    public CountContainer getVulns() {
        return vulns;
    }

    public CountContainer getOs() {
        return os;
    }

    public CountContainer getApps() {
        return apps;
    }

    public CountContainer getSslCerts() {
        return sslCerts;
    }

    public List<Result> getResults() {
        return results;
    }

    public Task getTask() {
        return task;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Date getScanStart() {
        return scanStart;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getTimezoneAbbrev() {
        return timezoneAbbrev;
    }

    public Severity getSeverity() {
        return severity;
    }

    public Host getHost() {
        return host;
    }

    public Errors getErrors() {
        return errors;
    }

    public ReportFormat getReportFormat() {
        return reportFormat;
    }
}


