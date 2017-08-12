package de.flingelli.security.openvas.reports.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;

public class DetailTest extends CommonReport {

    @Test
    public void getName() throws JAXBException {
        Assert.assertEquals(getDetails().getName(),
                "Cert:94C69463258A581361EF9CBE3DE08A09A395D7FACFB305124B683CE3019123B8");
    }

    @Test
    public void getValue() throws JAXBException {
        Assert.assertEquals(getDetails().getValue(),
                "x509:MIIDSTCCAjGgAwIBAgIEBmYAMDANBgkqhkiG9w0BAQUFADA2MQswCQYDVQQGEwJERTEQMA4GA1UECBMHQmF2YXJpYTEVMBMGA1UEAxMMTVVQIDA2NjYwNjY2MB4XDTE3MDcyOTIyNTcwM1oXDTE5MDcyOTIyNTcwM1owGzEZMBcGA1UEAxMQbXVwLmxvY2FsLmludGVybjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAM1T39zg+TcEDXtv2WgnlT+H/o9WHee6/2l0fpjxbk3HLYn59eIYeHISKsx3Gmyw2Ap9UhD9JyvRrIUJwoxqRXoWdgQ7y7yLDXY2ZGxDAi+9m7Nr/7zjQMB19C888UzKj1mnBGjLIksiLhuMLfNnb5mYmrIoMbOx0oRN8lvuq8U0NxdNf1RzgQSPA6PdSE1os7yIJPYq+L42PGNjmnqSAvviBahUH7hno46YcYdHXmC1dsRgc2t670csWyII2nX/gWl09zSrnda3wuNbYyS0RiNvHPRJE0eMvRuCZ/9vRvfxWP6KSFAAMPYW3M+uSEuZWz4DTGPaZzdJCoC5FdfOtx8CAwEAAaN6MHgwCQYDVR0TBAIwADALBgNVHQ8EBAMCBeAwXgYDVR0lBFcwVQYIKwYBBQUHAwEGCCsGAQUFBwMCBggrBgEFBQcDBQYIKwYBBQUHAwYGCCsGAQUFBwMHBgorBgEEAYI3CgMBBgorBgEEAYI3FAIBBgkrBgEEAYI3FQYwDQYJKoZIhvcNAQEFBQADggEBAElMCILmioOJB9n9bHBGvV4dF7TYR4PGolRvdBahqPauFJdt3/f0CVEyVPtDNXBnW2a7VWH719FrvzLZ3gioSlz0IMqJMJaDx9BkRRwJJE6fxCA0xRSOwZNTBvc1aVq6Bcyt2Po3DwRQ7qYkwCDMXxlu7UZnB9Nw/Z5HZoxTnZgXE5iIimv0fAtgmZMJRaU6DEsLiKQd/SUk2h3GLcXNqzXD0CMNLYkCrth9v8navRowYcnplROgIEgFI1hvuq/Ft24ZCba7X1IgbxfGIhlq9VNemaRgTwcczxkAiFaV6z5hvCarqoMuQmb5Ud9jb1GPdT2rB6lCxfe0O2T+o/22Rxg=");
    }

    private Detail getDetails() throws JAXBException {
        return getScanReport().getReport().getHost().getDetails().get(0);
    }
}
