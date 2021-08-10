package org.zerock.w1.dao;

import org.zerock.db.util.JdbcTemplate;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TimeDAO {

    public String getTime() throws RuntimeException{

        // 자동으로 connection과 close가 가능
        StringBuffer buffer = new StringBuffer();

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement("select now()");
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
//                System.out.println(resultSet.getString(1));
                buffer.append(resultSet.getString(1));
            }
        }.makeAll();
        return buffer.toString();
    }

//    //클래스먼저 로딩해주기
//    static {
//        try {//forName에서 예외가 걸리기 때문에 꼭 예외처리 해주기
//            Class.forName("com.mysql.cj.jdbc.Driver"); //실제 드라이버 버전에 따라 경로가 다르기 때문에 External Libraries에서 mysql에서 경로를 확인해주기
//        }catch (ClassNotFoundException e) {e.printStackTrace(); }
//    }
//
//    public String getTime() throws RuntimeException{//RuntimeException: 원한다면 받고 아니면 안받는거
//
//        //지역변수로 잡아주기
//        Connection connection = null;
//        PreparedStatement preparedStatement = null; // 메모장 확인
//        ResultSet resultSet = null;
//        String currentTime = null; //밑에서 쌓은 값을 여기에 보관
//
//        //db연결은 매번해줘야한다. 먹쉬돈나
//        try{
//           connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bit08db","bituser","bituser"); //db와 연결
//            //"jdbc:mysql://127.0.0.1:3306/bit08db?serverTimezone=Asia/Seoul","bituser","bituser")
//            preparedStatement = connection.prepareStatement("select now()"); //현재시간출력
//            resultSet = preparedStatement.executeQuery();//select문에는 resultSet사용
//
//            resultSet.next(); // 한 칸 내려줌
//
//            currentTime = resultSet.getString(1);//1번째 열의 값을 꺼내와라
//        }catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
//        }finally {
//            // 반대로 올라가면서 다 close
//            if(resultSet != null){// 위에서 문제가 생기면 여기까지 못 내려오니까 null값인지 한 번 확인해보기
//                try { resultSet.close(); }catch (Exception e){}
//            }
//            if(preparedStatement != null){// 위에서 문제가 생기면 여기까지 못 내려오니까 null값인지 한 번 확인해보기
//                try { resultSet.close(); }catch (Exception e){}
//            }
//            if(connection != null){// 위에서 문제가 생기면 여기까지 못 내려오니까 null값인지 한 번 확인해보기
//                try { resultSet.close(); }catch (Exception e){}
//            }
//        }
//        return currentTime;
//    }
}
