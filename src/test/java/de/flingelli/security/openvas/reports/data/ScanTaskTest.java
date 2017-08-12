package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ScanTaskTest extends CommonReport {

    @Test
    public void getSlave() throws JAXBException {
        Assert.assertEquals(getTask().getSlave().getId(), "");
    }

    @Test
    public void getPreferencesSize() throws JAXBException {
        Assert.assertEquals(getTask().getPreferences().size(), 1);
    }

    private ScanTask getTask() throws JAXBException {
        return getScanReport().getReport().getScan().getTask();
    }
}