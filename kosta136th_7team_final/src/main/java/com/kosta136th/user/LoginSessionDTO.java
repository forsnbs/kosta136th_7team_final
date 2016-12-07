package com.kosta136th.user;

public class LoginSessionDTO {
	private String email;
	private String nickname;

	public LoginSessionDTO() {
	}

	public LoginSessionDTO(String email, String nickname) {
		this.email = email;
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "LoginSessionDTO [email=" + email + ", nickname=" + nickname + "]";
	}
	
}