package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class TargetTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getTarget().getId(), "d7a2f393-a8ef-40c7-a5a6-6d43508e2fdd");
    }

    @Test
    public void getTrash() throws JAXBException {
        Assert.assertEquals(getTarget().getTrash(), 0);
    }

    private Target getTarget() throws JAXBException {
        return getScanReport().getReport().getTask().getTarget();
    }
}
