package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class QodTest extends CommonReport {

    @Test
    public void getValue() throws JAXBException {
        Assert.assertEquals(getQod().getValue(), 80);
    }

    @Test
    public void getType() throws JAXBException {
        Assert.assertEquals(getQod().getType(), "remote_banner");
    }

    private Qod getQod() throws JAXBException {
        ScanReport report = getScanReport();
        return report.getReport().getResults().get(0).getQod();
    }
}
