package com.example.ws.employee.mapper;

import com.example.ws.employee.entities.Employee;
import com.example.ws.employee.persist.wsdl.EmployeeJaxb;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.annotation.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-08T00:14:52-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_272 (Debian)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    private final DatatypeFactory datatypeFactory;

    public EmployeeMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public EmployeeJaxb employeeToEmployeeJaxb(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeJaxb employeeJaxb = new EmployeeJaxb();

        employeeJaxb.setName( employee.getName() );
        employeeJaxb.setSurname( employee.getSurname() );
        employeeJaxb.setDocumentType( employee.getDocumentType() );
        employeeJaxb.setDocumentNumber( employee.getDocumentNumber() );
        employeeJaxb.setBirthdate( dateToXmlGregorianCalendar( employee.getBirthdate() ) );
        employeeJaxb.setBondingDate( dateToXmlGregorianCalendar( employee.getBondingDate() ) );
        employeeJaxb.setCharge( employee.getCharge() );
        if ( employee.getSalary() != null ) {
            employeeJaxb.setSalary( employee.getSalary() );
        }

        return employeeJaxb;
    }

    @Override
    public Employee employeeJaxbToEmployee(EmployeeJaxb employeeJaxb) {
        if ( employeeJaxb == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setName( employeeJaxb.getName() );
        employee.setSurname( employeeJaxb.getSurname() );
        employee.setDocumentType( employeeJaxb.getDocumentType() );
        employee.setDocumentNumber( employeeJaxb.getDocumentNumber() );
        employee.setBirthdate( xmlGregorianCalendarToDate( employeeJaxb.getBirthdate() ) );
        employee.setBondingDate( xmlGregorianCalendarToDate( employeeJaxb.getBondingDate() ) );
        employee.setCharge( employeeJaxb.getCharge() );
        employee.setSalary( employeeJaxb.getSalary() );

        return employee;
    }

    private static Date xmlGregorianCalendarToDate( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        return xcal.toGregorianCalendar().getTime();
    }

    private XMLGregorianCalendar dateToXmlGregorianCalendar( Date date ) {
        if ( date == null ) {
            return null;
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime( date );
        return datatypeFactory.newXMLGregorianCalendar( c );
    }
}
