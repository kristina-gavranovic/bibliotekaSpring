package net.codejava.lice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LiceController {

	@Autowired
	private LiceService liceService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Lice> listLice = liceService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listLice", listLice);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newLiceForm(Map<String, Object> model) {
		Lice lice = new Lice();
		model.put("lice", lice);
		return "new_lice";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLice(@ModelAttribute("lice") Lice lice) {
		liceService.save(lice);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editLiceForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_lice");
		Lice lice = liceService.get(id);
		mav.addObject("lice", lice);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteLiceForm(@RequestParam long id) {
		liceService.delete(id);
		return "redirect:/";		
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Lice> result = liceService.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		
		return mav;		
	}	
}
