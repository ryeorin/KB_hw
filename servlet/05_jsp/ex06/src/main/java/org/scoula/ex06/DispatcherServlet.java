package org.scoula.ex06;

import org.scoula.ex06.command.Command;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

// @WebServlet 애너테이션 붙이지 않음
public class DispatcherServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;
    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    public void init() {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        createMap(getMap, postMap);
    }

    protected void createMap(Map<String, Command> getMap, Map<String, Command> postMap) {
    }

}