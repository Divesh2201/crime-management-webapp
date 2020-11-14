package com.miniproj.a4.crimems.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	private MissingRepository missingRepository;
    
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }
    
    @PostMapping(path="/missingReport") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String first_name
        , @RequestParam String last_name,  @RequestParam int age , @RequestParam String date , 
        	@RequestParam String time , @RequestParam String desc) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request

      Missing missing = new Missing();
      missing.setFirst_name(first_name);
      missing.setLast_name(last_name);
      missing.setAge(age);
      missing.setDate(date);
      missing.setTime(time);
      missing.setDesc(desc);
      missingRepository.save(missing);
      return "Saved";
    }
   

    @Autowired
    private FelonyRepository felonyRepository;
    
    @PostMapping(path="/felonyReport") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String first_name
        , @RequestParam String last_name,  @RequestParam int age ,@RequestParam String felony_committed, @RequestParam String date , 
        	@RequestParam String time , @RequestParam String desc) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request

      Felony felony = new Felony();
      felony.setFirst_name(first_name);
      felony.setLast_name(last_name);
      felony.setAge(age);
      felony.setFelony_committed(felony_committed);
      felony.setDate(date);
      felony.setTime(time);
      felony.setDesc(desc);
      felonyRepository.save(felony);
      return "Saved";
    }
    
    @Autowired
    private ExtortionRepository extortionRepository;
    
    @PostMapping(path="/extortionReport") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String first_name
        , @RequestParam String last_name,  @RequestParam int age ,@RequestParam int amt,
        @RequestParam String date , 
        	@RequestParam String time , @RequestParam String desc) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request

      Extortion extortion = new Extortion();
      extortion.setFirst_name(first_name);
      extortion.setLast_name(last_name);
      extortion.setAge(age);
      extortion.setAmt(amt);
      extortion.setDate(date);
      extortion.setTime(time);
      extortion.setDesc(desc);
      extortionRepository.save(extortion);
      return "Saved";
    }
    
    @Autowired
    private RobberyRepository robberyRepository;
    
    @PostMapping(path="/robberyReport") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String first_name
        , @RequestParam String last_name,  @RequestParam int age , @RequestParam String date , 
        	@RequestParam String time ,@RequestParam int amt, @RequestParam String desc) {
      // @ResponseBody means the returned String is the response, not a view name
      // @RequestParam means it is a parameter from the GET or POST request

      Robbery robbery = new Robbery();
      robbery.setFirst_name(first_name);
      robbery.setLast_name(last_name);
      robbery.setAge(age);
      robbery.setDate(date);
      robbery.setTime(time);
      robbery.setAmt(amt);
      robbery.setDesc(desc);
      robberyRepository.save(robbery);
      return "Saved";
    }
    
    @Autowired
	 private CyberCrimeRepository cyberCrimeRepository;
	    
	    @PostMapping(path="/cyberCrimeReport") // Map ONLY POST Requests
	    public @ResponseBody String addNewUser1(@RequestParam String first_name
	        , @RequestParam String last_name,  @RequestParam String account_number,
	        @RequestParam String date , @RequestParam String time , @RequestParam String desc) {
	      // @ResponseBody means the returned String is the response, not a view name
	      // @RequestParam means it is a parameter from the GET or POST request
	
	      CyberCrime cyberCrime = new CyberCrime();
	      cyberCrime.setFirst_name(first_name);
	      cyberCrime.setLast_name(last_name);
	      cyberCrime.setAccount_number(account_number);
	      cyberCrime.setDate(date);
	      cyberCrime.setTime(time);
	      cyberCrime.setDesc(desc);
	      cyberCrimeRepository.save(cyberCrime);
	      return "Saved";
	    }
    
   
  
}