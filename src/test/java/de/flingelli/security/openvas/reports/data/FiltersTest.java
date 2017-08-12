package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class FiltersTest extends CommonReport {

    @Test
    public void getTerm() throws JAXBException {
        Assert.assertEquals(getFilters().getTerm(),
                "apply_overrides=0 min_qod=70 first=1 rows=10 sort=name");
    }

    @Test
    public void getKeywords() throws JAXBException {
        Assert.assertEquals(getFilters().getKeywords().size(), 5);
    }

    @Test
    public void getFiltersSize() throws JAXBException {
        Assert.assertEquals(getScanReport().getReport().getFilters().getFilters().size(), 3);
    }

    private Filters getFilters() throws JAXBException {
        return getTasksReport().getFilters();
    }
}