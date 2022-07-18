/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softcaribbean.pruebas.Controllers;

/**
 *
 * @author Luis Alfonso
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softcaribbean.pruebas.Models.CustomerModels;

import com.softcaribbean.pruebas.Services.CustomerServices;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerControlles {
    @Autowired
    CustomerServices customerServices;


   @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<CustomerModels> getcustomerList() {
        return customerServices.customerList();
    }

    /**
     * @param customer
     * @return
     */
    @PostMapping()
    public CustomerModels postCustomerCreate(@RequestBody CustomerModels customer) {

        return this.customerServices.customerCreate(customer);
    }

    @GetMapping("/{id}")
    public Optional<CustomerModels> getCustomerId(@PathVariable Long id) {
        return this.customerServices.customerId(id);
    }

    @DeleteMapping("/{id}")
    public Object deleteCustomer(@PathVariable Long id) throws JSONException {
        ArrayList<String> Message = new ArrayList<String>();

        Message.clear();

        JSONObject jsonObject= new JSONObject();
        boolean ok = this.customerServices.customerDelete(id);
        if (ok) {
            jsonObject.put("message", "Se elimino con exito");
            return jsonObject.toString();
         
        } else {
            jsonObject.put("message", "No pudo eliminor");
            return jsonObject.toString();
         
        }
      
    }
}
