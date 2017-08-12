package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class SeverityTest extends CommonReport {

    @Test
    public void getFiltered() throws JAXBException {
        Assert.assertEquals(getSeverity().getFiltered(), 2.6);
    }

    @Test
    public void getFull() throws JAXBException {
        Assert.assertEquals(getSeverity().getFull(), 8.5);
    }

    private Severity getSeverity() throws JAXBException {
        return getScanReport().getReport().getSeverity();
    }
}
