package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ErrorsTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        Assert.assertEquals(getErrors().getCount(), 1);
    }

    @Test
    public void getErrorsSize() throws JAXBException {
        Assert.assertEquals(getErrors().getErrors().size(), 1);
    }

    private Errors getErrors() throws JAXBException {
        return getScanReport().getReport().getErrors();
    }
}
