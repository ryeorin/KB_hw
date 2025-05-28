package org.scoula.database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null) return conn;

        try {
            // 1. application.properties 파일 로드
            Properties props = new Properties();
            InputStream input = JDBCUtil.class.getClassLoader().getResourceAsStream("application.properties");
            props.load(input);

            // 2. 프로퍼티에서 정보 추출
            String driver = props.getProperty("jdbc.driver");
            String url = props.getProperty("jdbc.url");
            String user = props.getProperty("jdbc.username");
            String password = props.getProperty("jdbc.password");

            // 3. 드라이버 로드
            Class.forName(driver);

            // 4. Connection 생성
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // 5. Connection 종료 메서드
    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null; // 재연결 가능하게
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
