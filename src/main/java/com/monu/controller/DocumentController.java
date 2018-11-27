package com.monu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monu.service.DocumentService;
import com.monu.vos.Document;
import com.monu.vos.Response;

@RestController
public class DocumentController {
	@Autowired
	DocumentService documentService;

	// get all documents
	@RequestMapping("/documents")
	public List<Document> documents() {
		return documentService.getAllDocuments();
	}

	// to post a document
	@RequestMapping(method = RequestMethod.POST, value = "/documents")
	public String postDocument(@RequestBody Document document) {
		return documentService.postDocument(document);
	}

	// Search text in document
	@RequestMapping("/query/{id}")
	public Response getTopicById(@PathVariable String id) {
		return documentService.documentsWithTextLikeQuery(id);
	}

}
