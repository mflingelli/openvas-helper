package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class OwnerTest extends CommonReport {

    @Test
    public void getTerm() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getOwner().getName(),"jenkins");
    }

}