package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class PortTest extends CommonReport {

    @Test
    public void getHost() throws JAXBException {
        Assert.assertEquals(getPort().getHost(), "172.26.110.136");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getPort().getName(), "8443/tcp");
    }

    @Test
    public void getThreat() throws JAXBException {
        Assert.assertEquals(getPort().getThreat(), "Medium");
    }

    @Test
    public void getSeverity() throws JAXBException {
        Assert.assertEquals(getPort().getSeverity(), 4.0);
    }

    private Port getPort() throws JAXBException {
        return getScanReport().getReport().getPorts().getPorts().get(0);
    }
}
