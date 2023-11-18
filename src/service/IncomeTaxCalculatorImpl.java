package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.IncomeTaxCalculator",targetNamespace = "wsdl")
public class IncomeTaxCalculatorImpl implements IncomeTaxCalculator {

    @Override
    public double calculateIncomeTax(double income) {
        return income * 0.1;
    }
}

