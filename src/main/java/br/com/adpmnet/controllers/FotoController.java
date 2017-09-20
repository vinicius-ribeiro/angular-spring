package br.com.adpmnet.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adpmnet.models.Foto;

@Controller
@RestController
@RequestMapping("/foto")
public class FotoController {

	@RequestMapping(produces="application/json")
	public ArrayList<Foto> foto() {
		Foto f = new Foto("https://cdn.filestackcontent.com/PIxmlTd3T5qda3livynM", "JS", 300.00, 150.00);
		Foto ff = new Foto("https://cdn.filestackcontent.com/PIxmlTd3T5qda3livynM", "JS", 300.00, 150.00);
		
		ArrayList<Foto> arrayFotos = new ArrayList<>();
		
		arrayFotos.add(f);
		arrayFotos.add(ff);
		
		return arrayFotos;
	}
	
	
}
