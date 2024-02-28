package com.springsample3.main;

import com.springsample3.beans.Vehicle3;
import com.springsample3.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        var vehicle = context.getBean(Vehicle3.class);
        vehicle.printHello();
        //will give null if we didnot initialize at the component
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getVehicleName());
        context.close();
    }
}