package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlType(name = "severity_class")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeverityClass {
    @XmlAttribute
    private String id;
    @XmlElement
    private String name;
    @XmlElement(name = "full_name")
    private String fullName;
    @XmlElement(name = "severity_range")
    private List<SeverityRange> severityRanges;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public List<SeverityRange> getSeverityRanges() {
        return severityRanges;
    }
}
