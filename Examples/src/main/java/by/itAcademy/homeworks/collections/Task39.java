package by.itAcademy.homeworks.collections;

import java.sql.*;

public class Task39 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://194.195.241.62:5432/example_db", "example", ":zy(5k")){
            PreparedStatement ps=conn.prepareStatement("select p.id ,p.name ,p.birthday,r.processed_at,r.amount ,s.title,c.title as city_title from receipt r \n" +
                    " inner join people p  on r.people_id =p.id\n" +
                    " inner join shop s on r.shop_id=s.id \n" +
                    " inner join city c on s.city_id =c.id \n" +
                    " where c.title = 'Бобруйск' and p.name  like '%Мария%'");//2v
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
//                p.id ,p.name ,p.birthday,r.processed_at,r.amount ,s.title,c.title as city_title
//                rs.get
                System.out.print(rs.getInt("id"));
                System.out.print("; ");
                System.out.print(rs.getString("name"));
                System.out.print("; ");
                System.out.print(rs.getTimestamp("birthday"));
                System.out.print("; ");
                System.out.print(rs.getTimestamp("processed_at"));
                System.out.print("; ");
                System.out.print(rs.getBigDecimal("amount"));
                System.out.print("; ");
                System.out.print(rs.getString("title"));
                System.out.print("; ");
                System.out.print(rs.getString("city_title"));
                System.out.println("");
            }
            rs.close();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
