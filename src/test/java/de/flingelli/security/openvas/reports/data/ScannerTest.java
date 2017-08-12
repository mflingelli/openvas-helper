package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ScannerTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getScanner().getId(), "08b69003-5fc2-4037-a479-93b440211c73");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getScanner().getName(), "OpenVAS Default");
    }

    @Test
    public void getType() throws JAXBException {
        Assert.assertEquals(getScanner().getType(), 2);
    }

    @Test
    public void getTrash() throws JAXBException {
        Assert.assertEquals(getScanner().getTrash(), 0);
    }

    private Scanner getScanner() throws JAXBException {
        return getTasksReport().getTask().getScanner();
    }
}
