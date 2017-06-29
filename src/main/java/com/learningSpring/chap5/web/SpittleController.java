package com.learningSpring.chap5.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learningSpring.chap5.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository){
		this.spittleRepository =spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(spittleRepository.findSpittles(238900,50));
		//model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE,20));
		return "spittles";
	}
	
	@RequestMapping(value="/{spittleId}",method=RequestMethod.GET)
	public String spittle(@PathVariable long spittleId,Model model){
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
}
