package com.example.a16022809.p03_problemstatement;

public class Course {
    String moduleName;
    String moduleCode;
    String link;

    public Course(String moduleName, String moduleCode,String link) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.link = link;
    }


    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getModuleCode() {
        return moduleCode;
    }
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

}
