package jpojo.test;

import jpojo.User;

/**
 * Created by sing on 2018/8/5.
 * desc:
 */
public class test2 {

    public static void main(String arg[]){
        User user =new User();
        test t =new test();
        user.setName("安典龙");
        try {
            t.Add(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("插入失败");
        }

    }
}
