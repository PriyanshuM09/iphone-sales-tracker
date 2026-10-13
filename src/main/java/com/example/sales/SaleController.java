package com.example.sales;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SaleController {

	private final SaleRepository saleRepository;
	public SaleController(SaleRepository saleRepository) {
		this.saleRepository=saleRepository;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Sale create(@Valid @RequestBody Sale sale) {
		sale.setId(null);
		return saleRepository.save(sale);
		
	}
}
