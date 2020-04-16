package me.neha;

import javax.persistence.*;

@Entity
public class Usergroup {
    @Id
    private String groupname ;

    private String groupdesc;
   

    public Usergroup() {  }

/*    public Usergroup(String groupname, String userid) {
    	  this.setGroupdesc(groupname);
          this.setUserid(userid);
    }*/

    public Usergroup( String groupname, String groupdesc) {
        this.setGroupname(groupname);
        this.setGroupdesc(groupdesc);
        
    }

  
    public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getGroupdesc() {
		return groupdesc;
	}

	public void setGroupdesc(String groupdesc) {
		this.groupdesc = groupdesc;
	}



	@Override
    public String toString() {
        return "Usergroup{" +
                "groupname=" + groupname +
                ", groupdesc='" + groupdesc + '\'' +
                  '}';
    }
}
