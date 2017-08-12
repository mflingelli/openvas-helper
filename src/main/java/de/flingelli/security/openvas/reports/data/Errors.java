package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Errors {
    @XmlElement
    private int count;
    @XmlElement(name = "error")
    private List<Error> errors;

    public int getCount() {
        return count;
    }

    public List<Error> getErrors() {
        return errors;
    }
}
