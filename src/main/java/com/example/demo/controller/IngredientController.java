package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Ingredient;

@RestController
@RequestMapping(value = "/public/ingredient",produces = "application/json")
@CrossOrigin(origins="*")
public class IngredientController {
	
	@GetMapping(path = "/{ingredientId}")
	@ResponseStatus(value = HttpStatus.OK)
	public Ingredient getIngredient (@PathVariable Long ingredientId) {
		
		return new Ingredient(ingredientId,"test","desc");
		
	}

}
