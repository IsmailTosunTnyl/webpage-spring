package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


public class Metadata {

    String lang;
    String backendInfo = "Spring Boot";

    String DBInfo;


    String version;

    public Metadata(String lang, String DBInfo, String version) {
        this.lang = lang;
        this.DBInfo = DBInfo;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getBackendInfo() {
        return backendInfo;
    }

    public void setBackendInfo(String backendInfo) {
        this.backendInfo = backendInfo;
    }

    public String getDBInfo() {
        return DBInfo;
    }

    public void setDBInfo(String DBInfo) {
        this.DBInfo = DBInfo;
    }
}
