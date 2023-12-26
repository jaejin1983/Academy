package com.spring.member.ex03;

public class ArticleVO {
	private int articleNO;
	private String writer;
	private String title;
	private String content;
	
	public ArticleVO() {
		System.err.println("ArticleVO 생성자 호출");
	}

	public int getArticleNO() {
		return articleNO;
	}

	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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
	
	@Override
	public String toString() {
		String info = "";
		info += "\n" + articleNO + "\n "
					+writer+"\n "
					+title+"\n "
					+content;
		return info;
	}

}
