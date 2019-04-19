package com.epam.cleandesign.srp;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public final class EmployeeManager {

    private List<Employee> cache = null;

    public void getEmployeesList(Connection connection) {
        if (cache == null) {
            cache = DatabaseManager.readEmployees(connection);
        }
    }

    public synchronized String getAllEmployeesAsJson(Connection connection) {
        this.getEmployeesList(connection);
        return JsonConverter.getAllEmployeesAsJson(cache);
    }

    public synchronized String getAllEmployeesAsHtml(Connection connection) {
        this.getEmployeesList(connection);
        return HtmlConverter.getAllEmployeesAsHtml(cache);
    }




}
