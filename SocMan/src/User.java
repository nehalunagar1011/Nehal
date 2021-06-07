public class User {
	private String fname, lname, email, password, birth_date, flat_date, block, flatno, mobile;

	
	public User() {
		super();
	}

	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public User(String fname, String lname, String email, String password, String birth_date, String flat_date, String block, String flatno, String mobile) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.birth_date = birth_date;
		this.flat_date = flat_date;
		this.block = block;
		this.flatno = flatno;
		this.mobile = mobile;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getFlat_date() {
		return flat_date;
	}

	public void setFlat_date(String flat_date) {
		this.flat_date = flat_date;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
	