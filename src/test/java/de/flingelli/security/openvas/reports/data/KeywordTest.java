package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class KeywordTest extends CommonReport {

    @Test
    public void getColumn() throws JAXBException {
        Assert.assertEquals(getKeyword().getColumn(), "apply_overrides");
    }

    @Test
    public void getRelation() throws JAXBException {
        Assert.assertEquals(getKeyword().getRelation(), "=");
    }

    @Test
    public void getValue() throws JAXBException {
        Assert.assertEquals(getKeyword().getValue(), "0");
    }

    private Keyword getKeyword() throws JAXBException {
        return getTasksReport().getFilters().getKeywords().get(0);
    }
}