package Inheritance.dto;

public class Department implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public Department setName(String name){
        this.name=name;
        return this;
    }
    @Override
    public Department clone(){
        return new Department().setName(this.name);
    }
}
