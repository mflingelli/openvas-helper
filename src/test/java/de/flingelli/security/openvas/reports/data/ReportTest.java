package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ReportTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getReport().getId(), "2738649b-dac5-44da-8320-1766643906c7");
    }

    @Test
    public void getOmpVersion() throws JAXBException {
        Assert.assertEquals(getReport().getOmp().getVersion(), "7.0");
    }

    @Test
    public void getScanRunStatus() throws JAXBException {
        Assert.assertEquals(getReport().getScanRunStatus(), "Done");
    }

    @Test
    public void getResults() throws JAXBException {
        Assert.assertEquals(getReport().getResults().size(), 1);
    }

    @Test
    public void getTimestamp() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getReport().getTimestamp()), "30072017 173601");
    }

    @Test
    public void getScanStart() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getReport().getScanStart()), "30072017 173636");
    }

    @Test
    public void getTimezone() throws JAXBException {
        Assert.assertEquals(getReport().getTimezone(), "Coordinated Universal Time");
    }

    @Test
    public void getTimezoneAbbrev() throws JAXBException {
        Assert.assertEquals(getReport().getTimezoneAbbrev(), "UTC");
    }

    private Report getReport() throws JAXBException {
        return getScanReport().getReport();
    }

    @Test
    public void getIdOfTask() throws JAXBException {
        Assert.assertEquals(getTask().getId(), "8abc57cc-3497-44e4-ad17-ba64c270088f");
    }

    @Test
    public void getNameOfTask() throws JAXBException {
        Assert.assertEquals(getTask().getName(), "ridux-ci");
    }

    @Test
    public void getComment() throws JAXBException {
        Assert.assertEquals(getTask().getComment(), "Automatically generated by  wizard");
    }

    @Test
    public void getProgress() throws JAXBException {
        Assert.assertEquals(getTask().getProgress(), -1);
    }

    @Test
    public void getUserTagsCount() throws JAXBException {
        Assert.assertEquals(getTask().getUserTags().getCount(), 0);
    }

    @Test
    public void getFilters() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getFilters().getId(),"0");
    }

    @Test
    public void getUserTags() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getUserTags().getCount(), 0);
    }

    @Test
    public void getHosts() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getHosts().getCount().getValue(), 1);
    }

    @Test
    public void getClosedCves() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getClosedCves().getCount().getValue(), 0);
    }

    @Test
    public void getVulns() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getVulns().getCount().getValue(), 75);
    }

    @Test
    public void getOs() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getOs().getCount().getValue(), 1);
    }

    @Test
    public void getApps() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getApps().getCount().getValue(), 18);
    }

    @Test
    public void getSslCerts() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getSslCerts().getCount().getValue(), 4);
    }

    @Test
    public void getReportFormat() throws JAXBException {
        Assert.assertNull(getScanReport().getReport().getReportFormat());
    }

    @Test
    public void getScanEnd() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getTasksReport().getTask().getFirstReport().getReport().getScanEnd()),
                "06082017 050952");
    }

    private Task getTask() throws JAXBException {
        return getScanReport().getReport().getTask();
    }
}