package com.departmentalstore.store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.departmentalstore.store.filter.JwtFilter;



@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private JwtFilter jwtFilter;
	


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests( request -> request
            .requestMatchers(
            		
            	            		
          //ADMIN REGISTER AND LOGIN:
          "/api/user/login", "/api/user/register","/api/user/{id}",
            		
//          //Product API:
          "api/product/productadd","/api/product/getAllproduct","/api/product/Productget/{productid}","/api/product//Update/{productid}","/api/product/Delete/{productid}", 		
           "/api/product/productdetails",
           
          //Company API:
          "/companies/companyList","/companies/companyget/{companyid}","/companies/add","/companies/companyupdate/{companyid}","/companies/companydelete/{companyid}",
            		
          //Category API:
   		
          "/categories/categoryList","/categories/category/{categoryid}","/categories/category/add","categories/categoryupdate/{categoryid}","categories/categorydelete/{categoryid}",
          
          
          //CustomerOrder Details API
          
          "/CustomerOrder/customerOrderList","/CustomerOrder/CustomerOrder/{orderid}","/CustomerOrder/add","/CustomerOrder/update/{customerOrderid}","/CustomerOrder//delete/{customerid}",
          
          
          // OrderItem Details API
          
          "/OrderItem/orderItemadd","/OrderItem/getAllOrderItem","/OrderItem/{orderitemid}","/OrderItem/Delete/{orderitemid}"
            		).permitAll()
            .anyRequest().authenticated())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

