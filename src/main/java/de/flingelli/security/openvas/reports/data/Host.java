package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Host {
    @XmlElementRef(name = "host", type = Host.class)
    @XmlMixed
    private List<String> mixedContent;
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

    public String getName() {
        if (!mixedContent.isEmpty()) {
            return mixedContent.get(0).trim();
        }
        return "";
    }

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
