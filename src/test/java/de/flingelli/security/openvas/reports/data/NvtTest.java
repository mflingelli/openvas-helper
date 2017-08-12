package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class NvtTest extends CommonReport {

    @Test
    public void getOid() throws JAXBException {
        Assert.assertEquals(getNvt().getOid(), "1.3.6.1.4.1.25623.1.0.80091");
    }

    @Test
    public void getFamily() throws JAXBException {
        Assert.assertEquals(getNvt().getFamily(), "General");
    }

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getNvt().getName(), "TCP timestamps");
    }

    @Test
    public void getTags() throws JAXBException {
        Assert.assertEquals(getNvt().getTags(),
                "cvss_base_vector=AV:N/AC:H/Au:N/C:P/I:N/A:N|summary=The remote host implements TCP timestamps and therefore allows to compute\n" +
                        "  the uptime.|vuldetect=Special IP packets are forged and sent with a little delay in between to the\n" +
                        "  target IP. The responses are searched for a timestamps. If found, the timestamps are reported.|solution=To disable TCP timestamps on linux add the line 'net.ipv4.tcp_timestamps = 0' to\n" +
                        "  /etc/sysctl.conf. Execute 'sysctl -p' to apply the settings at runtime.\n" +
                        "\n" +
                        "  To disable TCP timestamps on Windows execute 'netsh int tcp set global timestamps=disabled'\n" +
                        "\n" +
                        "  Starting with Windows Server 2008 and Vista, the timestamp can not be completely disabled.\n" +
                        "\n" +
                        "  The default behavior of the TCP/IP stack on this Systems is to not use the\n" +
                        "  Timestamp options when initiating TCP connections, but use them if the TCP peer\n" +
                        "  that is initiating communication includes them in their synchronize (SYN) segment.\n" +
                        "\n" +
                        "  See also: http://www.microsoft.com/en-us/download/details.aspx?id=9152|affected=TCP/IPv4 implementations that implement RFC1323.|insight=The remote host implements TCP timestamps, as defined by RFC1323.|impact=A side effect of this feature is that the uptime of the remote\n" +
                        "  host can sometimes be computed.|solution_type=Mitigation|qod_type=remote_banner");
    }

    @Test
    public void getType() throws JAXBException {
        Assert.assertEquals(getNvt().getType(), "nvt");
    }

    @Test
    public void getXref() throws JAXBException {
        Assert.assertEquals(getNvt().getXref(), "URL:http://www.ietf.org/rfc/rfc1323.txt");
    }

    @Test
    public void getCvssBase() throws JAXBException {
        Assert.assertEquals(getNvt().getCvssBase(), "2.6");
    }

    @Test
    public void getCve() throws JAXBException {
        Assert.assertEquals(getNvt().getCve(), "NOCVE");
    }

    @Test
    public void getBid() throws JAXBException {
        Assert.assertEquals(getNvt().getBid(), "NOBID");
    }

    private Nvt getNvt() throws JAXBException {
        ScanReport report = getScanReport();
        return report.getReport().getResults().get(0).getNvt();
    }
}
