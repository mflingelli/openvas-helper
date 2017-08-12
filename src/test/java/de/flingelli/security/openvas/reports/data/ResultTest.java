package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class ResultTest extends CommonReport {

    @Test
    public void getId() throws JAXBException {
        ScanReport report = getScanReport();
        Assert.assertEquals(report.getReport().getResults().get(0).getId(),
                "891f6821-9eb6-4aa2-86e1-7e7992b8ed91");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getResult().getName(), "TCP timestamps");
    }

    @Test
    public void getDescription() throws JAXBException {
        Assert.assertEquals(getResult().getDescription(),
                "It was detected that the host implements RFC1323.\n" +
                        "\n" +
                        "The following timestamps were retrieved with a delay of 1 seconds in-between:\n" +
                        "Packet 1: 14831306\n" +
                        "Packet 2: 14831578");
    }

    @Test
    public void getPort() throws JAXBException {
        Assert.assertEquals(getResult().getPort(), "general/tcp");
    }

    @Test
    public void getCreationTime() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getResult().getCreationTime()), "30072017 173738");
    }

    @Test
    public void getModificationTime() throws JAXBException {
        Assert.assertEquals(getFormattedDate(getResult().getModificationTime()), "30072017 173738");
    }

    @Test
    public void getThreat() throws JAXBException {
        Assert.assertEquals(getResult().getThreat(), "Low");
    }

    @Test
    public void getOriginalThreat() throws JAXBException {
        Assert.assertEquals(getResult().getOriginalThreat(), "Low");
    }

    @Test
    public void getSeverity() throws JAXBException {
        Assert.assertEquals(getResult().getSeverity(), 2.6);
    }

    @Test
    public void getOriginalSeverity() throws JAXBException {
        Assert.assertEquals(getResult().getOriginalSeverity(), 2.6);
    }

    @Test
    public void getOwnerName() throws JAXBException {
        Assert.assertEquals(getResult().getOwner().getName(), "jenkins");
    }

    @Test
    public void getComment() throws JAXBException {
        Assert.assertEquals(getResult().getComment(), "");
    }

    @Test
    public void getUserTagsCount() throws JAXBException {
        Assert.assertEquals(getResult().getUserTags().getCount(), 0);
    }

    @Test
    public void getScanNvtVersion() throws JAXBException {
        Assert.assertEquals(getResult().getScanNvtVersion(), "$Revision: 5740 $");
    }

    private Result getResult() throws JAXBException {
        ScanReport report = getScanReport();
        return report.getReport().getResults().get(0);
    }
}
