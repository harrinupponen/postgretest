package postgre.test.demo1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import postgre.test.demo1.domain.PgTest;
import postgre.test.demo1.domain.TestRepo;

@Controller
public class TestController {
	
	@Autowired
	TestRepo testRepo;
	
	@GetMapping(value = "/")
	public String getAll(Model model) {
			model.addAttribute("list", testRepo.findAll());
			return "test"; 
	}
	
	// empty form
	@GetMapping(value = "/addtest")
	public String getNewForm(Model model) {
		model.addAttribute("test", new PgTest());
		return "addtest";
	}

	// receive and save data from the form
	@PostMapping(value = "/addtest")
	public String addBook(@ModelAttribute PgTest pgTest) {
		testRepo.save(pgTest);
		return "redirect:/test";
	}

}
