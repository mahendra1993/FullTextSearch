package com.monu.dao;

import java.util.List;

import com.monu.vos.Document;

public interface DocumentDao {
	List<Document> getAllDocuments();
	Boolean postDocument(Document document);
	List<Document> documentsWithTextLikeQuery(String qry);

}
