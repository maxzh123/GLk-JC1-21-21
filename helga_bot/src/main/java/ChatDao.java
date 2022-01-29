import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.*;

public class ChatDao {
    //Создаем и настравиваем мул соединения к базе данных
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    static {
        dataSource.setJdbcUrl("jdbc:postgresql://194.195.241.62:5432/o_makarevich_db");
        dataSource.setUser("o_makarevich");
        dataSource.setPassword(new String(Config.DB_PW));
        dataSource.setInitialPoolSize(2);
        dataSource.setMinPoolSize(2);
        dataSource.setAcquireIncrement(2);
        dataSource.setMaxPoolSize(6);
    }

    public static Employe getEmployeByNum(long number){
        Employe emp=null;
        try (Connection conn=dataSource.getConnection()){
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT Personnel_Number, Last_Name, First_Name, Patronymic, `Month`, Salary FROM o_makarevich_db.PaySlips where Personnel_Number=?;\n");
            ps.setLong(1,number); // Говорим подставить вместо первого параметра лонг значений.
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //нам не надо парсить лист. нам нужен один результат. остальные игнорируем
                /** Как здесь получить доступ к personnelNumber, который ввел пользователь в case INPUNT_NUMBER:, чтобы сравнить его с Personnel_Number из БД?*/
                emp=new Employe(rs.getInt("Personnel_Number"),
                        rs.getString("Last_Name"),
                        rs.getString("First_Name"),
                        rs.getString("Patronymic")
                        );
                //emp.setMonth(rs.getDate("Month"));
                //emp.setSalary(rs.getBigDecimal("Salary"));

//                            System.out.print(rs.getString("Last_Name"));
//                            System.out.print("; ");
//                            System.out.print(rs.getString("First_Name"));
//                            System.out.print("; ");
//                            System.out.print(rs.getString("Patronymic"));
//                            System.out.print("; ");
//                            System.out.print(rs.getDate("Month"));
//                            System.out.print("; ");
//                            System.out.print(rs.getBigDecimal("Salary"));
//                            System.out.println("");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
        }
        return emp;
    }

}
