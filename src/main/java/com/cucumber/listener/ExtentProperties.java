package com.cucumber.listener;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * An enum which holds the properties to be set for extent reporter
 */
public enum ExtentProperties {
    INSTANCE;
    private String reportPath;
    private String extentXServerUrl;
    private String projectName;

    //Klov properties
    private String klovServerUrl;
    private String klovProjectName;
    private String klovReportName;
    private String mongodbHost;
    private int mongodbPort;
    private String mongodbDatabase;
    private String mongodbUsername;
    private String mongodbPassword;

    ExtentProperties() {
    	/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyysy.MM.dd_HH.mm.ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String s = dtf.format(now);
        this.reportPath = "output" + File.separator + "Run_" + System.currentTimeMillis() + File.separator
                +s +"report.html";
        this.projectName = "default";*/
        
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath() {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd_HH.mm.ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String s = dtf.format(now);
        this.reportPath = "D:\\CucumberExtentReporter\\output\\" +"Run_" +System.currentTimeMillis() +File.separator
                +s +"report.html";
        this.projectName = "default";
       // this.reportPath = reportPath;
    }

    @Deprecated
    public String getExtentXServerUrl() {
        return extentXServerUrl;
    }

    @Deprecated
    public void setExtentXServerUrl(String extentXServerUrl) {
        this.extentXServerUrl = extentXServerUrl;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getKlovServerUrl() {
        return klovServerUrl;
    }

    public void setKlovServerUrl(String klovServerUrl) {
        this.klovServerUrl = klovServerUrl;
    }

    public String getKlovProjectName() {
        return klovProjectName;
    }

    public void setKlovProjectName(String klovProjectName) {
        this.klovProjectName = klovProjectName;
    }

    public String getKlovReportName() {
        return klovReportName;
    }

    public void setKlovReportName(String klovReportName) {
        this.klovReportName = klovReportName;
    }

    public String getMongodbHost() {
        return mongodbHost;
    }

    public void setMongodbHost(String mongodbHost) {
        this.mongodbHost = mongodbHost;
    }

    public int getMongodbPort() {
        return mongodbPort;
    }

    public void setMongodbPort(int mongodbPort) {
        this.mongodbPort = mongodbPort;
    }

    public String getMongodbDatabase() {
        return mongodbDatabase;
    }

    public void setMongodbDatabase(String mongodbDatabase) {
        this.mongodbDatabase = mongodbDatabase;
    }

    public String getMongodbUsername() {
        return mongodbUsername;
    }

    public void setMongodbUsername(String mongodbUsername) {
        this.mongodbUsername = mongodbUsername;
    }

    public String getMongodbPassword() {
        return mongodbPassword;
    }

    public void setMongodbPassword(String mongodbPassword) {
        this.mongodbPassword = mongodbPassword;
    }
}
