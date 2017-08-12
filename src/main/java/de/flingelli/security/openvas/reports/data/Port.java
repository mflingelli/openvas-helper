package de.flingelli.security.openvas.reports.data;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Port {
    @XmlElementRef(name = "task_count", type = TaskCount.class)
    @XmlMixed
    private List<String> mixedContent;
    @XmlElement
    private String host;
    @XmlElement
    private double severity;
    @XmlElement
    private String threat;

    public String getName() {
        if (mixedContent.isEmpty()) {
            return "";
        }
        return mixedContent.get(0).trim();
    }

    public String getHost() {
        return host;
    }

    public double getSeverity() {
        return severity;
    }

    public String getThreat() {
        return threat;
    }
}
