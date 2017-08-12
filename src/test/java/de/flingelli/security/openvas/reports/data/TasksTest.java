package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class TasksTest extends CommonReport {

    @Test
    public void getMax() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTasks().getMax(), 1000);
    }

    @Test
    public void getStart() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTasks().getStart(), 1);
    }

}
