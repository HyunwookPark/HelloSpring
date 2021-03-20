package com.hellospring.domain;

/**
 * データ
 * @author parkh
 */
//@Data
public class Todo {

	/**
	 * ID
	 * @param 取得ID
	 * @return IDを返す
	 */
	private int id;
	private String statusCd;
	private String statusNm;
	/** タイトル */
	private String title;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getStatusNm() {
		return statusNm;
	}

	public void setStatusNm(String statusNm) {
		this.statusNm = statusNm;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
