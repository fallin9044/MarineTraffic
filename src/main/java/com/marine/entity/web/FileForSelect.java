package com.marine.entity.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileForSelect implements Serializable {
    String path;
    String name;
    boolean chkDisabled;
    List<FileForSelect> children = null;

    public void addChild(FileForSelect child){
        if(children == null){
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public FileForSelect(String path, String name, boolean isDic) {
        this.path = path;
        this.chkDisabled = isDic;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isChkDisabled() {
        return chkDisabled;
    }

    public void setChkDisabled(boolean chkDisabled) {
        this.chkDisabled = chkDisabled;
    }

    public List<FileForSelect> getChildren() {
        return children;
    }

    public void setChildren(List<FileForSelect> children) {
        this.children = children;
    }

}
