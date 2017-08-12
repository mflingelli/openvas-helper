package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class GetTaskResponseTest extends CommonReport {

    @Test
    public void getStatusText() throws JAXBException {
        Assert.assertEquals(getTasksReport().getStatusText(), "OK");
    }

    @Test
    public void getStatus() throws JAXBException {
        Assert.assertEquals(getTasksReport().getStatus(), 200);
    }

    @Test
    public void getApplyOverrides() throws JAXBException {
        Assert.assertEquals(getTasksReport().getApplyOverrides(), 0);
    }

    @Test
    public void getSort() throws JAXBException {
        Assert.assertEquals(getTasksReport().getSort().getField().getName(), "name");
    }

}
