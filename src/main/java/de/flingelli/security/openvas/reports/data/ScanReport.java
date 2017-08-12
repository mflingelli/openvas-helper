package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.Date;

@XmlRootElement(name = "report")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScanReport {
    @XmlAttribute
    private String id;
    @XmlAttribute(name = "format_id")
    private String formatId;
    @XmlAttribute
    private String extension;
    @XmlAttribute
    private String type;
    @XmlAttribute(name = "content_type")
    private String contentType;
    @XmlElement
    private Owner owner;
    @XmlElement
    private String name;
    @XmlElement
    private String comment;
    @XmlElement(name = "creation_time")
    private Date creationTime;
    @XmlElement(name = "modification_time")
    private Date modificationTime;
    @XmlElement
    private int writable;
    @XmlElement(name = "in_use")
    private int inUse;
    @XmlElement
    private Task task;
    @XmlElement(name = "report_format")
    private ReportFormat reportFormat;
    @XmlElement
    private Report report;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public int getWritable() {
        return writable;
    }

    public void setWritable(int writable) {
        this.writable = writable;
    }

    public int getInUse() {
        return inUse;
    }

    public void setInUse(int inUse) {
        this.inUse = inUse;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public ReportFormat getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public void writeXml(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ScanReport.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(this, new File(fileName));
    }

    public void readXML(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ScanReport.class);
        Unmarshaller um = context.createUnmarshaller();
        ScanReport scanReport = (ScanReport) um.unmarshal(new File(fileName));
        setId(scanReport.getId());
        setFormatId(scanReport.getFormatId());
        setExtension(scanReport.getExtension());
        setType(scanReport.getType());
        setContentType(scanReport.getContentType());
        setOwner(scanReport.getOwner());
        setName(scanReport.getName());
        setComment(scanReport.getComment());
        setCreationTime(scanReport.getCreationTime());
        setModificationTime(scanReport.getModificationTime());
        setWritable(scanReport.getWritable());
        setInUse(scanReport.getInUse());
        setTask(scanReport.getTask());
        setReportFormat(scanReport.getReportFormat());
        setReport(scanReport.getReport());
    }
}
