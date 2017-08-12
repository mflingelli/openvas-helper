package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ScheduleTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getSchedule().getId(), "");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getSchedule().getName(), "");
    }

    @Test
    public void getNextTime() throws JAXBException {
        Assert.assertEquals(getSchedule().getNextTime(), "over");
    }

    @Test
    public void getTrash() throws JAXBException {
        Assert.assertEquals(getSchedule().getTrash(), 0);
    }

    private Schedule getSchedule() throws JAXBException {
        return getTasksReport().getTask().getSchedule();
    }
}
