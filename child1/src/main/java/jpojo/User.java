package jpojo;

/**
 * Created by sing on 2018/8/3.
 * desc:
 */
public class User {
    private int id;			// id
    private String name;	// 账号
    private String pwd;		// 密码
    private int authority;	// 权力

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public int getAuthority() {
        return authority;
    }
    public void setAuthority(int authority) {
        this.authority = authority;
    }

}
