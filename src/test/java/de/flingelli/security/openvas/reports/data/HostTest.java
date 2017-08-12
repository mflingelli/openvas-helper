package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class HostTest extends CommonReport {

    @Test
    public void getIp() throws JAXBException {
        Assert.assertEquals(getHost().getIp(), "172.26.110.136");
    }

    @Test
    public void getAssetId() throws JAXBException {
        Assert.assertEquals(getHost().getAsset().getAssetId(), "b5c0cab9-4164-4803-a78b-0ba96db55ab1");
    }

    @Test
    public void getStart() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getHost().getStart()), "30072017 173645");
    }

    @Test
    public void getEnd() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getHost().getEnd()), "30072017 180023");
    }

    @Test
    public void getDetails() throws JAXBException {
        Assert.assertEquals(getHost().getDetails().size(), 1181);
    }

    private Host getHost() throws JAXBException {
        return getScanReport().getReport().getHost();
    }
}
