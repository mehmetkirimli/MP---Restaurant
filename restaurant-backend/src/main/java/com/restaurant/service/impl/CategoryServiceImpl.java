package com.restaurant.service.impl;

import com.restaurant.entity.Category;
import com.restaurant.entity.Product;
import com.restaurant.repository.CategoryRepository;
import com.restaurant.service.CategoryService;
import com.restaurant.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ProductService productService;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ProductService productService) {
        this.categoryRepository = categoryRepository;
        this.productService = productService;
    }

    @Override
    public Category createCategory(Category category) // TODO bu metodda bir şeyler oturmadı kafama. Prodcut olmadan category kaydedilmez gibi bir durum var
    {
        if (categoryRepository.findByName(category.getName()) != null)
        {
            throw new RuntimeException("Category already exists");
        }

        Product product = category.getProduct();
        product.setId(null);
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();

        for (Category category : categories)
        {
            category.setProduct(productService.getProductByCategory(category));
        }

        return categories;
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category addProductToCategory(Long categoryId, Product product)
    {
        Category category = getCategoryById(categoryId);
        if (category == null) {
            throw new RuntimeException("Category not found");
        }

        if (product.getId() != null && !product.getId().equals(0l)) {
            throw new RuntimeException("Product already exists");
        } else {
            product.setId(null);
            product.setCategory(category);
            product = productService.createProduct(product);
        }
        category.setProduct(productService.getProductByCategory(category));

        /*
        if (CollectionUtils.isEmpty(category.getProduct())) {
            List<Product> products = new ArrayList<>();
            products.add(product);
            category.setProducts(products);
        } else {
            try {
                category.getProducts().add(product);
            } catch (Exception e) {
            }
        }
        category.setProducts(productService.getAllProductsByCategory(category));
         */
        //TODO Burada yorum satırına aldığım yerler patlayabilir test kısmında
        return category;
    }
}
