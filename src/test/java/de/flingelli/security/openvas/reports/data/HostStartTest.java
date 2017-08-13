package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.text.ParseException;

public class HostStartTest extends CommonReport {

    @Test
    public void getHost() throws JAXBException {
        Assert.assertEquals(getHostStart().getHost(), "172.26.110.136");
    }

    @Test
    public void getDate() throws JAXBException, ParseException {
        Assert.assertEquals(getFormattedDate(getHostStart().getDate()), "30072017 153645");
    }

    private HostStart getHostStart() throws JAXBException {
        return getScanReport().getReport().getHostStart();
    }
}
