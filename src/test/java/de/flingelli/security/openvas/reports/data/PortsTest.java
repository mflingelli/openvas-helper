package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class PortsTest extends CommonReport {

    @Test
    public void getCount() throws JAXBException {
        Assert.assertEquals(getPorts().getCount(), 7);
    }

    @Test
    public void getMax() throws JAXBException {
        Assert.assertEquals(getPorts().getMax(), -1);
    }

    @Test
    public void getStart() throws JAXBException {
        Assert.assertEquals(getPorts().getStart(), 1);
    }

    @Test
    public void getPortsSize() throws JAXBException {
        Assert.assertEquals(getPorts().getPorts().size(), 6);
    }

    private Ports getPorts() throws JAXBException {
        return getScanReport().getReport().getPorts();
    }
}
