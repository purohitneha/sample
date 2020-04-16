package me.neha;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid ;

    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String role;
    private String groupname;


    public User() {  }

    public User(String firstname, String lastname, String username, String password, String role, String groupname) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);
        this.setGroupname(groupname);
    }

    public User(int userid, String firstname, String lastname, String username, String password, String role, String groupname) {
        this.setUserid(userid);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);
        this.setGroupname(groupname);
    }

 

    public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                  ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                  ", role='" + role + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }
}
