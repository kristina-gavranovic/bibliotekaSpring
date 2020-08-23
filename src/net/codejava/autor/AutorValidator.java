package net.codejava.autor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AutorValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
	
		return Autor.class.equals(clazz);
	}

	@Override
	public void validate(Object o, Errors errors) {
		  //Autor autor=(Autor) o;
	        
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ime",null, "Unesite ime autora!");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prezime", null,"Unesite prezime autora!");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zemlja", null,"Unesite zemlju porekla autora!"); 
	        
	}

}
