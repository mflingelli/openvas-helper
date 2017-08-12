package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Field {
    @XmlElementRef(name = "field", type = Field.class)
    @XmlMixed
    private List<String> mixedContent;
    @XmlElement
    private String order;

    public String getName() {
        if (mixedContent.isEmpty()) {
            return "";
        }
        return mixedContent.get(0).trim();
    }

    public String getOrder() {
        return order;
    }
}
