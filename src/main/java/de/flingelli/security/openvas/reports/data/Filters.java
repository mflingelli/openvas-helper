package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Filters {
    @XmlAttribute
    private String id;
    @XmlElement
    private String term;
    @XmlElement(name = "filter")
    private List<String> filters;
    @XmlElementWrapper
    @XmlElement(name = "keyword")
    private List<Keyword> keywords;

    public String getId() {
        return id;
    }

    public String getTerm() {
        return term;
    }

    public List<String> getFilters() {
        return filters;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

}
