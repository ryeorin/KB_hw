package org.scoula.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    static Connection con =null;

    public static Connection getConnection() {
        // 연결 됐는지 안됐는지
        if (con!=null){
            return con;
        }

        //Properties 클래스를 이용하여 application.properties 파일을 로드함
        try{
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            // 데이터베이스 접속에 필요한 정보를 추출
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String id = properties.getProperty("id");
            String password = properties.getProperty("password");

            Class.forName(driver); // Connection객체를 보관함
            con = DriverManager.getConnection(url, id, password);

        }catch(Exception e){
            e.printStackTrace();
        }

        return con;
    }
    //데이터베이스 접속을 끊는 close() 메서드를 정의함
    public static void close(Connection con) {
        try{
            if(con!=null) con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
