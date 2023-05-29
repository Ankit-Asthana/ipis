//package org.example;
//
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(ProductsController.class)
//@Import({ProductsController.class})
//@RunWith(SpringRunner.class)
//
////@SpringBootTest
//public class ProductControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @MockBean
//    ProductsController productsController;
//
//    @MockBean
//    private ProductsService productService;
//
//
//    Product product = new Product(1,"Ram","abc");
//
//    @Test
//
//    public void testAddProduct() throws Exception {
//        when(productsController.addProduct(product)).thenReturn(product);
//        mockMvc.perform(post("/apiCheck/add"))
////                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value(product.getName()))
//                .andExpect(jsonPath("$.size()").value(1));
//        Assert.assertEquals(product,
//                productsController.addProduct(product));
//    }
//    }
