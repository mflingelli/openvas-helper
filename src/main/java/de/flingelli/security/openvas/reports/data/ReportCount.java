package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportCount {
    @XmlElementRef(name = "report_count", type = ReportCount.class)
    @XmlMixed
    private List<String> mixedContent;
    @XmlElement
    private int finished;

    public int getCount() throws NumberFormatException {
        if (!mixedContent.isEmpty()) {
            try {
                return Integer.valueOf(mixedContent.get(0).trim());
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return -1;
    }

    public int getFinished() {
        return finished;
    }
}
