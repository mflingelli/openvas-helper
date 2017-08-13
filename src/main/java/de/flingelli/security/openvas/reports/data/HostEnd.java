package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HostEnd {
    private static final SimpleDateFormat PARSER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    @XmlElementRef(name = "host_end", type = HostEnd.class)
    @XmlMixed
    private List<String> mixedContent;
    @XmlElement
    private String host;

    public Date getDate() throws ParseException {
        if (!mixedContent.isEmpty()) {
            try {
                PARSER.setTimeZone(TimeZone.getTimeZone("CET"));
                return PARSER.parse(mixedContent.get(0).trim());
            } catch (ParseException e) {
                throw e;
            }
        }
        return new Date();
    }

    public String getHost() {
        return host;
    }
}
