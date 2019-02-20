package model;

import java.io.Serializable;

public class Tester implements Serializable{
	//フィールド
	private String oyako;
	private String fu;
	private String han;
	//コンストラクタ
	public Tester() {
		super();
	}

	public Tester(String oyako, String fu, String han) {
		super();
		this.oyako = oyako;
		this.fu = fu;
		this.han = han;
	}
	//getter setter

	public String getOyako() {
		return oyako;
	}

	public void setOyako(String oyako) {
		this.oyako = oyako;
	}

	public String getFu() {
		return fu;
	}

	public void setFu(String fu) {
		this.fu = fu;
	}

	public String getHan() {
		return han;
	}

	public void setHan(String han) {
		this.han = han;
	}

}
