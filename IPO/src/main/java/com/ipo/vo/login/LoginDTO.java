package com.ipo.vo.login;

public class LoginDTO {

	private String mid;
	private String mpwd;
	private boolean useCookie;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [mid=" + mid + ", mpwd=" + mpwd + ", useCookie=" + useCookie + "]";
	}
	
	
}
