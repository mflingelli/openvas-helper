package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class TaskCountTest extends CommonReport {

    @Test
    public void getCount() throws JAXBException {
        Assert.assertEquals(getTaskCount().getCount(), 2);
    }

    @Test
    public void getFiltered() throws JAXBException {
        Assert.assertEquals(getTaskCount().getFiltered(), 1);
    }

    @Test
    public void getPage() throws JAXBException {
        Assert.assertEquals(getTaskCount().getPage(), 1);
    }

    private TaskCount getTaskCount() throws JAXBException {
        return getTasksReport().getTaskCount();
    }
}
