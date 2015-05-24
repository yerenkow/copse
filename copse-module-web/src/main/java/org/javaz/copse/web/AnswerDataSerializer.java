package org.javaz.copse.web;

import org.javaz.copse.logic.iface.AnswerDataI;
import org.javaz.util.JsonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 */
public class AnswerDataSerializer {
    public void writeData(AnswerDataI data, HttpServletRequest req, HttpServletResponse resp) {
        // todo different answers by content-type or something like that;
        try {
            if (data != null && data.getData() != null) {
                resp.getWriter().write(JsonUtil.convertToJS(data.getData()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
