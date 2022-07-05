package com.registro.usuarios.controlador.dto;
 
public class ImageDTO {

    private String fileContentBase64;
	private String fileName;

	public String getFileContentBase64() {
		return fileContentBase64;
	}

	public void setFileContentBase64(String fileContentBase64) {
		this.fileContentBase64 = fileContentBase64;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}