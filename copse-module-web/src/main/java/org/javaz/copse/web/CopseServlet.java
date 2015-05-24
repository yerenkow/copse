package org.javaz.copse.web;

import org.javaz.copse.logic.iface.AnswerDataI;
import org.javaz.copse.logic.impl.CopseRequestProcessor;
import org.javaz.copse.logic.impl.JdbcDataProvider;
import org.javaz.copse.model.beans.DataBase;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 */
public class CopseServlet extends HttpServlet {
    private CopseRequestProcessor copseRequestProcessor;
    private AnswerDataSerializer serializer = new AnswerDataSerializer();

    @Override
    public void init(ServletConfig config) throws ServletException {
        // create main DB
        String db = config.getInitParameter("db");
        DataBase dataBase = new DataBase();
        dataBase.setUrl(db);

        // bootstrap for access to DB
        JdbcDataProvider dataProvider = new JdbcDataProvider();
        dataProvider.init(dataBase);
        copseRequestProcessor = new CopseRequestProcessor(dataProvider);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AnswerDataI answerDataI = copseRequestProcessor.handleRequest(new HttpRequestParameterProvider(req, resp));
        serializer.writeData(answerDataI, req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
