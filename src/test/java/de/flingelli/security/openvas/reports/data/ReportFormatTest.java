package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ReportFormatTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getReportFormat().getId(), "a994b278-1f62-11e1-96ac-406186ea4fc5");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getReportFormat().getName(), "XML");
    }

    private ReportFormat getReportFormat() throws JAXBException {
        return getScanReport().getReportFormat();
    }
}
