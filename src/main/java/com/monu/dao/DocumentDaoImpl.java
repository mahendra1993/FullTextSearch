package com.monu.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monu.vos.Document;

@Repository
public class DocumentDaoImpl implements DocumentDao {

	public List<Document> documentData = new ArrayList<>(Arrays.asList(new Document(1,"This is a test document")));
	
	@Override
	public List<Document> getAllDocuments() {
		return this.documentData;
	}

	@Override
	public Boolean postDocument(Document document) {
		return this.documentData.add(document);
	}

	@Override
	public List<Document> documentsWithTextLikeQuery(String qry) {
		List<Document>response = new ArrayList<>();
		//Search Logic goes here :P
		response = documentData;
		return response;
	}

}
