package org.scoula.jdbc_ex.test;

import jdbc.common.JDBCUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnectionTest {

    // 단위테스트하려고 함.
    // 기능 단위 --> 메서드 구현
    // 메서드 하나씩 테스트할 수 있음.
    // 단위 테스트 (Unit test, 유닛테스트)
    //JUnit 5
    // 본 코드를 하기 전에 테스트를 충분히 거치고 난 후
    // 리팩토링하여 본 코드를 하면 에러율 낮아지고, 효과적으로 코딩
    //TDD 방법론

    @Test // 필수
    @DisplayName("DB연결 테스트 결과") // 선택

    // try/catch or  throws를 해줘야 에러가 안난다.
    public void testConnection() throws ClassNotFoundException, SQLException {
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

//        con에 연결이 성공하면 연결통오레 해당하는 객체가
//        메모리에 생김(주소를 가짐.)
//        com에 연결이 실패하면 연결통로에 해당하는 객체가
//        메모리에 안생김( null을 가짐.)
        Assertions.assertNull(con);
    }

    @Test
    void testConnection2() throws SQLException {
        Connection conn = JDBCUtil.getConnection();

        PreparedStatement pstmt = null;

        ResultSet result = null;

        try {
            String query = "select ROLE from users where name = ?";
            pstmt = conn.prepareStatement(query);

            String name = "관리자";

            pstmt.setString(1, name);

            result = pstmt.executeQuery();
            assertNotNull(result);

            if (result.next()) {
                String resultString = result.getString("ROLE");
                assertEquals("ADMIN", resultString);
            }

        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}






    }
}
