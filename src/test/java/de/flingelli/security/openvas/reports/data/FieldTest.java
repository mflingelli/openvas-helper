package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class FieldTest extends CommonReport {

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getField().getName(), "severity");
    }

    @Test
    public void getOrder() throws JAXBException {
        Assert.assertEquals(getField().getOrder(), "descending");
    }

    private Field getField() throws JAXBException {
        return getScanReport().getReport().getSort().getField();
    }
}
