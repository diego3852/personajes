package com.registro.usuarios.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.registro.usuarios.controlador.dto.ImageDTO;

@RestController
@RequestMapping(path = "/upload")
public class ImageUploadController {

	@PostMapping(path = "/images")
	public void uploadFile(@RequestBody  ImageDTO imageDTO) {
		
	}
}