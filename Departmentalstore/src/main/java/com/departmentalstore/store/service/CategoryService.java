package com.departmentalstore.store.service;

import com.departmentalstore.store.bean.Category;
import com.departmentalstore.store.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public Category saveCategory(Category category) {
        return CategoryRepository.save(category);
    }
    
  

    public List<Category> getAllCategories() {
        return CategoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long categoryid) {
        return CategoryRepository.findById(categoryid);
    }

   

    public void deleteCategory(Long categoryid) {
         CategoryRepository.deleteById(categoryid);

    }
}
