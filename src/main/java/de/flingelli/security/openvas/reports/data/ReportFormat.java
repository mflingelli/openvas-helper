package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;

@XmlType(name = "report_format")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportFormat {
    @XmlAttribute
    private String id;
    @XmlElement
    private String name;

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}
