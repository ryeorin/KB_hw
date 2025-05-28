package org.scoula.jdbc_ex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
    // 단위 테스트
    // 기능 단위 --> 메서드 구현
    // 메서드 하나씩 테스트할 수 있음
    // 단위 테스트(Unit test, 유닛테스트)
    // Junit 5

    @Test
    @DisplayName("DB연결 테스트 결과")
    public void test() throws ClassNotFoundException, SQLException {
        Connection con = null;
        // 1. 드라이버설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버설정성공..");
        // 2. 데이터베이스연결
        String url = "jdbc:mysql://localhost:3306/jdbc_ex";
        String user = "scoula";
        String password = "1234";
        con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결성공.");
    }

}
