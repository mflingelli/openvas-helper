package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class SourceTest extends CommonReport {

    @Test
    public void getDetails() throws JAXBException {
        Assert.assertEquals(getSource().getType(), "nvt");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getSource().getName(), "1.3.6.1.4.1.25623.1.0.103692");
    }

    @Test
    public void getDescription() throws JAXBException {
        Assert.assertEquals(getSource().getDescription(), "SSL/TLS Certificate");
    }

    private Source getSource() throws JAXBException {
        return getScanReport().getReport().getHost().getDetails().get(0).getSource();
    }

}
