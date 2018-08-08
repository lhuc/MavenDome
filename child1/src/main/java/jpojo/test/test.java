package jpojo.test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import jpojo.User;

import jpojo.util.Db;
import java.sql.SQLException;

/**
 * Created by sing on 2018/8/5.
 * desc:
 */
public class test {

    //添加用户
    public void Add(User user) throws SQLException {
        Connection conn = Db.open();
        String sql ="insert into user(username,password,state) values(?,?,?)";
        // TODO Auto-generated method stub
        PreparedStatement pra = (PreparedStatement) conn.prepareStatement(sql);
        pra.setString(1, user.getName());
        pra.setString(2, "00000");
        pra.setString(3, "1");
        pra.executeUpdate();
        pra.close();
    }


}
