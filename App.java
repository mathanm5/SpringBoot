package org.maddy;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tom = new Tomcat(); // creating instance for Tomcat server


        //For Mapping
        Context context = tom.addContext("",null);// Hold on context object since we are working with same application we will go for " ", we dont need any new directory structure to form so, leave it as null
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());// addServlet is a static method for mapping the context and set the name for our servlets and object we have created, which are all the parameters
        tom.setPort(8080);
        //Actual mapping
        context.addServletMappingDecoded("/hello", "HelloServlet");// which page has to be loaded and name of the servlet has been mentioned

        tom.start();// starting the Tomcat server
        tom.getServer().await();// wait for request from the user..


    }
}
