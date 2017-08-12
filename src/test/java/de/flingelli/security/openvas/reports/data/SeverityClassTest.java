package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class SeverityClassTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getSeverityClass().getId(), "d4c74cda-89e1-11e3-9c29-406186ea4fc5");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getSeverityClass().getName(), "nist");
    }

    @Test
    public void getFullName() throws JAXBException {
        Assert.assertEquals(getSeverityClass().getFullName(), "NVD Vulnerability Severity Ratings");
    }

    private SeverityClass getSeverityClass() throws JAXBException {
        return getScanReport().getReport().getSeverityClass();
    }
}
