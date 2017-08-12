package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Ports {
    @XmlAttribute
    private int max;
    @XmlAttribute
    private int start;
    @XmlElement
    private int count;
    @XmlElement(name = "port")
    private List<Port> ports;

    public int getMax() {
        return max;
    }

    public int getStart() {
        return start;
    }

    public int getCount() {
        return count;
    }

    public List<Port> getPorts() {
        return ports;
    }
}
