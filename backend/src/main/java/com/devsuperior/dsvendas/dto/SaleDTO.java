package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO(Sale saleEntity) {
		id = saleEntity.getId();
		visited = saleEntity.getVisited();
		deals = saleEntity.getDeals();
		amount = saleEntity.getAmount();
		date = saleEntity.getDate();
		seller = new SellerDTO(saleEntity.getSeller());
	}
	
	
}
