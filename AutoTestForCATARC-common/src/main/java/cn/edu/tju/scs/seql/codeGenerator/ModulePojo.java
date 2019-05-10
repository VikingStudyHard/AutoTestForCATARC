package cn.edu.tju.scs.seql.codeGenerator;

import java.util.LinkedList;
import java.util.List;

public class ModulePojo {

    private String id;
    private String moduleName;
    private List<ModulePojo> subModules;
    private ModulePojo parentModule;
    public ModulePojo(String id, String moduleName) {
        super();
        this.id = id;
        this.moduleName = moduleName;
        this.subModules = new LinkedList<ModulePojo>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public List<ModulePojo> getSubModules() {
        return subModules;
    }
    public void setSubModules(List<ModulePojo> subModules) {
        this.subModules = subModules;
    }
    public ModulePojo getParentModule() {
        return parentModule;
    }
    public void setParentModule(ModulePojo parentModule) {
        this.parentModule = parentModule;
    }
}

