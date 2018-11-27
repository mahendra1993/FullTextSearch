package com.monu.service;

import java.util.List;

import com.monu.vos.Document;
import com.monu.vos.Response;

public interface DocumentService {
	List<Document> getAllDocuments();
	String postDocument(Document document);
	Response documentsWithTextLikeQuery(String qry);

}
