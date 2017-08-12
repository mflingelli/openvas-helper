package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class TaskTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getTask().getId(), "8abc57cc-3497-44e4-ad17-ba64c270088f");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getTask().getName(), "ridux-ci");
    }

    @Test
    public void getCreationTime() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getTasksReport().getTask().getCreationTime()), "30072017 144337");
    }

    @Test
    public void getModificationTime() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getTasksReport().getTask().getModificationTime()), "12082017 044410");
    }

    @Test
    public void getWritable() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getWritable(), 1);
    }

    @Test
    public void getInUse() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getInUse(), 0);
    }

    @Test
    public void getAlterable() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getAlterable(), 0);
    }

    @Test
    public void getHostOrdering() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getHostOrdering(), "sequential");
    }

    @Test
    public void getStatus() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getStatus(), "Done");
    }

    @Test
    public void getTrend() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getTrend(), "same");
    }

    @Test
    public void getShedulePeriods() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getShedulePeriods(), 0);
    }

    @Test
    public void getAverageDuration() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getAverageDuration(), 1564);
    }

    @Test
    public void getResultCount() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getResultCount(), 585);
    }

    @Test
    public void getPreferences() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getPreferences().size(), 8);
    }

    @Test
    public void getFirstReport() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getFirstReport().getReport().getId(),
                "e9f01768-5264-4cba-b74e-44f8f79e7af1");
    }

    @Test
    public void getLastReport() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getLastReport().getReport().getId(),
                "c8d65c2c-3aed-49fc-9517-4cf7839a1370");
    }

    @Test
    public void getSecondLastReport() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getSecondLastReport().getReport().getId(),
                "eb713daf-9322-4f13-b882-71bdcc6ef17e");
    }

    private Task getTask() throws JAXBException {
        return getScanReport().getTask();
    }
}
