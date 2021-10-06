package com.sabi.assessment.utility;

import org.springframework.stereotype.Service;

@Service
public class Validation {

	public Boolean validateInput(String input) {

		Boolean bool = false;

		if (input.matches("[0-9]+") == true) {

			bool = true;

		}

		return bool;
	}

}
