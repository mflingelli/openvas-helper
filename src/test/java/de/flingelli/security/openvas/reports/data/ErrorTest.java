package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ErrorTest extends CommonReport {

    @Test
    public void getDescription() throws JAXBException {
        Assert.assertEquals(getError().getDescription(), "NVT timed out after 320 seconds.");
    }

    @Test
    public void getPort() throws JAXBException {
        Assert.assertEquals(getError().getPort(), "general/tcp");
    }

    @Test
    public void getScanNvtVersion() throws JAXBException {
        Assert.assertEquals(getError().getScanNvtVersion(), "$Revision: 6063 $");
    }

    @Test
    public void getSeverity() throws JAXBException {
        Assert.assertEquals(getError().getSeverity(), -3.0);
    }

    @Test
    public void getHost() throws JAXBException {
        Assert.assertEquals(getError().getHost().getAsset().getAssetId(),"b5c0cab9-4164-4803-a78b-0ba96db55ab1");
    }

    @Test
    public void getNvt() throws JAXBException {
        Assert.assertEquals(getError().getNvt().getOid(),"1.3.6.1.4.1.25623.1.0.14272");
    }

    private Error getError() throws JAXBException {
        return getScanReport().getReport().getErrors().getErrors().get(0);
    }
}
