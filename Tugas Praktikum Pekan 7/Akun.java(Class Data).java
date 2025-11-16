package Tugas2;

public class Akun {
	    private String username;
	    private String password;
	    private String email;
	    private int pinAngka;

	    // Constructor
	    public Akun(String username, String password, String email, int pinAngka) {
	        this.username = username;
	        this.password = password;
	        this.email = email;
	        this.pinAngka = pinAngka;
	    }

	    // Getter dan Setter
	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }
	    public String getPassword() { return password; }
	    public void setPassword(String password) { this.password = password; }
	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }
	    public int getPinAngka() { return pinAngka; }
	    public void setPinAngka(int pinAngka) { this.pinAngka = pinAngka; }

	    // Validasi Password
	    public boolean isPasswordValid() {
	        return password.length() >= 8;
	    }

	    // Validasi Email
	    public boolean isEmailValid() {
	        return email.contains("@") && email.contains(".");
	    }
	}




