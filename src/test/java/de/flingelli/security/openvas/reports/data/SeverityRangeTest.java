package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class SeverityRangeTest extends CommonReport {

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getSeverityRange().getName(), "None");
    }

    @Test
    public void getMin() throws JAXBException {
        Assert.assertEquals(getSeverityRange().getMin(), 0.0);
    }

    @Test
    public void getMax() throws JAXBException {
        Assert.assertEquals(getSeverityRange().getMax(), 0.0);
    }

    @Test
    public void getSeverityRanges() throws JAXBException {
        Assert.assertEquals( getScanReport().getReport().getSeverityClass().getSeverityRanges().size(), 4);
    }

    private SeverityRange getSeverityRange() throws JAXBException {
        return getScanReport().getReport().getSeverityClass().getSeverityRanges().get(0);
    }
}
