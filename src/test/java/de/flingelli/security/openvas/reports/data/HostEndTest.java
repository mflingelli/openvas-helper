package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.text.ParseException;

public class HostEndTest extends CommonReport {

    @Test
    public void getHost() throws JAXBException {
        Assert.assertEquals(getHostEnd().getHost(), "172.26.110.136");
    }

    @Test
    public void getDate() throws JAXBException, ParseException {
        Assert.assertEquals(getFormattedDate(getHostEnd().getDate()), "30072017 160023");
    }

    private HostEnd getHostEnd() throws JAXBException {
        return getScanReport().getReport().getHostEnd();
    }
}
