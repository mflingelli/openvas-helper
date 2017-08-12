package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Host {
    @XmlElement
    private String ip;
    @XmlElement
    private Asset asset;
    @XmlElement
    private Date start;
    @XmlElement
    private Date end;
    @XmlElement(name = "detail")
    private List<Detail> details;

    public String getIp() {
        return ip;
    }

    public Asset getAsset() {
        return asset;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public List<Detail> getDetails() {
        return details;
    }
}
