package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class PermissionTest extends CommonReport {

    @Test
    public void getPermissionsSize() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getPermissions().size(), 1);
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getTasksReport().getTask().getPermissions().get(0).getName(), "Everything");
    }

}