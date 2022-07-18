/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softcaribbean.pruebas.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.softcaribbean.pruebas.Models.CustomerModels;
import com.softcaribbean.pruebas.repositories.CustomerRepository;

import net.bytebuddy.asm.Advice.Return;

import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepository customerRepository;

    public ArrayList<CustomerModels> customerList() {
        return (ArrayList<CustomerModels>) customerRepository.findAll();
    }

    public CustomerModels customerCreate(CustomerModels customer) {
        return customerRepository.save(customer);
    }

    public Optional<CustomerModels> customerId(Long id) {
        return customerRepository.findById(id);
    }

    public Boolean customerDelete(Long id) {
        try {
            customerRepository.deleteById(id);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
