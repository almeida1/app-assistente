package com.fatec.gemini1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
@Service
public class Treinamento {
	
	public void obterDados() {
		List<Document> documents = FileSystemDocumentLoader.loadDocuments("C:/temp/dados/");
		Document document = Document.from("Texto do meu documento");
		
		
	}

}
