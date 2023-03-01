package org.example;

import java.util.Scanner;
import java.util.logging.*;


public class Shape {
    public static void main(String []args)
    {
        double d1;
        double d2;
        double d3;
        String etd="Enter the dimensions";
        String are="Area=";
        String per="Perimeter=";
        String ra;
        String rp;
        Scanner mysc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        for(int i=0;i<4;i++)
        {
            log.info("Enter the name of the shape:");
            String name=mysc.next();
            if((name.equals("rectangle")))
            {
                log.info(etd);
                d1=mysc.nextFloat();
                d2=mysc.nextFloat();
                BasicShape b=new BasicShape(name,d1,d2);
                b.findArea(d1,d2);
                b.findPerimeter(d1,d2);
                ra=""+b.retArea();
                log.info(ra);
                rp=""+b.retPeri();
                log.info(per);
                log.info(rp);
                b=null;

            }
            else if(name.equals("triangle"))
            {
                log.info(etd);
                d1=mysc.nextFloat();
                d2=mysc.nextFloat();
                d3=mysc.nextFloat();
                BasicShape b=new BasicShape(name,d1,d2,d3);
                b.findArea(d1,d2,d3);
                b.findPerimeter(d1,d2,d3);
                log.info(are);
                ra=""+b.retArea();
                log.info(ra);
                rp=""+b.retPeri();
                log.info(per);
                log.info(rp);
                b=null;

            }
            else if((name.equals("circle"))||(name.equals("square")))
            {
                log.info(etd);
                d1=mysc.nextFloat();
                BasicShape b=new BasicShape(name,d1);
                b.findArea(name,d1);
                b.findPerimeter(name,d1);
                log.info(are);
                ra=""+b.retArea();
                log.info(ra);
                rp=""+b.retPeri();
                log.info(per);
                log.info(rp);
                b=null;
            }
            else
            {
                log.info("Enter correct shape\n");
            }
        }
        mysc.close();
    }

}