package de.flingelli.security.openvas.reports.data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;

@XmlRootElement(name = "get_tasks_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetTaskResponse {
    @XmlAttribute(name = "status_text")
    private String statusText;
    @XmlAttribute
    private int status;
    @XmlElement(name = "apply_overrides")
    private int applyOverrides;
    @XmlElement
    private Task task;
    @XmlElement
    private Filters filters;
    @XmlElement
    private Sort sort;
    @XmlElement
    private Tasks tasks;
    @XmlElement(name = "task_count")
    private TaskCount taskCount;

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getApplyOverrides() {
        return applyOverrides;
    }

    public void setApplyOverrides(int applyOverrides) {
        this.applyOverrides = applyOverrides;
    }

    public Task getTask() {
        return task;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public TaskCount getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(TaskCount taskCount) {
        this.taskCount = taskCount;
    }

    public void readXML(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(GetTaskResponse.class);
        Unmarshaller um = context.createUnmarshaller();
        GetTaskResponse report = (GetTaskResponse) um.unmarshal(new File(fileName));
        setApplyOverrides(report.getApplyOverrides());
        setStatus(report.getStatus());
        setStatusText(report.getStatusText());
        setTask(report.getTask());
        setSort(report.getSort());
        setTasks(report.getTasks());
        setFilters(report.getFilters());
        setTaskCount(report.getTaskCount());
    }

}
