package com.monu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monu.dao.DocumentDao;
import com.monu.vos.Document;
import com.monu.vos.Response;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	DocumentDao documentDao;
	
	@Override
	public List<Document> getAllDocuments() {
		return documentDao.getAllDocuments();
	}

	@Override
	public String postDocument(Document document) {
		if(documentDao.postDocument(document)) {
			return "Document Added Succesfully";
		}else {
			return "Error Occured while adding the document";
		}
	}

	@Override
	public Response documentsWithTextLikeQuery(String qry) {
		Response response = new Response();
		List<Document>searchedDocs = documentDao.documentsWithTextLikeQuery(qry);
		response.setCount(searchedDocs.size());
		response.setDocuments(searchedDocs);
		return response;
	}

}
