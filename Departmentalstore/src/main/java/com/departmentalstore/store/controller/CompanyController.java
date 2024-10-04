package com.departmentalstore.store.controller;

import com.departmentalstore.store.bean.Company;
import com.departmentalstore.store.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companyList")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("companyget/{companyid}")
    public Optional<Company> getCompanyById(@PathVariable long companyid) {
        return companyService.getCompanyById(companyid);
    }

    @PostMapping("/add")
    public Company createCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @PutMapping("companyupdate/{companyid}")
    public Company updateCompany(@PathVariable long companyid, @RequestBody Company company) {
        company.setCompanyid(companyid);
        return companyService.saveCompany(company);
    }

    @DeleteMapping("companydelete/{companyid}")
    public void deleteCompany(@PathVariable Long companyid) {
        companyService.deleteCompany(companyid);
    }
}
