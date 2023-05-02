package br.luccademichei.trabalhoengswii.beans;

public class Course {
    String codCourse;
    String description;
    String codClass;
    String register;

    public String getCodCourse(){
        return codCourse;
    }

    public void setCodCourse(String cod){
        this.codCourse = cod;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String desc){
        this.description = desc;
    }

    public String getCodClass(){
        return codClass;
    }

    public void setCodClass(String cod){
        this.codClass = cod;
    }

    public String getRegister(){
        return register;
    }

    public void setRegister(String reg){
        this.register = reg;
    }
    
}
