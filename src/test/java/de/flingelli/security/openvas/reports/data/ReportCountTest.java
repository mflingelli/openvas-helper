package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ReportCountTest extends CommonReport {

    @Test
    public void getCount() throws JAXBException {
        Assert.assertEquals(getReportCount().getCount(), 7);
    }

    @Test
    public void getFinished() throws JAXBException {
        Assert.assertEquals(getReportCount().getFinished(), 7);
    }


    private ReportCount getReportCount() throws JAXBException {
        return getTasksReport().getTask().getReportCount();
    }
}
