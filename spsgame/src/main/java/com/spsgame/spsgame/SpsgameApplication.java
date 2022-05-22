package com.spsgame.spsgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spsgame.CONTROLLER.PlayerController;
import com.spsgame.SERVICE.PlayerServiceIMPL;


@SpringBootApplication
@ComponentScan(basePackageClasses = {PlayerController.class, PlayerServiceIMPL.class})
public class SpsgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsgameApplication.class, args);
	}

}
