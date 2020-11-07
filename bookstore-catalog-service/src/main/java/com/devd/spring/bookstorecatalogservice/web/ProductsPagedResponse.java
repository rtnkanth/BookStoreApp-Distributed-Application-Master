package com.devd.spring.bookstorecatalogservice.web;

import com.devd.spring.bookstorecatalogservice.repository.dao.Product;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rtnkanth, Date : 2020-08-29
 */
@Data
public class ProductsPagedResponse {
    
    Page<Product> page;
    Map<String, String> _links = new HashMap<>();
    
}
