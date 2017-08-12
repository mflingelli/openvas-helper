package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskCount {
    @XmlElementRef(name = "task_count", type = TaskCount.class)
    @XmlMixed
    private List<String> mixedContent;
    @XmlElement
    private int filtered;
    @XmlElement
    private int page;

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

    public int getFiltered() {
        return filtered;
    }

    public int getPage() {
        return page;
    }
}
