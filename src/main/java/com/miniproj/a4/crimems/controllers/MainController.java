package com.miniproj.a4.crimems.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miniproj.a4.crimems.entity.Admin;
import com.miniproj.a4.crimems.entity.CyberCrime;
import com.miniproj.a4.crimems.entity.Extortion;
import com.miniproj.a4.crimems.entity.Felony;
import com.miniproj.a4.crimems.entity.Missing;
import com.miniproj.a4.crimems.entity.Robbery;
import com.miniproj.a4.crimems.entity.User;
import com.miniproj.a4.crimems.repository.CyberCrimeRepository;
import com.miniproj.a4.crimems.repository.ExtortionRepository;
import com.miniproj.a4.crimems.repository.FelonyRepository;
import com.miniproj.a4.crimems.repository.MissingRepository;
import com.miniproj.a4.crimems.repository.RobberyRepository;
import com.miniproj.a4.crimems.repository.UserRepository;

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
    @Autowired
    private UserRepository userRepository;
   
	
	    
    // home page
    @RequestMapping("/home")
    public String loginMessage(){
        return "home";
    }
    
    @RequestMapping("/welcome")
    public String adminHome() {
    	return "admin";
    }
    
    @GetMapping("/admin/login") 
    public String loginForAdmin(Model model) {
    	Admin admin = new Admin();
    	model.addAttribute("adminobj", admin);
    	return "login";
    }
    
    @PostMapping("/admin") 
    public String validateAdmin(@ModelAttribute("adminobj") Admin admin) {
    	if(admin.getUsername().contentEquals("admin") && admin.getPassword().contentEquals("admin")) {
    		return "admin";
    	} else {
    		return "login";
    	}
    }
    
    @GetMapping("/register")
	public String register(Model theModel) {
		
		User user = new User();
		
		theModel.addAttribute("user", user);
		
		return "register";
	}
    
    @PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		
		userRepository.save(user);
		
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
		
		return "Report_e";
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
		
		return "Report_f";
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
		
		return "Report_m";
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
		
		return "Report_r";
	}
    
    @PostMapping("/saveRobbery")
	public String saveRobbery(@ModelAttribute("robbery") Robbery robbery) {
		
		robberyRepository.save(robbery);
		
		return "redirect:/home";
	}
    
    @GetMapping("/admin/viewCyberCrimeComplaints")
	public String listCyberComplaints(Model theModel) {
		
    	List<CyberCrime> theCyberComplaints = (List<CyberCrime>) cyberCrimeRepository.findAll();
		
		// add the customers to the model
		theModel.addAttribute("listCyberComplaints", theCyberComplaints);
		
		return "View_c";
	}
    
    @GetMapping("/admin/viewExtortionComplaints")
	public String listExtortionComplaints(Model theModel) {
		
    	List<Extortion> theExtortionComplaints = (List<Extortion>) extortionRepository.findAll();
		
		// add the customers to the model
		theModel.addAttribute("listExtortionComplaints", theExtortionComplaints);
		
		return "View_e";
	}
    
    @GetMapping("/admin/viewFelonyComplaints")
	public String listFelonyComplaints(Model theModel) {
		
    	List<Felony> theFelonyComplaints = (List<Felony>) felonyRepository.findAll();
		
		// add the customers to the model
		theModel.addAttribute("listFelonyComplaints", theFelonyComplaints);
		
		return "View_f";
	}
    
    @GetMapping("/admin/viewRobberyComplaints")
	public String listRobberyComplaints(Model theModel) {
		
    	List<Robbery> theRobberyComplaints = (List<Robbery>) robberyRepository.findAll();
		
		// add the customers to the model
		theModel.addAttribute("listRobberyComplaints", theRobberyComplaints);
		
		return "View_r";
	}
    @GetMapping("/admin/viewMissingComplaints")
   	public String listMissingComplaints(Model theModel) {
   		
       	List<Missing> theMissingComplaints = (List<Missing>) missingRepository.findAll();
   		
   		// add the customers to the model
   		theModel.addAttribute("listMissingComplaints", theMissingComplaints);
   		
   		return "View_m";
   	}
    
    @GetMapping("/admin/deleteCyberCrimeComplaints")
	public String deleteCyberCrimeRecord(@RequestParam("recordId") int id) {
    	
				// delete the customer
    	cyberCrimeRepository.deleteById(id);
		return "redirect:/admin/viewCyberCrimeComplaints";
	}
    
    @GetMapping("/admin/deleteMissingComplaints")
   	public String deleteMissingRecord(@RequestParam("recordId") int id) {
       	
   				// delete the customer
       	missingRepository.deleteById(id);
   		return "redirect:/admin/viewMissingComplaints";
   	}
       
    @GetMapping("/admin/deleteExtortionComplaints")
   	public String deleteExtortionRecord(@RequestParam("recordId") int id) {
       	
   				// delete the customer
       	extortionRepository.deleteById(id);
   		return "redirect:/admin/viewExtortionComplaints";
   	}
    @GetMapping("/admin/deleteRobberyComplaints")
   	public String deleteRobberyRecord(@RequestParam("recordId") int id) {
       	
   				// delete the customer
       	robberyRepository.deleteById(id);
   		return "redirect:/admin/viewRobberyComplaints";
   	}
    @GetMapping("/admin/deleteFelonyComplaints")
   	public String deleteFelonyRecord(@RequestParam("recordId") int id) {
       	
   				// delete the customer
       	felonyRepository.deleteById(id);
   		return "redirect:/admin/viewFelonyComplaints";
   	}
    
    @GetMapping("/showStatusForm") 
    public String showStatusForm() {
    	return "statusForm";
    }
     
    @RequestMapping("/admin/getStatus")
    public String getStatus(@RequestParam("statusId") int id, @RequestParam("complaintType") int type, Model model) {
    	if(type == 1) {
    		Optional<CyberCrime> object = cyberCrimeRepository.findById(id);
    		if(object.isPresent()) {
    			CyberCrime cyberCrime = object.get();
    			model.addAttribute("showCStatus", cyberCrime);
    		}
    		return "Status_c";
    	} else if(type == 2) {
    		Optional<Extortion> object = extortionRepository.findById(id);
    		if(object.isPresent()) {
    			Extortion extortion = object.get();
    			model.addAttribute("showEStatus", extortion);
    		}
    		return "Status_e";

    	} else if(type == 3) {
    		Optional<Felony> object = felonyRepository.findById(id);
    		if(object.isPresent()) {
    			Felony felony = object.get();
    			model.addAttribute("showFStatus", felony);
    		}
    		return "Status_f";

    	} else if(type == 4) {
    		Optional<Missing> object = missingRepository.findById(id);
    		if(object.isPresent()) {
    			Missing missing = object.get();
    			model.addAttribute("showMStatus", missing);
    		}
    		return "Status_m";

    	} else {
    		Optional<Robbery> object = robberyRepository.findById(id);
    		if(object.isPresent()) {
    			Robbery robbery = object.get();
    			model.addAttribute("showRStatus", robbery);
    		}
    		return "Status_r";

    	}
    }
    @GetMapping("/admin/changeStatustoGreen")
    public String changeStatustoGreen(@RequestParam("changeStatusId") int id, @RequestParam("changeStatusComplaintType") int type) {
    	if(type == 1) {
    		Optional<CyberCrime> object = cyberCrimeRepository.findById(id);
    		if(object.isPresent()) {
    			CyberCrime cyberCrime = object.get();
    			cyberCrime.setStatus(1);
    			cyberCrimeRepository.save(cyberCrime);
    		}
    		return "redirect:/admin/viewCyberCrimeComplaints";
    	} else if(type == 2) {
    		Optional<Extortion> object = extortionRepository.findById(id);
    		if(object.isPresent()) {
    			Extortion extortion = object.get();
    			extortion.setStatus(1);
    			extortionRepository.save(extortion);
    		}
    		return "redirect:/admin/viewExtortionComplaints";
    	} else if(type == 3) {
    		Optional<Felony> object = felonyRepository.findById(id);
    		if(object.isPresent()) {
    			Felony felony = object.get();
    			felony.setStatus(1);
    			felonyRepository.save(felony);
    		}
    		return "redirect:/admin/viewFelonyComplaints";
    	} else if(type == 4) {
    		Optional<Missing> object = missingRepository.findById(id);
    		if(object.isPresent()) {
    			Missing missing = object.get();
    			missing.setStatus(1);
    			missingRepository.save(missing);
    		}
    		return "redirect:/admin/viewMissingComplaints";
    	} else {
    		Optional<Robbery> object = robberyRepository.findById(id);
    		if(object.isPresent()) {
    			Robbery robbery = object.get();
    			robbery.setStatus(1);
    			robberyRepository.save(robbery);
    		}
    		return "redirect:/admin/viewRobberyComplaints";
    	}
    }
    
    @GetMapping("/admin/changeStatustoRed")
    public String changeStatustoRed(@RequestParam("changeStatusId") int id, @RequestParam("changeStatusComplaintType") int type) {
    	if(type == 1) {
    		Optional<CyberCrime> object = cyberCrimeRepository.findById(id);
    		if(object.isPresent()) {
    			CyberCrime cyberCrime = object.get();
    			cyberCrime.setStatus(2);
    			cyberCrimeRepository.save(cyberCrime);
    		}
    		return "redirect:/admin/viewCyberCrimeComplaints";
    	} else if(type == 2) {
    		Optional<Extortion> object = extortionRepository.findById(id);
    		if(object.isPresent()) {
    			Extortion extortion = object.get();
    			extortion.setStatus(2);
    			extortionRepository.save(extortion);
    		}
    		return "redirect:/admin/viewExtortionComplaints";
    	} else if(type == 3) {
    		Optional<Felony> object = felonyRepository.findById(id);
    		if(object.isPresent()) {
    			Felony felony = object.get();
    			felony.setStatus(2);
    			felonyRepository.save(felony);
    		}
    		return "redirect:/admin/viewFelonyComplaints";
    	} else if(type == 4) {
    		Optional<Missing> object = missingRepository.findById(id);
    		if(object.isPresent()) {
    			Missing missing = object.get();
    			missing.setStatus(2);
    			missingRepository.save(missing);
    		}
    		return "redirect:/admin/viewMissingComplaints";
    	} else {
    		Optional<Robbery> object = robberyRepository.findById(id);
    		if(object.isPresent()) {
    			Robbery robbery = object.get();
    			robbery.setStatus(2);
    			robberyRepository.save(robbery);
    		}
    		return "redirect:/admin/viewRobberyComplaints";
    	}
    }
}