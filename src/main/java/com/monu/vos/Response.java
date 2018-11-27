package com.monu.vos;

import java.util.List;

public class Response {
	private int count;
	List<Document> documents;
	public Response() {
		super();
	}
	public Response(int count, List<Document> documents) {
		super();
		this.count = count;
		this.documents = documents;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	

}
