package com.springsample3.beans;

//import jakarta.annotation.PostConstruct;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//can create single bean and single class
@Component
//pojo class
public class Vehicle3 {
    private String name;
    public String getVehicleName(){
        return name;
    }
    public void setVehiclename(String name) {
        this.name = name;
    }
@PostConstruct
public void initialize(){ this.name = "audi-1-postconstruct in @component";}
    /*if we have componenet annotation developers cant have permission
 to invoke or give the intialized value  */

    @PreDestroy
    public void destroy(){
        System.out.println(
                "Destroying Vehicle Bean"
        );
    }
    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }
}
