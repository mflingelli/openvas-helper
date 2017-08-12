package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ConfigTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getConfig().getId(), "74db13d6-7489-11df-91b9-002264764cea");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getConfig().getName(), "Full and very deep ultimate");
    }

    @Test
    public void getTrash() throws JAXBException {
        Assert.assertEquals(getConfig().getTrash(), 0);
    }

    @Test
    public void getType() throws JAXBException {
        Assert.assertEquals(getConfig().getType(), 0);
    }

    private Config getConfig() throws JAXBException {
        return getTasksReport().getTask().getConfig();
    }
}
