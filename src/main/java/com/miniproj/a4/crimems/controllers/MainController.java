package com.miniproj.a4.crimems.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproj.a4.crimems.entity.CyberCrime;
import com.miniproj.a4.crimems.entity.Extortion;
import com.miniproj.a4.crimems.entity.Felony;
import com.miniproj.a4.crimems.entity.Missing;
import com.miniproj.a4.crimems.entity.Robbery;
import com.miniproj.a4.crimems.repository.CyberCrimeRepository;
import com.miniproj.a4.crimems.repository.ExtortionRepository;
import com.miniproj.a4.crimems.repository.FelonyRepository;
import com.miniproj.a4.crimems.repository.MissingRepository;
import com.miniproj.a4.crimems.repository.RobberyRepository;
@Controller
public class MainController {  
    @Autowired
	private CyberCrimeRepository cyberCrimeRepository;
    @Autowired
    private ExtortionRepository extortionRepository;
    @Autowired
    private FelonyRepository felonyRepository;
    @Autowired
	private MissingRepository missingRepository;
    @Autowired
    private RobberyRepository robberyRepository;
    
	    
    // home page
    @RequestMapping("/home")
    public String loginMessage(){
        return "home";
    }
    
    
    @GetMapping("/reportCyberCrimeComplaint")
	public String reportCyberCrimeComplaint(Model theModel) {
		
		CyberCrime cyberCrime = new CyberCrime();
		
		theModel.addAttribute("cyberCrime", cyberCrime);
		
		return "Report_c";
	}
    
    @PostMapping("/saveCyberCrime")
	public String saveCyberCrime(@ModelAttribute("cyberCrime") CyberCrime cyberCrime) {
		
		cyberCrimeRepository.save(cyberCrime);
		
		return "redirect:/home";
	}
    

    @GetMapping("/reportExtortionComplaint")
	public String reportExtortionComplaint(Model theModel) {
		
		Extortion extortion = new Extortion();
		
		theModel.addAttribute("extortion", extortion);
		
		return "Report_c";
	}
    
    @PostMapping("/saveExtortion")
	public String saveExtortion(@ModelAttribute("extortion") Extortion extortion) {
		
		extortionRepository.save(extortion);
		
		return "redirect:/home";
	}

    
    @GetMapping("/reportFelonyComplaint")
	public String reportFelonyComplaint(Model theModel) {
		
		Felony felony = new Felony();
		
		theModel.addAttribute("felony", felony);
		
		return "Report_c";
	}
    
    @PostMapping("/saveFelony")
	public String saveFelony(@ModelAttribute("felony") Felony felony) {
		
		felonyRepository.save(felony);
		
		return "redirect:/home";
	}

    
    @GetMapping("/reportMissingComplaint")
	public String reportMissingComplaint(Model theModel) {
		
		Missing missing = new Missing();
		
		theModel.addAttribute("missing", missing);
		
		return "Report_c";
	}
    
    @PostMapping("/saveMissing")
	public String saveMissing(@ModelAttribute("missing") Missing missing) {
		
		missingRepository.save(missing);
		
		return "redirect:/home";
	}
    
    
    @GetMapping("/reportRobberyComplaint")
	public String reportRobberyComplaint(Model theModel) {
		
		Robbery robbery = new Robbery();
		
		theModel.addAttribute("robbery", robbery);
		
		return "Report_c";
	}
    
    @PostMapping("/saveRobbery")
	public String saveRobbery(@ModelAttribute("robbery") Robbery robbery) {
		
		robberyRepository.save(robbery);
		
		return "redirect:/home";
	}
}