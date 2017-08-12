package de.flingelli.security.openvas.reports.data;

import de.flingelli.security.openvas.reports.data.GetTaskResponse;
import de.flingelli.security.openvas.reports.data.ScanReport;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonReport {
    private SimpleDateFormat format = new SimpleDateFormat("ddMMyyy HHmmss");

    public SimpleDateFormat getSimpleDateFormat() {
        return format;
    }

    public String getFormattedDate(Date date) {
        return format.format(date);
    }

    protected ScanReport getScanReport() throws JAXBException {
        ScanReport report = new ScanReport();
        report.readXML(new File("src/test/resources/report.xml").getAbsolutePath());
        return report;
    }

    protected GetTaskResponse getTasksReport() throws JAXBException {
        GetTaskResponse report = new GetTaskResponse();
        report.readXML(new File("src/test/resources/get_tasks_response.xml").getAbsolutePath());
        return report;
    }
}
