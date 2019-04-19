package com.epam.cleandesign.srp;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.util.Properties;

public class ReportSender {

    public static final String RECEIVER = "abcd@gmail.com";
    public static final String SENDER = "web@gmail.com";
    public static final String HOST = "localhost";

    public static void sendEmployeesReport(Connection connection) {

        EmployeeManager employeeManager = new EmployeeManager();

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", HOST);
        Session session = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(SENDER));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(RECEIVER));
            message.setSubject("Employees report");

            String employeesHtml = employeeManager.getAllEmployeesAsHtml(connection);

            message.setContent(employeesHtml, "text/html; charset=utf-8");

            Transport.send(message);
        } catch (MessagingException e) {
            throw new IllegalStateException(e);
        }
    }
}
