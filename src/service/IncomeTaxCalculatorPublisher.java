package service;
import javax.xml.ws.Endpoint;

public class IncomeTaxCalculatorPublisher {
    public static void main(String[] args) {
        String address = "http://localhost:8082/incometaxcalculator";

        Endpoint.publish(address, new IncomeTaxCalculatorImpl());

        System.out.println("Web service is published at: " + address);
    }
}

