package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ResultCountTest extends CommonReport {

    @Test
    public void getDebug() throws JAXBException {
        Assert.assertEquals(getResultCount().getDebug(), 0);
    }

    @Test
    public void getHole() throws JAXBException {
        Assert.assertEquals(getResultCount().getHole(), 3);
    }

    @Test
    public void getInfo() throws JAXBException {
        Assert.assertEquals(getResultCount().getInfo(), 1);
    }

    @Test
    public void getLog() throws JAXBException {
        Assert.assertEquals(getResultCount().getLog(), 74);
    }

    @Test
    public void getWarning() throws JAXBException {
        Assert.assertEquals(getResultCount().getWarning(), 4);
    }

    @Test
    public void getFalsePositive() throws JAXBException {
        Assert.assertEquals(getResultCount().getFalsePositive(), 0);
    }

    private ResultCount getResultCount() throws JAXBException {
        return getTasksReport().getTask().getFirstReport().getReport().getResultCount();
    }
}
