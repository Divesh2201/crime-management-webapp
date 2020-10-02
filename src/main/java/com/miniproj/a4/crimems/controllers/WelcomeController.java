package com.miniproj.a4.crimems.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproj.a4.crimems.entity.Criminal;
import com.miniproj.a4.crimems.entity.CriminalRepository;
@Controller
public class WelcomeController {  
	
	@Autowired
	private CriminalRepository criminalRepository;
	
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }
    @PostMapping(path="/addCriminal") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String first_name
        , @RequestParam String last_name, @RequestParam String dob,
        @RequestParam String crime_committed, @RequestParam int prison_term) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request

      Criminal criminal = new Criminal();
      criminal.setFirst_name(first_name);
      criminal.setLast_name(last_name);
      criminal.setCrime_committed(crime_committed);
      criminal.setDob(dob);
      criminal.setPrison_term(prison_term);
      criminalRepository.save(criminal);
      return "Saved";
    }

}