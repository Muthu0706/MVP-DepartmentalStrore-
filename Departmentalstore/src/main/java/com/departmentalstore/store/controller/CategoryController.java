package com.departmentalstore.store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.departmentalstore.store.bean.Category;
import com.departmentalstore.store.service.CategoryService;
import java.util.List;
import java.util.Optional;



@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoryList")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/category/{categoryid}")
    public Optional<Category> getCategoryById(@PathVariable long categoryid) {
        return categoryService.getCategoryById(categoryid);
    }

    @PostMapping("/category/add")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @PutMapping("/categoryupdate/{categoryid}")
    public Category updateCategory(@PathVariable long categoryid, @RequestBody Category category) {
        category.setCategoryid(categoryid);
        return categoryService.saveCategory(category);
    }

    @DeleteMapping("/categorydelete/{categoryid}")
    public void deleteCategory(@PathVariable long categoryid) {
        categoryService.deleteCategory(categoryid);
    }
}
