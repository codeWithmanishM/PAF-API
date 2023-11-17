package com.jsp.PAF_API.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.PAF_API.dto.AuthRequest;
import com.jsp.PAF_API.dto.AuthResponse;
import com.jsp.PAF_API.dto.Country;
import com.jsp.PAF_API.dto.UnauthorizedException;

@RestController
public class CountriesController 
{
	private static final String USERNAME = "Manish30";
    private static final String PASSWORD = "Mech@2021";

    
    private static final List<Country> countries = List.of(
            new Country("United states of America",331449281, 9147590, "English"),
            new Country("India", 1425775850, 3287263, "Sanskrit"),
            new Country("China", 1425671352, 9596960, "chinese"),
            new Country("Japan", 123294513, 377973, "Japnese"),
            new Country("Australia", 26537072, 7692024, "Australian English"),
            new Country("Spain", 47502258, 506030, "Spanish")
           
    );

    
    private String authToken;

    
    @PostMapping("/auth")
    public AuthResponse auth(@RequestBody AuthRequest authRequest) {
        if (authRequest.getUsername().equals(USERNAME) && authRequest.getPassword().equals(PASSWORD)) {
            authToken = "M30"; // Replace with actual token generation logic
            return new AuthResponse(authToken);
        } else {
            throw new UnauthorizedException("Invalid credentials");
        }
    }

    
    @GetMapping("/country/{countryName}")
    public Country getCountryInfo(@PathVariable String countryName, @RequestHeader("Authorization") String token) {
        validateToken(token);
        
        return new Country("United states of America",331449281, 9147590, "English");
    }

    
    @GetMapping("/countries")
    public List<Country> filterAndSortCountries(@RequestParam(required = false) String filter,
                                                @RequestParam(required = false) String sort,
                                                @RequestParam(required = false) Integer page,
                                                @RequestHeader("Authorization") String token) {
        validateToken(token);
                return countries;
    }

    private void validateToken(String token) {
        if (token == null || !token.equals("Bearer " + authToken)) {
            throw new UnauthorizedException("Authentication required");
        }
    }
    
}
