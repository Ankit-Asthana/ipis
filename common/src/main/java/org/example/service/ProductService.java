package org.example.service;


import org.example.repo.ProductsRepository;
import org.example.RabbitMqConstant;
import org.example.model.Employee;
import org.example.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.amqp.core.AmqpTemplate;


import java.util.List;

/**
 Represents a ProductService.
 */
@Service
public class ProductService {
	@Autowired
	private AmqpTemplate rabbitTemplate; 

    @Autowired
    ProductsRepository productsRepository;

    public  void addProduct(Products newproduct) {
        System.out.println("Message recieved successfully"+ newproduct);
                System.out.println("Message recieved successfully"+ newproduct);
                Employee employee = new Employee();
                employee.setEmpName("marcus henry");
                employee.setEmpid(100);
                productsRepository.save(newproduct);
                rabbitTemplate.convertAndSend(RabbitMqConstant.DIRECT_DAILY_WEEKLY_EXCHANGE, RabbitMqConstant.DAILY_WEEKLY_ROUTING_KEY, employee);
    }

    public List<Products> getProductsByName(String name) {
        return productsRepository.findByName(name);
    }
}
