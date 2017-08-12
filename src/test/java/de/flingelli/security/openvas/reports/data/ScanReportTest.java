package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ScanReportTest extends CommonReport {

    @Test
    public void getReportId() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getId(), "2738649b-dac5-44da-8320-1766643906c7");
    }

    @Test
    public void getFormatId() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getFormatId(), "a994b278-1f62-11e1-96ac-406186ea4fc5");
    }

    @Test
    public void getExtension() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getExtension(), "xml");
    }

    @Test
    public void getType() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getType(), "scan");
    }

    @Test
    public void getContentType() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getContentType(), "text/xml");
    }

    @Test
    public void getOwnerName() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getOwner().getName(), "jenkins");
    }

    @Test
    public void getComment() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getComment(), "");
    }

    @Test
    public void getName() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getName(), "2017-07-30T15:36:36Z");
    }

    @Test
    public void getCreationTime() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(getFormattedDate(scanReport.getCreationTime()), "30072017 173636");
    }

    @Test
    public void getModificationTime() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(getFormattedDate(scanReport.getModificationTime()), "30072017 180023");
    }

    @Test
    public void getWritable() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getWritable(), 0);
    }

    @Test
    public void getInUse() throws JAXBException {
        ScanReport scanReport = getScanReport();
        Assert.assertEquals(scanReport.getInUse(), 0);
    }

}
