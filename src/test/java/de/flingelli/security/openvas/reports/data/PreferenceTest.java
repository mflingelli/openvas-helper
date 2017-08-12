package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class PreferenceTest extends CommonReport {

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getPreference().getName(), "Maximum concurrently executed NVTs per host");
    }

    @Test
    public void getScannerName() throws JAXBException {
        Assert.assertEquals(getPreference().getScannerName(), "max_checks");
    }

    @Test
    public void getValue() throws JAXBException {
        Assert.assertEquals(getPreference().getValue(), 10);
    }

    private Preference getPreference() throws JAXBException {
        return getTasksReport().getTask().getPreferences().get(0);
    }
}
