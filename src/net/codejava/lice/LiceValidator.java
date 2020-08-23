package net.codejava.lice;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class LiceValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Lice.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ime",null, "Unesite ime lica!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prezime", null,"Unesite prezime lica!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pol", null,"Unesite pol lica!"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "datumrodjenja",null, "Unesite datum rodjenja lica!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", null,"Unesite email lica!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Adresa", null,"Unesite adresu lica!"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Mesto", null,"Unesite mesto stanovanja lica!"); 
        
//       IZBACITI POLI I EMAIL ZBOG VALIDACIJE, A MOZDA I DATUM RODJENJA
      
//        Lice lice=(Lice) target;
//        if(lice.getEmail().contains("@")) {
//        	errors.rejectValue("email", "Mail mora sadrzati simbol @ !");
//        }

	}

}
