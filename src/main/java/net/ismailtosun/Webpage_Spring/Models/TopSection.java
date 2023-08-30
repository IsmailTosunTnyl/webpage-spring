package net.ismailtosun.Webpage_Spring.Models;

public class TopSection {
    String hellopromt;
    String myname;
    String mytitle;
    public TopSection(String hellopromt, String myname, String mytitle) {
        this.hellopromt = hellopromt;
        this.myname = myname;
        this.mytitle = mytitle;
    }

    public String getHellopromt() {
        return hellopromt;
    }

    public void setHellopromt(String hellopromt) {
        this.hellopromt = hellopromt;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMytitle() {
        return mytitle;
    }

    public void setMytitle(String mytitle) {
        this.mytitle = mytitle;
    }
}
