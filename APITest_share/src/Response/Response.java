package Response;

public class Response {

	private String passWordExpiredDate;

    private Integer companyid;

    private String username;

    private String rootCompanyid;

    private String token;

    private String email;

    private String isValidPassword;

    private String parentid;

    private String companyname;

    private String rootCompanyName;

    public String getPassWordExpiredDate ()
    {
        return passWordExpiredDate;
    }

    public void setPassWordExpiredDate (String passWordExpiredDate)
    {
        this.passWordExpiredDate = passWordExpiredDate;
    }

    
    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getRootCompanyid ()
    {
        return rootCompanyid;
    }

    public void setRootCompanyid (String rootCompanyid)
    {
        this.rootCompanyid = rootCompanyid;
    }

    public String getToken ()
    {
        return token;
    }

    public void setToken (String token)
    {
        this.token = token;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getIsValidPassword ()
    {
        return isValidPassword;
    }

    public void setIsValidPassword (String isValidPassword)
    {
        this.isValidPassword = isValidPassword;
    }

    public String getParentid ()
    {
        return parentid;
    }

    public void setParentid (String parentid)
    {
        this.parentid = parentid;
    }

    public String getCompanyname ()
    {
        return companyname;
    }

    public void setCompanyname (String companyname)
    {
        this.companyname = companyname;
    }

    public String getRootCompanyName ()
    {
        return rootCompanyName;
    }

    public void setRootCompanyName (String rootCompanyName)
    {
        this.rootCompanyName = rootCompanyName;
    }

	public Integer getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
}
