package com.departmentalstore.store.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.departmentalstore.store.bean.BalanceStatement;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/balance")
public class BalanceStatementController {

    @Autowired
    private BalanceStatement balanceStatementService;

    @GetMapping("/balance-statement")
    public ResponseEntity<List<BalanceStatement>> getBalanceStatements() {
        try {
            List<BalanceStatement> balanceStatements = balanceStatementService.getAllBalanceStatements();
            return new ResponseEntity<>(balanceStatements, HttpStatus.OK);
        } catch (Exception e) {
            // Log the error (optional)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}