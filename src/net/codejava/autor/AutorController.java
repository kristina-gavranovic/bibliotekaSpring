package net.codejava.autor;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AutorController {

	@Autowired
	private AutorService autorService;

	@Autowired
	private AutorValidator autorValidator;

	@RequestMapping("/autori")
	public ModelAndView home() {
		List<Autor> listAutori = autorService.listAll();
		ModelAndView mav = new ModelAndView("autori");
		mav.addObject("listAutori", listAutori);
		return mav;
	}

	@RequestMapping("/new_autor")
	public String newLiceForm(Map<String, Object> model) {
		Autor autor = new Autor();
		model.put("autor", autor);
		return "new_autor";
	}

	@RequestMapping("/delete_autor")
	public String deleteAutorForm(@RequestParam long id) {
		autorService.delete(id);
		return "redirect:/autori";
	}

	@RequestMapping("/edit_autor")
	public ModelAndView editAutorForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_autor");
		Autor autor = autorService.get(id);
		mav.addObject("autor", autor);

		return mav;
	}

	@RequestMapping("/search_autor")
	public ModelAndView search(@RequestParam String keyword) {
		List<Autor> result = autorService.search(keyword);
		ModelAndView mav = new ModelAndView("search_autor");
		mav.addObject("result", result);

		return mav;
	}

	@RequestMapping(value = "/save_autor", method = RequestMethod.POST)
	public String saveLice(@ModelAttribute("autor") @Validated Autor autor, BindingResult result,
			RedirectAttributes redirectAttributes, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("invalid" , result.getFieldError().getDefaultMessage());
			System.out.println("******************************** prazno poljeeee*******************s");
			return "new_autor";
		} else {
			autorService.save(autor);
		} 
		redirectAttributes.addFlashAttribute("message", "Author is saved!");
		return "redirect:/autori";
	}

	@InitBinder
	protected void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(autorValidator);
	}


}
