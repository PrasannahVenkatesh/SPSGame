package com.spsgame.CONTROLLER;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spsgame.BEAN.PlayerBEAN;

@Controller
public class PlayerController { 
	
	private String name;
	private String choice;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home","player",new PlayerBEAN());
	}
	
	@RequestMapping(value="/game",method={RequestMethod.POST})
	public ModelAndView startgame(@Valid @ModelAttribute("player") PlayerBEAN player,BindingResult b) {
		name = player.getPlayerName();
		if(b.hasErrors()) {
			return new ModelAndView("home","player",new PlayerBEAN());
		}
		return new ModelAndView("gamepage","player",new PlayerBEAN());
	}
	@RequestMapping(value="/playagain",method=RequestMethod.GET)
	public ModelAndView playAgain() {
		return new ModelAndView("gamepage","player",new PlayerBEAN());
	}
	@RequestMapping(value="/result",method= {RequestMethod.POST})
	public ModelAndView result(@ModelAttribute("player") PlayerBEAN player) {
		choice = player.getChoice();
		int min = 1;
		int max = 3;
		int value = (int)(Math.random()*(max-min+1))+min;
		String systemValue="";
		if(value==1) {
			systemValue = "Stone";
		}
		else if(value==2) {
			systemValue = "Paper";
		}
		else if(value==3) {
			systemValue = "Scissors";
		}
		String result="";
		System.out.println(value);
		if(choice.equals("Stone")) {
			if(systemValue.equals("Paper")) {
				result = "Oops! You Lose!! Try Again";
			}
			else if(systemValue.equals("Scissors")) {
				result = "Hurrah! You Won!! Try Again";
			}
			else {
				result = "Draw!";
			}
		}
		else if(choice.equals("Paper")) {
			if(systemValue.equals("Scissors")) {
				result = "Oops! You Lose!! Try Again";
			}
			else if(systemValue.equals("Stone")) {
				result = "Hurrah! You Won!! Try Again";
			}
			else {
				result = "Draw!";
			}
		}
		else if(choice.equals("Scissors")) {
			if(systemValue.equals("Paper")) {
				result = "Oops! You Lose!! Try Again";
			}
			else if(systemValue.equals("Stone")) {
				result = "Hurrah! You Won!! Try Again";
			}
			else {
				result = "Draw!";
			}
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", choice);
		mv.addObject("Result",result);
		mv.setViewName("points");
		return mv;
	}
	

}
