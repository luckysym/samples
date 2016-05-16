package act;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String m_username;
    private String m_password;

    public String getUsername() {
        return m_username;
    }

    public void setUsername(String username) {
        m_username = username;
    }

    public String getPassword() {
        return m_password;
    }

    public void setPassword(String password) {
        m_password = password;
    }

    public String checkLogin() {
        if( m_username.equals("admin") && m_password.equals("123") )
            return "success";
        else
            return "failure";
    }
}
