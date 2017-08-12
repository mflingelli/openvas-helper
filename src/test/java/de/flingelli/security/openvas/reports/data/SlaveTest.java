package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class SlaveTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getSlave().getId(), "");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getSlave().getName(), "");
    }

    @Test
    public void getHost() throws JAXBException {
        Assert.assertEquals(getSlave().getHost(), "");
    }

    @Test
    public void getPort() throws JAXBException {
        Assert.assertEquals(getSlave().getPort(), 0);
    }

    private Slave getSlave() throws JAXBException {
        return getScanReport().getReport().getScan().getTask().getSlave();
    }
}